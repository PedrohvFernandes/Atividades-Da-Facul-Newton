import java.util.Scanner;

public class Exercicio7 {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    int Idade;
    String Nome;

    System.out.print("Qual � o seu nome? ");
    Nome = ler.nextLine();

    System.out.print("Insira a sua idade para encaminhar a especialidade medica: ");
    Idade = ler.nextInt();

    if (Idade <= 12)
      System.out.println("Ol� " + Nome + ", como sua idade � essa: " + Idade
          + ", ent�o voc� irar ficar responsavel pela especialidade medica Pediatrica");
    else if (Idade > 12 && Idade == 59)
      System.out.println("Ol� " + Nome + ", como sua idade � essa: " + Idade
          + ", ent�o voc� irar ficar responsavel pela Clinica Geral");
    else
      System.out.println("Ol� " + Nome + ", como sua idade � essa: " + Idade
          + ", ent�o voc� irar ficar responsavel pela especialidade medica Geriatrica");

  }

}