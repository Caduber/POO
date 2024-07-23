// Carlos Eduardo Mazalli Drago Lopes
public class EntradaException extends Exception {

    Leitura l3 = new Leitura();
    Estagiario estag = new Estagiario();

    public String entInvChar(String comando) {

        String retorno = "";

        try{
            retorno = l3.entNum(comando);
        }
        catch(EntradaException ee){
            System.out.println("Entrada invalida, nao utilize letras\n");
            ee.entInvChar(comando);
        }   
    
        return retorno;

    }


    
	public float trataEntFloat() throws NumberFormatException {     
        
                String ret = "";

                ret = l3.entDados("Entrada Invalida, por favor insira apenas numeros");
        
                try{
                        return Float.parseFloat(ret);                   
                }
                catch(NumberFormatException nfe){
                    return trataEntFloat();
                }
            }


        public int trataEntInt() throws NumberFormatException {     
    
            String ret = "";

            ret = l3.entDados("Entrada Invalida, por favor insira apenas numeros");
    
            try{
                return Integer.parseInt(ret);                   
            }
            catch(NumberFormatException nfe){
                return trataEntInt();
            }
        }

    // public String entInvNum(String rotulo) {

    //     String retorno = "";

    //     try{
    //         retorno = l3
    //     }
    // }



}