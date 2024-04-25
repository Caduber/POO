//Carlos Eduardo Mazalli Drago Lopes

public class Particular extends Consulta{

    private float comissao;
    private boolean infantil;

    public Particular(){
        comissao = 0.00f;
        infantil = false;
    }

//Polimorfismo por Sobrecarga
    public Particular(float comissao, boolean infantil){

        this.comissao = comissao;
        this.infantil = infantil;

    }


    public float getComissao(){
        return comissao;
    }

    public boolean getInfantil(){
        return infantil;
    }


    public void setComissao(float comissao){
        this.comissao = comissao;
    }

    public void setInfantil(boolean intantil){
        this.infantil = infantil;
    }

}