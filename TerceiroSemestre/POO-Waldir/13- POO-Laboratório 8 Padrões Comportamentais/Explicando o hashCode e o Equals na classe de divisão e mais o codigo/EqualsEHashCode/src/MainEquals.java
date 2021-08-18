
public class MainEquals {

	public static void main(String[] args) {
		
		var pf1 = new PessoaFisica("Pedro", "123.456.789-11", "05/12/2001");
		
		var pf2 = new PessoaFisica("Pedro Henrique", "123.456.789-11", "05/12/2001");// nome diferente
		
		var pf3 = new PessoaFisica("Pedro", "176.236.765-91", "05/12/2001"); //Cpf diferente
		
		var pf4 = new PessoaFisica("Pedro", "123.456.789-11", "12/05/2000"); //Data de nascimento diferente
		
		var pf5 = new PessoaFisica("Pedro", "123.456.789-11", "05/12/2001"); // Pf5 identica ao pf1
		
		//Testes
		
		//Tratando se a ponta para mesma referencia, se o objeto é nulo, se a classe dos dois é igual ou não
		
		System.out.println(pf1.equals(pf1)); //Mesmo objeto, mesma referencia  TRUE
		
		System.out.println(pf1.equals(null)); // Objeto nulo  FALSE
		
		System.out.println(pf1.equals("teste")); //Classes diferentes, pf1 --> pessoa fisica, teste --> String  FALSE

		
		//Começar a comparar os atributos relacionado a pessoa fisica:
		
		System.out.println(pf1.equals(pf2)); //Comparar o nome diferente  FALSE
		
		System.out.println(pf1.equals(pf3)); // Cpf diferente  FALSE
		
		System.out.println(pf1.equals(pf4)); // Data de nascimento diferente  FALSE
		
		System.out.println(pf1.equals(pf5)); // Identicos  TRUE
		
		
		
		//Imprimindo os hashcodes
		
		//Pf1 e Pf5 tem que ter o mesmo hashcode, pois eles dois possuem os mesmos valores dos atributos
		//Se um é igual ao outro, então o hashcode tem quer ser identicos
		
		System.out.println(pf1.hashCode());
		System.out.println(pf5.hashCode());
		
		// Pf1 e Pf2 não podem ter o mesmo hashcode
		
		System.out.println(pf1.hashCode());
		System.out.println(pf2.hashCode());
		
		
		//Não pode fazer isso: Mesmo iguais ira dar False
		//Dessa forma a gente esta comparando a referencia de memoria dos objetos, com isso ira dar FALSE
		//Eles não estão apontando para mesma referencia de memoria
		
		System.out.println(pf1 == pf5); //FALSE
		

		//Agora dessa forma é true: Mesma referencia de memoria
		//Aviso do eclipse: Comparing identical expressions
		System.out.println(pf1 == pf1); //TRUE
		
		
		//Isso so funciona com String, pois String é imutavel
		//A jvm ela tem uma pscina de objetos de String, quando eu tenho dois objetos diferentes
		// ELes são identicos ele reaproveita aquele objeto, então eu tenho variaveis diferentes apontando para a mesma referencia
		//Então no caso de String funciona
		//A String é um caso especial dentro do java: Isso tudo é para acelerar o processo de processamento de Strings pra não ficar criando strings de mais por exemplo dentro da JVM 
		System.out.println("Teste" == "Teste"); //TRUE
	
		//Então objetos a gente sempre usa EQUALS
	}

}
