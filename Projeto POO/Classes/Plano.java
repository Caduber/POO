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



	public final int getCodPlano(){
		return codPlano;
	}

	public final boolean getAutorizado(){
		return autorizado;
	}

	public final void setCodPlano(int codPlano){
		this.codPlano = codPlano;
	}

	public final void setAutorizado(boolean autorizado){
		this.autorizado = autorizado;
	}

}
