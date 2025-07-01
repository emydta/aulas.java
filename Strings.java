public class Strings {

public static void main(String[] args){

String senha = "ABC123";
if (senha.length() > 3){
    System.out.println("senha valida");
} else {
    System.out.println("Senha invalida. Tamanho: "+senha.length());
}

System.out.println("lowercase: "+senha.toLowerCase());
System.out.println("UppserCase: "+senha.toUpperCase());
System.out.println("Normal Case: "+senha);

//Localizar caracteres
String texto = "Hoje e terça feira";
System.out.println(texto.indexOf("e"));

//Concatenar
String nome = "Emilyn";
String sobrenome = "grasielly";
System.out.println(nome+" "+sobrenome);
System.out.println(nome.concat(" ").concat(sobrenome));

String numero1 = "10";
String numero2 = "20";
System.out.println(numero1+numero2);

System.out.println("hoje esta fazendo \"calor\" e frio");

System.out.println("hoje esta fazendo \t\t\t\t\t\t\t\t\t\tcalor e frio");


}

}