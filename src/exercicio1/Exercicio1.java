package exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
       
        System.out.println("##### MEDICO #####");
 

        Medico m = new Medico();
        m.setNome("Jubileu");
        m.setSobrenome("Girosquinha");
        m.setCpf("40028922");
        m.setRg("15618951891");
        m.setSenhaMedico("jubileuzika");

        System.out.println("1º Nome do Medico: " + m.getNome());
        System.out.println("Sobrenome: " + m.getSobrenome());
        System.out.println("CPF: " + m.getCpf());
        System.out.println("RG: " + m.getRg());
        if (m.logar("jubileuzika") == true) {
            System.out.println("LOGADO");
        } else {
            System.out.println("NÂO LOGADO");
        }

        
        System.out.println("##### PACIENTE #####");
     

        Paciente p = new Paciente();
        p.setNome("Cleverton");
        p.setSobrenome("Kleber");
        p.setCpf("800250");
        p.setRg("1010101010");
        p.setSenhaPaciente("senha");

        System.out.println("1º Nome do Paciente: " + p.getNome());
        System.out.println("Sobrenome: " + p.getSobrenome());
        System.out.println("CPF: " + p.getCpf());
        System.out.println("RG: " + p.getRg());
        if (p.logar("errada") == true) {
            System.out.println("LOGADO");
        } else {
            System.out.println("NÂO LOGADO");
        }

        
        System.out.println("##### ENFERMEIRO #####");
        

        Enfermeiro e = new Enfermeiro();
        e.setNome("Jailson");
        e.setSobrenome("Mendes");
        e.setCpf("696969");
        e.setRg("2424242424");
        e.setSenhaEnfermeiro("sucodelaranja");

        System.out.println("1º Nome do Enfermeiro: " + e.getNome());
        System.out.println("Sobrenome: " + e.getSobrenome());
        System.out.println("CPF: " + e.getCpf());
        System.out.println("RG: " + e.getRg());
        if (e.logar("sucodelaranja") == true) {
            System.out.println("LOGADO");
        } else {
            System.out.println("NÂO LOGADO");
        }

    }

}
