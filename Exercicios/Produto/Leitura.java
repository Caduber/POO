import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{

    public static String retornaDados (String pergunta){

        System.out.println(pergunta);

        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(teclado);

        String retorno = "";

        try{
            retorno = buff.readLine();
        }
        catch(IOException ioe){
            System.out.println("ERRO!");
        }

        return retorno;

    }

}

