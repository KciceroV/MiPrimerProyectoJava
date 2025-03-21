import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el sueldo del operario: ");
        double sueldo = scanner.nextDouble();

        System.out.print("Ingresa los años de antigüedad del operario: ");
        int antiguedad = scanner.nextInt();

        if (sueldo < 500 && antiguedad >= 10) {
            sueldo += sueldo * 0.20;
            System.out.println("Se otorga un aumento del 20%. El sueldo a pagar es: $" + sueldo);
        } else if (sueldo < 500 && antiguedad < 10) {
            sueldo += sueldo * 0.05;
            System.out.println("Se otorga un aumento del 5%. El sueldo a pagar es: $" + sueldo);
        } else if (sueldo >= 500) {
            System.out.println("El sueldo es de $" + sueldo + " y no tiene cambios.");
        }

        scanner.close();
    }
}
