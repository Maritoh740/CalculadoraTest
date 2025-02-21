import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;
public class calculadoraTest {
    private static calculadora calc;

    @BeforeAll
    static void setup() {
        calc = new calculadora();
    }

    @Test
    void pru_suma_dosNumeros() {
        assertEquals(16, calc.suma(8, 8), "La suma de 8 + 8 debe ser 16");
    }

    @Test
    void pru_resta_dosNumeros() {
        assertEquals(0, calc.resta(4, 4), "La resta de 4 - 4 debe ser 0");
    }

    @Test
    void pru_multiplicacion_dosNumeros() {
        assertEquals(24, calc.multiplica(8, 3), "La multiplicación de 8 * 3 debe ser 24");
    }

    @Test
    void pru_division_dosNumeros() {
        assertEquals(5, calc.divide(100, 20), "La división de 100 / 20 debe ser 5");
    }

    @Test
    void pru_division_porCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }

    @Test
    void pru_potencia_dosNumeros() {
        assertEquals(9, calc.potencia(3, 2), "3 elevado a 2 debe ser 9");
    }

    @Test
    void pru_raizCuadrada_numeroPositivo() {
        assertEquals(3, calc.raizCuadrada(9), "La raíz cuadrada de 9 debe ser 3");
    }

    @Test
    void pru_raizCuadrada_numeroNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.raizCuadrada(-9));
        assertEquals("No se puede calcular la raíz cuadrada de un número negativo", exception.getMessage());
    }

    @Test
    void pru_logaritmoNatural_numeroPositivo() {
        assertEquals(Math.log(10), calc.logaritmoNatural(10), "El logaritmo natural de 10 debe coincidir");
    }

    @Test
    void pru_logaritmoNatural_numeroNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.logaritmoNatural(-1));
        assertEquals("El logaritmo natural solo está definido para números positivos", exception.getMessage());
    }

    @AfterAll
    static void teardown() {
        calc = null;

    }
}
