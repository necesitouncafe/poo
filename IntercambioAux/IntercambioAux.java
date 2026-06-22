//declaramos el paquete al que pertenece la clase
package IntercambioAux;
// Importamos la clase Scanner para leer la entrada del usuario
import java.util.Scanner;
// Declaramos la clase IntercambioAux
public class IntercambioAux {

    // Método principal
    public static void main(String[] args) {
        // Creamos un objeto Scanner llamado teclado para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);
        // Solicitamos al usuario que introduzca los valores de a y b
        System.out.print("Introduce el valor de a: ");
        // Leemos el valor de a introducido por el usuario
        int a = teclado.nextInt();
        // Solicitamos al usuario que introduzca el valor de b
        System.out.print("Introduce el valor de b: ");
        // Leemos el valor de b introducido por el usuario    
        int b = teclado.nextInt();
        // mostramos los valores de a y b antes del intercambio
        System.out.println("Antes del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // Intercambiamos los valores de a y b utilizando una variable auxiliar
        // Creamos una variable auxiliar para almacenar temporalmente el valor de a
        int auxiliar = a;
        // Asignamos el valor de b a a
        a = b;
        // Asignamos el valor de la variable auxiliar (que contiene el valor original de a) a b
        b = auxiliar;
        // mostramos los valores de a y b después del intercambio
        System.out.println("Después del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // Cerramos el objeto Scanner para liberar recursos
        teclado.close();
    }
}