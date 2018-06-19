/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salao.Model;

import java.sql.Time;

/**
 *
 * @author LAB1
 */
public class Servico {
    
    private int id_ser;
    private String nome_ser;
    private Time tempo_ser;
    private double valor_ser;

    @Override
    public String toString() {
        return id_ser + " - " + nome_ser + " - " + tempo_ser + " - " + valor_ser ;
    }

    public int getId_ser() {
        return id_ser;
    }

    public void setId_ser(int id_ser) {
        this.id_ser = id_ser;
    }

    public String getNome_ser() {
        return nome_ser;
    }

    public void setNome_ser(String nome_ser) {
        this.nome_ser = nome_ser;
    }

    public Time getTempo_ser() {
        return tempo_ser;
    }

    public void setTempo_ser(Time tempo_ser) {
        this.tempo_ser = tempo_ser;
    }

    public double getValor_ser() {
        return valor_ser;
    }

    public void setValor_ser(double valor_ser) {
        this.valor_ser = valor_ser;
    }

}
    

   
