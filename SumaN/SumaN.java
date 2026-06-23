package SumaN;

import java.util.Scanner;
public class SumaN {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.print ("Escribe un número N: ");
    int N = teclado.nextInt();

    int suma = 0;

    for (int i = 1; i <= N; i++) {
        suma += i;
    }

    System.out.println ("La suma de los primeros " + N + " números es: " + suma);

    teclado.close();    
}
    
}
