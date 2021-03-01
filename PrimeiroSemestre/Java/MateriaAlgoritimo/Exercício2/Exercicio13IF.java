import java.util.Scanner;

public class Exercicio13IF {

   public static void main(String[] args) {

      int Numero;

      Scanner entrada = new Scanner(System.in);

      System.out.println("Entre com um numero para ver se ele � negativo, positivo e nulo");
      Numero = entrada.nextInt();

      if (Numero == 0) // o if significa se
         System.out.println("Nulo");

      else if (Numero < 0) // os else do meio vem com if:else if(senao se)
         System.out.println("Negativo");

      else // o ultimo else vem separado do if
         System.out.println("Positivo");

   }
}