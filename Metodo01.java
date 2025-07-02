import java.util.Scanner;

public class Metodo01{

    public static double subtracao(double a, double b){
        double subtrair = a - b;
        System.out.println("resultado: "+subtrair);
        return subtrair;
    }

     public static double dividir(double a, double b){
        double divisao = a / b;
        System.out.println("resultado: "+divisao);
        return divisao;
    }

    public static double soma(double numero1, double numero2){
        double soma = numero1 + numero2;
        System.out.println("resultado: "+soma);
        return soma;
    }

    public static double multiplicar(double numero1, double numero2){
        double multiplica
         = numero1 * numero2;
        return multiplica;
    }



    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao;


        while (true){
        System.out.println("\n--- CALCULADORA ---");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = entrada.nextInt();

        if(opcao == 0) {
           System.out.println("Encerrando o programa...");
                break;
        }


       if (opcao == 1){ 
            System.out.println("digite o valor a: ");    
            double a = entrada.nextDouble();
            System.out.println("digite o valor b: ");
            double b = entrada.nextDouble();
            double resultado = soma(a, b);  
            
        } else if (opcao == 2){
          System.out.println("digite o valor a: ");    
            double a = entrada.nextDouble();
            System.out.println("digite o valor b: ");
            double b = entrada.nextDouble();
            double resultado = subtracao(a, b);  
            
        } else if (opcao == 3){
            System.out.println("digite o valor a: ");    
            double a = entrada.nextDouble();
            System.out.println("digite o valor b: ");
            double b = entrada.nextDouble();
            double resultado = multiplicar(a, b);  
        }else if (opcao == 4) {
             System.out.println("digite o valor a: ");    
            double a = entrada.nextDouble();
            System.out.println("digite o valor b: ");
            double b = entrada.nextDouble();
            double resultado = dividir(a, b);  
            } 
       }
    }
}