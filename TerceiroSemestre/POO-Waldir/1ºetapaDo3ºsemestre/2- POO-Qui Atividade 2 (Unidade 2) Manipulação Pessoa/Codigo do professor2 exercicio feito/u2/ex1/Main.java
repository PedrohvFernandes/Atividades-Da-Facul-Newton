package u2.ex1;

public class Main {

    public static void main(String[] args) {
        
        // 1a pessoa
        var pessoa1 = new Pessoa("José Pereira", "123456789.01", "2010.02.03", 35.3f);
        System.out.println(pessoa1);
        System.out.println("Quantidade: " + Pessoa.getQuantidade() + "\n");

        // 2a pessoa
        var pessoa2 = new Pessoa("Maria Pereira", "567890123-45", "2000.12.03", 15.3f);
        System.out.println(pessoa2);
        System.out.println("Quantidade: " + Pessoa.getQuantidade() + "\n");
    
        // 3a pessoa
        var pessoa3 = new Pessoa("Marta Pereira", "654321987-65", "1998.04.13", 85.3f);
        System.out.println(pessoa3);
        System.out.println("Quantidade: " + Pessoa.getQuantidade() + "\n");
        
        float peso = pessoa1.getPeso();
        
        if (pessoa2.getPeso() < peso) {
            peso = pessoa2.getPeso();
        }
        if (pessoa3.getPeso() < peso) {
            peso = pessoa3.getPeso();
        }
        
        System.out.println("Menor peso: " + peso);
    }

}
