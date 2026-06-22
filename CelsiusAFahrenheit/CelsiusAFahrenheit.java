//Declaramos el paquete al que pertenece la clase
package CelsiusAFahrenheit;
// Declaramos la clase CelsiusAFahrenheit
import java.util.Scanner;
// Método principal
public class CelsiusAFahrenheit {
    
    //
    public static void main(String[] args) {
        // Creamos un objeto Scanner llamado teclado para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);
        // Solicitamos al usuario que introduzca la temperatura en grados Celsius
        System.out.print("Introduce la temperatura en grados Celsius: ");
        // Leemos la temperatura en grados Celsius introducida por el usuario
        double celsius = teclado.nextDouble();
        // Convertimos la temperatura de Celsius a Fahrenheit utilizando la fórmula
        double fahrenheit = celsius * 9 / 5 + 32;
        // Mostramos el resultado de la conversión
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
        // Cerramos el objeto Scanner para liberar recursos
        teclado.close();
    }
}
