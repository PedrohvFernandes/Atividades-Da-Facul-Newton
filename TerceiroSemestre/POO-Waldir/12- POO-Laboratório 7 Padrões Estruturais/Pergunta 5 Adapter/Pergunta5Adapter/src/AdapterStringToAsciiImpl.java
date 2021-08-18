import java.util.ArrayList;
import java.util.List;

public class AdapterStringToAsciiImpl implements AdapterStringToAscii {

	private Servico servico;

	public AdapterStringToAsciiImpl(Servico servico) {

		this.servico = servico;

	}

	@Override
	public List<Short> adaptarDados(String strings) {

		System.out.println("Dados originais:\n");
		System.out.println(strings);
		System.out.println();

		// Convertendo String em tabela Ascii

		List<Short> dados = new ArrayList<Short>();

		System.out.println("Dados Em Ascii: \n");

		for (int i = 0; i < strings.length(); i++) {
			int tabelaAscii = (int) strings.charAt(i);
			
			dados.add((short) tabelaAscii);

		}

		System.out.print(dados + " \n");
		servico.analisarDadosEmAscii(dados);

		return dados;
	}

}
