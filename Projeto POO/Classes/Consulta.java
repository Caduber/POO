// Carlos Eduardo Mazalli Drago Lopes
public class Consulta {

	private int codConsulta;

	private Paciente cliente;

	private float preco;

/////////////

	public Consulta() {
		codConsulta = -1;
		cliente = new Paciente();
		preco = 0.00f;
	}

	//Polimorfismo Sobrecarga

	public Consulta(int codConsulta, Paciente cliente, float preco) {
		this.codConsulta = codConsulta;
		this.cliente = cliente;
		this.preco = preco;
	}

/////////////

	public int getCodConsulta() {
		return codConsulta;
	}

	public Paciente getCliente() {
		return cliente;
	}

	public float getPreco() {
		return preco;
	}



	public void setCodConsulta(int codConsulta) {
		this.codConsulta = codConsulta;
	}

	public void setCliente(Paciente cliente) {
		this.cliente = cliente;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
