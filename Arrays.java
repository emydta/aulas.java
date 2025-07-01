public class Arrays {
    
    
    public static void main(String[] args) {
       //                     0       1      2       3
        String[] carros = {"volvo", "BMW","ford", "mazda"};
        //Mostra o tamanho do array
        System.out.println(carros.length);
        //Mostrar todos os elementos do array
        for (int i=0; i < carros.length; i++){
            System.out.println(carros[i]);
        }
        //Altera o valor de um elemento do array
        carros [0] = "fusca";
        //Mostrar um elemnto especifico do array pelo indice
        System.out.println(carros[2]);
        //Xriar novo array para adicionar outro elemento
        //Precisa fazer uma cópia do array original
        String[] novoCarros = new String[carros.length + 1];
        for (int i=0; i < carros.length; i++){
            novoCarros[i] = carros[i];
        }
        //Adiciona o novo carro no novo array com base no último elemento
        // do array carros
        novoCarros[carros.length] = "toyota";
        for (String carro : carros){
            System.out.println(carro);
        }

    }
}