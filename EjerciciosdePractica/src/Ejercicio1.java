import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un Número:");

        int numeroInt = entrada.nextInt();
        byte numeroByte = (byte) numeroInt;
        short numeroShort = (short) numeroInt;
        long numeroLong = (long) numeroInt;
        
        System.out.println("Valor como Int:" + numeroInt);
        System.out.println("Valor como byte:" + numeroByte);
        System.out.println("Valor como Short:" + numeroShort);
        System.out.println("Valor como Long:" + numeroLong);
        entrada.close();
    }
}
