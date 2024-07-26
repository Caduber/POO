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
			try{
				menu = Integer.parseInt(l.entNum("Escolha:\n 1-Cadastrar Estagiario\n 2-Cadastrar Medico\n 3-Cadastrar Secretario\n 4-Cadastrar Paciente\n 5-Autorizar com Plano\n 6-Inserir Consulta\n 7-Imprimir Dados\n 0-SAIR"));
			}
			catch(EntradaException ee){
				menu = Integer.parseInt(ee.entInvChar("Utilize apenas numeros"));
			}

		switch (menu){
			case 0:
			break;

			case 1:
				est.setFaculdade(l.entDados("Insira a faculdade do estagiario"));

			try{
				//usar ent dados ou ent num em todos!
				est.setSalario(Float.parseFloat(l.entNum("Insira o salario do Estagiario")));
			}
			catch(NumberFormatException nfe){
				EntradaException ee = new EntradaException();
				est.setSalario(ee.trataEntFloat());
			}
			catch(EntradaException ee){
				est.setSalario(ee.trataEntFloat());
			}
			try{
				est.getSupervisor().setCrm(l.entNum("Insira o CRM do medico Supervisor do Estagiario"));
			}
			catch(EntradaException ee){
				est.getSupervisor().setCrm(ee.entInvChar("Insira o CRM do medico Supervisor do Estagiario"));
			}
			break;

			case 2:
			try{
				med.setCrm(l.entNum("Insira o CRM do Medico"));
			}
			catch(EntradaException ee){
				med.setCrm(ee.entInvChar("Insira o CRM do Medico"));
			}
			try{
				med.setSalario(Float.parseFloat(l.entNum("Insira o salario do Medico")));
			}
			catch(NumberFormatException nfe){
				EntradaException ee = new EntradaException();
				med.setSalario(ee.trataEntFloat());
			}
			catch(EntradaException ee){
				med.setSalario(ee.trataEntFloat());
			}
			med.setEspecialidade(l.entDados("Insira a especialidade do medico"));
			break;

			case 3:
			try{
				sec.setTelefone(Integer.parseInt(l.entDados("Insira o telefone do secretario (somente numeros)")));
			}
			catch(NumberFormatException nfe){
				EntradaException ee = new EntradaException();
				sec.setTelefone(ee.trataEntInt());
			}
			try{
			sec.setSalario(Float.parseFloat(l.entNum("Insira o salario do secretario")));
			}
			catch(NumberFormatException nfe){
				EntradaException ee = new EntradaException();
				sec.setSalario(ee.trataEntFloat());
			}
			catch(EntradaException ee){
				sec.setSalario(ee.trataEntFloat());
			}

			// A refazer a interface
			sec.setPatrao(sec.cadastrarMedico("Insira o CRM do medico ao qual o secretario eh subordinado")); 
			break;
			//
			
			case 4: 
			try{
				pac.setCpf(l.entNum("Insira o CPF do paciente"));
			}
			catch(EntradaException ee){
				med.setCrm(ee.entInvChar("Insira o CPF do Paciente"));
			}
			try{
				pac.setCodPaciente(Integer.parseInt(l.entDados("Insira o codigo de cadastro do paciente")));
			}
			catch(NumberFormatException nfe){
				EntradaException ee = new EntradaException();
				pac.setCodPaciente(ee.trataEntInt());
			}
			pac.setNomePaciente(l.entDados("Insira o nome do paciente"));

			try{
			pac.setDependentes(Integer.parseInt(l.entDados("Insira quantos dependentes o paciente possui")));
			}
			catch(NumberFormatException nfe){
				EntradaException ee = new EntradaException();
				pac.setDependentes(ee.trataEntInt());
			}
			break;

			case 5:
			try {
				pac.getPlano().setCodPlano(Integer.parseInt(l.entDados("Insira o codigo do plano para autorizar a consulta")));
			}
			catch (NumberFormatException nfe) {
				EntradaException ee = new EntradaException();
				pac.getPlano().setCodPlano(ee.trataEntInt());
			}

			pac.getPlano().setAutorizado(true);
			l.entDados("Exame autorizado com sucesso!\nAperte \"enter\" para continuar");
			break;

			case 6:
			try{
				cons.setCodConsulta(Integer.parseInt(l.entDados("Insira o codigo da consulta")));
			}
			catch(NumberFormatException nfe){
				EntradaException ee = new EntradaException();
				cons.setCodConsulta(ee.trataEntInt());
			}

			cons.setCliente(pac);
			
			try{
				cons.setPreco(Float.parseFloat(l.entDados("Insira o preco da consulta")));
			}
			catch(NumberFormatException nfe){
				EntradaException ee = new EntradaException();
				cons.setPreco(ee.trataEntFloat());
			}

			// A refazer a interface

			cons.setClinico(cons.cadastrarMedico("Insira o CRM do medico que fara a consulta"));
			//

			break;

			case 7:
			System.out.println("\n\nESTAGIARIO:\n Faculdade: " + est.getFaculdade() + "\n CRM Supervisor: " + est.getSupervisor().getCrm() + "\n Salario: " + est.getSalario());
			System.out.println("\n\nMEDICO:\n Especializacao: " + med.getEspecialidade() + "\n CRM Medico: " + med.getCrm() + "\n Salario: " + med.getSalario());
			System.out.println("\n\nSECRETARIO:\n Telefone: " + sec.getTelefone() + "\n CRM Patrao: " + sec.getPatrao().getCrm() + "\n Salario: " + sec.getSalario());
			System.out.println("\n\nPACIENTE:\n CPF: " + pac.getCpf() + "\n Codigo de Paciente: " + pac.getCodPaciente() + "\n Nome Paciente: " + pac.getNomePaciente() + "\n Dependentes: " + pac.getDependentes());
			System.out.println("\n\nCONSULTA:\n Codigo da Consulta: " + cons.getCodConsulta() + "\n Cliente: " + cons.getCliente().getNomePaciente() + "\n Valor: " + cons.getPreco() + "\n Medico: " + cons.getClinico().getCrm());
			break;

			default:
			System.out.println("\nInsira um numero valido, por favor\n");

		}

	}while(menu != 0);
		
		
	}

}
