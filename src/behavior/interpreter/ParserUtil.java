package behavior.interpreter;

import java.util.Stack;

public class ParserUtil {

    public static Expression parse(String expression) {
        Stack<Expression> stack = new Stack<>();

        for (String token : expression.split(" ")) {
            stack.push(parseToken(token, stack));
        }
        return stack.pop();
    }

    public static Expression parseToken(String token, Stack<Expression> stack) {
        Expression left, right;

        switch (token) {
            case "+":
                right = stack.pop();
                left  = stack.pop();
                return Expression.add(left, right);
            case "-":
                right = stack.pop();
                left = stack.pop();
                return Expression.minus(left, right);
            default:
                return Expression.variable(token);
        }
    }
}
