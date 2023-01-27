import java.util.Scanner;

public class ConversorDeMinutos{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite os minutos: ");
        int minutos = input.nextInt();
        int dias, horas, min2;

        dias = minutos/1440;
        horas = (minutos - dias*1440)/60;
        min2 = (minutos - dias * 1440 - horas * 60);

        System.out.format("%d = %d dias, %d horas e %d minutos\n",minutos, dias, horas, min2);

        input.close();
    }
}