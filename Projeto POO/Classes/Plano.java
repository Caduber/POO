// Carlos Eduardo Mazalli Drago Lopes
public class Plano{
//classe reflexiva

	private int codPlano;

	private boolean autorizado;


	/////////////	


	public Plano (){
		codPlano = -1;
		autorizado = false;
	}

	//Polimorfismo Sobrecarga

	public Plano(int codPlano, boolean autorizado){
		this.codPlano = codPlano;
		this.autorizado = autorizado;
	}

	/////////////



	public int getCodPlano(){
		return codPlano;
	}

	public boolean getAutorizado(){
		return autorizado;
	}

	public void setCodPlano(int codPlano){
		this.codPlano = codPlano;
	}

	public void setAutorizado(boolean autorizado){
		this.autorizado = autorizado;
	}

}
