public class PessoaFisica implements Prototype {

	  private String nome;
	  private String cpf;
	  private String dataNasc;


    public PessoaFisica(String nome, String cpf, String dataNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
	}

	// (2) criar um construtor que aceita um obj da mesma classe
    public PessoaFisica(PessoaFisica source) {
    	this.nome = source.nome;
    	this.cpf = source.cpf;
    	this.dataNasc = source.dataNasc;
    }

    // (3) adicionar o metodo de clonagem
    @Override
    public Prototype clonar() {
        return new PessoaFisica(this);
    }

	@Override
	public String toString() {
		return "PessoaFisica [nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc + "]";
	}

    

}
