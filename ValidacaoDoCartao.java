import java.util.Scanner;
import java.util.Calendar;

public class ValidacaoDoCartao {
    public static void main(String[] args) {

        int numero, cod, mes,ano, mesAtual, anoAtual;
        System.out.println("Informe os dados do seu cartao");
        Scanner input = new Scanner(System.in);

        Calendar calendario = Calendar.getInstance(); //biblioteca para trabalhar com data.

        mesAtual = 1 + calendario.get(Calendar.MONTH); /*Criando uma variavel que recebe o mês atual. Mas como a biblioteca inicia
        o mes com 0, é necessário adicionar mais 1 para os meses terem a numereção correta. */
        anoAtual = calendario.get(Calendar.YEAR);   

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
       
        System.out.print("Digite o numero do cartao: ");
        numero = input.nextInt();

        System.out.print("Digite o codigo: ");
        cod = input.nextInt();

        System.out.print("Digite o mes da validade: ");
        mes = input.nextInt();

        System.out.print("Digite o ano da validade: ");
        ano = input.nextInt();

        while(ano < anoAtual || (ano == anoAtual && mes < mesAtual )){
            System.out.println("Dados invalidos! Digite novamente");
            System.out.print("Digite o mes da validade: ");
            mes = input.nextInt();
    
            System.out.print("Digite o ano da validade: ");
            ano = input.nextInt();
        }

        System.out.println("Dados validos!");

        input.close();
    }
}
