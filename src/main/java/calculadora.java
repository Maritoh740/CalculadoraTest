public class calculadora {

    // Método para sumar dos números
    public int suma(int a, int b) {
        return a + b;
    }
    // Método para restar dos números
    public int resta(int a, int b) {
        return a - b;
    }
    // Método para multiplicar dos números
    public int multiplica(int a, int b) {
        return a * b;
    }
    // Método para dividir dos números
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }
    // Método para calcular la potencia
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    // Método para calcular la raíz cuadrada
    public double raizCuadrada(double numero) {
        if (numero < 0) {

            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(numero);
    }
    // Método para calcular el logaritmo natural
    public double logaritmoNatural(double numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("El logaritmo natural solo está definido para números positivos");
        }
        return Math.log(numero);
    }
}
