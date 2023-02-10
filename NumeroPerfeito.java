public class NumeroPerfeito{
//Falta resolver
    /*Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito é aquele que é igual à soma dos seus divisores (exceto o próprio número). Exemplos: 6=1+2+3, 28=1+2+4+7+14. */
    public static void main(String[] args) {

        int contNum = 0, restoDiv = 0, somaResto = 0; 
        int num = 2, i;

        do{
            somaResto = 0;
            num++;
            for(i = 1; i < num; i++){
                if(num % i == 0){
                    restoDiv = i;
                    somaResto += restoDiv;
                }
            }

            if(somaResto == num){  
                System.out.format("O %d numero perfeito: %d\n",contNum + 1, num);
                contNum++;
            }

        }while(contNum < 4);

    }
}