package EstacionMes;
import java.util.Scanner;

public class EstacionMes {
    public void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        System.out.print("Introduce el número de mes: ");
        int mes = teclado.nextInt();
         
        //Controlar el numero de mes introducido por el usuario
        if (mes < 1 &&  mes > 12) {
                    System.out.println("El mes introducido no es válido. Por favor, introduce un número entre 1 y 12.");

        }   else {
            switch (mes) {
                case 1:
                case 2:
                case 12:
                    System.out.println("El mes corresponde a la estación de invierno.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("El mes corresponde a la estación de primavera.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("El mes corresponde a la estación de verano.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("El mes corresponde a la estación de otoño.");
                    break;
            }
        }




        teclado.close();
    }
} 
	