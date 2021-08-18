import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
  
  private String banco;
  private String agencia;
  private String numero;
  private float saldo;
  private static int quantidade = 1;
 // Scanner input = new Scanner(System.in);

  private List<String> extrato = new ArrayList<>();

public ContaBancaria(String banco, String agencia, String numero, float saldo){
        System.out.println(banco + "\n");
        this.banco = banco;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;

    }

public String getBanco() {
        return banco;
    }

public String getAgencia(){
        return agencia;
    }

public String getNumero(){
      return numero;
    }
    
public float getSaldo(){
      return saldo;
    }

public String setAgencia(String agencia){
  return this.agencia = agencia;
}

    @Override
 public String toString() {
        return "Conta bancaria cadastrado no sistema: " + banco + ", Agencia = " + agencia + ", numero da conta: " + numero + " e o saldo: " + saldo + "\n";
    }

  public static int getQuantidade() {
        return quantidade++;

    }
  
  public boolean sacar(float valor, boolean exbirNoExtrato) {

  
        if (valor <= 0) {
            System.out.println("ALERTA: valor de saque inválido: " + valor);
            
            return false;
        }
        
        if (valor > saldo) {
            System.out.println("ALERTA: saldo insuficiente");
            
            return false;
        }

            // efetivar o saque
            System.out.println("Sacando: "+ valor +" da sua conta: " + numero);
            saldo-=valor;
            System.out.println("Saldo atual da conta após sacar: "+numero+": R$"+saldo);

        if (exbirNoExtrato) {
            adicionarOperacaoNoExtrato("saque", valor);
        }

            return true;
       }

      private void adicionarOperacaoNoExtrato(String operacao, float valor) {
             var dateTime = LocalDateTime.now();
             extrato.add(String.format("%30s - %25s - %05.2f", 
                        dateTime.format(DateTimeFormatter.ISO_DATE_TIME),
                        operacao,
                        valor));        
            }


  public void depositar(float valor){

    if (valor <= 0) {
      System.out.println("ERRO: valor inválido para depósito.");

      return;
    }

    saldo = saldo + valor;
    System.out.println("Saldo atual na conta apos o deposito: " +numero+": R$"+saldo);

    adicionarOperacaoNoExtrato("depósito", valor);

      
  }

public boolean transferir (float valor, String contaDestino){

      //sacar da conta
      var ehValida = this.sacar(valor, false);

      //depositar na conta destino
      if (!ehValida) {
            System.out.println("ALERTA: não foi possível a transferência da conta");
            
            return false;            
        }
  
              System.out.println("Descontado: "+ valor +" da sua conta");

              System.out.println("Saldo atual da conta apos transferir: "+numero+": R$"+saldo);

               adicionarOperacaoNoExtrato("transferencia - " + contaDestino, valor);

              return true;
                  
        }
public boolean pagarConta(float valor, String destinatario){
             
        //sacar da conta
        var ehValida = this.sacar(valor, false);
        // pagar
        if (!ehValida) {
            System.out.println("ALERTA: não foi possível o pagamento da conta: " + destinatario);
            
            return false;
        }

             
              System.out.println("Descontado: "+ valor +" da sua conta");
              System.out.println("Saldo atual da conta apos pagar conta: "+numero+": R$"+saldo);
              adicionarOperacaoNoExtrato("pagamento conta - " + destinatario, valor);
              return true;
            
}
      public void exibirExtrato() {
              
              System.out.println("===============================");
              System.out.println("Banco " + banco);
              System.out.println(LocalDateTime.now());
              System.out.println("\n");
              System.out.println("Agência: " + agencia);
              System.out.println("Número: " + numero + "\n");
              
              for (var linha: extrato) {  // for each
                  System.out.println(linha);
              }
              
              System.out.println(String.format("Saldo em conta: \t R$%05.2f", saldo));
              
      //        for (int i = 0; i < extrato.size(); i++) {
      //            System.out.println(extrato.get(i));
      //        }
              System.out.println("===============================\n\n");



}


  }

