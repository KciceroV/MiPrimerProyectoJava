import java.util.Scanner;

public class ComparacionNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print(" Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print(" Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 < numero3) {
            System.out.println("El primer número es mayor que el segundo y menor que el tercero.");
        } else {
            System.out.println("El primer número NO cumple la condición de ser mayor que el segundo y menor que el tercero.");
        }
        
        scanner.close();
        
    }
}