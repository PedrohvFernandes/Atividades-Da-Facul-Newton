import java.time.LocalDateTime;

public class Usuario {

	private int idade;
	private int anoDeNascimento;
	private int mesDeNascimento;
	private String nomeCompleto;
	LocalDateTime now = LocalDateTime.now(); // Data atual do sistema
	
	public void criarUmUsuario(String nomeCompleto, int idade, int mesDeNascimento, int anoDeNascimento) throws NomeCompletoVazioExceptionException, IdadeInvalidaException, MesDeNascimentoInvalidoException, AnoDeNascimentoInvalidoException{
		//.isEmpty() para verificar se uma String está vazia em Java
		if (nomeCompleto.isEmpty()) {
			
			throw new NomeCompletoVazioExceptionException(nomeCompleto);
			
		}if(idade <= 0 || idade < 18 || idade > 100) {
			
			throw new IdadeInvalidaException(idade);
			
		}if(mesDeNascimento <= 0 || mesDeNascimento > 12 ) {
			
			throw new MesDeNascimentoInvalidoException(mesDeNascimento);
			
		}if(anoDeNascimento < 1980 || anoDeNascimento >=  now.getYear()) {
			
			throw new AnoDeNascimentoInvalidoException(anoDeNascimento);
			
		}
		this.nomeCompleto = nomeCompleto;
		this.idade = idade;
		this.mesDeNascimento = mesDeNascimento;
		this.anoDeNascimento = anoDeNascimento;
		
		System.out.println("Usuario criado com sucesso: " + this.nomeCompleto + " " + this.idade + " "
				+ " " + this.mesDeNascimento + " " + this.anoDeNascimento);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}

	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}

	public int getMesDeNascimento() {
		return mesDeNascimento;
	}

	public void setMesDeNascimento(int mesDeNascimento) {
		this.mesDeNascimento = mesDeNascimento;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	
}
