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
        System.out.println(multipliacion(arreglo));
    }

    public static int[] largoArreglo() {
        int n = validarEntrada();
        while (n < 2 || n > 20) {
            System.out.println("El tamaño del arreglo debe estar entre 2 y 20.");
            n = validarEntrada();
        }
        int[] arreglo = new int[n];
        return arreglo;
    }

    public static int validarEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del arreglo (debe ser un número entero): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada no válida. Por favor ingresa un número entero.");
            scanner.next();
        }
        int n = scanner.nextInt();
        return n;
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
            arreglo[i] = rand.nextInt(1001);
        }
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
