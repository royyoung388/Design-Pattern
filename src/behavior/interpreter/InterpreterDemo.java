package behavior.interpreter;

import java.util.Map;

public class InterpreterDemo {

    public static void main(String[] args) {
        Expression exp = ParserUtil.parse("x y z + -");
        Map<String, Integer> context = Map.of("x", 1, "y", 2, "z", 3);
        int result = exp.interpret(context);
        System.out.println(result);
    }
}
