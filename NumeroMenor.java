import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;

        System.out.println("Digite 3 numero para verificar qual é o menor");
        System.out.print("Digite o primeiro numero: ");
        a = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        b = input.nextInt();

        System.out.print("Digite o terceiro numero: ");
        c = input.nextInt();

        int menor = a < b ? a: b; // Operador ternário
        menor = menor < c ? menor : c;
      
        System.out.println("O menor numero eh: "+ menor);

        


        input.close();
    }
}
