public class Exerci60Array {
	public static void main(String args[]) {

		int i;
		int[] vet = new int[10];

		for (i = 0; i < vet.length; i++) {
			vet[i] = i + 1;
		}

		System.out.println("Imprimindo Array");
		for (i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}
}