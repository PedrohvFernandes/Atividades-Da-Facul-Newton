import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // problema:
    // entrada: uma frase digitada pelo usuário
    // saida: 
    // a) quantas vogais existem na frase
    // b) imprimir a frase sem as vogais

    // declaração
    String frase = null;
    int numVogais = 0;
    String vogais = "aeiouyAEIOUY";

    // entrada
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite uma frase:");
    frase = scanner.nextLine();
    
    // processamento
    for (int i = 0; i < frase.length(); i++) {
      char c = frase.charAt(i);

      System.out.println("Verificando se " + c + 
      " existe em vogais: " + vogais);
      // se o caractere é uma vogal
      if (vogais.indexOf(frase.charAt(i)) != -1) {     // tenho uma vogal
        System.out.println(frase.charAt(i));
        numVogais++;
      }
    }

    // saida
    System.out.println("Número de vogais: " + numVogais);

    System.out.println("Imprimindo a frase sem as vogais:");

    // excluindo as vogais na frase
    for (int i = 0; i < frase.length(); i++) {
      char c = frase.charAt(i);

      // se a letra NAO for uma vogal, ela é impressa
      if (vogais.indexOf(frase.charAt(i)) == -1) {
        System.out.print(c);
      } 
      //else {
      //  System.out.print('*');
      // }
    }


    scanner.close();
  }
}