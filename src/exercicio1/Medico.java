package exercicio1;

public class Medico extends Pessoa {

    private String especialidades;
    private int crm;
    private String senhaMedico;
    private double salario;

    @Override
    public boolean logar(String senha) {
        boolean logar = false;
        if (senha == this.senhaMedico) {
            logar = true;
        }
        return logar;
    }
    
    public String getEspecialidades() {
        return this.especialidades;
    }
    
    public void setEspecialidades(String especialidades){
        this.especialidades = especialidades;
    }
    
    public int getCrm(){ //No diagrama de classes o tipo de dado do Crm não coincide com o atribuido.
        return this.crm;
    }
    
    public String getSenhaMedico(){
        return this.senhaMedico;
    }
    
    public void setSenhaMedico(String senhaMedico){
        this.senhaMedico = senhaMedico;
    }

}
