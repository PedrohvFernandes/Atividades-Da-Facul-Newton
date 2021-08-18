public class Saque  implements Transacoes{


    @Override
    public String transacao(float valor, String senha, CartaoDeCredito cartao) {
        if(valor <= 0){
        	
            return "Error: valor para saque invalido";
        } 
        if(!cartao.getSenha().equalsIgnoreCase(senha)){
            return "Senha incorreta";
        } 
        
        return "Saque realizado com sucesso";
    }
    
    
}
