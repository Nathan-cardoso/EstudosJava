import java.util.Scanner;

public class PotenciaRecursiva{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Base: ");
        int base = input.nextInt();

        System.out.print("Expoente: ");
        int expoente = input.nextInt();

        System.out.println("Potencia: " + potencia(base, expoente));
        input.close();
    }

    public static int potencia(int base, int expoente){  
        if(expoente == 0){
            return 1;
        }else{
            return base * potencia(base, expoente - 1);
        }
    }
}
