import java.util.Scanner;

public class InterpolacionNewton {

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nINTERPOLACION DE NEWTON\n");

        System.out.print("Cantidad de puntos (p0, p1, p2, px...): ");
        int n = sc.nextInt();

        double[] x = new double[n];
        double[][] tabla = new double[n][n];

        for (int i = 0; i < n; i++) {

            System.out.print("x" + i + ": ");
            x[i] = sc.nextDouble();

            System.out.print("y" + i + ": ");
            tabla[i][0] = sc.nextDouble();
        }

        // Diferencias divididas
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                tabla[i][j] = (tabla[i + 1][j - 1] - tabla[i][j - 1]) / (x[i + j] - x[i]);
            }
        }
        System.out.println("\nTABLA DE DIFERENCIAS DIVIDIDAS\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.printf("%12.4f", tabla[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nCoeficientes:");

        for (int i = 0; i < n; i++) {
            System.out.printf("b%d = %.4f%n", i, tabla[0][i]);
        }
        // Polinomio de Newton
        System.out.println("\nPolinomio de Newton:");

        System.out.print("P(x) = ");

        for (int i = 0; i < n; i++) {
            if (i > 0)
                System.out.print(" + ");

            System.out.printf("(%.4f)", tabla[0][i]);

            for (int j = 0; j < i; j++) {
                System.out.printf("(x - %.4f)", x[j]);
            }
        }
        System.out.println();
        // Polinomio desarrollado para 3 puntos
        if (n == 3) {

            double b0 = tabla[0][0];
            double b1 = tabla[0][1];
            double b2 = tabla[0][2];

            double a2 = b2;

            double a1 = b1 - b2 * (x[0] + x[1]);

            double a0 = b0 - b1 * x[0] + b2 * x[0] * x[1];

            System.out.println("\nPolinomio desarrollado:");

            System.out.printf(
                    "P(x) = %.2fx^2 + %.2fx + %.2f%n", a2, a1, a0);
        }
        char opcion;
        do {

            System.out.print("\nValor de x a evaluar: ");

            double valorX = sc.nextDouble();

            double resultado = tabla[0][0];

            for (int i = 1; i < n; i++) {
                double termino = tabla[0][i];
                for (int j = 0; j < i; j++) {
                    termino *= (valorX - x[j]);
                }
                resultado += termino;
            }

            System.out.printf(
                    "P(%.4f) = %.4f%n", valorX, resultado);

            System.out.print("\n¿Evaluar otro valor? (s/n): ");
            opcion = sc.next().toLowerCase().charAt(0);
        } while (opcion == 's');
    }
}