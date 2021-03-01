package operacao;

public class Operacao {// parte 3 criar o pocote e a classe operacao --> so vai ter as opera�oes da
						// calculadora

	// parte 4 metodos
	// aqui recebe o que o usuario digitar "num1 e num2(parametros variavel de
	// refrencia(auxiliar))" dentro da classe "Operacao"
	public Double Somar(Double num1, Double num2) {// Parametros(variavel de referencia) //sem o void ele ira retorna o
													// double

		// outra maneira de fazer a opera��o "Double resultado = num1 + num2"
		// return resultado;
		return num1 + num2;

	}

	public Double Multiplicar(Double num1, Double num2) {

		return num1 * num2;
	}

	public Double Subtrair(Double num1, Double num2) {

		Double resultado = num1 - num2;
		return resultado;
	}

	public Double Dividir(Double num1, Double num2) {

		Double resultado = num1 / num2;
		return resultado;
	}

	public Double Resto(Double num1, Double num2) {

		Double resultado = num1 % num2;
		return resultado;
	}

}
