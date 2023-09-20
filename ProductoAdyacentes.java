import java.util.Scanner;
import java.util.Random;

public class ProductoAdyacentes {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int[] arreglo = largoArreglo();
        generarRandom(arreglo);
        imprimirArreglo(arreglo);
    }

    public static int[] largoArreglo() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Ingresa el tamaño del arreglo (debe ser mayor que 2 y menor a 20): ");
            n = scanner.nextInt();
        } while (n < 2 || n > 20);
        int[] arreglo = new int[n];
        return arreglo;
    }

    public static void imprimirArreglo(int[] arreglo) {
        System.out.println("El arreglo es:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i != arreglo.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void generarRandom(int[] arreglo) {
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextInt(1001); // Números entre -1000 y 1000
        }
    }
}
