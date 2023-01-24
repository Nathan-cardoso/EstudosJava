import java.util.Scanner;

public class Angulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double graus;

        System.out.print("Informe um numero em graus: ");
        graus = entrada.nextDouble();

        double rad = Math.toRadians(graus);

        System.out.println("Convetendo para Radianos -> " + rad );
        System.out.println("O cosseno do angulo -> " + Math.cos(rad));
        System.out.println("O seno do angulo -> " + Math.sin(rad));
        System.out.println("A tangente do angulo -> " + Math.tan(rad));
        System.out.println("O cossecante do angulo -> " + Math.acos(rad));
        System.out.println("O secante do angulo -> " + Math.asin(rad));
        System.out.println("O cotangente do angulo -> " + Math.atan(rad));


        entrada.close();
    }
}
