public class SaldoIndisponivelException extends Exception {

	public SaldoIndisponivelException(float valor) {
		super("Saldo indisponivel para saque: " + valor);
	}
}
