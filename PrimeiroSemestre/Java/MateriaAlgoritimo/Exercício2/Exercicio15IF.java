import java.util.Scanner;

public class Exercicio15IF {

   public static void main(String[] args) {

      String Time1, Time2;
      int gol1, gol2;
      Scanner ler = new Scanner(System.in);

      System.out.println("Qual o nome do primeiro time");
      Time1 = ler.nextLine();

      System.out.println("Quantos gols que o " + Time1 + " fez");
      gol1 = ler.nextInt();

      Scanner entrada = new Scanner(System.in);

      System.out.println("Qual o nome segundo time");
      Time2 = entrada.nextLine();

      System.out.println("Quantos gols que o " + Time2 + " fez");
      gol2 = entrada.nextInt();

      if (gol1 == gol2)
         System.out.println("O jogo ficou empatado");

      else if (gol1 > gol2)
         System.out.println("O time " + Time1 + " ganhou");

      else
         System.out.println("O time " + Time2 + " ganhou");

   }
}
