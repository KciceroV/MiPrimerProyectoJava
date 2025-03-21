import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Ingresa el segundo nombre: ");
        String nombre2 = scanner.nextLine();

        if (nombre1.compareToIgnoreCase(nombre2) < 0) {
            System.out.println(nombre1);
            System.out.println(nombre2);
        } else if (nombre1.compareToIgnoreCase(nombre2) > 0) {
            System.out.println(nombre2);
            System.out.println(nombre1);
        } else {
            System.out.println("Ambos son iguales.");
        }

        scanner.close();
    }
}