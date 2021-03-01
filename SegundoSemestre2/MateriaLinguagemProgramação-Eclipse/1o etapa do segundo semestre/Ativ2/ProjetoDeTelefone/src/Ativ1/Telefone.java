package Ativ1;

public class Telefone {
	//atributos(características) nome de atributos minusculos:
	//atributos é padrão colocar aqui em cima, mas pode colocar em outro lugar
	String cor;
	String contato;
	String marca;
	
	/*public= publico, pode ser acessado pela classe principal ou outras classes. 
	 * void=Como não precisa de resposta, então usa o void 
	 * pra não ter retorno de resposta nem uma. Por exemplo Boolean
	 * no lugar do void.
	 */
	//metodo sempre no infinito e com letra maiuscula no inicio
	//Metodos são nossas ações, funcionalidades
	public void Ligar(String cont) {//metodo(comportamento) Ligar //variavel(Cont(parametro que o metodo ta recebendo) de contato) qualquer, pra o telefone ligar ele precisa do contato
		// pode atribuir atributo com o paramentro: mas se quisesse usar logo o parametro podia
		contato = cont;
		
		System.out.println("Ligando para " + cont);
	}
	
	public void TocarMusica() {
		System.out.println("Começando o som!");
	}
}