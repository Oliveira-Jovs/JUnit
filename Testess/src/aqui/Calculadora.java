package aqui;

public class Calculadora {
	
	
	// Método para somar dois números
	public int somar(int a, int b) {
	    return a + b;
	}

	// Método para subtrair dois números
	public int subtrair(int a, int b) {
	    return a - b;
	}

	// Método para multiplicar dois números
	public int multiplicar(int a, int b) {
	    return a * b;
	}

	// Método para dividir dois números
	public double dividir(float a, float b) {
	    if (b == 0) {
	        throw new IllegalArgumentException("Divisor não pode ser zero porra");
	    }
	    return a / b;
	}

	


}
