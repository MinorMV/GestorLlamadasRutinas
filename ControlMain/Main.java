package ControlMain;

import Logic.GestorLlamadas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorLlamadas gestor = new GestorLlamadas();
        int opcion;

        do {
            System.out.println("\n===== GESTOR DE LLAMADAS A RUTINAS =====");
            System.out.println("1. Llamar a una función");
            System.out.println("2. Finalizar última llamada");
            System.out.println("3. Mostrar pila actual");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la función: ");
                    String nombre = sc.nextLine();

                    System.out.print("Tipo de retorno: ");
                    String tipoRetorno = sc.nextLine();

                    System.out.print("Parámetros: ");
                    String[] parametros = sc.nextLine().split(",");

                    gestor.llamarFuncion(nombre, tipoRetorno, parametros);
                    break;

                case 2:
                    gestor.finalizarLlamada();
                    break;

                case 3:
                    gestor.mostrarPila(); 
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
