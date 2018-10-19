package testando;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


import correto.Calculadora;
import correto.Triangle;

public class TriangleTest {
	@Test
	public void testaTriangulo() {
		int resultado = Triangle.Type_Area(2,  3, 4);
		assertThat(resultado, is(1));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testaDivisaoPorZero() {
		Calculadora.divide(2,  0);
	}
}
