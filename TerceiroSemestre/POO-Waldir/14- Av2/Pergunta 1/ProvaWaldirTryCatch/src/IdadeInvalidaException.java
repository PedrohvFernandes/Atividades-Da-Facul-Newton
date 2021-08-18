

public class IdadeInvalidaException extends Exception {

	public IdadeInvalidaException(int idade) {
		super("Essa idade é invalida: " + idade);
	}
}
