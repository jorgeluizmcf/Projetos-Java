import javax.swing.*;

public class Paciente extends JDialog {

    private String nome, sobrenome, cpf, telefone;

    public Paciente(String nome, String sobrenome, String cpf, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome +
                " " + sobrenome +
                "\n CPF: " + cpf +
                "\n Telefone: " + telefone ;
    }


}
