import java.util.ArrayList;
import java.util.List;

public class Automovel {
    private String marca;
    private String modelo;
    private int ano;
    private int km;
    private float valor;
    private List<String> cpfs;

    public Automovel(String marca, String modelo, int ano, int km, float valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.km = km;
        this.valor = valor;
        this.cpfs = new ArrayList<String>();
    }

    
    /** 
     * @return String
     */
    public String toString() {
        return "Marca do automovel:" + marca + ", modelo:" + modelo + ", ano:" + ano + 
        ", km:" + km + ", valor:" + valor + "R$\n";
    }

    
    /** 
     * @param cpf
     */
    public void adicionarProprietario(String cpf){
        if(cpfs.contains(cpf)){
            System.out.println("Esse proprietario: " + cpf + " ja esta incluso no modelo: " + this.modelo+", com isso não sera possivel adicioná-lo no nosso sistema\n");
        }
        else{
        cpfs.add(cpf);
        System.out.println("Proprietario adicionado com sucesso: " + cpf + " no automovel do modelo:" + this.modelo+"\n");
        }    
    }

    
    /** 
     * @param cpf
     */
    public void removerProprietario(String cpf){
        if(!cpfs.contains(cpf)){
            System.out.println("ERRO: Esse proprietario:" + cpf + " não existe no nosso sistema, com isso não sera possivel removê-lo");
        }
        else{
        cpfs.remove(cpf);
        System.out.println("Proprietario removido com sucesso: " + cpf + " no automovel do modelo:" + this.modelo+"\n");
        }
    }

    public void exibirProprietarios(){
        System.out.println("=======================================================================");
        System.out.println("Todos os cpfs ligados a esse modelo: "+modelo + ":");
        for (String imprimiCpfs : cpfs) {
            System.out.println("Cpf dos proprietarios: "+ imprimiCpfs.toString() + "\n");
        }
        System.out.println("=======================================================================");
    }

}