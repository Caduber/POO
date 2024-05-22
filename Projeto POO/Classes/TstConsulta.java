//Carlos Eduardo Mazalli Drago Lopes

public class TstConsulta{

    public static void main (String args[]){

        Leitura l1 = new Leitura();
        Particular part = new Particular();
        Convenio conv = new Convenio();
        Plano plan = new Plano();

        

        //

        //Teste Polimorfismo da Interface
            // part.getMedico().setCrm("123");
            // boolean testePolimorfismo = part.checaCrm(part.getMedico().getCrm());
            // System.out.println(testePolimorfismo);

        //

        int menu=1;

        System.out.println("Digite:\n1- Checar CRM\n2- Testar Reflexividade\n0- Sair");



        switch(menu){
            case 1:
                
                int indice = 0;

                //System.out.println("Para escolher o medico a ser checado, digite:\n\t1- Particular \n\t2- Convenio\n\t 3- Plano");

                try {
                        indice = Integer.parseInt(l1.entDados("Para escolher o medico a ser checado, digite:\n\n1- Particular\n2- Convenio\n3- Plano\n0- Sair"));

                        if (indice <= 3 && indice >= 0) {
                            
                        }

                    
                } catch () {
                }
        

                switch(indice){

                    case 1:
                        if (part.checaCrm(part.getMedico().getCrm()) == true ){
                            System.out.println("O CRM do medico \"" + part.getMedico().getCrm() + "\" eh valido.");
                        }
                        else{
                            System.out.println("CRM do medico invalido.");
                        }
                    break;

                    case 2:
                        if (conv.checaCrm(conv.getMedico().getCrm()) == true ){
                            System.out.println("O CRM do medico \"" + conv.getMedico().getCrm() + "\" eh valido.");
                        }
                        else{
                            System.out.println("CRM do medico invalido.");
                        }
                    break;

                    case 3:
                        if (plan.checaCrm(plan.getMedico().getCrm()) == true ){
                            System.out.println("O CRM do medico \"" + plan.getMedico().getCrm() + "\" eh valido.");
                        }
                        else{
                            System.out.println("CRM do medico invalido.");
                        }
                    break;
                     
                    


                }

                //try{

                //}

            break;

            case 2:
                //Teste Relflexividade

                conv.getMedico().setCrm("15");
                System.out.println(conv.getMedico().getCrm());
            break;
        }


// Excessões ====================================

// Ainda não implementado - desconsiderar

    // try{
    //     conv.setCodConvenio(2);
    // }

    // catch(ConvNegativoException objetoConvNegativo){
    //     System.out.println("Erro " + objetoConvNegativo);
    // }

    // finally{
    //     System.out.println("programa finalizado com exito");
    // }

// ==============================================

    }

}
