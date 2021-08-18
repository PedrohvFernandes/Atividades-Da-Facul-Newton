public class Deposito implements Transacoes {
    
	float deposito; 
   
    @Override
    public String transacao(float valor, String senha, CartaoDeCredito cartao) {
        if(valor <= 0){
        	
            return "Erro: valor para deposito invalido";
        } 
        if(!cartao.getSenha().equalsIgnoreCase(senha)){
            return "Senha incorreta";
        } 
        
        return "Deposito realizado com sucesso";
    }
    
    
       

}
