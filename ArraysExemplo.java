import java.util.Scanner;

public class ArraysExemplo {


    public static void main(String[] args) {
        String[] alunos = new String[5];
        double[] media = new double[5];

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<5; i++){
            System.out.println("digite o nome do aluno: ");
            alunos[i] = scanner.nextLine();

            double notas = 0;
            System.out.println("digite a nota 1: ");
            notas = notas + scanner.nextDouble();
            System.out.println("digite a nota 2: ");
            notas = notas + scanner.nextDouble();
            System.out.println("digite a nota 3: ");
            notas = notas + scanner.nextDouble();
            System.out.println("digite a nota 4: ");
            notas = notas + scanner.nextDouble();
            System.out.println("digite a nota 5: ");
            notas = notas + scanner.nextDouble();

            scanner.nextLine();

            media[i] = notas / 4;

        }
        System.out.println("resultado: ");
        System.out.println("-----------");

        for(int i=0; i<5; i++){
            System.out.println("Nome: "+alunos[i]+"- Média:"+media[i]);
        }
    }
}