import java.util.Scanner;

public class SistemaDeLoja{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o codigo do produto: ");
        short codigoDoProduto = input.nextShort();

        System.out.print("Digite o valor do produto: ");
        float produto = input.nextFloat();

        float desconto;
        String setor;

        switch(codigoDoProduto){
            case 111:
            setor = "Setor de cama, mesa e banho";

            if(produto > 100.0f){
                desconto = 0.4f * produto;
                produto -= desconto;
            } else if(produto >= 50 && produto <= 100){
                desconto = 0.2f * produto;
                produto -= desconto;   
            }else{
                desconto =  0.1f * produto;
                produto = produto - (desconto); 
            }

            System.out.format("O seu produto eh do %s. Com o desconto, o seu produto passou a custar %.2f R$\n",setor,produto);

            break;
            case 222:
            setor = "Setor de eletros";

            if(produto > 500.0f){
                desconto =  0.1f * produto;
                produto = produto - (desconto);
            }

            System.out.format("O seu produto eh do %s. Com o desconto, o seu produto passou a custar %.2f R$\n",setor,produto);

            break;

            default :
            System.out.println("Setor Invalido");

        }
     

        input.close();
    }
}