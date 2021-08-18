import java.util.*;

public class Banco {

  private String nome;
  
  

  private ArrayList<ContaBancaria> _vetorContasBancaria;
  private ArrayList<Correntista> _vetorCorrentista;

  public Banco(String nome) {
    this.nome = nome;
    this._vetorContasBancaria = new ArrayList<ContaBancaria>();
    this._vetorCorrentista = new ArrayList<Correntista>();
  }

  public String getNome() {
    return nome;
  }

  public void inserirConta() {
    Scanner input = new Scanner(System.in);
    System.out.println("Insira os dados da conta bancaria: agencia, numero e saldo");

    String agencia = input.nextLine();
    String numero = input.nextLine();
    float saldo = input.nextFloat();

    var contaBancaria = new ContaBancaria(this.nome, agencia, numero, saldo);
    System.out.println("Conta criada com sucesso\n");

    _vetorContasBancaria.add(contaBancaria);
    System.out.println("Quantidade de contas bancarias criadas: " + ContaBancaria.getQuantidade());

    System.out.println("\nInsira os dados do correntista dessa conta: Nome, Cpf, Data de nascimento");

    input.nextLine();

    String nome = input.nextLine();
    String cpf = input.nextLine();
    String dataNasc = input.nextLine();

    var correntista = new Correntista(nome, cpf, dataNasc);
    System.out.println("Dados do correntista inseridos com sucesso\n");

    _vetorCorrentista.add(correntista);
    System.out.println("Quantidade de correntistas criados: " + Correntista.getQuantidade() + "\n");

  }

  public void printVectorBancario() {
    for (ContaBancaria imprimiBancario : _vetorContasBancaria) {
      System.out.println("\n"+imprimiBancario.toString()+"\n");
    }

    for (Correntista imprimiCorrentista : _vetorCorrentista) {
      System.out.println(imprimiCorrentista.toString()+"\n");
    }
  }

  public ContaBancaria pesquisarConta(String agencia, String numero) {

    for (int i = 0; i < _vetorContasBancaria.size(); i++) {
      ContaBancaria c = _vetorContasBancaria.get(i);

      if (c.getNumero().equals(numero) && c.getAgencia().equalsIgnoreCase(agencia)) {
        // Encontrou

        // Sai do loop.
        System.out.println("Conta pesquisada com sucesso, Numero: " + numero + " Agencia: " + agencia);
        
      }

    }
    return null;
  }

  public ContaBancaria atualizarConta(String nome, String cpf, String dataNasc) {

  String auxCpf;
  String auxNome;
  String auxDataNasc;

    Scanner input = new Scanner(System.in);
    
    for (int i = 0; i < _vetorContasBancaria.size(); i++) {
      Correntista c = _vetorCorrentista.get(i);
      if(c.getNome().equalsIgnoreCase(nome)){
          System.out.println("Pra qual nome você quer mudar dessa conta: " + nome);
          c.setNome(auxNome = input.nextLine());
          System.out.println("\nA conta com o nome: " + nome + " foi alterado para: " + auxNome+ "\n");
      }
      
      if(c.getCpf().equals(cpf)){
          System.out.println("Pra qual cpf você quer mudar dessa conta: " + cpf);
          c.setCpf(auxCpf = input.nextLine());
          System.out.println("\nA conta com o cpf: " + cpf + " foi alterado para: " + auxCpf+ "\n");
  
      }

      if(c.getDataNasc().equals(dataNasc)){
          System.out.println("Pra qual data de nascimento registrada na sua conta você quer mudar: " + dataNasc);
          c.setDataNasc(auxDataNasc = input.nextLine());
          System.out.println("\nA conta com a data de nascimento: " + dataNasc + " foi alterado para: " + auxDataNasc + "\n");
        
      }

        }
        return null;
    }

  public ContaBancaria deletarConta(String numero) {
    for (int i = 0; i < _vetorContasBancaria.size(); i++) {
      ContaBancaria c = _vetorContasBancaria.get(i);

      if (c.getNumero().equals(numero)) {
        // Encontrou

        // Remove.
        _vetorContasBancaria.remove(c);

        // Sai do loop.
        System.out.println("\nConta removida com sucesso Numero: " + numero + "\n");

      }
    }

    return null;
  }

  public ContaBancaria deletarCorrentista(String nome) {
    for (int i = 0; i < _vetorCorrentista.size(); i++) {
      Correntista c = _vetorCorrentista.get(i);

      if (c.getNome().equals(nome)) {
        // Encontrou

        // Remove.
        _vetorCorrentista.remove(c);

        // Sai do loop.
        System.out.println("\n"+"Correntista removido com sucesso do Nome: " + nome +"\n");

      }
    }

    return null;
  }

}
