import java.util.Scanner;

public class InterpolacionLagrange {

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nINTERPOLACION DE LAGRANGE\n");

        System.out.print("Cantidad de puntos (p0, p1, p2, px...): ");
        int n = sc.nextInt();

        double[] x = new double[n];
        double[] y = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x" + i + ": ");
            x[i] = sc.nextDouble();
            System.out.print("y" + i + ": ");
            y[i] = sc.nextDouble();
        }

        System.out.println("\nPolinomio de Lagrange:\n");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.4f * L%d(x)%n",
                    y[i],
                    i);
        }

        System.out.println("\nBases de Lagrange:\n");

        for (int i = 0; i < n; i++) {
            System.out.print("L" + i + "(x) = ");
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    System.out.printf(
                            "(x - %.4f)/(%.4f - %.4f) ", x[j], x[i], x[j]);
                }
            }
            System.out.println();
        }

        char opcion;
        do {

            System.out.print("\nValor de x a evaluar: ");

            double valorX = sc.nextDouble();

            double resultado = 0;

            for (int i = 0; i < n; i++) {
                double Li = 1;
                for (int j = 0; j < n; j++) {

                    if (i != j) {Li *= (valorX - x[j]) / (x[i] - x[j]);
                    }
                }
                resultado += y[i] * Li;
            }

            System.out.printf(
                    "P(%.4f) = %.4f%n", valorX, resultado);

            System.out.print("\n¿Evaluar otro valor? (s/n): ");
            opcion = sc.next().toLowerCase().charAt(0);
        } while (opcion == 's');
    }
}