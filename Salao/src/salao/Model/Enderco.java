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
public class Enderco {
     
    private String cep;
    private String rua;
    private String bairro;
    private String cidadeuf;
    private String num;
    private String comp;

    @Override
    public String toString() {
        return cep + " - " + rua + " - " + bairro + " - " + cidadeuf + " - " + num + " - " + comp ;
    }

       
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidadeuf() {
        return cidadeuf;
    }

    public void setCidadeuf(String cidadeuf) {
        this.cidadeuf = cidadeuf;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }
}
