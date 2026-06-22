//Declaramos el paquete RadarMulta
package RadarMulta;
//Declaramos la clase RadarMulta
public class RadarMulta {
    // Método principal
    public static void main(String[] args) {
        // Declaración de variables para la velocidad límite y la velocidad capturada
        int limiteVelocidad = 120;
        double velocidadCapturada = 125.75;


//Aquí truncamos de un double a un int, eliminando los decimales
        int velocidadTruncada = (int) velocidadCapturada;
        // Mostrar la velocidad capturada y truncada
        System.out.println("Velocidad capturada (truncada): " + velocidadTruncada + " km/h");
        // Comprobación de si la velocidad capturada supera el límite
        if (velocidadTruncada > limiteVelocidad) {
            System.out.println("El conductor debe ser multado.");
        } else {
            System.out.println("El conductor no debe ser multado.");
        }
    }
}