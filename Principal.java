import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\nCALCULADORA DE METODOS NUMERICOS");
            System.out.println("1. Metodo de Biseccion");
            System.out.println("2. Metodo de Newton-Raphson");
            System.out.println("3. Metodo de la Secante");
            System.out.println("4. Inversa de Matriz");
            System.out.println("5. Interpolacion de Newton");
            System.out.println("6. Interpolacion de Lagrange");
            System.out.println("7. Salir");

            System.out.print("\nSeleccionaste: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    Biseccion.ejecutar();
                    break;

                case 2:
                    Newton.ejecutar();
                    break;

                case 3:
                    Secante.ejecutar();
                    break;

                case 4:
                    Inversa.ejecutar();
                    break;
                case 5:
                    InterpolacionNewton.ejecutar();
                    break;

                case 6:
                    InterpolacionLagrange.ejecutar();
                    break;

                case 7:
                    System.out.println("\nHasta la vista.");
                    break;

                default:
                    System.out.println("\nOpcion invalida.");
            }
        } while(opcion != 7);
        sc.close();
    }
}