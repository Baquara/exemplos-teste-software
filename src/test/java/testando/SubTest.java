package testando;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


import correto.Calculadora;

public class SubTest {
	@Test
	public void testaSubtracao() {
		int resultado = Calculadora.subtrai(2,  3);
		assertThat(resultado, is(5));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testaDivisaoPorZero() {
		Calculadora.divide(2,  0);
	}
}
