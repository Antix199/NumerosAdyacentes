import java.util.Scanner;
public class ProductoAdyacentes {
    public static void main(String[] args) {
    iniciar();
    }

    public static void iniciar(){
        int[] arreglo = largoArreglo();
        imprimirArreglo(arreglo);
    }
    public static int[] largoArreglo() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Ingresa el tamaño del arreglo (debe ser mayor que 2 y par): ");
            n = scanner.nextInt();
        } while (n <= 2);
        int[] arreglo = new int[n];
        return arreglo;
    }

    public static void imprimirArreglo(int[] arreglo) {
        System.out.println("El arreglo es:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }


}