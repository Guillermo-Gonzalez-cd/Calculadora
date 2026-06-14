import java.util.Scanner;

public class Inversa{

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nINVERSA DE MATRIZ (GAUSS-JORDAN)\n");

        System.out.print("Ingrese el orden de la matriz (2 o 3): ");
        int n = sc.nextInt();

        double[][] matriz = new double[n][n];
        double[][] aumentada = new double[n][2 * n];

        System.out.println("\nIngrese los elementos de la matriz: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        // Construir matriz aumentada [A / I]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {aumentada[i][j] = matriz[i][j];
            }
            for (int j = n; j < 2 * n; j++) {
                if (j - n == i)
                    aumentada[i][j] = 1;
                else
                    aumentada[i][j] = 0;
            }
        }

        // Método Gauss-Jordan
        for (int i = 0; i < n; i++) {
            double pivote = aumentada[i][i];
            if (pivote == 0) {
                System.out.println(
                        "\nLa matriz no tiene inversa.");
                return;
            }
            // Convertir pivote en 1
            for (int j = 0; j < 2 * n; j++) {aumentada[i][j] /= pivote;
            }

            // Hacer ceros en la columna
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = aumentada[k][i];
                    for (int j = 0; j < 2 * n; j++) {
                        aumentada[k][j] -= factor * aumentada[i][j];
                    }
                }
            }
        }
        System.out.println("\nMatriz Inversa:\n");
        for (int i = 0; i < n; i++) {
            for (int j = n; j < 2 * n; j++) {

                System.out.printf("%12.2f",
                        aumentada[i][j]);
            }
            System.out.println();
        }
    }
}