// Carlos Eduardo Mazalli Drago Lopes
public class Medico extends Funcionario {
	private String crm;

	private String especialidade;


/////////////	


	public Medico (){
		crm = "sem crm";
		especialidade = "sem especialidade";
	}

	//Polimorfismo Sobrecarga

	public Medico(String crm, String especialidade){
		this.crm = crm;
		this.especialidade = especialidade;
	}

/////////////

	public String getCrm(){
        return crm;
    }

	public String getEspecialidade(){
		return especialidade;
	}


    public void setCrm(String crm){
        this.crm = crm;
    }

	public void setEspecialidade(String especialidade){
		this.especialidade = especialidade;
	}


}
