import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa una nota: ");
        int nota = entrada.nextInt();
        if (nota >= 9) {
            System.out.println("Sobresaliente");
        } else if (nota >= 7) {
            System.out.println("Notable");
        } else if (nota >= 5) {
            System.out.println("Bien");
        } else {
            System.out.println("Insuficiente");
        }
        entrada.close();
    }
}
