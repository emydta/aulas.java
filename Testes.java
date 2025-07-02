public class Testes{
    public static void main(String[] args) {
    
        char[][] matriz = new char [3][3];
        char jogador = 'X';
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = '_';
            }  
        }

            for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++){
                 System.out.print(matriz[x][y]+ "|");
                }
                 System.out.println(); 
            }    
    }
}
