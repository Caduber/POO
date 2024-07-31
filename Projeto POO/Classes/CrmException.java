// Carlos Eduardo Mazalli Drago Lopes

public class CrmException extends Exception{

    // dar throw nos crms

    public String corrigeCrm(){

        // Medico med = new Medico();
        Leitura l4 = new Leitura();
        String crmCorrigido = "";

            try {
                crmCorrigido = l4.entNum("Insira um crm de 4 a 5 digitos");
                if(crmCorrigido.length() >=4 && crmCorrigido.length() <= 5){
                    return crmCorrigido;
                }
                else{
                    System.out.println("Tamanho de CRM invalido");
                    return crmCorrigido;
                }

            } catch (EntradaException ee) {

                crmCorrigido = ee.entInvChar("O Crm deve conter apenas numeros");

                if(crmCorrigido.length() >= 4 && crmCorrigido.length() <= 5){
                    return crmCorrigido;
                }
                else{
                    return corrigeCrm();
                }
            }
        }

    }


