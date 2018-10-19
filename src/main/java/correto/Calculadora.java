package correto;

public class Calculadora {
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtrai(int a, int b) {
		return a - b;
	}
	
	public static double divide(int a, int b) throws IllegalArgumentException {
		if (b == 0) {
			throw new IllegalArgumentException("b cannot be zero.");
		}
		return (double)a / (double)b;
	}
}
