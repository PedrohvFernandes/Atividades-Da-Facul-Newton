import java.time.Duration;
import java.time.LocalDateTime;

public class Automovel {
    private String placa;
    private float valorTempo;
    private LocalDateTime tempoEntrada;
    private LocalDateTime tempoSaida;
    private float tempo;

    public Automovel() {

    }

    public String getPlaca() {
        return placa;
    }

    public float getTempo() {
        return tempo;
    }

    public LocalDateTime getTempoEntrada() {
        return tempoEntrada;
    }

    public LocalDateTime getTempoSaida() {
        return tempoSaida;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    public void setTempoEntrada(LocalDateTime tempoEntrada) {
        this.tempoEntrada = tempoEntrada;
    }

    public void setTempoSaida(LocalDateTime tempoSaida) {
        this.tempoSaida = tempoSaida;
    }

    public void setValorTempo(float valorTempo) {
        this.valorTempo = valorTempo;
    }

    public float getValorTempo() {
        return valorTempo;
    }

    public float calcularTempoDePermancencia() {

        Duration duracao = Duration.between(this.tempoEntrada, this.tempoSaida);
        long diferencaMinutos = duracao.toMinutes();

        this.tempo = diferencaMinutos;
      
        System.out.println("Tempo de permanencia: " + this.tempo);
        return tempo;

    }

    public float calcularValorApagar(float taxaHora) {

        this.valorTempo = tempo * taxaHora / 60;
        System.out.println("Valor a pagar: " + valorTempo);

        return valorTempo;
    }
}
