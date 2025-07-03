import java.util.Scanner;

public class JogodaVelha {

    public static void mostrarMatriz(char[][] matriz){
        System.out.println("___ JOGO DA VELHA___");
        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
                if (j < 2) System.out.print("  | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---");
        }
    }

    public static boolean jogoCheio(char[][] tabuleiro) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[i][j] == ' ') {
                return false;
            }
        }
    }
    return true; 
    }


    

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char[][] matriz = new char[3][3];
        char[][] tabuleiro = new char[3][3];
    
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matriz[i][j] = ' ';
            }
        }

        mostrarMatriz(matriz);
        
        System.out.println("Jogador 1, decida o que será! (X ou O): ");
        char jogador1 = scanner.nextLine().charAt(0);

        System.out.println("Jogador 2, agora é sua vez: (X ou O): ");
        char jogador2 = scanner.nextLine().charAt(0);

       while (jogoCheio(tabuleiro)){
        
        System.out.println("Jogador 1, sua vez! Escolha a linha e a coluna (0 a 2):");
        System.out.print("linha: ");
        int linha = scanner.nextInt();
        System.out.print("coluna: ");
        int coluna = scanner.nextInt();

            if (matriz[linha][coluna] == ' ') {
            matriz[linha][coluna] = jogador1;
            } else {
            System.out.println("Essa posição já está ocupada!");
            }

        System.out.println("Jogador 2, sua vez! Escolha a linha e a coluna (0 a 2):");
        System.out.print("linha: ");
        linha = scanner.nextInt();
        System.out.print("coluna: ");
        coluna = scanner.nextInt();

            if (matriz[linha][coluna] == ' ') {
            matriz[linha][coluna] = jogador2;
            } else {
            System.out.println("Essa posição já está ocupada!");
            } {break; 
            }
       } 


        


        mostrarMatriz(matriz);
    }
}