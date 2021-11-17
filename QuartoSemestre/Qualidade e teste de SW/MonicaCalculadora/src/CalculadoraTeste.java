import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTeste {
	private Operacao operator = new Operacao();
	
	@Test
	void testSomar() {
		System.out.println("Testando Metodo Somar");
		double n1 = 5.0;
		double n2 = 5.0;
		
		double resultado = operator.Somar(n1, n2);
		
		double esperadoResultado = 10.0;
		
		assertEquals(esperadoResultado, resultado);
		
		System.out.println("Resultado esperado: "+esperadoResultado + " Resultado: "+resultado+"\n");
		
	}
	
	@Test
	void testDividir() {
		System.out.println("Testando Metodo Dividir");
		double n1 = 6.0;
		double n2 = 2.0;
		
		double resultado = operator.Dividir(n1, n2);
		
		double esperadoResultado = 3.0;
		
		assertEquals(esperadoResultado, resultado);
		System.out.println("Resultado esperado: "+esperadoResultado + " Resultado: "+resultado +"\n");
	}
	
	
	@Test
	void testMultiplicar() {
		System.out.println("Testando Metodo Multiplicar");
		double n1 = 6;
		double n2 = 2;
		
		double resultado = operator.Multiplicar(n1, n2);
		
		double esperadoResultado = 12.0;
		
		assertEquals(esperadoResultado, resultado);
		
		System.out.println("Resultado esperado: "+esperadoResultado + " Resultado: "+resultado +"\n");
		
	}
	
	@Test
	void testSubtrair() {
		System.out.println("Testando Metodo Subtrair");
		double n1 = 6;
		double n2 = 2;
		
		double resultado = operator.Subtrair(n1, n2);
		
		double esperadoResultado = 4.0;
		
		assertEquals(esperadoResultado, resultado);
		
		System.out.println("Resultado esperado: "+esperadoResultado + " Resultado: "+resultado + "\n");
		
	}
	
	@Test
	void testResto() {
		System.out.println("Testando Metodo Resto");
		double n1 = 6;
		double n2 = 2;
		
		double resultado = operator.Resto(n1, n2);
		
		double esperadoResultado = 0;
		
		assertEquals(esperadoResultado, resultado);
		
		System.out.println("Resultado esperado: "+esperadoResultado + " Resultado: "+resultado + "\n");
		
	}


}
