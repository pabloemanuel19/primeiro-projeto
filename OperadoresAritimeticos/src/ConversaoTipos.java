public class ConversaoTipos {
    public static void main(String[] args) {
        int numero = 10;
        double d = numero;


        double d2 = 10.5;
        int int2 = (int) d2;

        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();


        String numeroStringDois = "1234";
        Integer numeroConveritido = Integer.parseInt(numeroStringDois);


        System.out.println(d);
        System.out.println(int2);
        System.out.println(numeroInteger + " " + numeroString);
        System.out.println(numeroStringDois + " " +  numeroConveritido);

    }
}
