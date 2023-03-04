import java.util.Scanner;

public class MediaArray {
    public static void main(String[] args) {
        float vet[] = new float[3];
        float soma = 0;
        Scanner inp = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.format("Digite sua %d nota: \n",i+1);
            vet[i] = inp.nextFloat();
        }

        for (float i : vet) {
            soma += i;
        }


        System.out.format("Sua media: %.2f\n",soma/vet.length);


        inp.close();
    }
}
