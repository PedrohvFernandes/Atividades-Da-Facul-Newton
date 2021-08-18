public class EstadoDaContaInvalidaException extends Exception {

	public EstadoDaContaInvalidaException(String estado) {
		super("O estado da conta atualmente: " + estado + ", por isso não sera possivel sacar");
	}
}
