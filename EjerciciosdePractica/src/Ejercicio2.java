import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos a comparar\n\r dos números decimales a ver cual es más grande");
        Thread.sleep(4000);
        System.out.print("Dame un número decimal:");
        double numero1 = entrada.nextDouble();
        System.out.print("Dame otro número decimal:");
        double numero2 = entrada.nextDouble();
        if (numero1 > numero2) {
            System.out.print(numero1 + " es el número más grande");
        } else if (numero1 < numero2) {
            System.out.print(numero2 + " es el número más grande");
        } else {
            System.out.print("Los dos números son iguales");
        }

        entrada.close();
    }
}
