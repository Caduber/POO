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


	public String getCpf() {
		return cpf;
	}
	
	public String getNomePaciente() {
		return nomePaciente;
	}

	public int getCodPaciente() {
		return codPaciente;
	}
	
	public int getDependentes() {
		return dependentes;
	}

	public Plano getPlano() {
		return plano;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public void setCodPaciente(int codPaciente) {
		this.codPaciente = codPaciente;
	}
	
	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

}
