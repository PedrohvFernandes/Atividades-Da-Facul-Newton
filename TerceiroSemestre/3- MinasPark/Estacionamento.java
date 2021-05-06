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

    private Automovel carro;

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

    public void obterQuantidadeVagasDisponivel() {
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

        int taxaOcupacao = (this.totalAutomovel / this.quantidadeVagas) * 100;
        System.out.println("Taxa de ocupação é de: " + taxaOcupacao);

        return;

    }

    public Automovel cadastrarEntradaCarro(String placa) {
        carro = new Automovel();

        var dateTime = LocalDateTime.now();
        String.format("%30s", dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        carro.setPlaca(placa);
        carro.setTempoEntrada(dateTime);

        for (int i = 0; i < automoveis.size(); i++) {
            Automovel a = automoveis.get(i);

            if (a.getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("\033[0;31mERRO: " + carro.getPlaca() + ", já existente no estacionamento "
                        + getNomeEstacionamentoEmpresa() + "\033[0m");
                return null;
            }

            if (automoveis.size() >= quantidadeVagas) {
                System.out
                        .println("\033[0;31mERRO: Estacionamento " + getNomeEstacionamentoEmpresa() + " lotado\033[0m");
                return null;
            }
        }

        this.automoveis.add(carro);
        totalAutomovel++;
        System.out.println("\033[0;32mEntrada do carro cadastrado com sucesso: \033[0m" + placa);
        System.out.println("Taxa do estacionamento por hora: " + this.taxaHora + "R$");
        System.out.println("Tempo de entrada do veiculo: " + carro.getTempoEntrada());
        return carro;

    }

    public void cadastrarSaidaCarro(String placa) {

        var dateTime = LocalDateTime.now();
        String.format("%30s", dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        carro.setTempoSaida(dateTime);

        for (int i = 0; i < automoveis.size(); i++) {
            Automovel a = automoveis.get(i);
            if (a.getPlaca().equalsIgnoreCase(placa)) {

                this.automoveisHistorico.add(carro);
                this.automoveis.remove(carro);
                totalAutomovel--;
                System.out.println("\033[0;32mSaida do carro cadastrado com sucesso: \033[0m" + placa);
                System.out.println("Tempo de entrada do veiculo: " + carro.getTempoEntrada());
                System.out.println("Tempo de saida do veiculo: " + carro.getTempoSaida());

                return;
            }
        }

        if (automoveis.size() <= 0) {
            System.out.println("\033[0;31mERRO: Estacionamento: " + this.nomeEstacionamentoEmpresa + " vazio\033[0m");
            return;
        }

        System.out.println("\033[0;31mERRO: " + placa + ", não existente no estacionamento "
                + this.nomeEstacionamentoEmpresa + "\033[0m");
        return;
    }

    public void exibirValorAPagar(String placa) {
        if (carro.getPlaca().equalsIgnoreCase(placa) && carro.getTempoSaida() != null) {
            System.out.println("Automovel da placa: " + placa + ", tera que pagar: ");

            carro.calcularTempoDePermancencia();
            carro.calcularValorApagar(this.taxaHora);

            return;
        }

        if (carro.getPlaca().equalsIgnoreCase(placa) && carro.getTempoSaida() == null) {
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
