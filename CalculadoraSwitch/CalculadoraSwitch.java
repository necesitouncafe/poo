package CalculadoraSwitch;
import java.util.Scanner;

public class CalculadoraSwitch {
  
    public static void main (String[] args) {
       Scanner teclado =new Scanner(System.in);

        //Solicitamos al usuario que introduzca dos números y un operador
        System.out.print("Introduce el primer número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = teclado.nextDouble();

        System.out.print("Introduce el operador (+, -, *, /): ");
        char operador = teclado.next().charAt(0);

        //Usamos un switch para realizar la operación correspondiente según el operador introducido
        switch (operador) {
            
            //Si el usuario introduce +, realizamos la suma
            case '+':
            System.out.println("Resultado: " + (num1 + num2));
            break;
           
            //Si el usuario introduce -, realizamos la resta
            case '-':
            System.out.println("Resultado: " + (num1 - num2));
            break;
           
            //Si el usuario introduce *, realizamos la multiplicación
            case '*':
            System.out.println("Resultado: " + (num1 * num2));
            break;

            //Si el usuario introduce /, realizamos la división
            case '/':
            if (num2 != 0) {
            System.out.println("Resultado: " + (num1 / num2));
            //Si el segundo número es cero, mostramos un mensaje de error
                } else {
                    System.out.println("Error: no se puede dividir entre cero.");
                }
                break;
            //Si el usuario introduce un operador no válido, mostramos un mensaje de error
            default:
                System.out.println("Error: operador no válido.");
        }

     teclado.close();  
    }


}