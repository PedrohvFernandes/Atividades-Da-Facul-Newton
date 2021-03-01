import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Entre com as notas do aluno");
        System.out.println("Nota da materia matematica �: ");
        nota1 = ler.nextDouble();
        System.out.println("Nota da materia portugues �: ");
        nota2 = ler.nextDouble();
        System.out.println("Nota da materia historia �: ");
        nota3 = ler.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("O valor da M�dia �: " + media);

    }
}