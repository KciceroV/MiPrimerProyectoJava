import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaración de la variable
        int i;

        // Solicitar al usuario un valor para la variable
        System.out.print("Introduce un número a ver si lo adivinas: ");
        i = scanner.nextInt();

        // Estructura if-else para comparar el valor de 'i'
        if (i == 0 || i == 6 || i == 8) {
            System.out.print("adivinaste");
        } else {
            System.out.println("No tienes adivinaste");
        }

        scanner.close(); // Cerramos el scanner para evitar fugas de recursos
    }
}