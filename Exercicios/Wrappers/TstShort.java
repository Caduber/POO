//Carlos Eduardo Mazalli Drago Lopes

public class TstShort {


    public static void decodeString_Short(String exemplo,short shrt1){
        
        exemplo = "1294";
        System.out.println("String decodificada em short: " + Short.decode(exemplo));

    }

    public static void converteShort_Long(short shrt){

        System.out.println("O short foi convertido em long: " + Short.toUnsignedLong(shrt));

    }

}
