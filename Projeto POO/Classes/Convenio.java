//Carlos Eduardo Mazalli Drago Lopes

public class Convenio extends Consulta{

    private int codConvenio;
    private float desconto;



    public Convenio(){
        codConvenio = -1;
        desconto = 0.00f;
    }

    //Polimorfismo por Sobrecarga
    public Convenio(int codConvenio, float desconto){
        this.codConvenio = codConvenio;
        this.desconto = desconto;
    }


    public int getCodConvenio(){
        return codConvenio;
    }

    public float getDesconto(){
        return desconto;
    }


    public void setCodConvenio(int codConvenio) throws ConvNegativoException{
        if (codConvenio > 0){

            this.codConvenio = codConvenio;
        }
        else{
            throw new ConvNegativoException();
        }
    }

    public void setDesconto(float desconto){
        this.desconto = desconto;
    }


}