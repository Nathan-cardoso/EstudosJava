//Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo. Assuma que n>0.

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        int n, a = 1,aux = 0 ,fib = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero para representar a quantidade de elementos da sequencia de Fibonacci: ");
        n = input.nextInt();
        // O SOUT abaixo é apenas para representar a saída.
       System.out.print("Sequencia Fibonacci: ");
        for(int i = 1; i <= n; i++){
            fib = a + aux;
            aux = a;
            a = fib;
            System.out.print(fib);
        }
        //Apenas para organização da saída.
        System.out.println("");
        input.close();
    }

}