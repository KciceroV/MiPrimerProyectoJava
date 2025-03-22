import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de empleados:");
        int n = scanner.nextInt();

        int contador100a300 = 0;
        int contadorMayor300 = 0;
        int totalSueldos = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el sueldo del empleado " + (i + 1) + ":");
            int sueldo = scanner.nextInt();

            totalSueldos += sueldo;

            if (sueldo >= 100 && sueldo <= 300) {
                contador100a300++;
            } else if (sueldo > 300) {
                contadorMayor300++;
            }
        }

        System.out.println("Empleados que cobran entre $100 y $300: " + contador100a300);
        System.out.println("Empleados que cobran más de $300: " + contadorMayor300);
        System.out.println("Gasto total en sueldos: " + totalSueldos);

        scanner.close();
    }
}