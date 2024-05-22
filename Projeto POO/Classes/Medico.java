//Carlos Eduardo Mazalli Drago Lopes

public class Medico{
    private String crm;

    public Medico(){
        crm = "Sem Crm";
    }

//Polimorfismo por Sobrecarga
    public Medico(String crm){
        this.crm = crm;
    }

    

    public String getCrm(){
        return crm;
    }

    public void setCrm(String crm){
        this.crm = crm;
    }


}