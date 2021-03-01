import java.util.Scanner;

public class TrabalhoRepeticaoJatiboca {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int numA, i = 1;
    double estoqueJ, estoqueP, val;

    System.out.println("Entre com o estoque inicial em Kg a��car de Jatiboca: ");
    estoqueJ = ler.nextDouble();
    if (estoqueJ < 0) {
      System.out.println("Erro! O valor no estoque n�o pode ser negativo: " + estoqueJ);
      i = 5;
    }

    System.out.println("Entre com o estoque inicial em Kg de a��car de Pontal: ");
    estoqueP = ler.nextDouble();
    if (estoqueP < 0) {
      System.out.println("Erro! O valor no estoque n�o pode ser negativo: " + estoqueJ);
      i = 5;
    }

    while (i != 5) {
      System.out.println("Qual opera��o deseja realizar?");
      System.out.println("1 � Entrada de Estoque");
      System.out.println("2 - Sa�da de Estoque");
      System.out.println("3 - Transfer�ncia de Estoque");
      System.out.println("4 - Consulta Estoque");
      System.out.println("5 � Finalizar");
      i = ler.nextInt();

      switch (i) {
        case 1:
          System.out.println("Qual empresa: ");
          System.out.println("1 - Jatiboca");
          System.out.println("2 - Pontal");
          numA = ler.nextInt();

          if (numA != 1 && numA != 2) {
            System.out.println("Empresa inv�lida");
          } else if (numA == 1) {
            System.out.println("Qual a entrada de estoque em Kg na empresa Jatiboca: ");
            val = ler.nextDouble();
            System.out.println("Adicionando " + val + "Kg de a��car na empresa Jatiboca");
            estoqueJ += val;
            System.out.println("Estoque atual na empresa Jatiboca:" + estoqueJ + "Kg");
          } else {
            System.out.println("Qual a entrada de estoque em Kg na empresa Pontal: ");
            val = ler.nextDouble();
            System.out.println("Acicionando " + val + "Kg de a��car na empresa Pontal");
            estoqueP += val;
            System.out.println("Estoque atual na empresa Pontal: " + estoqueP + "Kg");
          }
          break;
        case 2:
          System.out.println("Qual empresa: ");
          System.out.println("1 - Jatiboca");
          System.out.println("2 - Pontal");
          numA = ler.nextInt();

          if (numA != 1 && numA != 2) {
            System.out.println("Empresa invalida");
          } else if (numA == 1) {
            System.out.println("Quanto voc� deseja retirar de Pontal? \n Valor atual:" + estoqueJ);
            val = ler.nextDouble();

            if (val <= estoqueJ) {
              System.out.println("Sa�da de " + val + "Kg de a��car em Jatiboca");
              estoqueJ -= val;
            } else {
              System.out.println("Estoque insuficiente.");
            }
            System.out.println("Estoque atual da empresa: " + estoqueJ);
          } else {
            System.out.println("Quanto voc� deseja retirar de Pontal? \n Valor atual:" + estoqueP);
            val = ler.nextDouble();

            if (val <= estoqueP) {
              System.out.println("Descontado " + val + "Kg de a��car em Pontal");
              estoqueP -= val;
            } else {
              System.out.println("Estoque insuficiente");
            }
            System.out.println("Estoque atual da empresa: " + estoqueP + "Kg");
          }
          break;

        case 3:
          System.out.println("Qual transfer�ncia: ");
          System.out.println("1 - Da empresa Jatiboca para a empresa Pontal");
          System.out.println("2 - Da empresa Pontal para a empresa Jatiboca");
          numA = ler.nextInt();

          if (numA != 1 && numA != 2) {
            System.out.println("Opera��o inv�lida");
          } else if (numA == 1) {
            System.out.println("Qual a quantidade em Kg � transferir da empresa Jatiboca para a empresa Pontal?");
            val = ler.nextDouble();
            if (val >= 0 && val <= estoqueJ) {
              System.out.println("Transferido " + val + "Kg de a��car para Pontal");
              estoqueJ -= val;
              estoqueP += val;
            } else {
              System.out.println("Erro! N�o � poss�vel transferir quantidades negativas");
            }
            System.out.println("Estoque atual na empresa Jatiboca: " + estoqueJ + "Kg");
            System.out.println("Estoque atual na empresa Pontal: " + estoqueP + "Kg");
          } else {
            System.out.println("Qual a quantidade em Kg � transferir da empresa Pontal para a empresa Jatiboca?");
            val = ler.nextDouble();

            if (val >= 0 && val <= estoqueP) {
              System.out.println("Transferido " + val + "Kg de a��car para Jatiboca");
              estoqueP -= val;
              estoqueJ += val;
            } else {
              System.out.println(
                  "Erro! N�o � poss�vel transferir estoques negativos ou estoques acima da quantidade que tem na empresa");
            }
            System.out.println("Estoque atual na empresa Jatiboca: " + estoqueJ + "Kg");
            System.out.println("Estoque atual na empresa Pontal: " + estoqueP + "Kg");
          }
          break;

        case 4:
          System.out.println("Estoque atual na empresa Jatiboca: " + estoqueJ + "Kg");
          System.out.println("Estoque atual na empresa Pontal: " + estoqueP + "Kg");

          break;

        default:
          if (i >= 6) {
            System.out.println("Comando inv�lido");
          } else {
            System.out.println("Bom dia e um bom trabalho !!!");
          }
      }

    }
  }
}