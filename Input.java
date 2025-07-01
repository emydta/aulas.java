import java.util.Scanner;

public class Input {

    public static void main(String[] args){
    
           Scanner scanner = new Scanner(System.in); //instancia de uma classe (classe->objeto) 
           System.out.println("digite seu nome: ");
           String nome = scanner.nextLine();
           System.out.println("nome: "+nome);
           int idade = scanner.nextInt();

           System.out.println("Seu nome e "+nome+" e voce tem "+idade+"anos");
    
    }

}