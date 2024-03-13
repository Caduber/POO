import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1{
    public static void main(String args[]){

        int tam = 3, i=0;
        int vtr[] = new int[tam];

        for( i = 0; i <= tam-1; i++){

             System.out.println("Entre com o valor da posicao " + i + ": ");
            InputStreamReader c = new InputStreamReader(System.in);
            BufferedReader cd = new BufferedReader(c);
            String s = "";
            try{
            s = cd.readLine();
            }
            catch(IOException e){
            System.out.println("Erro de entrada");
            }
            vtr[i] = Integer.parseInt(s);

        }

        for (i = 0; i <= vtr.length-1; i++){

            System.out.println("A posicao " + i + " do vetor contem o numero " + vtr[i]);

        }

    }
}