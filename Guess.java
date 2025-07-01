import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int RESPOSTA_CORRETA = 99;
        final int QUANTIDADE_TENTATIVAS = 3;
        int palpite;
        
        System.out.println("Seja bem-vindo ao QuickGuess!");
        System.out.println("Descubra o número.\nDicas:");
        System.out.println("- É ímpar.");
        System.out.println("- É divisível por 3.");
        System.out.println("- É composto por dezena e unidade.");
        System.out.println("- É quase uma centena.");
        System.out.println("Dê seu palpite. Você tem apenas 3 tentativas!");

        for (int i = 1; i <= QUANTIDADE_TENTATIVAS; i++) {
            System.out.print("Tentativa " + i + ": ");
            palpite = entrada.nextInt();

            if (palpite == RESPOSTA_CORRETA) {
                System.out.println("Parabéns, você ganhou!");
                break;
            } else {
                if (i < QUANTIDADE_TENTATIVAS) {
                    System.out.println("Errado, tente novamente.");
                } else {
                    System.out.println("Suas tentativas acabaram. O número era " + RESPOSTA_CORRETA + ".");
                }
            }
        }

    }
}