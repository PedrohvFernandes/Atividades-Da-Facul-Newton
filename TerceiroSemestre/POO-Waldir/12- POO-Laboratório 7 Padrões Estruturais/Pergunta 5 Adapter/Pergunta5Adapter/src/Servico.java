import java.util.List;
import java.util.logging.Logger;


public class Servico {

	private static final Logger LOG = Logger.getLogger(Servico.class.getName());
	
	
	 public void analisarDadosEmAscii(List<Short> dados) {
		 
		 // validando formato
	        if (dados.contains("The")) {
	            LOG.severe("ERRO: Formato de dados inválido!\n");

	            return;
	        } else {
	            LOG.info("INFO: formato aceito com sucesso!");
	        }
		 
	 }
	
}
