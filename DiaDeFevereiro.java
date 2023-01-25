import java.util.Scanner;

public class DiaDeFevereiro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um dia do mes de fevereiro, em numero, para saber qual dia da semana vai ser"); /*O exercício considerou que o primeiro dia de fevereiro foi um
        domingo.*/
        System.out.print("Digite o dia: ");
        short dia = entrada.nextShort();
        String diaTexto;
        switch (dia) {

            case 1:
            case 8:
            case 15:
            case 22:
            diaTexto = "Domingo";
            System.out.println(diaTexto);
            break;

            case 2:
            case 9:
            case 16:
            case 23:
            diaTexto = "Segunda-feira";
            System.out.println(diaTexto);
            break;

            case 3:
            case 10:
            case 17:
            case 24:
            diaTexto = "Terça-feira";
            System.out.format("%s",diaTexto);
            break;

            case 4:
            case 11:
            case 18:
            case 25:
            diaTexto = "Quarta-feria";
            System.out.println(diaTexto);
            break;

            case 5:
            case 12:
            case 19:
            case 26:
            diaTexto = "Quinta-feira";
            System.out.println(diaTexto);
            break;

            case 6:
            case 13:
            case 20:
            case 27:
            diaTexto = "Sexta-feira";
            System.out.println(diaTexto);
            break;

            case 7:
            case 14:
            case 21:
            case 28:
            diaTexto = "Sabado";
            System.out.println(diaTexto);
            break;

            default:
            System.out.println("Dia invalido! Fevereiro tem 28 dias");
                break;
        }

        entrada.close();
    }
}
