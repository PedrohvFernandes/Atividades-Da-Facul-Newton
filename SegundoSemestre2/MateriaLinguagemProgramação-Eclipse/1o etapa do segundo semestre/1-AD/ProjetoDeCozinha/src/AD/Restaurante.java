package AD;

public class Restaurante {

	public static void main(String[] args) {
		
		Cozinha coz1 = new Cozinha();
		Cozinha coz2 = new Cozinha();
		
		System.out.println("Chinesa");
		coz1.cozinhas = "Chinesa";
		coz1.cozinheiros = 2;
		coz1.cozinhar(3);
		coz1.Lavarlouca();
		
		System.out.println("");
		
		System.out.println("Italiana");
		coz2.cozinhas = "Italiana";
		coz2.cozinheiros = 3;
		coz2.cozinhar(6);
		coz2.Lavarlouca();
		
	}

}
