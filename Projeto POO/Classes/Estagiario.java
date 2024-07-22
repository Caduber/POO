// Carlos Eduardo Mazalli Drago Lopes
public class Estagiario extends Funcionario{

	private String faculdade;

	private Medico supervisor;



/////////////	


public Estagiario (){
	faculdade = "Sem faculdade";
	supervisor = new Medico();
}

//Polimorfismo Sobrecarga

public Estagiario( String faculdade, Medico supervisor){
	this.faculdade = faculdade;
	this.supervisor = supervisor;
}

/////////////



	public final String getFaculdade() {
		return faculdade;
	}

	public final Medico getSupervisor() {
		return supervisor;
	}



	public final void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	public final void setSupervisor(Medico supervisor) {
		this.supervisor = supervisor;
	}

}
