//Declaramos el paquete al que pertenece la clase
package ParImpar;
// Declaramos la clase ParImpar
import java.util.Scanner;
// Método principal
public class ParImpar {
//
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        teclado.close();
    }
}