public class NotasMMMvet {
	// problema:
	// entrada: conjunto de notas
	// saida: calcular e exibir a m�dia
	// - Exibir a maior nota
	// - Exibir a menor nota
	public static void main(String[] args) {

		float soma = 0, maior = 0, menor = 9999, media;/*
														 * na variavel "menor" se inicia apartir de 10 pra cima, porque
														 * no vetor n�o existe um dado menor do que 10, ent�o se
														 * inica-se com 0, na hora de imprimir o resultado iria da 0
														 */

		float[] notas = { 150, 85.5f, 65, 98, 45.5f, 96.6f, 10, 101, 87,
				68.8f };/*
						 * o "f" na frente dos numeros decimais � para formar pois o tipo do vetor �
						 * float
						 */
		for (int i = 0; i < notas.length; i++) {
			soma = soma + notas[i];// a variavel inica com 0 e soma com 100, e assim por diante
			System.out.println(soma);// imprimi todas as somas
		}

		media = soma / notas.length;

		for (int i = 0; i < notas.length; i++)
			if (notas[i] > maior) {// procura o maior dado do vetor
				maior = notas[i];// a variavel "maior" atribui o maior numero do vetor
			}

		for (int x = 0; x < notas.length; x++)
			if (notas[x] < menor) {// procura o menor dado do vetor
				menor = notas[x];
			}
		System.out.println("Media: " + media);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
	}
}