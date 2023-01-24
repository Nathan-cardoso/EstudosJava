import java.util.Scanner;
public class ConversorDeGraus {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double celsius;
        //F = C x 1,8 + 32 formula 
        System.out.print("Informe um numero em graus Celsius: ");
        celsius = entrada.nextDouble();

        //double fahrenheit = celsius * 1.8 + 38;
        
        System.out.println("Convertendo para fahrenheit: " + (celsius * 1.8 + 32));

        entrada.close();

    }
}
