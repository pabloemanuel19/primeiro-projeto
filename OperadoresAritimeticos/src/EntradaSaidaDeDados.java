import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {
//        System.out.println("Olá, eu faço impressão e pulo a linha");
//        System.out.print("Olá eu faço impressão da mesma linha");
//        System.out.printf("Olá eu faço a impressão formatada ");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Pablo sua idade é: " + idade);

        System.out.println("Digite se você está empregado sim(true) ou não(false) ");
        boolean empregado = scanner.nextBoolean();
        System.out.println("Olá, sou " + nome + " tenho " + idade + " estou empregado " + empregado);

    }
}
