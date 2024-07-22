// Carlos Eduardo Mazalli Drago Lopes
public class Paciente {

	private String cpf;

	private int codPaciente;

	private String nomePaciente;

	private int dependentes;

	private Plano plano;


	/////////////	


	public Paciente (){
		cpf = "Nao Cadastrado";
		codPaciente = -1;
		nomePaciente = "Nao cadastrado";
		dependentes = 0;
		plano = new Plano();
	}

	//Polimorfismo Sobrecarga

	public Paciente(String cpf, int codPaciente, String nomePaciente, int dependentes, Plano plano){
		this.cpf = cpf;
		this.codPaciente = codPaciente;
		this.nomePaciente = nomePaciente;
		this.dependentes = dependentes;
		this.plano = plano;
	}

	/////////////


	public final String getCpf() {
		return cpf;
	}
	
	public final String getNomePaciente() {
		return nomePaciente;
	}

	public final int getCodPaciente() {
		return codPaciente;
	}
	
	public final int getDependentes() {
		return dependentes;
	}

	public final Plano getPlano() {
		return plano;
	}



	public final void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public final void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public final void setCodPaciente(int codPaciente) {
		this.codPaciente = codPaciente;
	}
	
	public final void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}

	public final void setPlano(Plano plano) {
		this.plano = plano;
	}

}
