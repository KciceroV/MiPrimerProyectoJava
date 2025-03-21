import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingresa la segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingresa la tercera nota: ");
        double nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Promedio: " + promedio);

        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else if (promedio >= 4) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
        }

        scanner.close();
    }
}
