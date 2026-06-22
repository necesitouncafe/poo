//Creamos la clase Rectangulo
public class AreaPerimetroRectangulo {
    //Creamos el método main que es el punto de entrada del programa
        public static void main(String[] args) {

        // Declaramos la base y la altura
        double base = 10.5;
        double altura = 4.2;

        // Calculamos el área (base × altura)
        double area = base * altura;

        // Calculamos el perímetro (2 × (base + altura))
        double perimetro = 2 * (base + altura);

        //Mostramos la base
        System.out.println("Base: " + base);
        // Mostramos la altura
        System.out.println("Altura: " + altura);

        //Mostramos el área
        System.out.println("Área del rectángulo: " + area);
        // Mostramos el perímetro
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }
}