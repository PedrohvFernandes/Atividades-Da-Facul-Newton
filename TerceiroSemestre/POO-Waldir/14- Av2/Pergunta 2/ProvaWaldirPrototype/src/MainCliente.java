public class MainCliente {

    public static void main(String[] args) {
        var pessoaFisica = new PessoaFisica("Pedro", "1234567891-11", "05/12/2001");
        System.out.println(pessoaFisica);
        System.out.println();

        var copiaPessoaFisica = pessoaFisica.clonar();
        System.out.println(copiaPessoaFisica);
        System.out.println();

    }
}
