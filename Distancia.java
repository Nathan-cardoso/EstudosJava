import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x1, x2;
        double y1, y2;

        System.out.print("Informe o valor de x1:");
        x1 = entrada.nextDouble();

        System.out.print("Informe o valor de x2:");
        x2 = entrada.nextDouble();

        System.out.print("Informe o valor de y1:");
        y1 = entrada.nextDouble();

        System.out.print("Informe o valor de y2:");
        y2 = entrada.nextDouble();

        Double distancia;
        distancia = Math.sqrt(Math.pow((x1 - x2), 2.0) + Math.pow((y2 - y1), 2.0));

        System.out.printf("A distancia entre os pontos he: %.2f%n", distancia);

        entrada.close();
    }
}
