package ControlAccesos;
import java.util.Scanner;

public class ControlAccesos {
    public static void main(String[] args ) {
        Scanner teclado =new Scanner(System.in);

        System.out.print("Introduce tu edad, por favor: ");
        int edad = teclado.nextInt();
        
        //Preguntamos al usuario si tiene una invitación y leemos su respuesta
        System.out.print("¿Tienes invitación al guachiclub?: ");
        //Leemos la respuesta del usuario y la convertimos a un valor booleano
        boolean tieneInvitacion = teclado.nextBoolean();

        //Verificamos si el usuario es mayor de edad y tiene invitación para permitirle el acceso al guachiclub
        if (edad >= 18 && tieneInvitacion) {
            System.out.println("¡Bienvenid@ al guachiclub!");
        //Si el usuario no cumple con los requisitos, le mostramos un mensaje de acceso denegado
        } else {
            System.out.println("Lo siento, acceso no permitido al guachiclub.");
        }


        teclado.close();


    }

}

 
