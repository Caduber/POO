import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class K1{
    public static void main(String args[]){

        int lin = 3, col = 3, i=0, j=0;
        int mat[][] = new int[lin][col];

        for( i = 0; i <= lin-1; i++){

            for( j = 0; j<= col-1; j++){
                System.out.println("Entre com o valor da linha " + i + " coluna " + j + ": ");
            InputStreamReader c = new InputStreamReader(System.in);
            BufferedReader cd = new BufferedReader(c);
            String s = "";
            try{
            s = cd.readLine();
            }
            catch(IOException e){
            System.out.println("Erro de entrada");
            }
            mat[i][j] = Integer.parseInt(s);
            }
        

        }

        for (i = 0; i <= mat.length-1; i++){
            for (j = 0; j <= mat.length-1; j++){

            System.out.println("A linha " + i + " coluna " + j + " do vetor contem o numero: " + mat[i][j]);
            
            }
        }

    }
}