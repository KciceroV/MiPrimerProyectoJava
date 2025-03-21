import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El número mayor es: " + numero2);
        } else {
            System.out.println("Los números son iguales. Deben ser distintos.");
        }

        scanner.close();
    }
}
