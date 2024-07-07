// Carlos Eduardo Mazalli Drago Lopes
public class Estagiario extends Funcionario {

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



	public String getFaculdade() {
		return faculdade;
	}

	public Medico getSupervisor() {
		return supervisor;
	}



	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	public void setSupervisor(Medico supervisor) {
		this.supervisor = supervisor;
	}

}
