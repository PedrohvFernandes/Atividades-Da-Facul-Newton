import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double AlturaTriangulo, BaseTriangulo, Area;

        System.out.println("Entre com os dados do triangulo");
        AlturaTriangulo = entrada.nextDouble();
        BaseTriangulo = entrada.nextDouble();

        Area = (AlturaTriangulo * BaseTriangulo) / 2;

        System.out.println("O valor da Area �:" + Area);

    }
}