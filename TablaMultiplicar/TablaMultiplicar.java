package TablaMultiplicar;

import java.util.Scanner;
public class TablaMultiplicar {
   
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce un número entero: " );
        int numero = teclado.nextInt();
        
        System.out.println("\nTabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        teclado.close();
    }
}
