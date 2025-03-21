import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayores = 0;
        int menores = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa la nota del alumno " + i + ": ");
            int nota = scanner.nextInt();

            if (nota >= 7) {
                mayores++;
            } else {
                menores++;
            }
        }

        System.out.println("Cantidad de alumnos con notas mayores o iguales a 7: " + mayores);
        System.out.println("Cantidad de alumnos con notas menores a 7: " + menores);

        scanner.close();
    }
}
