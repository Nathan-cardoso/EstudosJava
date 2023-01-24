import java.util.Scanner;

public class BoasVindas {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String nome = entrada.nextLine();

        System.out.printf("Bem-vindo(a),  %s!\n",nome);



        entrada.close();
    }
}
