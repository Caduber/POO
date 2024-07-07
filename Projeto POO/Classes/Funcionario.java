// Carlos Eduardo Mazalli Drago Lopes
public abstract class Funcionario {

	private float salario;

/////////////

	public Funcionario(){
		salario = 0.00f;
	}

	//Polimorfismo Sobrecarga
	public Funcionario(float salario){
		this.salario = salario;
	}

/////////////

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
