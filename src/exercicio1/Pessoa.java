package exercicio1;

public abstract class Pessoa {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        if (nome != "") {
            this.nome = nome;
        }

    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public abstract boolean logar(String senha);
}
