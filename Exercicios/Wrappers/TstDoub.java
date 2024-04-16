//Carlos Eduardo Mazalli Drago Lopes

public class TstDoub {

    public static void converteString_Double(double dblExemplo, String extensoExemplo){

        extensoExemplo = "686.765";
        System.out.println("String convertida em double com o parseDouble " + Double.parseDouble(extensoExemplo));

    }

    public static void converteDouble_Bits(double dbl1){

        System.out.println("O valor da representação de " + dbl1 + " em bits e de: " + Double.doubleToLongBits(dbl1));
    
    }


}
