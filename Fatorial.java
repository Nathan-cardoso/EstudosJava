import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int num, fat = 1;

        Scanner ent = new Scanner(System.in);
        System.out.print("Informe um numero para saber seu fatorial: ");
        num = ent.nextInt();

        for(int i = 0; i <= num; i++){
            fat = 1;
            for(int j = i; j > 0; j--){
                fat *= j;
            }
            System.out.println("O fatorial de " + i + ": " + fat);
        }

        ent.close();
    }
}
