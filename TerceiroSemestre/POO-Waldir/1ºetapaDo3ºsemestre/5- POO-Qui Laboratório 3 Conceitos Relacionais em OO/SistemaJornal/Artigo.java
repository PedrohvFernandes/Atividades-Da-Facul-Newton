public class Artigo {

    private String id;
    private String autor;
    private String conteudo;
    private String data;

    public Artigo(String id, String autor, String conteudo, String data) {

        this.id = id;
        this.autor = autor;
        this.conteudo = conteudo;
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getData() {
        return data;
    }

    public String getId() {
        return id;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "Artigo: " + id + " Autor do artigo: " + autor + "conteudo do artigo: " + conteudo
 + " Data de lançamento desse artigo: " + data;
    }

    public void obterTamanho() {
        // forma de contar todos os caracteres de uma string é utilizar o método
        // String.chars().count() que devolve o número total de caracteres na string,
        // mas incluindo os espaços em branco. Como chars() é um fluxo, podemos utilizar
        // o método filter() para ignorar os espaços em branco. O filter(ch -> ch != '
        // ') verifica todos os caracteres e, se encontrar um espaço em branco,
        // filtrá-lo-á para fora.
        //a onde esta o ch pode ser qualquer letra 

        long totalCharacters = conteudo.chars().filter(ch -> ch != ' ').count();

        System.out
                .println("Total de carcteres no conteudo do Artigo " + getId() + " " + totalCharacters);

        return;
    }

}
