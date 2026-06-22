//  El programa IntercambioSinAux intercambia los valores de dos variables enteras sin utilizar una variable auxiliar.
package IntercambioSinAux;
// Importamos la clase Scanner para leer la entrada del usuario
import java.util.Scanner;
// Declaramos la clase IntercambioSinAux
public class IntercambioSinAux {
    //Método principal  
    public static void main(String [] args){
        // Creamos un objeto Scanner llamado teclado para leer la entrada del usuario
        Scanner teclado=new Scanner(System.in);

        // Solicitamos al usuario que introduzca los valores de a y b
        System.out.print ("Introduce el valor de a: ");
        // Leemos el valor de a introducido por el usuario
        int a=teclado.nextInt();

        // Solicitamos al usuario que introduzca el valor de b
        System.out.print("Introduce el valor de b: ");
        // Leemos el valor de b introducido por el usuario
        int b=teclado.nextInt();

        // mostramos los valores de a y b antes del intercambio
        System.out.println("Antes del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // Intercambiamos los valores de a y b sin utilizar una variable auxiliar
        a = a + b;
        b = a - b;
        a = a -b;

        //Mostramos los valores de a y b después del intercambio
        System.out.println("Valores después del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Cerramos el objeto Scanner para liberar recursos
        teclado.close();
        }

}