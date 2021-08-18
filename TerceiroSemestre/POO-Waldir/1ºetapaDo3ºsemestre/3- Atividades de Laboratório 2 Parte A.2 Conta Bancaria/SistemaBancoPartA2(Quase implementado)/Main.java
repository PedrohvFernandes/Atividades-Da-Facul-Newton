import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i=0;
    int aux3 = 0;
    float valor;
   

    
    Banco bank = new Banco("Banco: Newton");

    System.out.println(
        " @@@@@@    @@@@@@@@  @@@@@@@@  @@@  @@@   @@@@@@@  @@@   @@@@@@      @@@@@@@    @@@@@@   @@@  @@@   @@@@@@@   @@@@@@   @@@@@@@   @@@   @@@@@@   \n"+
        "@@@@@@@@  @@@@@@@@@  @@@@@@@@  @@@@ @@@  @@@@@@@@  @@@  @@@@@@@@     @@@@@@@@  @@@@@@@@  @@@@ @@@  @@@@@@@@  @@@@@@@@  @@@@@@@@  @@@  @@@@@@@@  \n"+
        "@@!  @@@  !@@        @@!       @@!@!@@@  !@@       @@!  @@!  @@@     @@!  @@@  @@!  @@@  @@!@!@@@  !@@       @@!  @@@  @@!  @@@  @@!  @@!  @@@  \n"+
        "!@!  @!@  !@!        !@!       !@!!@!@!  !@!       !@!  !@!  @!@     !@   @!@  !@!  @!@  !@!!@!@!  !@!       !@!  @!@  !@!  @!@  !@!  !@!  @!@  \n"+
        "@!@!@!@!  !@! @!@!@  @!!!:!    @!@ !!@!  !@!       !!@  @!@!@!@!     @!@!@!@   @!@!@!@!  @!@ !!@!  !@!       @!@!@!@!  @!@!!@!   !!@  @!@!@!@!  \n"+
        "!!!@!!!!  !!! !!@!!  !!!!!:    !@!  !!!  !!!       !!!  !!!@!!!!     !!!@!!!!  !!!@!!!!  !@!  !!!  !!!       !!!@!!!!  !!@!@!    !!!  !!!@!!!!  \n"+
        "!!:  !!!  :!!   !!:  !!:       !!:  !!!  :!!       !!:  !!:  !!!     !!:  !!!  !!:  !!!  !!:  !!!  :!!       !!:  !!!  !!: :!!   !!:  !!:  !!!  \n"+
        ":!:  !:!  :!:   !::  :!:       :!:  !:!  :!:       :!:  :!:  !:!     :!:  !:!  :!:  !:!  :!:  !:!  :!:       :!:  !:!  :!:  !:!  :!:  :!:  !:!  \n"+
        "::   :::   ::: ::::   :: ::::   ::   ::   ::: :::   ::  ::   :::      :: ::::  ::   :::   ::   ::   ::: :::  ::   :::  ::   :::   ::  ::   :::  \n"+
        " :   : :   :: :: :   : :: ::   ::    :    :: :: :  :     :   : :     :: : ::    :   : :  ::    :    :: :: :   :   : :   :   : :  :     :   : :"
    );
  

  while( i != 7 ){
          System.out.println("Qual operação deseja realizar?");
          System.out.println("1 - Cadastrar conta bancaria e correntista no " + bank.getNome());
          System.out.println("2 - Pesquisar Conta");
          System.out.println("3 - Atualizar Conta");
          System.out.println("4 - Deletar Conta");
          System.out.println("5 - Deletar Correntista");
          System.out.println("6 - Imprima todas as contas e correntistas cadastrados no sistema");
          System.out.println("7 - Sair");
          i = input.nextInt();
          //i = Float.parseFloat(input.nextLine());

          switch (i) {
            case 1:
              bank.inserirConta();
              bank.printVectorBancario();
            break;

            case 2:
            System.out.println("Digite a agencia e o numero da conta bancaria a ser pesquisada: ");
            input.nextLine();  
            String agencia = input.nextLine();
            String numero = input.nextLine();
            bank.pesquisarConta(agencia, numero);
           
            break;

            case 3:
            System.out.println("Menu de atualizações: ");
            System.out.println("1- Nome ");
            System.out.println("2- cpf");
            System.out.println("3- Data de nascimento");
            System.out.println("4- Deseja sair");
            aux3 = input.nextInt();
            switch(aux3){
              case 1:
              System.out.println("Passe o nome atual cadastrado para poder atualizar: ");
              input.nextLine();   
              String nome = input.nextLine();
              bank.atualizarConta(nome, null, null);
              break;
              case 2:
              System.out.println("Passe o cpf atual cadastrado para poder atualizar: ");
              input.nextLine();   
              String cpf = input.nextLine();
              bank.atualizarConta(null, cpf, null);
              break;
              case 3:
              System.out.println("Passe a data de nascimento atualmente cadastrado na sua conta correnstista: ");
              input.nextLine();   
              String dataNasc = input.nextLine();
              bank.atualizarConta(null, null, dataNasc);
              break;
              case 4:
              System.out.println("De volta ao menu geral");
              break;
              default:
              System.out.println("Operação invalida");
            }
            break;

            case 4:
            System.out.println("Qual conta Bancaria deseja deletar");
            input.nextLine();    
            numero = input.nextLine();
            bank.deletarConta(numero);
            break;

            case 5:
            System.out.println("Qual correntista deseja deletar");
            input.nextLine();    
            String nome = input.nextLine();
            bank.deletarCorrentista(nome);
            break;

            case 6:
            bank.printVectorBancario();
            break;
            
            case 7:
            System.out.println("Obrigado por usar o nosso software😎");
            break;
            
            default:
            System.out.println("Operação invalida");
          }
  }
  }
}
/*
              case 5:
              System.out.println("Saldo atual da conta: "+bank.saldo);

              System.out.println("Qual valor você deseja sacar da sua conta: "+contaBancaria.getNumero());

              valor = input.nextFloat();
              
              contaBancaria.sacar(valor, true); 
              
              break;

              case 6:
              System.out.println("Saldo atual da conta: "+contaBancaria.getSaldo());

              System.out.println("Qual valor a creditar na conta: " +contaBancaria.getNumero()+" : ");

              valor = input.nextFloat(); 

              contaBancaria.depositar(valor);
              break;

              case 7:

              System.out.println("Saldo atual da conta: "+contaBancaria.getSaldo());

              System.out.println("Qual valor a transferir da conta: " + contaBancaria.getNumero()+ " para a conta: 345674-98" );

              valor = input.nextFloat();

              contaBancaria.transferir(valor, "Netflix");
              break;

              case 8:
              System.out.println("Saldo atual da conta: "+contaBancaria.getSaldo());

              System.out.println("Digite um valor a pagar a conta: ");
              valor = input.nextFloat();
              contaBancaria.pagarConta(valor, "AmazonPrime");
              break;

              case 9:
              System.out.println("Saldo disponivel: "+ contaBancaria.getSaldo());
              break;

              case 10:
              contaBancaria.exibirExtrato();
              break;

              




*/

               




