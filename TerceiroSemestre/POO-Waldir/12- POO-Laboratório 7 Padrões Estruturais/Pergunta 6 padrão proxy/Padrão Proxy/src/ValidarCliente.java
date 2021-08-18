public class ValidarCliente {

	public boolean validarContaBancaria(ContaBancaria cliente, String codLetras, String senhaCartao) {
		
		if (cliente.getCodLetras().equalsIgnoreCase(codLetras) && cliente.getCartao().getSenha().equalsIgnoreCase(senhaCartao)) {
			
			System.out.println("Codigo de letras e senha do cartão correto");
			
			return true;
			
		} else
			return false;
	}
}