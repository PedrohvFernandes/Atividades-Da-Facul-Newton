public class String1 {

  public static void main(String[] args) {
    int i;
// o especificador de formato para caractere (%c)
// o especificador de formato para decimal (%d)
// mostra o i-�simo caractere da tabela ASCII
    System.out.printf("Caracteres num�ricos:\n");
    for (i=48; i<=57; i++) {
      System.out.printf("%d", i);
    }

    System.out.printf("\n\nCaracteres alfab�ticos mai�sculos:\n");
    for (i=65; i<=90; i++) {
      System.out.printf("%d", i);
    }

    System.out.printf("\n\nCaracteres alfab�ticos min�sculos:\n");
    for (i=97; i<=122; i++) {
      System.out.printf("%d", i);
    }
    
    System.out.printf("\n\nTodos os caracteres:\n");
    for (i=48; i<=122; i++) {
      System.out.printf("%d", i);
    }
    
    System.out.printf("\n");
  }

}