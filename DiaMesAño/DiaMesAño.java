package DiaMesAño;

import java.util.Scanner;

public class DiaMesAño {
    public static void main(String[] args) {
      // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Solicitamos al usuario que introduzca el día
        System.out.print ("Introduce el número de días: ");
        //leemos el número de días introducido por el usuario y lo almacenamos en la variable dia
        int dias = teclado.nextInt();
        

         //Para calcular el número de años, dividimos el número de días entre 365 utilizando la división entera
        int anhos = dias / 365;
        int diasRestantes = dias % 365; 

        //Para calcular el número de meses, dividimos el número de días entre 30 utilizando la división entera
        int meses = diasRestantes / 30;
        int diasFinales = diasRestantes % 30;
       
     
        //Mostramos el resultado al usuario
         // Resultado
        System.out.println(dias + " días equivalen a:");
        System.out.println(anhos + " anhos, " + meses + " meses y " + diasRestantes + " días");

        teclado.close();
        
    }
}