import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class G1{
    public static void main(String arg[]){

        System.out.println("Entre com o primeiro valor: ");
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



        System.out.println("Entre com o segundo valor valor: ");
        String entrada2 = "";

        try{
            entrada2 = cd.readLine();
        }
        catch(IOException e){
            System.out.println("Erro de entrada");
        }

        int valor2 = Integer.parseInt(entrada2);


        System.out.println("Digite 1 para somar");
        System.out.println("Digite 2 para subtrair");        
        System.out.println("Digite 3 para multiplicar");
        System.out.println("Digite 4 para dividir");
        System.out.println("Digite 0 para sair");

        String strEscolha = "";

        try{
            strEscolha = cd.readLine();
        }
        catch(IOException e){
            System.out.println("Erro de entrada");
        }

        int escolha = Integer.parseInt(strEscolha);
        
        switch(escolha){
            case 0:
                break;
            case 1:
                System.out.println("A soma dos valores e " + (valor + valor2) );
                break;
            case 2:
                System.out.println("A subtracao dos valores e " + (valor - valor2) );
                break;
            case 3:
                System.out.println("A multiplicacao dos valores e " + (valor * valor2) );
                break;
            case 4:
                System.out.println("A divisao dos valores e " + (valor / valor2) );
                break;
        }

        

    }
}