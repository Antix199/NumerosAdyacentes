import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoAdyacentesTest {

    @Test
    public void testProductoAdyacentesValoresNegativos() {
        int[] arreglo = {-2, -3, -5, -7, -11};
        int resultadoEsperado = 77;
        assertEquals(resultadoEsperado, ProductoAdyacentes.productoAdyacentes(arreglo));
    }
    @Test
    public void testProductoAdyacentesMezclaPositivosNegativos() {
        int[] arreglo = {-2, 3, -5, 7, -11};
        int resultadoEsperado = -6;
        assertEquals(resultadoEsperado, ProductoAdyacentes.productoAdyacentes(arreglo));
    }

    @Test
    public void testProductoAdyacentesMultiplesPares() {
        int[] arreglo = {2, 5, 2, 5, 2, 5};
        int resultadoEsperado = 10;
        assertEquals(resultadoEsperado, ProductoAdyacentes.productoAdyacentes(arreglo));
    }
    @Test
    public void testProductoAdyacentesConCeros() {
        int[] arreglo = {0, 0, 0, 0, 0, 0};
        int resultadoEsperado = 0; // 7 * 8
        assertEquals(resultadoEsperado, ProductoAdyacentes.productoAdyacentes(arreglo));
    }

    @Test
    public void testProductoAdyacentesRepetidos() {
        int[] arreglo = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,};
        int resultadoEsperado = 81; // 7 * 8
        assertEquals(resultadoEsperado, ProductoAdyacentes.productoAdyacentes(arreglo));
    }

}
