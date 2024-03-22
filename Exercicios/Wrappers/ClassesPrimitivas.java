public class ClassesPrimitivas{
    public static void main (String args[]){

        // Classe Integer

        int i = 23;
        int i2 = 48;

        System.out.println("\nMenor: "+ (Integer.min(i, i2)));
        System.out.println(i2 + " em binario: " + Integer.toBinaryString(i2));

        // Classe Float

        float f1 = 24.123f, f2 = 12.345f ;

        System.out.println("\n" + f1 + " representa um numero finito: " + Float.isFinite(f1));
        System.out.println("Maior entre " + f1 + " e " + f2 + " : " + Float.max(f1,f2));

        // Classe Char

        char c = 'H';

        System.out.println("\nA variavel c contem o caractere Unicode: " + Character.getName(c));
        System.out.println("E seu numero em Unicode: " + Character.getNumericValue(c));

        // Classe Long

        long l = 132545754l;

        System.out.println("\n" + l + " em hexadecimal: " + Long.toHexString(l));
        System.out.println("E em octal: " + Long.toOctalString(l));

        // Classe Bool

        boolean b = true;
        String s ="essa string";

        System.out.println("\nHash code :" + Boolean.hashCode(b));
        System.out.println("Essa string e :" + Boolean.valueOf(s) + "\n\n");
        

    }
}