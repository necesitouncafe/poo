package ComparaNum;
import java.util.Scanner;

public class ComparaNum {
            public static void main (String [] args){
                Scanner teclado = new Scanner (System.in);
                
                //solicitamos el primer número al usuario
                System.out.print ("Introduzca el primer numerito: ");
                int num1 = teclado.nextInt();
                //solicitamos el segundo número al usuario
                System.out.print ("Introduzca el segundo numerito: ");
                int num2 = teclado.nextInt();
                //Soliticamos el tercer numero al usuario
                System.out.print ("Introduzca el tercer numerito: ");
                int num3 =teclado.nextInt();
               
               
               
                //Comparamos que número es el mayor y mostramos el resultado
                if (num1 > num2 && num1 > num3) {
                    System.out.println("El número mayor es: " + num1);
                                }
                    else if (num2 > num1 && num2 > num3) {
                    System.out.println ("El número mayor es: " + num2);
                                }
                    else if (num3 > num1 && num3 > num2) {
                    System.out.println ("El número mayor es: " + num3);
                                }
                
                //Compartamos si son iguales
                if (num1 == num2 && num1 == num3) {
                    System.out.println ("Los números son iguales");
                                }



            }
}
