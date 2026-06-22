package EvaluarNota;

import java.util.Scanner;

public class EvaluarNota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una nota (0 a 10): ");
        double nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida.");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 7) {
            System.out.println("Suficiente");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }

        sc.close();
    }
}