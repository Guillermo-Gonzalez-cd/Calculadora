import java.util.Scanner;

public class Newton{

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nMETODO DE NEWTON-RAPHSON\n");

        System.out.print("Ingrese f(x) (la funcion): ");
        String funcion = sc.nextLine();

        System.out.print("Ingrese f'(x) (la derivada): ");
        String derivada = sc.nextLine();

        System.out.print("Ingrese x0 (el valor inicial): ");
        double xi = sc.nextDouble();

        System.out.print("Ingrese numero de iteraciones: ");
        int iteraciones = sc.nextInt();

        System.out.print("Ingrese la raiz verdadera: ");
        double raizVerdadera = sc.nextDouble();

        System.out.printf("\n%-5s %-15s %-15s%n","i", "xi", "et(%)");

        for (int i = 0; i <= iteraciones; i++) {
            double et = Math.abs((raizVerdadera - xi) / raizVerdadera) * 100;

            if (et < 1e-8) {
                System.out.printf("%-5d %-15.4f %-15s%n", i, xi, "< 10^-8");

            } else {
                System.out.printf("%-5d %-15.4f %-15.4f%n", i, xi, et);
            }

            double fx = EvaluadorFuncion.evaluar(funcion, xi);
            double dfx = EvaluadorFuncion.evaluar(derivada, xi);

            if (dfx == 0) {
                System.out.println("\nError: f'(x) = 0");
                return;
            }
            xi = xi - (fx / dfx);
        }

        System.out.printf("\nRaiz aproximada = %.4f%n", xi);
    }
}