// Carlos Eduardo Mazalli Drago Lopes
public class Secretario extends Funcionario implements CadastraMedico{

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



	public final int getTelefone() {
		return telefone;
	}

	public final Medico getPatrao(){
		return patrao;
	}


	public final void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public final void setPatrao(Medico patrao){
		this.patrao = patrao;
	}

	//Polimorfismo por sobrescricao

	public final String cadastrarMedico(String frase) {
		
        Medico med = new Medico();
        Leitura l2 = new Leitura();

		try{
			med.setCrm(l2.entNum(frase));
			return med.getCrm();

		}
		catch(EntradaException ee){
			return ee.entInvChar("Entrada Invalida, por favor insira apenas numeros");
		}


	}


}
