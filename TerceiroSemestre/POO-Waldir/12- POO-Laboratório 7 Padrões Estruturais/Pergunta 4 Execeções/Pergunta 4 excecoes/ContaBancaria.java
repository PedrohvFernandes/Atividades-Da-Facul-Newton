public class ContaBancaria {

	private float saldo;
	private int numOperacoes = 0;
	private String estado; // 0: em-criacao, 1: disponivel; 2: bloqueada; 3: cancelada
	
	public ContaBancaria(float valor, String estado) {
		this.saldo = valor;
		this.estado = estado;
	}
	
	public void efetuarSaque(float valor) throws ValorSaqueInvalidoException, SaldoIndisponivelException, EstadoDaContaInvalidaException{
		// verificar valor a ser sacado > 0
		if (valor <= 0) {
			// lançando uma excecao para ser tratada por um tratador especifico
			throw new ValorSaqueInvalidoException(valor);
		}
		// verificar saldo disponivel
		if (valor > saldo) {
			
			throw new SaldoIndisponivelException(valor);
			
		}
		// verificar o estado da conta bancaria (somente estado disponivel é permitido)
		if (estado.equalsIgnoreCase("0- em-criacao") || estado.equalsIgnoreCase("2- bloqueada") || estado.equalsIgnoreCase("3- cancelada")) {
			
			
			throw new EstadoDaContaInvalidaException(estado);
			
		}
		
		// caso de sucesso.
		this.saldo = this.saldo - valor;
		System.out.println("Saldo: " + this.saldo);
	}
	
	public void efetuarDeposito(float valor) {
		
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void incrementarContadorOperacoes() {
		this.numOperacoes++;
		
		System.out.println("Operacoes: "+ numOperacoes);
	}
}
