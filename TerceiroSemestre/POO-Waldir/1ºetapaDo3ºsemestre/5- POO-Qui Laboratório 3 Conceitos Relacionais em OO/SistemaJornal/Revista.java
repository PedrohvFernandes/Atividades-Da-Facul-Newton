import java.util.ArrayList;
import java.util.List;

public class Revista {
    private String id;
    private String nome;

    private Artigo artigo1;
    private Artigo artigo2;

    public Revista(String id, String nome, Artigo artigo1, Artigo artigo2){
        this.id = id;
        this.nome = nome;
        this.artigo1 = artigo1;
        this.artigo2 = artigo2;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "Revista: " + id + ": " + nome;
    }

    public void imprimirArtigos(){
        List<Artigo> artigos = new ArrayList<>();
        artigos.add(artigo1);
        artigos.add(artigo2);

        System.out.println("=======================================");
        System.out.println("Id da revista: " + id);
        System.out.println("Revista: " + getNome());
        System.out.println("\n");
        System.out.println("Artigos da revista: " + getId() + " " + getNome() + " :\n");

        for (Artigo imprimiArtigos : artigos) {
            System.out.println(imprimiArtigos.toString()+"\n");
        }
        System.out.println("=======================================");

    }

}
