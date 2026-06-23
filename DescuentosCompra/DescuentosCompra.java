package DescuentosCompra;
import java.util.Scanner;


public class DescuentosCompra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Solicitamos al usuario que ingrese el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        //Leemos el precio ingresado por el usuario
        double precio = teclado.nextDouble();
      
        //El descuento inicial es 0, y el total a pagar se calculará después de aplicar el descuento
        double descuento = 0;
        double total;

        if (precio >= 100) {
           descuento = precio * 0.15;
        } else if (precio >= 50) {
            descuento = precio * 0.05; 
        }
        total = precio - descuento;
        System.out.println( "El precio del producto es: " + precio);   
        System.out.println("El descuento aplicado es: " + descuento);
        System.out.println("El total a pagar es: " + total);

        teclado.close();
    }
}
