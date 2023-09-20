import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ProductoAdyacentes {
    public static void main(String[] args) {

        int[] arreglo = generarArregloVacio(largoArreglo);
        llenarArreglo(arreglo);

        // Imprimir el arreglo generado
        System.out.println("Arreglo generado:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }


    }
    //expresiones regulares java
    public static int validarEntrada() {
        Scanner scanner = new Scanner(System.in);
        int largoArreglo;
        try{
            do {
                System.out.print("Ingresa el largo del arreglo (entre 2 y 20): ");
                largoArreglo = scanner.nextLine();
            } while (largoArreglo < 2 || largoArreglo > 20);
            return largoArreglo;}
        catch (InputMismatchException e){
            System.out.println("Entrada no válida; ingresar un número");
            Scanner.nextLine();

        }
        Scanner.close();
    }

    public static int[] generarArregloVacio(int largoArreglo) {
        return new int[largoArreglo];
    }

    public static void llenarArreglo(int[] arreglo) {
        Random random = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(2001) - 1000;
        }
    }
}
