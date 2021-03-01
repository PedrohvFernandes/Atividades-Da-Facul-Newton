public class TadFila {

    public static final int VAZIO = -1;

    TadCelula frente;
    TadCelula tras;
    int tamanho;
    int capacidade;

    // construtor
    public TadFila(int capacidade) {
        TadCelula cabeca = new TadCelula();
        this.frente = cabeca;
        this.tras = cabeca;
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    public void exibir() {
        if (estahVazia()) {
            System.out.println("\033[0;31mERRO:A Fila está VAZIA!\033[0m");
        } else {
            System.out.println("\n\nTAD Fila: ");
            System.out.println(String.format("Tamanho/Capacidade: %d/%d\n", tamanho, capacidade));
            TadCelula aux = frente.prox;
            System.out.print("FRENTE: ");
            while (aux != null) {
                System.out.print(aux);
                aux = aux.prox;
            }

            System.out.println(" TRÁS\n");
        }
    }

    public boolean estahVazia() {
        return frente == tras;
    }

    public boolean estahCheia() {
        return tamanho == capacidade;
    }

    public boolean enfileirar(int chave) {
        // 1. verficar se está cheia.
        if (estahCheia()) {
            System.out.println("\033[0;31mERRO:A Fila está CHEIA!\033[0m");
            return false;
        }

        // 2. criar a nova TadCelula
        TadCelula nova = new TadCelula(chave);
        // 3. atribuir a chave na nova celula
        // 4. colocar a nova celula atrás da Fila
        this.tras.prox = nova;
        // 5. atualizar a tras da fila
        this.tras = nova;
        // 6. atualizar o tamanho da fila
        this.tamanho++;

        return true;
    }

    public int desenfileirar() {
        // 1. verificar se não está vazia
        if (estahVazia()) {
            System.out.println("\033[0;31mERRO:A Fila está VAZIA!\033[0m");
            return VAZIO;
        }

        // 2. atribuir a célula a ser removida
        TadCelula aux = this.frente.prox;
        // 3. atualizar a frente
        this.frente = frente.prox;
        // 4. atualizar o tamanho
        this.tamanho--;

        return aux.valor;
    }

    public boolean pesquisar(int chave) {
        TadCelula aux = frente.prox;
        while (aux != null && aux.valor != chave) {
            aux = aux.prox;
        }
        this.exibir();

        if (aux == null) {
            System.out.println("\033[0;31mERRO:Valor não encontrado\033[0m");
            return false;
        } else {
            System.out.println("Valor encontrado");
            return true;
        }

    }

    public int obterFrente() {
        // 1. verificar se não está VAZIA
        if (estahVazia()) {
            System.out.println("A Fila está VAZIA!");
            return VAZIO;
        }
        // 2. retornar o valor na frente da fila
        return this.frente.prox.valor;
    }

    public int obterTras() {
        // 1. verificar se não está VAZIA
        if (estahVazia()) {
            System.out.println("A Fila está VAZIA!");
            return VAZIO;
        }
        // 2. retornar o valor na frente da fila
        return this.tras.valor;
    }

    /**
     * Permite inverter a fila.
     */
    public void inverter() {
        if (estahVazia()) {
            System.out.println("\033[0;31mERRO:A Fila está VAZIA!\033[0m");
        }
        TadFila temp = new TadFila(this.capacidade);
        TadCelula aux = frente.prox;
        while (aux != null) {
            temp.furarFila(aux.valor);
            aux = aux.prox;
        }
        this.frente = temp.frente;
        this.tras = temp.tras;
    }

    /**
     * Altera um valor existente na fila (de original para o novo).
     *
     * ex: fila.alterar(3, 7); altera do 3 para o 7.
     *
     * @return true se a alteração for bem sucedida, false o contrário
     */
    public boolean alterarValor(int original, int novo) {
        TadCelula aux = frente.prox;
        if (estahVazia()) {
            System.out.println("\033[0;31mERRO:A Fila está VAZIA!\033[0m");
            return false;
        }
        while (aux != null && aux.valor != original) {
            aux = aux.prox;
        }
        if (aux == null) {
            System.out.println("\033[0;31mERRO:Valor " + original + " não encontrado\033[0m");
            return false;
        } else if (aux.valor == original) {
            System.out.println("Valor antigo: " + original + " substituido para o novo valor: " + novo);
            aux.valor = novo;
            return true;
        }
        return false;

    }

    /**
     * Permite desenfileirar quem está na frente e colocá-lo atrás da fila.
     *
     * @return true se a troca for bem sucedida, false o contrário
     */
    public boolean jogarFrenteParaTras() {
        if (estahVazia()) {
            System.out.println("\033[0;31mERRO:A Fila está VAZIA!\033[0m");
            return false;
        }
        TadCelula aux = this.frente.prox;
        this.frente = frente.prox;
        this.tamanho--;
        this.enfileirar(aux.valor);

        return true;

    }

    /**
     * Permite colocar quem está atrás na fila na sua frente.
     *
     * @return true se a troca for bem sucedida, false o contrário
     */
    public boolean jogarTrasParaFrente() {
        if (estahVazia()) {
            System.out.println("\033[0;31mERRO:A Fila está VAZIA!\033[0m");
            return false;
        }
        TadCelula aux = frente.prox;
        TadCelula anterior = null;
        while (aux != tras) {
            anterior = aux;
            aux = aux.prox;
        }
        anterior.prox = aux.prox;
        tamanho--;
        this.furarFila(aux.valor);

        return true;
    }

    public boolean furarFila(int chave) {

        if (estahCheia()) {
            System.out.println("\033[0;31mERRO:A Fila está CHEIA!\033[0m");
            return false;
        }

        TadCelula aux = frente.prox;
        TadCelula nova = new TadCelula(chave);
        frente.prox = nova;
        nova.prox = aux;
        tamanho++;

        return true;
    }
}