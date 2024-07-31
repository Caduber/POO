// Carlos Eduardo Mazalli Drago Lopes
public class Consulta implements CadastraMedico{

	private int codConsulta;

	private Paciente cliente;

	private float preco;

	private Medico clinico;

/////////////

	public Consulta() {
		codConsulta = -1;
		cliente = new Paciente();
		preco = 0.00f;
		clinico = new Medico();
	}

	//Polimorfismo Sobrecarga

	public Consulta(int codConsulta, Paciente cliente, float preco, Medico clinico) {
		this.codConsulta = codConsulta;
		this.cliente = cliente;
		this.preco = preco;
		this.clinico = clinico;
	}

/////////////

	public final int getCodConsulta() {
		return codConsulta;
	}

	public final Paciente getCliente() {
		return cliente;
	}

	public final float getPreco() {
		return preco;
	}

	public final Medico getClinico() {
		return clinico;
	}


	public final void setCodConsulta(int codConsulta) {
		this.codConsulta = codConsulta;
	}

	public final void setCliente(Paciente cliente) {
		this.cliente = cliente;
	}

	public final void setPreco(float preco) {
		this.preco = preco;
	}

	public final void setClinico(Medico clinico) {
		this.clinico = clinico;
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
		catch(CrmException ce){
			return ce.corrigeCrm();
		}

	}


}
