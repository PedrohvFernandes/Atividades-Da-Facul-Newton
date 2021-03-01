package Ativ1;

public class Adolescente {

	public static void main(String[] args) {

	//objetos tel 1 e tel 2:	
	Telefone tel1 = new Telefone();
	Telefone tel2 = new Telefone();
	
	//caracteristicas
	tel1.marca = "YPhone";
	tel1.cor = "Prata";
	
	/*Segunda maneira para usar o parametro Ligar:
	 *  String nome = "Matheus";
	 * 	tel1.Ligar(nome);
	 */
	tel1.Ligar("Matheus");//como eu vou ligar usando o parametro
	tel1.TocarMusica();
	
	tel2.marca = "S10";
	tel2.cor = "Preta";
	tel2.Ligar("Maria");
	tel2.TocarMusica();
	}

}
