import java.util.Scanner;

public class Hospital {
    // Variables Estáticas
    private static final int minNuss = 100000;
    private static final int maxNuss = 999999;
    private static final int minPrioridad = 0;
    private static final int maxPrioridad = 5;
    private static final int minTemperatura = 27;
    private static final int maxTemperatura = 45;
    private static final String sinDolor = "Dolor";
    private static final String sinLesion = "Lesión Traumática";
    private static final String sinFiebre = "Fiebre Alta";
    private static final String sinConfusion = "Confusión o desorientación";
    private static final String expDolor1 = "Dolor torácico";
    private static final String expDolor2 = "Dolor abdominal";
    private static final String expDolor3 = "Dolor de cabeza";
    private static final String expDolor4 = "Migraña";
    private static final String expLesion1 = "Fractura ósea";
    private static final String expLesion2 = "Herida de Bala";
    private static final String expLesion3 = "Quemadura";
    private static final String expLesion4 = "Lesión cerebral traumática";
    private static final String expFiebre1 = "Neumonía";
    private static final String expFiebre2 = "Meningitis";
    private static final String expFiebre3 = "Infección viral";
    private static final String expFiebre4 = "Reacción Alérgica";
    private static final String expConfusion1 = "Intoxicación por drogas o alcohol";
    private static final String expConfusion2 = "Deshidratación Severa";
    private static final String expConfusion3 = "Accidente cerebrovascular";
    private static final String expConfusion4 = "Hipoglucemia severa";
    private static String finSintoma = "";
    private static String finExploracion = "";
    private static int finNuss = 0;
    private static int finPrioridad = 0;
    private static int finTemperatura = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static boolean checkFunction(int valorFunction, int input) {
        switch (valorFunction) {
            case 1:
                return input >= minNuss && input <= maxNuss;
            default:
                break;
        }
        return false;
    }

    public static int getInt(String inputMsg, String errorMsg, int valorFunction) {
        boolean exit = false;
        String msg = inputMsg;
        while (!exit) {
            System.out.print(msg);
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                if (checkFunction(valorFunction, numero)) {
                    exit = true;
                    return numero;
                }
            } else {
                msg = errorMsg;
                scanner.next();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // Declaro un booleano como comprobador, inicializo en true para poder entrar.
        boolean comprobador = true;
        // Solo se puede salir del while cuando se elijan opciones validas que permiten
        // llegar a la actualización de la variable "comprobador"
        String msg = "Bienvenido, introduzca su NUSS por favor: ";
        String errorMsg = "NUSS irreconocible, introduzca nuevamente su NUSS por favor: ";
        finNuss = getInt(msg, errorMsg, 1);
        System.out.println(
                "\n¿Síntoma?: \n\r" + sinDolor + "(0)\n\r" + sinLesion + "(1)\n\r" + sinFiebre
                        + "(2)\n\r" + sinConfusion + "(3)\n");
        while (!comprobador) {
            int sintoma = scanner.nextInt();
            switch (sintoma) {
                case 0:
                    comprobador = true;
                    finSintoma = sinDolor;
                    break;
                case 1:
                    comprobador = true;
                    finSintoma = sinLesion;
                    break;
                case 2:
                    comprobador = true;
                    finSintoma = sinFiebre;
                    break;
                case 3:
                    comprobador = true;
                    finSintoma = sinConfusion;
                    break;
                default:
                    // Si se da un caso no permitido se manda un mensaje de error y no se sale del
                    // while para pedir los datos nuevamente.
                    System.out.println(
                            "\nError al elegir síntoma, intentelo de nuevo. Las opciones son: \n\r" + sinDolor
                                    + "(0)\n\r" + sinLesion + "(1)\n\r" + sinFiebre + "(2)\n\r"
                                    + sinConfusion + "(3)\n");
            }
        }
        if (finSintoma == sinDolor) {
            System.out.println(
                    "\n¿Exploración?: \n\r" + expDolor1 + "(0)\n\r" + expDolor2 + "(1)\n\r"
                            + expDolor3
                            + "(2)\n\r" + expDolor4 + "(3)\n");
            while (comprobador) {
                int exploracion = scanner.nextInt();
                switch (exploracion) {
                    case 0:
                        comprobador = false;
                        finExploracion = expDolor1;
                        break;
                    case 1:
                        comprobador = false;
                        finExploracion = expDolor2;
                        break;
                    case 2:
                        comprobador = false;
                        finExploracion = expDolor3;
                        break;
                    case 3:
                        comprobador = false;
                        finExploracion = expDolor4;
                        break;
                    default:
                        System.out.println(
                                "\nError al elegir exploración, intentelo de nuevo. Las opciones son: \n\r"
                                        + expDolor1 + "(0)\n\r" + expDolor2 + "(1)\n\r"
                                        + expDolor3
                                        + "(2)\n\r" + expDolor4 + "(3)\n");
                }
            }
        } else if (finSintoma == sinLesion) {
            System.out.println(
                    "\n¿Exploración?: \n\r" + expLesion1 + "(0)\n\r" + expLesion2 + "(1)\n\r"
                            + expLesion3
                            + "(2)\n\r" + expLesion4 + "(3)\n");
            while (comprobador) {
                int exploracion = scanner.nextInt();
                switch (exploracion) {
                    case 0:
                        comprobador = false;
                        finExploracion = expLesion1;
                        break;
                    case 1:
                        comprobador = false;
                        finExploracion = expLesion2;
                        break;
                    case 2:
                        comprobador = false;
                        finExploracion = expLesion3;
                        break;
                    case 3:
                        comprobador = false;
                        finExploracion = expLesion4;
                        break;
                    default:
                        System.out.println(
                                "\nError al elegir exploración, intentelo de nuevo. Las opciones son: \n\r"
                                        + expLesion1 + "(0)\n\r" + expLesion2 + "(1)\n\r"
                                        + expLesion3
                                        + "(2)\n\r" + expLesion4 + "(3)\n");
                }
            }
        } else if (finSintoma == sinFiebre) {
            System.out.println(
                    "\n¿Exploración?: \n\r" + expFiebre1 + "(0)\n\r" + expFiebre2 + "(1)\n\r"
                            + expFiebre3
                            + "(2)\n\r" + expFiebre4 + "(3)\n");
            while (comprobador) {
                int exploracion = scanner.nextInt();
                switch (exploracion) {
                    case 0:
                        comprobador = false;
                        finExploracion = expFiebre1;
                        break;
                    case 1:
                        comprobador = false;
                        finExploracion = expFiebre2;
                        break;
                    case 2:
                        comprobador = false;
                        finExploracion = expFiebre3;
                        break;
                    case 3:
                        comprobador = false;
                        finExploracion = expFiebre4;
                        break;
                    default:
                        System.out.println(
                                "\nError al elegir exploración, intentelo de nuevo. Las opciones son: \n\r"
                                        + expFiebre1 + "(0)\n\r" + expFiebre2 + "(1)\n\r"
                                        + expFiebre3
                                        + "(2)\n\r" + expFiebre4 + "(3)\n");
                }
            }
        } else if (finSintoma == sinConfusion) {
            System.out.println(
                    "\n¿Exploración?: \n\r" + expConfusion1 + "(0)\n\r" + expConfusion2 + "(1)\n\r"
                            + expConfusion3
                            + "(2)\n\r" + expConfusion4 + "(3)\n");
            while (comprobador) {
                int exploracion = scanner.nextInt();
                switch (exploracion) {
                    case 0:
                        comprobador = false;
                        finExploracion = expConfusion1;
                        break;
                    case 1:
                        comprobador = false;
                        finExploracion = expConfusion2;
                        break;
                    case 2:
                        comprobador = false;
                        finExploracion = expConfusion3;
                        break;
                    case 3:
                        comprobador = false;
                        finExploracion = expConfusion4;
                        break;
                    default:
                        System.out.println(
                                "\nError al elegir exploración, intentelo de nuevo. Las opciones son: \n\r"
                                        + expConfusion1 + "(0)\n\r" + expConfusion2 + "(1)\n\r"
                                        + expConfusion3
                                        + "(2)\n\r" + expConfusion4 + "(3)\n");
                }
            }
        }
        System.out.print("\nNivel de prioridad [0: Baja] - [5: Alta]: ");
        while (!comprobador) {
            finPrioridad = scanner.nextInt();
            if (finPrioridad < minPrioridad || finPrioridad > maxPrioridad) {
                System.out.print("\nError, introduzca la prioridad de nuevo por favor: ");
            } else {
                comprobador = true;
            }
        }
        System.out.print("\nTemperatura [27: Baja] - [45: Alta]: ");
        while (comprobador) {
            finTemperatura = scanner.nextInt();
            if (finTemperatura < minTemperatura || finTemperatura > maxTemperatura) {
                System.out.print("\nError, introduzca la temperatura de nuevo por favor: ");
            } else {
                comprobador = false;
            }
        }
        System.out.println("\nLos datos del paciente son los siguientes: \n");
        System.out.println("NUSS: \t\t" + finNuss + "\n\r" + "Síntoma: \t" + finSintoma + "\n\r" + "Exploración: \t"
                + finExploracion + "\n\r" + "Prioridad: \t" + finPrioridad + "\n\r" + "Temperatura: \t"
                + finTemperatura);
        scanner.close();
    }
}