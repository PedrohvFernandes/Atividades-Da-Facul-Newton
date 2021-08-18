
public class PessoaFisica {
	
	private String nomeCompleto;
	private String cpf;
	private String dataNasc;
	
	
	public PessoaFisica(String nomeCompleto, String cpf, String dataNasc) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
	}

	//Eu quero comparar dois obejtos de pessoa fisica, então
	// a gente vai precisar implementar o equals e o hashcode
	// O eclipse em Source, me permite gerar a implementação
	// do equals e do hashcode usando nesse caso os 3 parametros
	// nome, cpf e data de nascimento, a gente vai usar eles
	// para comparar se o objeto é igual ou não:
	
	//Pra estudo: 1º ver o equals, depois o hashcode
	
	
	// O hashcode utiliza uma operação matematica usando numeros primos pra multiplicar numeros primos
	// Com os valores gerados de cada atributo, então o codigo de disperção ele é gerado a partir de uma forma matematica
	//que eu calculo sobre o cpf, sobre a data de nascimento e sobre o nome completo
	//A gente utiliza o hashcode do String, o cpf é string, então uso o hashCode do String pra criar o hashcode da pessoa fisica
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
		result = prime * result + ((nomeCompleto == null) ? 0 : nomeCompleto.hashCode());
		return result;
	}

	
	//Nesse metodo eu comparo pessoa fisica com object
	//Então eu estou pegando um objeto que eu não sei
	//extamente qual que é o tipo dele e comparando com pessoa fisica
	
	//O equals ele compara varias caracteristicas entre os objetos  
	@Override
	public boolean equals(Object obj) {
		
		//Tratando se a ponta para mesma referencia, se o objeto é nulo, se a classe dos dois é igual ou não
		
		//Estou verificando se as duas variaveis apontam para a mesma referencia de memoria
		//Se elas apontarem pra mesma referencia de memoria, então elas são iguais
		//Porque na realidade estou comparando o mesmo objeto com ele mesmo, então a gente
		// retorna true
		//Aqui a gente compara se a referencia de memoria é a mesma
		//Então se o objeto de pessoa fisica tiver o mesmo endereço do objeto
		// que esta sendo comparado, então é o mesmo objeto
		
		if (this == obj) // Apontam para a mesma referencia de memoria
			return true;
		
		//Estou validando se o objeto que eu passei é nulo
		//Se esse obejeto que eu passei é nulo eles são diferentes
		//porque eu não consigo comparar um objeto pessoa fisica com alguma coisa
		// que é nula, então eu retorno false 
		//Então aqui eu ja retorno uma resposta pra minha comparação falando que
		// meu objeto é diferente de nulo, então retorno false pra quem fez a solicitação
		
		if (obj == null) // Obj nulo, diferentes
			return false;
		
		//Esse getClass() ele vai pegar a classe que corresponde aos objetos que eu tenho
		//Estou comparando a classe do meu objeto pessoa fisica getClass(), com a classe do objeto
		//que eu passei aqui obj.getClass() pra comparação
		//Se o tipo de objeto for diferente eles não são iguais
		//Então por exemplo estou comparando pessoa fisica com pessoa juridica eles são objetos diferentes
		//Então se a classe desses objetos for diferente eu retorno false, então classes diferentes
		//Com isso retornando false, que eu não tenho os dois iguais
		
		if (getClass() != obj.getClass()) // Classes diferentes
			return false;
		
		
		//Começar a comparar os atributos relacionado a pessoa fisica:
		
		
		//Se os tratamentos atras derem falsos é que de fato eu tenho uma pessoa fisica no objeto obj
		
		//Aqui eu pego o obj do tipo Object e transformo ele em pessoa fisica --> (PessoaFisica) obj
		//Aqui eu estou fazendo uma conversão(casting) --> http://www.universidadejava.com.br/materiais/java-casting-tipos-primitivos/ 
		//Conversão para pessoa fisica para a gente poder acessar os atributos desse objeto passado aqui
		
		PessoaFisica other = (PessoaFisica) obj; //Conversão para pessoa fisica
		
		//Pegando o cpf, se o cpf for nulo, e vamos olhar se o outro é diferente de nulo
		//se um é nulo e o outro é diferente de nulo, então eles não são iguais
		//Então eu não consigo comparar o cpf porque pelo menos um dos dois é nulo, então eles são diferentes
		// Se if todo der falso quer dizer que eu consigo comparar o cpf e eu continuo.
		if (cpf == null) {
			if (other.cpf != null)
				return false;
			
		}
		
		//Então eu pego o cpf da pessoa fisica e comparo com o outro cpf da pessoa fisica
		// Se eles forem diferentes eu ja retorno false, se eles forem iguais eu continuo 
		else if (!cpf.equals(other.cpf))
			return false;
		
		
		//Agora é a mesma coisa para o resto dos outros atributos
		
		//Eu verifco se a pessoa fisica tem data de nascimento, se ela tiver data de nascimento
		// e o outro não tiver eles são diferentes, se esse if der false quer dizer que eu tenho data de nascimento
		
		if (dataNasc == null) {
			if (other.dataNasc != null)
				return false;
			
		} 
		
		//Então eu consigo comparar a data de nasicmento do meu objeto com a data do outro
		//Se eles forem diferentes retorno false tambem, se eles forem iguais eu tenho o cpf igual, eu tenho a data de nasicmento igual
		
		else if (!dataNasc.equals(other.dataNasc))
			return false;
		
		
		//Então agora eu comparo o nome completo, se eu não tenho o nome completo e o outro tem nome completo eles são diferentes
		//porque eles não tem o mesmo valor, se eu tenho nome completo
		if (nomeCompleto == null) {
			if (other.nomeCompleto != null)
				return false;

		}
		
		//Então eu vou comparar esse nome completo, com o outro nome completo que esta na outra pessoa fisica
		//se eles forem diferentes eu retorno false 
		else if (!nomeCompleto.equals(other.nomeCompleto))
			return false;
		
		
		//Se tudo isso der false, não quer dizer retornar false, quer dizer caso se nas condições/comparações não forem true, derem false desde la de cima la do cpf, quer dizer que os dois objetos são iguais
		//No fim a gente esta tentando ver se os dois são iguais
		//Nos estamos testando na contraprova, com cpf ou data de nascimento ou nome completo diferentes a gente sai, se todas essas comparações não forem verdades, forem falsos quer dizer que eu tenho dois objetos com os mesmos atributos
		//obs: "se todas essas comparações não forem verdades, forem falsos" --> não é retornar false, é caso as comparações não se baterem(tudo falso) para elas não retornarem false, com isso os obejtos são iguais
		return true;
	}
	

	@Override
	public String toString() {
		return "PessoaFisica [nomeCompleto=" + nomeCompleto + ", cpf=" + cpf + ", dataNasc=" + dataNasc + "]";
	}

	

}
