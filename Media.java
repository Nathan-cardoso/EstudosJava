import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota1, nota2, nota3;

        System.out.print("Digite sua primeira nota: ");
        nota1 = input.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        nota2 = input.nextFloat();
        System.out.print("Digite sua terceira nota: ");
        nota3 = input.nextFloat();

        float media = (nota1 + nota2 + nota3)/3;

        if(media >= 7 && media <= 10){
            System.out.println("Parabens! Voce passou");
        } else{
            System.out.println("Infelizmente voce não passou");
        }

        System.out.format("Sua media foi %.2f\n",media);

        input.close();
    }
}
