public class ContaBancaria {
	
    private String nome;
    
    private String codLetras;
    
    private CartaoDeCredito cartao;

	public ContaBancaria (String nome, String codLetras, CartaoDeCredito cartao) {
		
        this.nome = nome;
        this.codLetras = codLetras;
        this.cartao = cartao;
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public CartaoDeCredito getCartao() {
		return cartao;
	}

	public void setCartao(CartaoDeCredito cartao) {
		this.cartao = cartao;
	}
	
	public String getCodLetras() {
		return codLetras;
	}
	
	public void setCodLetras(String codLetras) {
		this.codLetras = codLetras;
	}

	@Override
	public String toString() {
		return "ContaBancaria [nome=" + nome + ", codLetras=" + codLetras + ", cartao=" + cartao + "]";
	}
	
	
    
}
