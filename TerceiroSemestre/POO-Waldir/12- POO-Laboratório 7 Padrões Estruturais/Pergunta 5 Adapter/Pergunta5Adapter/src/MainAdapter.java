public class MainAdapter {

	public static void main(String[] args) {
		
        var cliente = new Cliente();

        var servico = new Servico();

        // formato incompat�vel
        String dados = null; 
      
        dados = cliente.fornecerDadosEmString();

        // usando adapter
        AdapterStringToAscii adapter = new AdapterStringToAsciiImpl(servico);

        adapter.adaptarDados(dados);

	}

}
