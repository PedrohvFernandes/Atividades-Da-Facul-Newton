package poo.u8.strategy;

public class Contexto {

	// 4a estratégia via interface
	private Strategy estrategia;

	public void setEstrategia(Strategy estrategia) {
		System.out.println("Setando a estratégia: " + estrategia + "\n");

		this.estrategia = estrategia;
	}

	public int executar(int a, int b) throws ExceptionValorPorZero {
		if (estrategia == null) {
			System.out.println("ERRO: estratégia não definida.");
			
			return 0;
		}

		return estrategia.execute(a, b);
	}

	public Strategy getEstrategia() {
		return estrategia;
	}
	
	
}
