import java.util.Scanner;

public class TrocaDeNumeros {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, unidade, dezena, centena ;

        System.out.print("Digite um numero: ");
        num = entrada.nextInt();

        centena = (int) num/100;
        dezena = (int)((num/10) - (centena * 10));
        unidade = num - ((centena * 100) + (dezena * 10));
        
        int numTrocado = (unidade * 100) + (centena * 10) + dezena;

        System.out.printf("Numero trocado -> %d\n",numTrocado); //Utilizando a variável que armazena cada digito.
        //System.out.printf("%d%d%d\n",unidade,centena,dezena); Formatando o número pelos algarismos.
        entrada.close();
    }
}
