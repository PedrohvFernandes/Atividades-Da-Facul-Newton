public class Main {
    public static void main(String[] args) {

        System.out.println("\n=======================================");
        System.out.println(
                "\nGrupo: Josue Martins Beda,\nPedro Henrique Vieira Fernandes,\nSamuel Marques Abreu Pereira\n");
        System.out.println("=======================================\n");

        // criando editora
        var editora = new Editora("001", "O globo", "São Paulo");
        System.out.println("Editora criada com sucesso: " + editora + "\n");

        // Vazio
        editora.imprimirRevista();

        // criando os primeiros artigos da revista casa e jardim
        var artigoCasaJardim1 = new Artigo("001", "Fernanda Drumond, ",
                "Arte e design se destacam em apê clean de 370 m² em São Paulo.", "21/03/2021");
        var artigoCasaJardim2 = new Artigo("002", "Nathalia Fabro, ",
                "Projeto de apê evidência piso de madeira, tons claros e peças de design", "29/03/2021");

        // criando os primeiros artigos da revista globo rural
        var artigoGloboRural = new Artigo("001", "Mariana Grilli, Eliane Silva e Cleyton Vilarino, ", "Ernesto Araújo dificultou relações do agro brasileiro com o mundo, avaliam especialistas ",
                "29/03/21");
        var artigoGloboRura2 = new Artigo("002", "Reuters, ", "CDPC aprova R$5,9 bi para linhas do Funcafé em 2021/22",
                "29/03/21");    

        // criando as revistas com os artigos
        var revista1 = new Revista("001", "CASA E JARDIM", artigoCasaJardim1, artigoCasaJardim2);
        var revista2 = new Revista("002", "GLOBORURAL", artigoGloboRural, artigoGloboRura2);

        // Tentando pesquisar revistas no banco de dados da editora vazia = null
        System.out.println("\nPesquisa " + editora.pesquisar(revista1.getId(), revista1.getNome()) + "\n");

        // adicionando a primeira revista no banco de dados da editora = adicionando
        editora.adicionarRevista(revista1);

        // Pesquisando a revista passando o id e o nome
        System.out.println("Pesquisa " + editora.pesquisar(revista1.getId(), revista1.getNome()) + "\n");

        // tentando adicionar a mesma revista
        editora.adicionarRevista(revista1);

        // tentando pesquisar com outro Id de outra revista
        System.out.println("\nPesquisa " + editora.pesquisar(revista2.getId(), revista1.getNome()) + "\n");

        // adicionando mais 1 revista na editora
        editora.adicionarRevista(revista2);

        // com duas revistas
        editora.imprimirRevista();
        
            
        // obtendo tamanho e imprimindo os artigos das revistas
        // Casa e jardim - 2 artigos
        revista1.imprimirArtigos();
        artigoCasaJardim1.obterTamanho();
        artigoCasaJardim2.obterTamanho();
 

        // Globo rural- 2 artigos
        revista2.imprimirArtigos();
        artigoGloboRural.obterTamanho();
        artigoGloboRura2.obterTamanho();


        System.out.println("=======================================");

    }

}
