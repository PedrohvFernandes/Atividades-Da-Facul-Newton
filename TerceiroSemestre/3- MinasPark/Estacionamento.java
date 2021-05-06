import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Estacionamento {
    private int quantidadeVagas;
    private String nomeEstacionamentoEmpresa;
    private int totalAutomovel;
    private float taxaHora;
    private List<Automovel> automoveis;
    private List<Automovel> automoveisHistorico;

    private Automovel automovel;

    public Estacionamento(int quantidadeVagas, String nomeEstacionamentoEmpresa, int totalAutomovel, float taxaHora) {

        this.quantidadeVagas = quantidadeVagas;
        this.nomeEstacionamentoEmpresa = nomeEstacionamentoEmpresa;
        this.totalAutomovel = totalAutomovel;
        this.taxaHora = taxaHora;
        this.automoveis = new ArrayList<>();
        this.automoveisHistorico = new ArrayList();

    }

    public String getNomeEstacionamentoEmpresa() {
        return nomeEstacionamentoEmpresa;
    }

    public int getQuantidadeVagas() {
        return quantidadeVagas;
    }

    public float getTaxaHora() {
        return taxaHora;
    }

    public int getTotalAutomovel() {
        return totalAutomovel;
    }

    public void calcularQuantidadeVagasDisponivel() {
        int obterQuantidadeVagasDisponivel = quantidadeVagas - totalAutomovel;

        if (obterQuantidadeVagasDisponivel == 0) {

            System.out.println("\033[0;31mERRO:As vagas acabaram: " + obterQuantidadeVagasDisponivel + "\033[0m");
            return;
        }
        System.out.println("\033[0;32mQuantidade de vagas disponiveis: " + obterQuantidadeVagasDisponivel + "\033[0m");
        return;

    }

    public void obterTotalDeAutomoveis() {

        if (this.automoveis.size() == 0) {

            System.out.println("\033[0;31mERRO:Não possui nem um carro no estacionamento "
                    + this.nomeEstacionamentoEmpresa + "\033[0m");
            return;
        }
        System.out.println("\033[0;32mQuantidade de automoveis: " + this.totalAutomovel + "\033[0m");
        return;

    }

    public void calcularTaxaOcupacao() {

        if (this.automoveis.size() == 0) {

            System.out.println("\033[0;31mERRO:Estacionamento : " + this.nomeEstacionamentoEmpresa
                    + " não possui taxa de ocupção, pois esta vazio\033[0m");
            return;
        }

        int taxaOcupacao = (totalAutomovel / quantidadeVagas) * 100;
        System.out.println("Taxa de ocupação é de: " + taxaOcupacao);

        return;

    }

    public Automovel pesquisarPorAutomovel(String placa) {

        for (Automovel automovel : automoveis) {
            if (automovel.getPlaca().equalsIgnoreCase(placa)) {
                return automovel;
            }
        }

        return null;

    }

    public Automovel pesquisarPorAutomovelHistorico(String placa) {

        for (Automovel automovelHistorico : automoveisHistorico) {
            if (automovelHistorico.getPlaca().equalsIgnoreCase(placa)) {
                return automovelHistorico;
            }
        }

        return null;

    }

    public Automovel cadastrarEntradaCarro(String placa) {
        automovel = new Automovel(placa);

        var dateTime = LocalDateTime.now();
        String.format("%30s", dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        automovel.setTempoEntrada(dateTime);

        if (pesquisarPorAutomovel(placa) != null) {
            System.out.println("\033[0;31mERRO: " + automovel.getPlaca() + ", já existente no estacionamento "
                    + this.nomeEstacionamentoEmpresa + "\033[0m");
            return null;
        }

        if (automoveis.size() >= quantidadeVagas) {
            System.out.println("\033[0;31mERRO: Estacionamento " + getNomeEstacionamentoEmpresa() + " lotado\033[0m");
            return null;
        }

        
        this.automoveis.add(automovel);
        totalAutomovel++;
        System.out.println("\033[0;32mEntrada do automovel cadastrado com sucesso: \033[0m" + placa);
        System.out.println("Taxa do estacionamento por hora: " + this.taxaHora + "R$");
        System.out.println("Tempo de entrada do veiculo: " + automovel.getTempoEntrada());
        return automovel;

    }

    public Automovel cadastrarSaidaCarro(String placa) {

        var dateTime = LocalDateTime.now();
        String.format("%30s", dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        
            if (pesquisarPorAutomovel(placa) != null) {

                automovel.setTempoSaida(dateTime);
                this.automoveisHistorico.add(automovel);
                this.automoveis.remove(automovel);
                totalAutomovel--;
                System.out.println("\033[0;32mSaida do automovel cadastrado com sucesso: \033[0m" + placa);
                System.out.println("Tempo de entrada do veiculo: " + automovel.getTempoEntrada());
                System.out.println("Tempo de saida do veiculo: " + automovel.getTempoSaida());

                return automovel;
            }

        if (automoveis.size() <= 0) {
            System.out.println("\033[0;31mERRO: Estacionamento: " + this.nomeEstacionamentoEmpresa + " vazio\033[0m");
            return null;
        }

        System.out.println("\033[0;31mERRO: " + placa + ", não existente no estacionamento "
                + this.nomeEstacionamentoEmpresa + "\033[0m");
        return null;
    }

    public void exibirValorAPagar(String placa) {
        if (pesquisarPorAutomovelHistorico(placa) != null && automovel.getTempoSaida() != null) {
            System.out.println("Automovel da placa: " + placa + ", tera que pagar: ");

            automovel.calcularTempoDePermancencia();
            automovel.calcularValorApagar(this.taxaHora);

            return;
        }

        if (pesquisarPorAutomovel(placa) != null && automovel.getTempoSaida() == null) {
            System.out.println("\033[0;31mERRO: Automovel da placa: " + placa + " não possui tempo de saida\033[0m");
            return;
        }

    }

    public void exibirVeiculos() {
        System.out.println("                             ====================================================");
        System.out.println("Automoveis estacioanados no:               ###        \033[0;34m"
                + this.nomeEstacionamentoEmpresa + "\033[0m       ###\n");
        for (Automovel automoveisEstacioanados : automoveis) {
            System.out.println("PLACA DO CARRO:       " + automoveisEstacioanados.getPlaca()
                    + "     TEMPO DE ENTRADA:       " + automoveisEstacioanados.getTempoEntrada() + "\n");
        }
        System.out.println("                             ====================================================");
    }

    public void exibirHistorico() {
        System.out.println("                             ====================================================");
        System.out.println("Historico dos automoveis no:               ###        \033[0;34m"
                + this.nomeEstacionamentoEmpresa + "\033[0m       ###\n");
        for (Automovel automoveisHistorico : automoveisHistorico) {
            System.out.println("PLACA DO CARRO:       " + automoveisHistorico.getPlaca()
                    + "     TEMPO DE ENTRADA:       " + automoveisHistorico.getTempoEntrada()
                    + "     TEMPO SAIDA:       " + automoveisHistorico.getTempoSaida() + "\n");
        }
        System.out.println("                             ====================================================");
    }

}
