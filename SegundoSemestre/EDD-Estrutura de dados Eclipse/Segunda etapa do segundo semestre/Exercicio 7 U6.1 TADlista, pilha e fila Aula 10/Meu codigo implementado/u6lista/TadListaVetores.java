public class TadListaVetores {
    public static final int VAZIO = -1;
    public static final int MAX = 100;

    int[] valores;
    int tamanho;
    int capacidade;

    public TadListaVetores(int capacidade) {
        this.valores = new int[MAX];
        this.tamanho = 0;
        this.capacidade = capacidade;

        this.inicializar();
    }

    private void inicializar() {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = VAZIO;
        }
    }

    public void exibir() {
        System.out.println("\nTAD Lista Encadeada usando Vetores");
        System.out.println(String.format("Tamanho/Capacidade: %d/%d", tamanho, capacidade));
        System.out.print("PRIMEIRO: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(String.format(" [%d]->", valores[i]));
        }
        System.out.println(" ULTIMO\n");
    }

    public boolean estahCheia() {
        return tamanho == capacidade;
    }

    public boolean inserirPrimeiro(int chave) {
        if (estahCheia()) {
            System.out.println("\033[0;31mERRO: LISTA está cheia!\033[0m");
            return false;
        }

        // remanejar todos para a direita em 1 posição
        // tam = 7
        // [2, 4, 10, 7, 9, 5, 3, 8]
        // i
        for (int i = tamanho; i > 0; i--) {
            valores[i] = valores[i - 1];
        }
        // insere a nova chave no 1o indice
        valores[0] = chave;
        // incrementa o tamanho
        tamanho++;

        return true;
    }

    public boolean inserirUltimo(int chave) {
        // verificar se está cheio
        if (estahCheia()) {
            System.out.println("\033[0;31mERRO: LISTA está cheia!\033[0m");
            return false;
        }

        // tam = 8
        // [2, 4, 10, 7, 9, 5, 3, 8, 15]
        valores[tamanho] = chave;
        tamanho++;

        return true;
    }

    public boolean estahVazia() {
        return tamanho == 0;
    }

    public int retirarPrimeiro() {
        // verificar se está vazia
        if (estahVazia()) {
            System.out.println("\033[0;31mERRO: LISTA está vazia!\033[0m");
            return VAZIO;
        }

        // tam = 7
        // [4, 10, 7, 9, 5, 3, 8]
        // *
        int chave = valores[0];
        // *
        // remanejar elementos da direita para a esquerda (<-)
        for (int i = 0; i < tamanho; i++) {
            valores[i] = valores[i + 1];
        }
        // atualizar o tamanho
        tamanho--;

        return chave;
    }

    public void inverter() {
        // criar lista temporária
        var temp = new TadListaVetores(this.capacidade);

        // iterar a lista de forma invertida
        // tam = 7
        // [4, 10, 7, 9, 5, 3, 8]
        // *
        // [8, 3, 5, 9, 7, 10, 4]
        for (int i = 0; i < tamanho; i++) {
            int chave = valores[i];
            temp.inserirPrimeiro(chave); // LIFO (Pilha)
        }

        // atualizar o vetor da lista para o vetor invertido
        this.valores = temp.valores;
    }

    public boolean empilhar(int chave) { // PILHA - LIFO
        return inserirPrimeiro(chave);
    }

    public int desempilhar() { // PILHA - LIFO
        return retirarPrimeiro();
    }

    public boolean enfileirar(int chave) { // FILA
        return inserirUltimo(chave);
    }

    public int desenfileirar() { // FILA - FIFO
        // FRENTE [8, 3, 5, 9, 7, 10, 4] TRAS
        //
        return retirarPrimeiro();
    }

    // - inserir em posição específica
    public boolean inserirPosEspecifica(int pos, int chave) {
        // int[] v = { 4, 10, 7, 9, 5, 3, 8, 0, 0, 0 };
                // pos 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        if (pos < 0 || pos > this.tamanho) {

            System.out.println("Tentando inserir a chave " + chave + " na posição especifica " + pos
                    + " que não existe no vetor: ");
            System.out.println("\033[0;31mERRO:Posição invalida\033[0m\n");
            return true;
        }
        if (estahCheia()) {
            System.out.println(
                    "Tentando inserir a chave " + chave + " na posição especifica " + pos + " com o vetor cheio: ");
            System.out.println("\033[0;31mERRO: LISTA está cheia!\033[0m\n");
            return false;
        }
        // remanejar elementos da esquerda para a direita (->)
        for (int i = this.tamanho; i > pos; i--) {
            valores[i] = this.valores[i - 1];
        }
        System.out.println("Tentando inserir a chave: " + chave + " na posição especifica: " + pos);
        valores[pos] = chave;
        this.tamanho++;
        return true;

    }

    // - retirar em posição específica
    public boolean retirarPosEspecifica(int pos, int chave) {
        if (pos < 0 || pos > this.tamanho) {
            System.out.println("Tentando retirar a chave " + chave + " na posição especifica " + pos
                    + " que não existe no vetor: ");
            System.out.println("\033[0;31mERRO:Posição invalida\033[0m");
            return true;
        }
        if (estahVazia()) {
            System.out.println(
                    "Tentando retirar a chave " + chave + " na posição especifica " + pos + " com o vetor vazio: ");
            System.out.println("\033[0;31mERRO: LISTA está vazia!\033[0m");
            return false;
        }
        // remanejar elementos da direira para a esquerda (<-)
        for (int i = pos; i < this.tamanho - 1; i++) {

            valores[i] = valores[i + 1];
        }
        System.out.println("Tentando retirar a chave: " + chave + " na posição especifica: " + pos);
        this.tamanho--;
        return true;
    }

    // - inserirOrdenado
    public boolean inserirOrdenado(int chave) {
        int i = tamanho;

        if (estahCheia()) {
            System.out.println("Tentando inserir ordenado a chave " + chave + " com o vetor cheio: ");
            System.out.println("\033[0;31mERRO: LISTA está cheia!\033[0m");
            return false;
        }
        while ((i > 0) && (chave < valores[i - 1])) {
            valores[i] = valores[i - 1];
            i--;
        }
        valores[i] = chave;
        tamanho++;
        System.out.println("\nTentando inserir ordenado a chave: " + chave);
        return false;
    }

    // - atualizar(indice, valor)
    public void atualizarChave(int chave, int indice) {
        if (indice < 0 || indice > this.tamanho) {
            System.out.println("Tentando atualizar a chave antiga com o indice especifico errado: " + indice
                    + " para a chave: " + chave);
            System.out.println("\033[0;31mERRO:Posição invalida\033[0m");
            return;
        }
        if (estahVazia()) {
            System.out.println("Tentando atualizar a chave antiga com o indice especifico: " + indice
                    + " para a chave: " + chave + " com o vetor vazio: ");
            System.out.println("\033[0;31mERRO: LISTA está vazia!\033[0m\n");
            return;
        }
        for (int i = indice; i < this.tamanho; i++) {

            if (this.valores[i] == chave) {
                valores[i] = valores[i + 1];
            }
        }
        System.out.println(
                "\nTentando atualizar a chave antiga com o indice especifico : " + indice + " para a chave: " + chave);
        valores[indice] = chave;
        return;
    }

    // - pesquisando a chave retornando a propia posição do vetor
    // Busca sequencial
    public int pesquisarChave(int chave) {
        if (estahVazia()) {
            System.out.println("Tentando pesquisar a chave " + chave + " com o vetor vazio: ");
            System.out.println("\033[0;31mERRO: LISTA está vazia!\033[0m");
            return VAZIO;
        }
        for (int i = 0; i < this.tamanho; i++) {

            if (this.valores[i] == chave) {
                System.out.println("Pesquisando a chave: " + chave);
                System.out.println("A chave " + chave + " existe no vetor\n");
                return i;
            }
        }
        System.out.println("Pesquisando a chave: " + chave);
        System.out.println("\033[0;31mERRO:A chave " + chave + " não existe no vetor\033[0m\n");
        return VAZIO;

    }

    // - exibirInvertido
    public void exibirInvertido() {

        if (estahVazia()) {
            System.out.println("Tentando inverter o vetor vazio: ");
            System.out.println("\033[0;31mERRO: LISTA está vazia!\033[0m");
        }
        System.out.println("\nTAD Lista Encadeada Invertida usando Vetores: ");
        System.out.println(String.format("Tamanho/Capacidade: %d/%d", tamanho, capacidade));
        System.out.print("PRIMEIRO: ");
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.print(String.format(" [%d]->", valores[i]));
        }
        System.out.println(" ULTIMO\n");

    }

    // - retirar(chave)
    public void retirarChave(int chave) {
        if (chave < 0 || chave > this.tamanho) {
            System.out.println("Pesquisando a chave na posição: " + chave + " para retirar do vetor");
            System.out.println("\033[0;31mERRO:Posição invalida\033[0m");
            return;
        }
        if (estahVazia()) {
            System.out.println("Tentando retirar uma chave com vetor vazio: " + chave);
            System.out.println("\033[0;31mERRO: LISTA está vazia!\033[0m");
            return;
        }

        for (int i = chave; i < tamanho - 1; i++) {

            valores[i] = valores[i + 1];
        }
        System.out.println("Pesquisando a chave na posição: " + chave + " para retirar do vetor");
        System.out.println("Retirando a chave na posição: " + chave + " encontrada no vetor");
        tamanho--;

    }
}
