import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;


public class I1{
    public static void main(String args[]){

        System.out.println("Insira uma frase: ");
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String frase = "";
        try{
        frase = cd.readLine();
        }
        catch(IOException e){
        System.out.println("Erro de entrada");
        }

        System.out.println("Escolha uma letra para procurar: ");
        String let = "";
        try{
        let = cd.readLine();
        }
        catch(IOException e){
        System.out.println("Erro de entrada");
        }


        let = let.toLowerCase();
        char letra = let.charAt(0);



        String fraseMinuscula = frase.toLowerCase();
        int achado = -1;

        achado = fraseMinuscula.indexOf(letra);

        if (achado == -1) {
            System.out.println("Letra nao encontrada");
        }
        else{
            System.out.println("Letra encontrada na posicao " + (achado+1) ); //achado +1 porque usuarios padrao comecam a contar no 1
        }

    }
}