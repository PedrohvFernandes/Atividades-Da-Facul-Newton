public class Transferencia implements Transacoes {

    @Override
    public String transacao(float valor, String senha, CartaoDeCredito cartao) {
        if(valor <= 0){
        	
            return "Error: valor para transferencia invalido";
            
        } 
        if(!cartao.getSenha().equalsIgnoreCase(senha)){
        	
            return "Senha incorreta";
            
        }
        
        return "Transferencia realizada com sucesso";
    }
    
}
