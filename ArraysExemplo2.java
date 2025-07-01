import java.util.Scanner;

public class ArraysExemplo2 {


    public static void main(String[] args) {
        String[] alunos = new String[5];
        double[] media = new double[5];

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<5; i++){
            System.out.println("digite o nome do aluno "+(i+1)+ ": ");
            alunos[i] = scanner.nextLine();

            double notas = 0;
            for(int y=0; y < 4; y++){
                System.out.println("digite a nota "+(y+1)+" do aluno "+alunos[i]+": ");
                notas = notas + scanner.nextDouble();
            }
            scanner.nextLine();

            media[i] = notas / 4;

        }
        System.out.println("resultado: ");
        System.out.println("-------------------------------");

        for(int i=0; i<5; i++){
            System.out.println("Nome: "+alunos[i]+"- Média:"+media[i]);
        }
    }
}