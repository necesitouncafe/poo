//Declaramos la clase PrecioIva
public class PrecioIva {

    // Método principal
         public static void main(String[] args) {

        // Precio del producto
        double precio = 100.0;
        // Constante IVA (21%)
        final double IVA = 0.21;

        // Cálculo del precio final
        double precioFinal = precio + (precio * IVA);

        // Mostrar resultado formateado
        System.out.println("Precio sin IVA: " + precio + " €");
        System.out.println("IVA: " + (IVA * 100) + " %");
        System.out.println("Precio final con IVA: " + precioFinal + " €");
    }
}