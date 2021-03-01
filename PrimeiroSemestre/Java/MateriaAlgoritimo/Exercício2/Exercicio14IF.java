import java.util.Scanner;

public class Exercicio14IF {

    public static void main(String[] args) {

        float Numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com um numero para ver se ele � par, impar ou nulo");
        Numero = entrada.nextFloat();

        if (Numero == 0)
            System.out.println("Nulo");

        else if (Numero % 2 == 0)// o % � sinal de dividir, o == 0 � porque se tal numero for dividido e nao
                                 // sobrar nada � par, sepre dividir por, por isso tem um 2 na frente do %
            System.out.println("� par");

        else
            System.out.println("� impar");

    }

}