import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

public class LeituraNomesSobrenomes {
	
	public static void main(String[] args) {
			
		
	try {
		
		FileReader nomes = new FileReader("D:/Linguagens de programação/Tarefa/Ativ 8-Manipulação de Arquivos/PastaNomesSobrenomes/1-Nomes.txt");
		FileReader sobreNomes = new FileReader("D:/Linguagens de programação/Tarefa/Ativ 8-Manipulação de Arquivos/PastaNomesSobrenomes/2-Sobrenomes.txt");
		
		BufferedReader nomesBr = new BufferedReader(nomes);
		BufferedReader sobreNomesBr = new BufferedReader(sobreNomes);
		
		//Arrays para armazenar os nomes para poder concatenar, pois os arrays são do tipo string
		String[] listaNomes = new String[10];
		String[] listaSobreNomes = new String[10];
		
		String nomesItem;
		String sobreNomesItem;
		
		System.out.println("\nNomes:\n");
		int i = 0;
		while((nomesItem = nomesBr.readLine()) != null) {	
			listaNomes[i] = nomesItem;
			i++;
			System.out.println(nomesItem);
			}
		i = 0;
		System.out.println("\nSobrenomes:\n");
		while((sobreNomesItem = sobreNomesBr.readLine()) != null) {
			listaSobreNomes[i] = sobreNomesItem;
			i++;
			System.out.println(sobreNomesItem);
		}
		
		File concatenacaoNomesF = new File("D:/Linguagens de programação/Tarefa/Ativ 8-Manipulação de Arquivos/PastaNomesSobrenomes/3-NomesSobreNomesConcatenados.txt");

		
		FileWriter concatenacaoNomesFw = new FileWriter(concatenacaoNomesF);
		BufferedWriter concatenacaoNomesbw = new BufferedWriter(concatenacaoNomesFw);
		
		concatenacaoNomesbw.write("Nomes e Sobrenomes concatenados: ");
		concatenacaoNomesbw.newLine();
		
		for(i = 0; i < 10; i++) {
			concatenacaoNomesbw.write(listaNomes[i]+ " " + listaSobreNomes[i]);
			concatenacaoNomesbw.newLine();
		}
		
		concatenacaoNomesbw.flush();
		concatenacaoNomesbw.close();
		
		
		
	}catch(Exception ex) {
		ex.printStackTrace();
		
		}
	}
}