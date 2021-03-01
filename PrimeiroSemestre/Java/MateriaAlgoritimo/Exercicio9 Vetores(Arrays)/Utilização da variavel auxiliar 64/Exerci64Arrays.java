import java.util.Scanner;

public class Exerci64Arrays {
	public static void main(String[] args) {
		int i;
		int x[] = new int[10];
		int y[] = new int[10];
		int z[] = new int[20];
		int auxiliar; // var aux

		Scanner ler = new Scanner(System.in);

		for (i = 0; i < x.length; i++) { // entrada dos dados no vetor
			System.out.println("Digite um n�mero para o primeiro vetor: ");
			x[i] = ler.nextInt(); // variavel
		}

		for (i = 0; i < y.length; i++) { // entrada dos dados no segundo vetor
			System.out.println("Digite um n�mero para o segundo vetor: ");
			y[i] = ler.nextInt(); // variavel
		}
		auxiliar = 10;
		for (i = 0; i < x.length; i++) { // processamento - unir os vetores
			z[i] = x[i];
			z[auxiliar] = y[i];
			auxiliar++;// primeira maneira de incrementar
			// segunda maneira:z[auxiliar++]=y[i];
		}
		/*
		 * for(i=0;i<x.length;i++){ //maneira completar pra unir z[i]=x[i];
		 * z[i+10]=y[i];
		 */
		for (i = 0; i < z.length; ++i) { // saida- imprimir o vetor resultante
			System.out.print(z[i] + " ");
		}
	}
}