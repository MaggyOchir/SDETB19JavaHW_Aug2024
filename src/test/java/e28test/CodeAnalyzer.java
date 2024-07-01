package e28test;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CodeAnalyzer {

    public boolean analyze(String filePath) {
        try {
            File file = new File(filePath);
            CompilationUnit cu = new JavaParser().parse(file).getResult().orElse(null);

            if (cu == null) {
                System.out.println("Failed to parse the file.");
                return false;
            }

            // Check if the correct method is declared
            Optional<MethodDeclaration> mainMethod = cu.findFirst(MethodDeclaration.class, m -> m.getNameAsString().equals("main"));
            if (!mainMethod.isPresent()) {
                System.out.println("Main method not found.");
                return false;
            }

            // Check if variables are declared
            List<VariableDeclarator> variables = cu.findAll(VariableDeclarator.class);
            List<String> variableNames = variables.stream().map(VariableDeclarator::getNameAsString).collect(Collectors.toList());

            if (!(variableNames.contains("operator") && variableNames.contains("num1") && variableNames.contains("num2"))) {
                System.out.println("Required variables are not declared.");
                return false;
            }

            // Check for if-else conditions
            IfStmtVisitor ifStmtVisitor = new IfStmtVisitor();
            ifStmtVisitor.visit(cu, null);

            if (!ifStmtVisitor.isValidIfElseStructure()) {
                System.out.println("Invalid if-else structure detected.");
                return false;
            }

            System.out.println("All checks passed.");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static class IfStmtVisitor extends VoidVisitorAdapter<Void> {
        private boolean validIfElseStructure = false;

        @Override
        public void visit(IfStmt n, Void arg) {
            super.visit(n, arg);
            // Check if the if statement has a valid binary expression
            if (n.getCondition() instanceof BinaryExpr) {
                BinaryExpr condition = (BinaryExpr) n.getCondition();
                if (condition.getOperator() == BinaryExpr.Operator.EQUALS) {
                    validIfElseStructure = true;
                }
            }
        }

        public boolean isValidIfElseStructure() {
            return validIfElseStructure;
        }
    }
}
