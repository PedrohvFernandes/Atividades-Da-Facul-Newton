
public class NomeCompletoVazioExceptionException extends Exception {
	
	public NomeCompletoVazioExceptionException(String nomeCompleto) {
		super("O nome esta vazio: " + nomeCompleto);
	}

}
