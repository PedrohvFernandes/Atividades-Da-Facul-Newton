import java.util.Scanner;

public class TrabalhoRepeticaoBanco {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int num, numA, i = 1, contaC, contaP;
    double saldoC, saldoP, val;
    String nome;

    System.out.println("Entre com o seu nome: ");
    nome = ler.nextLine();

    System.out.println("Entre com o número da Conta Corrente: ");
    contaC = ler.nextInt();

    System.out.println("Entre com o saldo inicial da Conta Corrente: ");
    saldoC = ler.nextDouble();

    System.out.println("Entre com o número da Conta Poupança: ");
    contaP = ler.nextInt();

    System.out.println("Entre com o seu saldo inicial da Conta Poupança: ");
    saldoP = ler.nextDouble();
    if (saldoP < 0) {
      System.out.println("Erro! O valor do saldo na conta poupança não pode ser negativo: " + saldoP);
      i = 5;
    }

    while (i != 5) {
      System.out.println("Qual operação deseja realizar?");
      System.out.println("1 - Creditar");
      System.out.println("2 - Debitar");
      System.out.println("3 - Transferir");
      System.out.println("4 - Saldo");
      System.out.println("5 - Sair ");
      i = ler.nextInt();

      switch (i) {
        case 1:
          System.out.println("Qual conta: ");
          System.out.println("1 - Corrente");
          System.out.println("2 - Poupança");
          numA = ler.nextInt();

          if (numA != 1 && numA != 2) {
            System.out.println("Conta inválida");
          } else if (numA == 1) {
            System.out.println("Qual valor a creditar na conta corrente " + contaC + ": ");
            val = ler.nextDouble();
            System.out.println("Acicionando " + val + " à sua conta corrente");
            saldoC += val;
            System.out.println("Saldo atual na conta corrente " + contaC + ": R$" + saldoC);
          } else {
            System.out.println("Qual valor a creditar na conta poupança " + contaP + ": ");
            val = ler.nextDouble();
            System.out.println("Acicionando " + val + " à sua conta Poupança");
            saldoP += val;
            System.out.println("Saldo atual na conta poupança" + contaP + ": R$" + saldoP);
          }
          break;
        case 2:
          System.out.println("Qual conta: ");
          System.out.println("1 - Corrente");
          System.out.println("2 - Poupança");
          numA = ler.nextInt();

          if (numA != 1 && numA != 2) {
            System.out.println("Conta invalida");
          } else if (numA == 1) {
            System.out.println("Qual valor a debitar na conta corrente " + contaC + ": ");
            val = ler.nextDouble();
            System.out.println("Descontado " + val + " à sua conta corrente");
            saldoC -= val;
            System.out.println("Saldo atual na conta corrente " + contaC + ": R$" + saldoC);
          } else {
            System.out.println("Qual valor a debitar na conta poupança " + contaP + ": ");
            val = ler.nextDouble();

            if (val <= saldoP) {
              System.out.println("Descontado " + val + " à sua conta Poupança");
              saldoP -= val;
            } else {
              System.out.println("Saldo insuficiente");
            }
            System.out.println("Saldo atual na conta poupança " + contaP + ": R$" + saldoP);
          }
          break;

        case 3:
          System.out.println("Qual operação: ");
          System.out.println("1 - Conta corrente para poupança");
          System.out.println("2 - Poupança para conta corrente");
          numA = ler.nextInt();

          if (numA != 1 && numA != 2) {
            System.out.println("Operação invalida");
          } else if (numA == 1) {
            System.out
                .println("Qual valor a tranferir da conta corrente " + contaC + " para a poupança " + contaP + " ?");
            val = ler.nextDouble();
            if (val >= 0) {
              System.out.println("Transferido " + val + " para sua conta Poupança");
              saldoC -= val;
              saldoP += val;
            } else {
              System.out.println("Erro! Não é possível tranferir valores negativos");
            }
            System.out.println("Saldo atual na conta corrente " + contaC + ": R$" + saldoC);
            System.out.println("Saldo atual na conta poupança " + contaP + ": R$" + saldoP);
          } else {
            System.out
                .println("Qual valor a transferir da conta poupança " + contaP + " para a corrente " + contaC + " ?");
            val = ler.nextDouble();

            if (val >= 0 && val <= saldoP) {
              System.out.println("Transferido " + val + " para sua conta Corrente");
              saldoP -= val;
              saldoC += val;
            } else {
              System.out.println(
                  "Erro! Não é possível tranferir valores negativos ou valores acima do valor na conta poupança");
            }
            System.out.println("Saldo atual na conta corrente " + contaC + ": R$" + saldoC);
            System.out.println("Saldo atual na conta poupança " + contaP + ": R$" + saldoP);
          }
          break;

        case 4:
          System.out.println("Senhor(a): " + nome + ",");
          System.out.println("O saldo atual na conta corrente " + contaC + ": R$" + saldoC);
          System.out.println("e o saldo atual na conta poupança " + contaP + ": R$" + saldoP);

          break;

        default:
          if (i >= 6) {
            System.out.println("Comando inválido");
          } else {
            System.out.println("Obrigado por trabalhar com o nosso banco!!!");
          }
      }

    }

  }
}
