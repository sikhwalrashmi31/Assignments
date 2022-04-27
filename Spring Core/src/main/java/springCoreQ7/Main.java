package springCoreQ7;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
    public static void main(String[] args) {

        ExpressionParser expressionParser = new SpelExpressionParser();

        Expression expression = expressionParser.parseExpression("'Hello World'");
        String message = (String) expression.getValue();
        System.out.println(message);

    }
}

