
public class MesDeNascimentoInvalidoException extends Exception {
	
	public MesDeNascimentoInvalidoException(int mesDeNascimento) {
		super("O Mes de nascimento esta invalido: " + mesDeNascimento);
	}


}
