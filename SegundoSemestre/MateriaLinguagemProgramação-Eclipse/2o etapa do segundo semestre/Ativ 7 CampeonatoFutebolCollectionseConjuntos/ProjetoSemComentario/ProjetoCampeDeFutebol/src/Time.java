public class Time {

	String nome, cor;
	int colocacao, pontuacao = 0;

	public int ganhar(int pontos) {
		pontuacao = pontuacao + pontos * 3;
		return pontuacao;

	}

	public int perder(int pontos) {
		pontuacao = pontuacao + pontos * 0;
		return pontos;
	}

	public int empatar(int pontos) {
		pontuacao = pontuacao + pontos;
		return pontos;

	}

	public void colocacao() {
		if (pontuacao >= 100) {
			System.out.println("Ele está entre os primeiros da tabela: " + nome);
		} else if (pontuacao < 100 && pontuacao >= 50) {
			System.out.println("Ele esta no meio da tabela: " + nome);
		} else {
			System.out.println("Ele está entre os últimos da tabela: " + nome);
		}
	}

}