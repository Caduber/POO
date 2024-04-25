//Carlos Eduardo Mazalli Drago Lopes

public class TstConsulta{

    public static void main (String args[]){

        Leitura l1 = new Leitura();
        Particular part = new Particular();
        Convenio conv = new Convenio();
        Plano plan = new Plano();

        //Teste Relflexividade

        conv.getMedico().setCrm(15);
        System.out.println(conv.getMedico().getCrm());

        //

    }

}
