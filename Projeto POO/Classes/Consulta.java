//Carlos Eduardo Mazalli Drago Lopes

public abstract class Consulta{
    
    private int codConsulta;
    private String paciente;
    private float preco;

// Reflexão de Medico ========= 

    public Medico medico;

    public Medico getMedico(){
        return medico;
    }

    public void setMedico(Medico med){
        this.medico = medico;
    }

// =======================

    public Consulta(){
        codConsulta = -1;
        paciente = "Nao Informado";
        preco = 0.00f;
        medico = new Medico();
    }

//Polimorfismo por Sobrecarga

    public Consulta(int codConsulta, String paciente, float preco, Medico medico){
        this.codConsulta = codConsulta;
        this.paciente = paciente;
        this.preco = preco;
        this.medico = medico;
    }

// =======================

    public int getCodConsulta(){
        return codConsulta;
    }

    public String getPaciente(){
        return paciente;
    }

    public float getPreco(){
        return preco;
    }


    public void setCodConsulta(int codConsulta){
        this.codConsulta = codConsulta;
    }

    public void setPaciente(String paciente){
        this.paciente = paciente;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

}