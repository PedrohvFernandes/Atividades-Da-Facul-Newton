
public class PessoaFisica {
	
	private String nomeCompleto;
	private String cpf;
	private String dataNasc;
	
	
	public PessoaFisica(String nomeCompleto, String cpf, String dataNasc) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
	}

	//Eu quero comparar dois obejtos de pessoa fisica, ent�o
	// a gente vai precisar implementar o equals e o hashcode
	// O eclipse em Source, me permite gerar a implementa��o
	// do equals e do hashcode usando nesse caso os 3 parametros
	// nome, cpf e data de nascimento, a gente vai usar eles
	// para comparar se o objeto � igual ou n�o:
	
	//Pra estudo: 1� ver o equals, depois o hashcode
	
	
	// O hashcode utiliza uma opera��o matematica usando numeros primos pra multiplicar numeros primos
	// Com os valores gerados de cada atributo, ent�o o codigo de disper��o ele � gerado a partir de uma forma matematica
	//que eu calculo sobre o cpf, sobre a data de nascimento e sobre o nome completo
	//A gente utiliza o hashcode do String, o cpf � string, ent�o uso o hashCode do String pra criar o hashcode da pessoa fisica
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
	//Ent�o eu estou pegando um objeto que eu n�o sei
	//extamente qual que � o tipo dele e comparando com pessoa fisica
	
	//O equals ele compara varias caracteristicas entre os objetos  
	@Override
	public boolean equals(Object obj) {
		
		//Tratando se a ponta para mesma referencia, se o objeto � nulo, se a classe dos dois � igual ou n�o
		
		//Estou verificando se as duas variaveis apontam para a mesma referencia de memoria
		//Se elas apontarem pra mesma referencia de memoria, ent�o elas s�o iguais
		//Porque na realidade estou comparando o mesmo objeto com ele mesmo, ent�o a gente
		// retorna true
		//Aqui a gente compara se a referencia de memoria � a mesma
		//Ent�o se o objeto de pessoa fisica tiver o mesmo endere�o do objeto
		// que esta sendo comparado, ent�o � o mesmo objeto
		
		if (this == obj) // Apontam para a mesma referencia de memoria
			return true;
		
		//Estou validando se o objeto que eu passei � nulo
		//Se esse obejeto que eu passei � nulo eles s�o diferentes
		//porque eu n�o consigo comparar um objeto pessoa fisica com alguma coisa
		// que � nula, ent�o eu retorno false 
		//Ent�o aqui eu ja retorno uma resposta pra minha compara��o falando que
		// meu objeto � diferente de nulo, ent�o retorno false pra quem fez a solicita��o
		
		if (obj == null) // Obj nulo, diferentes
			return false;
		
		//Esse getClass() ele vai pegar a classe que corresponde aos objetos que eu tenho
		//Estou comparando a classe do meu objeto pessoa fisica getClass(), com a classe do objeto
		//que eu passei aqui obj.getClass() pra compara��o
		//Se o tipo de objeto for diferente eles n�o s�o iguais
		//Ent�o por exemplo estou comparando pessoa fisica com pessoa juridica eles s�o objetos diferentes
		//Ent�o se a classe desses objetos for diferente eu retorno false, ent�o classes diferentes
		//Com isso retornando false, que eu n�o tenho os dois iguais
		
		if (getClass() != obj.getClass()) // Classes diferentes
			return false;
		
		
		//Come�ar a comparar os atributos relacionado a pessoa fisica:
		
		
		//Se os tratamentos atras derem falsos � que de fato eu tenho uma pessoa fisica no objeto obj
		
		//Aqui eu pego o obj do tipo Object e transformo ele em pessoa fisica --> (PessoaFisica) obj
		//Aqui eu estou fazendo uma convers�o(casting) --> http://www.universidadejava.com.br/materiais/java-casting-tipos-primitivos/ 
		//Convers�o para pessoa fisica para a gente poder acessar os atributos desse objeto passado aqui
		
		PessoaFisica other = (PessoaFisica) obj; //Convers�o para pessoa fisica
		
		//Pegando o cpf, se o cpf for nulo, e vamos olhar se o outro � diferente de nulo
		//se um � nulo e o outro � diferente de nulo, ent�o eles n�o s�o iguais
		//Ent�o eu n�o consigo comparar o cpf porque pelo menos um dos dois � nulo, ent�o eles s�o diferentes
		// Se if todo der falso quer dizer que eu consigo comparar o cpf e eu continuo.
		if (cpf == null) {
			if (other.cpf != null)
				return false;
			
		}
		
		//Ent�o eu pego o cpf da pessoa fisica e comparo com o outro cpf da pessoa fisica
		// Se eles forem diferentes eu ja retorno false, se eles forem iguais eu continuo 
		else if (!cpf.equals(other.cpf))
			return false;
		
		
		//Agora � a mesma coisa para o resto dos outros atributos
		
		//Eu verifco se a pessoa fisica tem data de nascimento, se ela tiver data de nascimento
		// e o outro n�o tiver eles s�o diferentes, se esse if der false quer dizer que eu tenho data de nascimento
		
		if (dataNasc == null) {
			if (other.dataNasc != null)
				return false;
			
		} 
		
		//Ent�o eu consigo comparar a data de nasicmento do meu objeto com a data do outro
		//Se eles forem diferentes retorno false tambem, se eles forem iguais eu tenho o cpf igual, eu tenho a data de nasicmento igual
		
		else if (!dataNasc.equals(other.dataNasc))
			return false;
		
		
		//Ent�o agora eu comparo o nome completo, se eu n�o tenho o nome completo e o outro tem nome completo eles s�o diferentes
		//porque eles n�o tem o mesmo valor, se eu tenho nome completo
		if (nomeCompleto == null) {
			if (other.nomeCompleto != null)
				return false;

		}
		
		//Ent�o eu vou comparar esse nome completo, com o outro nome completo que esta na outra pessoa fisica
		//se eles forem diferentes eu retorno false 
		else if (!nomeCompleto.equals(other.nomeCompleto))
			return false;
		
		
		//Se tudo isso der false, n�o quer dizer retornar false, quer dizer caso se nas condi��es/compara��es n�o forem true, derem false desde la de cima la do cpf, quer dizer que os dois objetos s�o iguais
		//No fim a gente esta tentando ver se os dois s�o iguais
		//Nos estamos testando na contraprova, com cpf ou data de nascimento ou nome completo diferentes a gente sai, se todas essas compara��es n�o forem verdades, forem falsos quer dizer que eu tenho dois objetos com os mesmos atributos
		//obs: "se todas essas compara��es n�o forem verdades, forem falsos" --> n�o � retornar false, � caso as compara��es n�o se baterem(tudo falso) para elas n�o retornarem false, com isso os obejtos s�o iguais
		return true;
	}
	

	@Override
	public String toString() {
		return "PessoaFisica [nomeCompleto=" + nomeCompleto + ", cpf=" + cpf + ", dataNasc=" + dataNasc + "]";
	}

	

}
