// Carlos Eduardo Mazalli Drago Lopes
public class Secretario extends Funcionario {

	private Medico patrao;

	private int telefone;


/////////////	


public Secretario (){
	telefone = 000000000;
	patrao = new Medico();
}

//Polimorfismo Sobrecarga

public Secretario( int telefone, Medico patrao){
	this.telefone = telefone;
	this.patrao = patrao;
}

/////////////



	public int getTelefone() {
		return telefone;
	}

	public Medico getPatrao(){
		return patrao;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void setPatrao(Medico patrao){
		this.patrao = patrao;
	}

}
