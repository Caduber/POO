//Carlos Eduardo Mazalli Drago Lopes

public class Medico {
    private int crm;

    public Medico(){
        crm = -1;
    }

//Polimorfismo por Sobrecarga
    public Medico(int crm){
        this.crm = crm;
    }

    

    public int getCrm(){
        return crm;
    }

    public void setCrm(int crm){
        this.crm = crm;
    }

}