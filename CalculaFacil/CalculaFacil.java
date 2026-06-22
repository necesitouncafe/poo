//Define el paquete donde está la clase
package CalculaFacil;

//Creamos la clase calculafacil
public class CalculaFacil {

    //Creamos el método main que es el punto de entrada del programa
    public static void main(String[] args) {
        //Definimos dos variables de tipo entero
        int num1 = 20;
        int num2 = 6;
        //definimos variables para almacenar los resultados de las operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int modulo = num1 % num2;

        double division = (double) num1 / num2;

        //Definimos las operaciones y almacenamos los resultados en variables

        //Imprime las variables de tipo entero
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        
        //Imprime los resultados de las operaciones con esas variables  
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
    }
}