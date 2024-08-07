// Carlos Eduardo Mazalli Drago Lopes
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{

	public String entDados(String rotulo){

		System.out.println(rotulo);

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);
		
		String ret ="";
			
		try{
			ret = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}

		return ret;
	}



	public String entNum(String rotulo) throws EntradaException{

		System.out.println(rotulo);

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);
		
		String ret ="";
			
		try{
			ret = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}

		if(ret.matches("[0-9.]+") && !ret.matches("[.]")) {
				return ret;
		}
		else{
			throw new EntradaException();
		}

	}

}
