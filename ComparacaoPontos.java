import java.util.Scanner;

public class ComparacaoPontos {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int x1,x2, y1, y2;

        System.out.print("Informe o primeiro ponto\nDigite o valor de x:");
        x1 = ent.nextInt();
        System.out.print("Digite o valor de Y: ");
        y1 = ent.nextInt();

        System.out.print("Informe o segundo ponto\nDigite o valor de x:");
        x2 = ent.nextInt();
        System.out.print("Digite o valor de Y: ");
        y2 = ent.nextInt();

        if(x1 == x2 && y2 > y1){

            System.out.println("O segundo ponto esta acima do primeiro");

        } else if(x1 == x2 && y2 < y1){

            System.out.println("O segundo ponto esta abaixo do primeiro");

        }else if(x1 > x2 && y2 > y1){

            System.out.println("O segundo ponto esta acima e a esquerda do primeiro");

        }else if(x1 > x2 && y2 < y1){

            System.out.println("O segundo ponto esta abaixo e a esquerda do primeiro");

        }else if(x1 < x2 && y2 > y1){

            System.out.println("O segundo ponto esta acima e a direita do primeiro");

        }else if(x1 < x2 && y2 < y1){

            System.out.println("O segundo ponto esta abaixo e a direita do primeiro");

        }else if(x1 > x2 && y2 == y1){

            System.out.println("O segundo ponto esta a esquerda do primeiro");

        }else if(x1 < x2 && y2 == y1){

            System.out.println("O segundo ponto esta a direita do primeiro");

        }else{

            System.out.println("Os pontos estão no mesmo lugar no plano");
        }

        ent.close();
    }
}
