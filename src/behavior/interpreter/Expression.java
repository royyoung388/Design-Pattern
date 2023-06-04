package behavior.interpreter;

import java.util.Map;

public interface Expression {
    int interpret(Map<String, Integer> context);

    static Expression minus(Expression left, Expression right) {
        return context -> left.interpret(context) - right.interpret(context);
    }

    static Expression add(Expression left, Expression right) {
        return context -> left.interpret(context) + right.interpret(context);
    }

    static Expression variable(String name) {
        return context -> context.getOrDefault(name, 0);
    }
}
