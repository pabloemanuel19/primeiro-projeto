import java.util.Scanner;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o nome da loja: ");
        String nomeLoja = scanner.nextLine();

        // ARRAY 1: nomes dos itens (array de String já inicializado com valores)
        String[] itens = {"Pão", "Queijo", "Açucar"};

        // ARRAY 2: preços dos itens (array de double com o mesmo tamanho do array de itens)
        double[] precos = new double[itens.length];

        // Lê o preço de cada item usando um laço sobre o array
        for (int i = 0; i < itens.length; i++) {
            System.out.println("Digite o valor do " + itens[i] + ": ");
            precos[i] = scanner.nextDouble();
        }

        System.out.println("Digite o valor do desconto: ");
        double desconto = scanner.nextDouble();

        // Soma todos os preços percorrendo o array
        double valorTotal = 0.0;
        for (int i = 0; i < precos.length; i++) {
            valorTotal += precos[i];
        }

        // Descobre o item mais caro percorrendo o array
        int indiceMaisCaro = 0;
        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > precos[indiceMaisCaro]) {
                indiceMaisCaro = i;
            }
        }

        int totalDiasDoMes = 30;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalMensal = valorTotalComDesconto * totalDiasDoMes;
        double carteira = 10.00;
        carteira += 10.00;

        System.out.println("=========== RECIBO DE COMPRAS ==============");
        System.out.println("Cliente: " + nomeCliente.toUpperCase());
        System.out.println("Estabelecimento: " + nomeLoja.toUpperCase());
        System.out.println("============================================");

        // Imprime cada item do recibo usando o array (não precisa repetir println para cada item)
        for (int i = 0; i < itens.length; i++) {
            System.out.printf("Item %d:  %-18s R$ %.2f%n", (i + 1), itens[i], precos[i]);
        }

        System.out.printf("Total: --------------------- R$ %.2f%n", valorTotal);
        System.out.printf("Desconto: ------------------ R$ %.2f%n", desconto);
        System.out.printf("Valor Final: --------------- R$ %.2f%n", valorTotalComDesconto);
        System.out.println("Item mais caro: " + itens[indiceMaisCaro]
                + " (R$ " + String.format("%.2f", precos[indiceMaisCaro]) + ")");
        System.out.println("===========================================");

        if (carteira >= valorTotalComDesconto && valorTotalComDesconto > 10.00) {
            System.out.println("Status: Compra aprovada com Desconto Especial! ");
        } else if (carteira >= valorTotal) {
            System.out.println("Status: Compra aprovada! ");
        } else {
            System.out.println("Status: Saldo insuficiente na carteira! ");
        }

        // ARRAY 3: guarda o gasto acumulado de cada dia
        double[] gastosPorDia = new double[5];
        double gastoAcumulado = 0.0;

        for (int dia = 0; dia < gastosPorDia.length; dia++) {
            gastoAcumulado += valorTotalComDesconto;
            gastosPorDia[dia] = gastoAcumulado;
        }

        // Percorre o array com "for-each" para mostrar o histórico
        System.out.println("========= HISTÓRICO DE GASTOS ==========");
        int diaAtual = 1;
        for (double gasto : gastosPorDia) {
            System.out.printf("Dia %d - Gasto acumulado: R$ %.2f%n", diaAtual, gasto);
            diaAtual++;
        }

        System.out.printf("Projeção mensal (%d dias): R$ %.2f%n", totalDiasDoMes, valorTotalMensal);

        scanner.close();
    }
}
