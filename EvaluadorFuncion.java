import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class EvaluadorFuncion {

    public static double evaluar(String funcion, double x) {

        Expression e = new ExpressionBuilder(funcion)
                .variable("x")
                .build();

        e.setVariable("x", x);

        return e.evaluate();
    }
}