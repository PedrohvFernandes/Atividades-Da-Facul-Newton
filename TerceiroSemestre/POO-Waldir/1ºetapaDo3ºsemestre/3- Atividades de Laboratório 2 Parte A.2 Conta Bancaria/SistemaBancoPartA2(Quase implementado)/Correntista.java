public class Correntista {
  private String nome;
  private String cpf;
  private String dataNasc;
  private static int quantidade = 1;

public Correntista(String nome, String cpf, String dataNasc){
        
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;

    }

public String getNome() {
        return nome;
    }

public String getCpf(){
        return cpf;
    }

public String getDataNasc(){
      return dataNasc;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public void setDataNasc(String dataNasc) {
    this.dataNasc = dataNasc;
}

public void setNome(String nome) {
    this.nome = nome;
}
@Override
 public String toString() {
        return "Usuario cadastrado no sistema: " + " nome: " + nome + ", Cpf = " + cpf + ", dataNasc=" + dataNasc + "\n";
    }
    
 public static int getQuantidade() {
        return quantidade++;
    }
  
}