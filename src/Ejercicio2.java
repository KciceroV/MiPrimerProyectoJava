import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        float nota1 = sc.nextFloat();
        System.out.print("Ingrese la segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.print("Ingrese la tercera nota: ");
        float nota3 = sc.nextFloat();  //buscar especificamente en que casos usar el float

        float promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {
            System.out.println("Promocionado"); //repasar esta parte que me tocó buscarla por ia
        } else {
            System.out.println("No promocionado"); //esta igual
        }

        sc.close();
    }
}

