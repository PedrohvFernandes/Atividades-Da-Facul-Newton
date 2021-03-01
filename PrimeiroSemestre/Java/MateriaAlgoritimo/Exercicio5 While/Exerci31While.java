
public class Exerci31While {
	public static void main(String[] args) {

		int Cnt, num1 = 1;
		Cnt = 1;

		while (Cnt <= 100) { // (Cnt<=100) ou (Cnt<101)

			System.out.println("N�mero: " + num1++ + "\n");

			Cnt++;
		}
		System.out.print("Os n�meros listados foram de 1 ao 100");

		/*
		 * codigo resumido: int i=1; While (i<=100){
		 *
		 *
		 * System.out.println(i); i++;
		 * 
		 * }
		 */

	}
}
