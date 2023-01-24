import java.util.Scanner;

public class AreaDoQuadrado{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double ladoDoQuadrado;
        System.out.print("Informe o lado do quadrado: ");
        ladoDoQuadrado = entrada.nextDouble();

        System.out.printf("A area do quadro eh: %.2f%n",Math.pow(ladoDoQuadrado, 2));







        entrada.close();
    }

}