import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoAdyacentesTest {

    @Test
    public void testProductoAdyacenteValoresNegativos() {
        int[] arreglo = {-2, -3, -5, -7, -11};
        int resultadoEsperado = 77;
        assertEquals(resultadoEsperado, ProductoAdyacentes.productoAdyacente(arreglo));
    }
    @Test
    public void testProductoAdyacenteMezclaPositivosNegativos() {
        int[] arreglo = {-2, 3, -5, 7, -11};
        int resultadoEsperado = -6;
        assertEquals(resultadoEsperado, ProductoAdyacentes.productoAdyacente(arreglo));
    }

    @Test
    public void testProductoAdyacenteMultiplesPares() {
        int[] arreglo = {2, 5, 2, 5, 2, 5};
        int resultadoEsperado = 10;
        assertEquals(resultadoEsperado, ProductoAdyacentes.productoAdyacente(arreglo));
    }
    @Test
    public void testProductoAdyacenteConCeros() {
        int[] arreglo = {0, 0, 0, 0, 0, 0};
        int resultadoEsperado = 0; // 7 * 8
        assertEquals(resultadoEsperado, ProductoAdyacentes.productoAdyacente(arreglo));
    }

    @Test
    public void testProductoAdyacenteRepetidos() {
        int[] arreglo = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,};
        int resultadoEsperado = 81; // 7 * 8
        assertEquals(resultadoEsperado, ProductoAdyacentes.productoAdyacente(arreglo));
    }

}