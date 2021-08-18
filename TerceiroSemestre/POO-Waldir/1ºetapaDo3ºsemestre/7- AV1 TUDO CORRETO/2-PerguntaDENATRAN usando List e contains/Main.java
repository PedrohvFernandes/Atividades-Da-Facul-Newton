public class Main {
    
    /** 
     * @param args
     */
    public static void main(String[] args){

        System.out.println("============================================");
        System.out.println("Pedro Henrique Vieira Fernandes- Ra:12108683");
        System.out.println("============================================\n");

        //criando um automovel
        var corolla = new Automovel("Toyota", "Toyota Corolla", 2019, 0, 125.090f);
        System.out.println(corolla);
        //adicionando um proprietario nesse modelo de automovel
        corolla.adicionarProprietario("15445906604");
        //tentando inserir o mesmo proprietario
        corolla.adicionarProprietario("15445906604");

        //exibindo todos os proprietarios
        corolla.exibirProprietarios();

        

        //Criando um segundo automovel
        var venenoRoadster = new Automovel("Lamborghini", "Lamborghini Veneno Roadster", 2022, 0, 149.090f);
        System.out.println(venenoRoadster);
        //Adicionando um proprietario nesse automovel
        venenoRoadster.adicionarProprietario("12345678911");
        //exibindo todos os proprietarios
        venenoRoadster.exibirProprietarios();

     
        //adicionando mais dois proprietarios no modelo corolla
        corolla.adicionarProprietario("13243234243");
        corolla.adicionarProprietario("32323213213");
        //exibindo todos os proprietatios
        corolla.exibirProprietarios();

        //adicionando mais um proprietatio no modelo Lamborghini Veneno Roadster
        venenoRoadster.adicionarProprietario("39390430248");
        //exibindo todos os proprietarios
        venenoRoadster.exibirProprietarios();

        //removendo um proprietario de cada modelo criado
        corolla.removerProprietario("15445906604");
        venenoRoadster.removerProprietario("12345678911");

        //tentando remover um cpf que não existe no sistema
        corolla.removerProprietario("32384355659");
        venenoRoadster.removerProprietario("23256675765");
        
        //exibindo apos remover os proprietarios
        corolla.exibirProprietarios();
        venenoRoadster.exibirProprietarios();
    }
}
