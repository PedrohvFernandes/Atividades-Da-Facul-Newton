
public class AnoDeNascimentoInvalidoException extends Exception{
	
	public AnoDeNascimentoInvalidoException(int anoDeNascimento) {
		super("O Ano de nascimento esta invalido: " + anoDeNascimento);
	}

}
