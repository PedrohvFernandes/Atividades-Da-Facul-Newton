import java.util.Scanner;

public class Exercicio11 {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    double custoFabrica, custoConsumidor, destribuidor, valorImpostos;
    double porcentagemDistri = 12.0; // Se eu colocar 0,12 aqui, n�o precisaria de colocar os /100 la em baixo
    double porcentagemImpostos = 45.0;

    System.out.println("Informe o custo de f�brica de um carro novo: ");
    custoFabrica = ler.nextDouble();

    destribuidor = (custoFabrica * porcentagemDistri) / 100; // O/100 � para dividir a porcentagem com o custo de
                                                             // fabrica, no caso seria 0,12*30000(valor estimado de um
                                                             // carro), so que ele multiplica os 12*30000=360000/100
    valorImpostos = (custoFabrica * porcentagemImpostos) / 100;

    custoConsumidor = (destribuidor + valorImpostos);

    System.out.println("O custo ao consumidor de um carro novo �: " + custoConsumidor);

  }
}
