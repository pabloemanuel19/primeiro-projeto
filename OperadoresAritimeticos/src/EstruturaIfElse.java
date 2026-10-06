public class EstruturaIfElse {
    public static void main(String[] args) {
        int idade = 30;


//        if (idade >= 18) {
//            System.out.println("Você é maior de idade ");
//        }
//        else {
//            System.out.println("Você é menor de idade");
//        }

        boolean temDinheiro = true;
        boolean temCartao = false;

        if (temDinheiro && temCartao){
            System.out.println("Pede um ifood e um zé delivery");
        } else if (temDinheiro || temCartao) {
            System.out.println("Pede um ifood ");
        } else {
            System.out.println("Não pede nada");
        }



    }

}
