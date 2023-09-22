import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ProductoAdyacentes {
    public static void main(String[] args) {
        iniciar();
    }
    public static void iniciar() {
        int largoArreglo = validarLargoArreglo();
        int[] arreglo = generarArregloVacio(largoArreglo);
        llenarArreglo(arreglo);

        System.out.println("Arreglo generado con éxito");
        imprimirArreglo(arreglo);
        System.out.println("Máxima multiplicación de números adyacentes: " + multipliacion(arreglo));
    }

    //Es posible mejorar el código utilizando expresiones regulares de java
    //Investigaremos sobre el tema para aplicarlo en futuros códigos
    public static int entradaUsuario() {
        Scanner scanner = new Scanner(System.in);
        int entradaUsuario = 0;
        try {
            System.out.print("Ingresa el largo del arreglo: ");
            entradaUsuario = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida; debes ingresar un número entero.");
            scanner.nextLine();
        }
        return entradaUsuario;
    }

    public static int validarLargoArreglo() {
        int entradaUsuario;
        do {
            entradaUsuario = entradaUsuario();
            if (entradaUsuario < 2 || entradaUsuario > 20) {
                System.out.println("El número debe estar entre 2 y 20. Intenta de nuevo:");
            }
        } while (entradaUsuario < 2 || entradaUsuario > 20);
        return entradaUsuario;
    }


    public static int[] generarArregloVacio(int largoArreglo) {
        return new int[largoArreglo];
    }

    public static int generarRandom() {
        Random rand = new Random();
        return rand.nextInt(2001) - 1000;
    }

    public static void llenarArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = generarRandom();
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        System.out.println("El arreglo es el siguiente:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i != arreglo.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static int multipliacion(int[] arreglo){
        int maxProducto = arreglo[0] * arreglo[1];

        for (int i = 1; i < arreglo.length - 1; i++) {
            int productoActual = arreglo[i] * arreglo[i + 1];
            if (productoActual > maxProducto) {
                maxProducto = productoActual;
            }
        }

        return maxProducto;
    }
}