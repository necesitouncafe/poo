package Login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        
        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "1234XYZ";

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el usuario: ");
        String usuario = teclado.nextLine();

        System.out.print("Introduce la contraseña: ");
        String contrasena = teclado.nextLine();

        if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
        System.out.println("Login correcto. Bienvenido.");
        } else {
        System.out.println("Usuario o contraseña incorrectos.");
        }

        teclado.close();
    }
}