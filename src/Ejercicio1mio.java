public class Ejercicio1mio {
    public static void main(String[] args) throws Exception {
        float num1 = 15;
        float num2 = 10;

        if (num1 > num2) {
            System.out.println("La suma es: " + (int) (num1 + num2));
            System.out.println("La diferencia es: " + (int) (num1 - num2));
        } else {
            System.out.println("El producto es: " + (int) (num1 * num2));

            if (num2 != 0) {
                System.out.println("La división es: " + (num1 / num2));
            } else {
                System.out.println("No se puede realizar la división porque el divisor es 0.");
            }
        }
    }
}
