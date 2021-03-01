import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int LadoA, LadoB, LadoC;

		System.out.print("Coloque o valor do primeiro lado do trinagulo:");
		LadoA = ler.nextInt();

		System.out.print("Coloque o valor do segundo lado do triangulo:");
		LadoB = ler.nextInt();

		System.out.print("Coloque o valor do terceiro lado do triangulo:");
		LadoC = ler.nextInt();

		if (LadoA < (LadoB + LadoC) && LadoB < (LadoA + LadoB) && LadoC < (LadoB + LadoA)) { // (inicio da chave) O if
																								// primeiro fala que �
																								// verdade
			if (LadoA == LadoB && LadoB == LadoC)
				System.out.println("O triangulo � equilatero.");
			else if (LadoA == LadoB || LadoB == LadoC || LadoA == LadoC)
				System.out.println("O triangulo � isosceles.");
			else
				System.out.println("O tringulo � escaleno.");

		} // (fim da chave) (essa chave � para fechar o comando, finalizando esse comando
			// com else, sendo assim nao vai ocorrer do proximo else de baixo ganhar
			// prioridade, assim o outro else irar finalizar o codigo total.)

		else
			System.out.println("Os valor digitados n�o possui propriedade de nem um tringulo.");

	}

}
