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
public class Solicitacao_Servicos {
    
       private int id_sol;
       private int idser_sol; 
       private int qtd_sol;
       private double subtotal_sol; 

    @Override
    public String toString() {
        return id_sol + " - " + idser_sol + " - " + qtd_sol + " - " + subtotal_sol ;
    }

       
       
    public int getId_sol() {
        return id_sol;
    }

    public void setId_sol(int id_sol) {
        this.id_sol = id_sol;
    }

    public int getIdser_sol() {
        return idser_sol;
    }

    public void setIdser_sol(int idser_sol) {
        this.idser_sol = idser_sol;
    }

    public int getQtd_sol() {
        return qtd_sol;
    }

    public void setQtd_sol(int qtd_sol) {
        this.qtd_sol = qtd_sol;
    }

    public double getSubtotal_sol() {
        return subtotal_sol;
    }

    public void setSubtotal_sol(double subtotal_sol) {
        this.subtotal_sol = subtotal_sol;
    }

       
    
}
