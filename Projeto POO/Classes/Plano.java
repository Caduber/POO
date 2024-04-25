//Carlos Eduardo Mazalli Drago Lopes

public class Plano extends Consulta{

    private int codPlano;
    private String cobertura;
    private boolean autorizado;



    public Plano(){
        codPlano = -1;
        cobertura = "Nao Informado";
        autorizado = false;
    }

//Polimorfismo por Sobrecarga
    public Plano(int codPlano, String cobertura, boolean autorizado){
        this.codPlano = codPlano;
        this.cobertura = cobertura;
        this.autorizado = autorizado;
    }

    // Ideia: a autorização pode ser por interface

    public int getCodPlano(){
        return codPlano;
    }

    public String getCobertura(){
        return cobertura;
    }

    public boolean getAutorizado(){
        return autorizado;
    }


    public void setCodPlano(int codPlano){
        this.codPlano = codPlano;
    }

    public void setDesconto(String cobertura){
        this.cobertura = cobertura;
    }

    public void setAutorizado(boolean autorizado){
        this.autorizado = autorizado;
    }

}