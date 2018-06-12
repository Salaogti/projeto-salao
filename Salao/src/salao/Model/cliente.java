/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salao.Model;

/**
 *
 * @author LAB1
 */
public class cliente {
    
    private int cpf;
    private String nome;
    private String telefone;
    private String email;
    private String datanasc;

    @Override
    public String toString() {
        return cpf + " - " + nome + " - " + telefone + " - " + email + " - " + datanasc ;
    }
    
    

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }
    
}
