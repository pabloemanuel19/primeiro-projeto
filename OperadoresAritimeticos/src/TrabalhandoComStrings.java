public class TrabalhandoComStrings {
    public static void main(String[] args) {
        String nome = "Pablo";
        String sobrenome = " Emanuel";
        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(sobrenome);
        String nomeCompleto = nome.concat(sobrenome);


        System.out.println(" Olá " + nome.toLowerCase() + " seu nome tem " + tamanhoString + " caracteres ");
        System.out.println("Os nomes são iguais: " + saoIguais);
        System.out.println(" Nome completo " + nomeCompleto );



    }
}
