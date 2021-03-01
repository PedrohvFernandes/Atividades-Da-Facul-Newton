class TadCelula {//dentro da celula:
  int valor;//item
  TadCelula prox;//referencia apontador o encadeamento para a proxima celula
}

class TadListaEncadeada {//lista
  //4 atributos
  TadCelula primeiro;//referencias da celula
  TadCelula ultimo;//referencias da celula
  int tamanho;
  int capacidade;
}

class Main {
  public static void main(String[] args) {// trabalhando com as duas classes
    // declaração
    TadListaEncadeada lista;

    // criar a lista vazia
    lista = new TadListaEncadeada();
    // criando a celula cabeca
    TadCelula cabeca = new TadCelula();
    lista.primeiro = cabeca;
    lista.ultimo = cabeca;
    lista.tamanho = 0;
    lista.capacidade = 5;

    System.out.println("\nPrimeiro:" + lista.primeiro);

    System.out.println("\nUltimo:" + lista.ultimo);

    // lista está vazia
    // equals(Igual) compara se dois objetos são iguais
    //duas maneiras pra ver se a lista esta vazia
    
    // para objetos de classe se usa o equals mais seguro
    //igual so se usa pra tipos primitivos
    if (lista.primeiro.equals(lista.ultimo)) {
      System.out.println("Lista vazia!\n");
    }
    if (lista.tamanho == 0) {
      System.out.println("Lista vazia!\n");
    }

    // insercao
    for (int i = 0; i < 5; i++) {
      if (lista.tamanho == lista.capacidade) {
        System.out.println("Lista Cheia!");// se encher ele avisa que a lista ta cheia e mostra ate a onde ele inseriu
      } else {
        TadCelula nova = new TadCelula();
        nova.valor = i * 2; // pode ser inserido via scanner
        lista.ultimo.prox = nova; // a celula anterior apontado para nova
        lista.ultimo = nova;//ultimo apostando para nova celula
        lista.tamanho++;//pra atualizar o tamanho de acordo com inserção das celulas

      }
    }

    // exibir a lista
    TadCelula aux = lista.primeiro.prox;
    while (aux != null) {//equanto aux não for nulo eu tenho o que imprimir, percorrendo a lista com o auxiliar
      System.out.print("[ " + aux.valor + "] -> ");//chaves no vetores
      aux = aux.prox;// proxima celula
    }
    System.out.println("NULL");// quando o tamanho bater com a capacidade ele mostra o nulo

  }
}