import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el sueldo de la persona: ");
        double sueldo = scanner.nextDouble();

        if (sueldo > 3000) {
            System.out.println("El sueldo supera los 3000 dólares. Debe abonar impuestos.");
        } else {
            System.out.println("El sueldo no supera los 3000 dólares. No debe abonar impuestos.");
        }

        scanner.close();
    }
}
