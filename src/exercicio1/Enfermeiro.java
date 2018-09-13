package exercicio1;

public class Enfermeiro extends Pessoa {
    private int corem;
    private double salario;
    private String senhaEnfermeiro;
    
    public int getCorem(){
        return this.corem;
    }
    
    public void setCorem(int corem){
        this.corem = corem;
    }
    
    @Override
    public boolean logar(String senha) {
        boolean logar = false;
        if (senha == this.senhaEnfermeiro) {
            logar = true;
        }
        return logar;
    }
    
    public String getSenhaEmfermeiro(){
        return this.senhaEnfermeiro;
    }
    
    public void setSenhaEnfermeiro(String senhaEnfermeiro){
        this.senhaEnfermeiro = senhaEnfermeiro;
    }
    
}
