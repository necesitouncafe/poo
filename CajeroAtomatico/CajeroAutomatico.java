package CajeroAtomatico;
import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        // Saldo inicial
        double saldo = 1000.0; 
        
        // Mostramos el menú de opciones al usuario
        System.out.println("1. Consulte su saldo actual: ");

        System.out.println("2.Ingrese dinero en efectivo: ");

        System.out.print("3. Retirar dinero: ");

        int opcion = teclado.nextInt();
        // Evaluamos la opción seleccionada por el usuario
        switch (opcion) {
            case 1:
                System.out.println("Su saldo actual es: " + saldo + " euros");
                break;
            case 2:
                System.out.println("Ingrese la cantidad a depositar: ");
                double deposito = teclado.nextDouble();
                saldo += deposito;
                System.out.println("Depósito realizado. Su nuevo saldo es: " + saldo + " euros");
                break;
            case 3:
                  System.out.println("Ingrese la cantidad a retirar: ");
                double retiro = teclado.nextDouble();

                if (retiro <= saldo) {
                    saldo -= retiro;
                    System.out.println("Operación realizada. Nuevo saldo: " + saldo + "  euros");
                } else {
                    System.out.println("Importe no disponible.");
                }
                break;    

                default:
                   System.out.println("Opción no válida.");

            }

        teclado.close();

    }

}
