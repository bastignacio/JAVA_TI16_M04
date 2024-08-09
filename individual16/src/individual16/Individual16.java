package individual16;

import java.util.Scanner;

public class Individual16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String contrasenaCorrecta = "estaesunacontrasena", contrasena = null;
        int intentos = 3;

        while (intentos > 0) {

            System.out.println("Ingrese la contraseña del sistema: ");
            contrasena = scanner.nextLine();

            if (contrasena.equals(contrasenaCorrecta)) {
                System.out.println("La contraseña ingresada es la correcta, accediendo al sistema ...");
                break;

            } else {
                intentos--;
                System.out.println("#ERROR# La contraseña ingresada no es correcta");

                if (intentos > 0) {
                    System.out.println("Intentos disponibles: " + intentos);
                } else {
                    System.out.println("#BLOQUEO# El ingreso se ha bloqueado, ya no puede acceder al sistema");
                }
            }
        }
        scanner.close();
    }
}
