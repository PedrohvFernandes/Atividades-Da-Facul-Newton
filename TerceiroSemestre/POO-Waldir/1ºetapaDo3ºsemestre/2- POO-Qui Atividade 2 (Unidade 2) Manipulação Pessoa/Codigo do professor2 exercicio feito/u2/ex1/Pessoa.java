package u2.ex1;

public class Pessoa {
    
    private static int quantidade = 0;
    
    private String nome;
    private String cpf;
    private String dataNasc;
    private float peso;
    
    /**
     * @param nome
     * @param cpf
     * @param dataNasc
     * @param peso
     */
    public Pessoa(String nome, String cpf, String dataNasc, float peso) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.peso = peso;
        
        quantidade++;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc + ", peso=" + peso + "]";
    }
    
    public static int getQuantidade() {
        return quantidade;
    }
}
