import java.util.Scanner;

public class Biseccion {

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nMETODO DE BISECCION\n");

        System.out.print("Ingrese f(x) (la funcion): ");
        String funcion = sc.nextLine();

        System.out.print("Ingrese xl (a): ");
        double xl = sc.nextDouble();

        System.out.print("Ingrese xu (b): ");
        double xu = sc.nextDouble();

        System.out.print("Ingrese numero de Iteraciones: ");
        int iteraciones = sc.nextInt();

        System.out.print("¿Conoces la raiz verdadera? (s/n): ");
        char respuesta = sc.next().toLowerCase().charAt(0);

        double raizVerdadera = 0;
        boolean calcularEt = false;

        if (respuesta == 's') {
            System.out.print("Ingrese la raiz verdadera: ");
            raizVerdadera = sc.nextDouble();
            calcularEt = true;
        }

        double xr = 0;
        double xrAnterior = 0;
        double ea = 0;
        double et = 0;

        System.out.printf("%-10s %-12s %-12s %-12s %-12s %-12s%n","Iter", "xl", "xu", "xr", "ea(%)", "et(%)");
        

        for (int i = 1; i <= iteraciones; i++) {xr = (xl + xu) / 2.0;
            double fxl = EvaluadorFuncion.evaluar(funcion, xl);
            double fxr = EvaluadorFuncion.evaluar(funcion, xr);
            if (i == 1) {
                ea = 0;
            } else {
                ea = Math.abs((xr - xrAnterior) / xr) * 100;
            }
            if (calcularEt) {
                et = Math.abs((raizVerdadera - xr) / raizVerdadera) * 100;
                System.out.printf(
                        "%-10d %-12.4f %-12.4f %-12.4f %-12.4f %-12.4f%n", i, xl, xu, xr, ea, et);
            } else {
                System.out.printf("%-10d %-12.4f %-12.4f %-12.4f %-12.4f %-12s%n", i, xl, xu, xr, ea, "N/A");
            }
            if (fxl * fxr < 0) {
                xu = xr;
            } else {
                xl = xr;
            }
            xrAnterior = xr;
        }
        System.out.printf("Raiz aproximada = %.5f%n", xr);
    }
}