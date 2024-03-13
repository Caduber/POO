import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class F1{
    public static void main(String arg[]){

        System.out.println("Entre com um valor: ");
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String entrada = "";

        try{
            entrada = cd.readLine();
        }
        catch(IOException e){
            System.out.println("Erro de entrada");
        }

        int valor = Integer.parseInt(entrada);



        System.out.println("Entre com um valor: ");
        String entrada2 = "";

        try{
            entrada2 = cd.readLine();
        }
        catch(IOException e){
            System.out.println("Erro de entrada");
        }

        int valor2 = Integer.parseInt(entrada2);



        if (valor < valor2){
            System.out.println("\nO primeiro valor foi menor que o segundo");
        }
        else if (valor > valor2){
            System.out.println("\nO primeiro valor foi maior que o segundo");
        }
        else{
            System.out.println("\nOs valores sao iguais");
        }

    }
}