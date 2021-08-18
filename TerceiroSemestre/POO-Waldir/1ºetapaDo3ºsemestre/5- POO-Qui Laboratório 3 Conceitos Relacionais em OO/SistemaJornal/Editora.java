import java.util.ArrayList;
import java.util.List;

public class Editora {
    private String id;
    private String nome;
    private String endereco;

    private List<Revista> revistas;

    public Editora(String id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.revistas = new ArrayList<>();
    }

    public String getEndereco() {
        return endereco;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {

        return "Editora: " + id + ": " + nome + " Endereço: " + endereco;
    }

    public Revista pesquisar(String id, String nome) {

        for (Revista revista : revistas) {
            if (revista.getId().equals(id) && revista.getNome().equals(nome)) {
                return revista;
            }
        }
        return null;
    }

    public void adicionarRevista(Revista revista) {

        if (pesquisar(revista.getId(), revista.getNome()) != null) {
            System.out.println(revista + " ja existente no banco de dados da Editora: " + nome);
            return;
        }

        this.revistas.add(revista);
        System.out.println("Revista adicionada com sucesso: \n" + revista + "\n");
    }

    public Revista imprimirRevista() {
        
        System.out.println("=======================================");
        System.out.println("Id: " + id);
        System.out.println("Editora: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("\n");
        System.out.println("Todas as revistas no banco de dados da " + nome + "\n");

        for (Revista imprimiRevista : revistas) {
            System.out.println(imprimiRevista.toString()+"\n");
        }

        System.out.println("=======================================");
        return null;
    }
}
