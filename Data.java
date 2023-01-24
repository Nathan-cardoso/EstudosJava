import java.util.Scanner;

public class Data{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\tInforme uma data digitando o dia, mes e ano, respectivamente\nDigite o dia: ");
        int dia = input.nextInt();
        System.out.print("Digite o mes: ");
        int mes = input.nextInt();
        System.out.print("Digite o ano: ");
        int ano = input.nextInt();

        String mesConvertido;
//Convertendo o numero do mes para seu nome convencional 
        if(mes == 1){
            mesConvertido = "Janeiro";
        }else if (mes == 2){
            mesConvertido = "Fevereiro";           
        }else if (mes == 3){
            mesConvertido = "Março";
        }else if(mes == 4){
            mesConvertido = "Abriu";
        }else if(mes == 5){
            mesConvertido = "Maio";
        }else if(mes == 6){
            mesConvertido = "Junho";
        }else if(mes == 7){
            mesConvertido = "Julho";
        }else if(mes == 8){
            mesConvertido = "Agosto";
        }else if(mes == 9){
            mesConvertido = "Setembro";
        }else if(mes == 10){
            mesConvertido = "Outubro";
        } else if(mes == 11){
            mesConvertido = "Novembro";
        }else{
            mesConvertido = "Dezembro";
        }

        byte diasDoMes;
//Verificando quantos dias tem o mes informado no inicio, Considerando que fevereiro tem 28 dias.
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            diasDoMes = 31;
            break;
            case 2:
            diasDoMes = 28;
            break;
            default: 
            diasDoMes = 30;
            break;
        }
        System.out.format("%d de %s de %d\n",dia, mesConvertido, ano);
        System.out.format("%s tem %d dias\n",mesConvertido,diasDoMes);



        input.close();
    }

}