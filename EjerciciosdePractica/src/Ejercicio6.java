import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        boolean comprobador = false;
        Scanner entrada = new Scanner(System.in);
        //int dia = Integer.valueOf(args[0]); <--- Con esto comentando todas las lineas que contengan el scanner puedo pedir el numero directamente al fichero compilado.
        while (!comprobador) {
            System.out.print("Escribe un número del 1 al 7 para elegir un dia de la semana:");
            int dia = entrada.nextInt();
            if (dia > 7) {
                System.out.println("1 2 1 2 no os olvideis del 3 maldicion discapacitado otra vez");
            } else {
                comprobador = true;
                switch (dia) {
                    case 1:
                        System.out.print("El día elegido es el Lunes");
                        break;
                    case 2:
                        System.out.print("El día elegido es el Martes");
                        break;
                    case 3:
                        System.out.print("El día elegido es el Miércoles");
                        break;
                    case 4:
                        System.out.print("El día elegido es el Jueves");
                        break;
                    case 5:
                        System.out.print("El día elegido es el Viernes");
                        break;
                    case 6:
                        System.out.print("El día elegido es el Sábado");
                        break;
                    case 7:
                        System.out.print("El día elegido es el Domingo");
                        break;
                }
            }
        }
        entrada.close();
    }
}
