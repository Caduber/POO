// Carlos Eduardo Mazalli Drago Lopes
public class TstConsulta {


	public static void main(String[] args) {

		Leitura l = new Leitura();
		Medico med = new Medico();
		Estagiario est = new Estagiario();
		Secretario sec = new Secretario();
		Paciente pac = new Paciente();
		//Plano é preenchido com reflexividade
		Consulta cons = new Consulta();

		int menu = -1;

		do{
		menu = Integer.parseInt(l.entDados("Escolha:\n 1-Cadastrar Estagiario\n 2-Cadastrar Medico\n 3-Cadastrar Secretario\n 4-Cadastrar Paciente\n 5-Modificar Plano\n 6-INTERFACE****\n 7-Imprimir Dados\n 0-SAIR"));

		switch (menu){
			case 0:
			break;

			case 1:
			est.setFaculdade(l.entDados("Insira a faculdade do estagiario"));
			est.setSalario(Float.parseFloat(l.entDados("Insira o salario do Estagiario")));
			l.entDados("Certifique-se de que o medico ja foi inserido no sistema para que o supervisor seja automaticamente definido\nAperte \"enter\" para continuar");
			est.setSupervisor(med);
			break;

			case 2:
			med.setCrm(l.entDados("Insira o CRM do Medico"));
			med.setSalario(Float.parseFloat(l.entDados("Insira o salario do Medico")));
			med.setEspecialidade(l.entDados("Insira a especialidade do medico"));
			break;

			case 3:
			sec.setTelefone(Integer.parseInt(l.entDados("Insira o telefone do secretario (somente numeros)")));
			sec.setSalario(Float.parseFloat(l.entDados("Insira o salario do secretario")));
			l.entDados("Certifique-se de que o medico ja foi inserido no sistema para que o patrao seja automaticamente definido\nAperte \"enter\" para continuar");
			sec.setPatrao(med);
			break;

			case 4: 
			pac.setCpf(l.entDados("Insira o CPF do paciente"));
			pac.setCodPaciente(Integer.parseInt(l.entDados("Insira o codigo de cadastro do paciente")));
			pac.setNomePaciente(l.entDados("Insira o nome do paciente"));
			pac.setDependentes(Integer.parseInt(l.entDados("Insira quantos dependentes o paciente possui")));
			break;

			case 5:
			pac.getPlano().setCodPlano(Integer.parseInt(l.entDados("Insira o codigo do plano para autorizar a consulta")));
			pac.getPlano().setAutorizado(true);
			l.entDados("Exame autorizado com sucesso!\nAperte \"enter\" para continuar");
			break;

			case 7:
			System.out.println("\n\nESTAGIARIO:\n Faculdade: " + est.getFaculdade() + "\n CRM Supervisor: " + est.getSupervisor().getCrm() + "\n Salario: " + est.getSalario());
			System.out.println("\n\nMEDICO:\n Especializacao: " + med.getEspecialidade() + "\n CRM Medico: " + med.getCrm() + "\n Salario: " + med.getSalario());
			System.out.println("\n\nSECRETARIO:\n Telefone: " + sec.getTelefone() + "\n CRM Patrao: " + sec.getPatrao().getCrm() + "\n Salario: " + sec.getSalario());
			System.out.println("\n\nPACIENTE:\n CPF: " + pac.getCpf() + "\n Codigo de Paciente: " + pac.getCodPaciente() + "\n Nome Paciente: " + pac.getNomePaciente() + "\n Dependentes: " + pac.getDependentes());
			break;

			default:
			System.out.println("\nInsira um numero valido, por favor\n");

		}

	}while(menu != 0);
		
		
	}

}
