package AD;

public class Cozinha {
	int pratos;
	String cozinhas;
	int cozinheiros;
	
	public void cozinhar(int prat) {
		pratos = prat;
	
		System.out.println("O número de pratos informado está preparado com sucesso! " + prat + " pratos no total.");
	}
	
	
	public void Lavarlouca() {
		System.out.println("Possuimos " + cozinheiros + " cozinheiros e toda a louça foi lava com sucesso");
		System.out.println("Muito obrigado :D");
	}
	
}
