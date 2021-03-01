import java.util.Scanner;

public class Exercicio2 {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    int num1, num2, result;

    System.out.print("Entre com o primeiro n�mero: ");
    num1 = ler.nextInt();

    System.out.print("Etre com o segundo n�mero: ");
    num2 = ler.nextInt();

    result = num1 + num2;
    if (result >= 10)
      System.out.print("A soma dos dois numeros, " + num1 + " + " + num2 + " � " + result);
    else
      System.out.print("A soma desses dois numeros, " + num1 + " + " + num2 + " � " + result
          + ", sendo assim n�o � maior do que 10 ou n�o igual a 10");

  }
}
