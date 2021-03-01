import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double distancia, volume, consumo;

        System.out.println("Distancia percorrida � de (km): ");
        distancia = ler.nextDouble();

        System.out.println("Volume gasto do combustivel (l): ");
        volume = ler.nextDouble();

        consumo = (distancia / volume);

        System.out.println("O consumo medio � de: " + consumo);

    }
}