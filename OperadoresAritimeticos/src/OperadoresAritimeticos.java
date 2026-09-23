import java.util.Scanner;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o nome da loja: ");
        String nomeLoja = scanner.nextLine();

        System.out.println("Digite o valor do pão: ");
        double pao = scanner.nextDouble();

        System.out.println("Digite o valor do queijo: ");
        double queijo = scanner.nextDouble();

        System.out.println("Digite o valor do açucar: ");
        double acucar = scanner.nextDouble();

        System.out.println("Digite o valor do desconto: ");
        double desconto = scanner.nextDouble();

        int totalDiasDoMes = 30;
        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDivido = valorTotalComDesconto / (double)2.0;
        double valorTotalMensal = valorTotalComDesconto * (double)totalDiasDoMes;
        double cashbackAcumulado = valorTotalMensal * 0.05;
        double carteira = (double)500.0;
        carteira += (double)50.0;
        double var10000 = carteira - valorTotalMensal;

        System.out.println("=========== RECIBO DE COMPRAS ==============");
        System.out.println("Cliente: " + nomeCliente.toUpperCase());
        System.out.println("Estabelecimento: " + nomeLoja);
        System.out.println("============================================");
        System.out.println("Item 1:  Pão ---------------   R$ " + pao);
        System.out.println("Item 2:  Queijo ------------   R$ " + queijo);
        System.out.println("Item 3:  Açucar ------------   R$ " + acucar);
        System.out.println("Total: ---------------------   R$ " + valorTotal);
        System.out.println("Desconto: ------------------   R$ " + desconto);
        System.out.println("Valor Final: ---------------   R$ " + valorTotalComDesconto);
        System.out.println("===========================================");

        scanner.close();
    }
}
