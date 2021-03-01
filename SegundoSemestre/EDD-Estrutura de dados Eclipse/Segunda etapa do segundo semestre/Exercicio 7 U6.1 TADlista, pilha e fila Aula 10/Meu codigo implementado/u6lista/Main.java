public class Main {
    public static void main(String[] args) {
        var lista = new TadListaVetores(20);

        int[] v = {1, 8, 4, 5, 6, 7, 50};
        for (int i : v) {
            lista.inserirPrimeiro(i);
        }
        System.out.println("Lista invertida: ");
        lista.exibir();
        // inverter
        System.out.println("Lista normal: ");
        lista.inverter();
        lista.exibir();

        // pilha
        // lista.empilhar(18);
        // lista.exibir();
        // int chave = lista.desempilhar();
        // System.out.println("Retirou a chave: " + chave);
        // lista.exibir();

        // fila
        System.out.println("Enfileirando: ");
        lista.enfileirar(23);
        lista.exibir();
        int chave = lista.desenfileirar();
        System.out.println("Retirou a chave: " + chave);
        lista.exibir();

        // inserirPosEspecifica
        lista.inserirPosEspecifica(1, 2);
        lista.exibir();
        lista.inserirPosEspecifica(5, 28);
        lista.exibir();
        lista.inserirPosEspecifica(3, 11);
        lista.exibir();
        // Inserir em uma posição invalida
        lista.inserirPosEspecifica(20, 30);

        // - retirar em posição específica
        lista.retirarPosEspecifica(1, 2);
        lista.exibir();
        // Tentando retirar chave e a posição especifica que não existe no vetor
        lista.retirarPosEspecifica(20, 13);

        // - Inserir ordenado
        lista.inserirOrdenado(2);
        lista.exibir();
        
        // - atualizar(indice, valor)
        lista.atualizarChave(8, 3);
        lista.exibir();
        // - atualizar(indice, valor)  indice que não existe
        lista.atualizarChave(90, 80);
        lista.exibir();
     

        // - pesquisar(chave)
        lista.pesquisarChave(28);
        // - pesquisar(chave) que não existe no vetor
        lista.pesquisarChave(120);

        // - exibirInvertido
        lista.exibirInvertido();
        lista.exibir();
        
        // - retirar(chave)
        lista.retirarChave(4);
        lista.exibir();
        // - retirar(chave) que não existe no vetor
        lista.retirarChave(90);

        // estado final da lista
        System.out.println("\nVetor em estado final: ");
        lista.exibir();

        // int chave = 0;
        // // validar se a chave foi removida
        // if ((chave = lista.retirarPrimeiro()) != VAZIO) {
        // System.out.println("Retirou a chave: " + chave);
        // }
        // lista.exibir();

        // while (!lista.estahVazia()) {
        // chave = lista.retirarPrimeiro();
        // System.out.println("Retirou a chave: " + chave);
        // lista.exibir();
        // }
    }
}
