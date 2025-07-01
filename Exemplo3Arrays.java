import java.util.Scanner;

public class Exemplo3Arrays {


    public static void main(String[] args) {
        String[] alunos = new String[5];
        double[] media = new double[5];
        double[][] notas = new double[5][4];
        double soma=0;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<5; i++){
            System.out.println("digite o nome do aluno "+(i+1)+ ": ");
            alunos[i] = scanner.nextLine();

            soma=0;
            for(int y=0; y < 4; y++){
                System.out.println("digite a nota "+(y+1)+" do aluno "+alunos[i]+": ");
                notas[i][y] = scanner.nextDouble();
                soma = soma+notas[i][y];
            }
            
            scanner.nextLine();
            media[i] = soma / 4;

        }
        System.out.println("resultado: ");
        System.out.println("---------------------");
        //Mostrar o nome média e as notas de cada aluno 
        for(int i=0; i < 5; i++){
            System.out.println("Nome: "+alunos[i]+"- Média:"+media[i]);
            System.out.print("Notas:");
            for(int y=0; y<4; y++){
                System.out.print("|"+notas[i][y]+"|");
            }
            System.out.println("");
            System.out.println("---------------------");
        }
    }    
}