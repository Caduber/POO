import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H1{
    public static void main(String args[]){

        String input = "";

        System.out.println("Entre com um valor: ");
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);

        try{
            input = cd.readLine();
        }
        catch(IOException e){
            System.out.println("Erro de entrada");
        }
        int valor = Integer.parseInt(input);
        
        if (valor%2 == 1){
            System.out.println("O valor e impar");
        }
        else {
            System.out.println("O valor e par");
        }

    }
}