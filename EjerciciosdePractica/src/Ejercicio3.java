import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dame un número:");
        int numero1 = entrada.nextInt();
        System.out.print("Dame otro número:");
        int numero2 = entrada.nextInt();
        boolean mayor = numero1 > numero2;
        if (mayor) {
            System.out.print(numero1 + " es mayor");
        } else {
            System.out.print(numero2 + " es mayor");
        }
        entrada.close();
    }
}
