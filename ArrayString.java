
//Questão criada pelo ChatGPT
//Criar um array de String e apresentar a primeira letra de cada 
import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //CharAt(Indice) é uma função que retornar um caractere de uma String .
        int SIZE = 3;
        String[][] nome;
        char[] letra = new char[SIZE];
        nome = new String[SIZE][1];
        
        for (int i = 0; i < nome.length; i++) {
            for (int j = 0; j < nome[i].length; j++) {
                System.out.printf("Digite seu nome: ");
                //Vai ler as Strings.
                nome[i][j] = sc.nextLine();
                //O vetor de caractere vai armazenar em cada posição a primeira letra de cada palavra digitada
                letra[i] = nome[i][j].charAt(0);
            }
        }
    
        //O for earth para percorrer todo o vetor que armazena as letras.
        System.out.print("Iniciais: ");
        for(char l : letra){
            System.out.print(" "+l);
        }
        System.out.println("\n");
    //Organização de apresentação.
        
        sc.close();
    
    }

}
