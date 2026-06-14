import java.util.Scanner;

public class Secante {

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nMETODO DE LA SECANTE\n");

        System.out.print("Ingrese f(x) (la funcion): ");
        String funcion = sc.nextLine();

        System.out.print("Ingrese x(i-1): ");
        double xAnterior = sc.nextDouble();

        System.out.print("Ingrese xi: ");
        double xi = sc.nextDouble();

        System.out.print("Ingrese numero de iteraciones: ");
        int iteraciones = sc.nextInt();

        System.out.printf("\n%-10s %-15s %-15s %-15s%n","Iter", "x(i-1)", "xi", "x(i+1)");

        for (int i = 1; i <= iteraciones; i++) {
            double fxAnterior =
                    EvaluadorFuncion.evaluar(funcion, xAnterior);
            double fxi =
                    EvaluadorFuncion.evaluar(funcion, xi);
            double denominador = fxi - fxAnterior;

            if (denominador == 0) {
                System.out.println( "\nError: division entre cero.");
                return;
            }

            double xSiguiente = xi - (fxi * (xi - xAnterior)) / denominador;

            System.out.printf(
                    "%-10d %-15.4f %-15.4f %-15.4f%n", i, xAnterior, xi, xSiguiente);
            xAnterior = xi; xi = xSiguiente;
        }
        System.out.printf("\nRaiz aproximada = %.4f%n", xi);
    }
}