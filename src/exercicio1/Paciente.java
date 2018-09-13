package exercicio1;

public class Paciente extends Pessoa {

    private int codPaciente;
    private String senhaPaciente;

    @Override
    public boolean logar(String senha) {
        boolean logar = false;
        if (senha == this.senhaPaciente) {
            logar = true;
        }
        return logar;
    }

    public int getCodPaciente() {
        return this.codPaciente;
    }

    public void setCodPaciente(int codPaciente) { //O nome do metodo utilizado no diagrama nao coincide 
        this.codPaciente = codPaciente;
    }

    public String getSenhaPaciente() {
        return this.senhaPaciente;
    }

    public void setSenhaPaciente(String senhaPaciente) {
        this.senhaPaciente = senhaPaciente;
    }

}
