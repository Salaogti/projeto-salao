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
public class Agendamento {
    
    private int id_agd;
    private int idsolserv_agd ;
    private int idcli_agd;
    private String nomecli_agd;
    private String data_agd;

    @Override
    public String toString() {
        return id_agd + " - " + idsolserv_agd + " - " + idcli_agd + " - " + nomecli_agd + " - " + data_agd ;
    }

   
    
    public int getId_agd() {
        return id_agd;
    }

    public void setId_agd(int id_agd) {
        this.id_agd = id_agd;
    }

    public int getIdsolserv_agd() {
        return idsolserv_agd;
    }

    public void setIdsolserv_agd(int idsolserv_agd) {
        this.idsolserv_agd = idsolserv_agd;
    }

    public int getIdcli_agd() {
        return idcli_agd;
    }

    public void setIdcli_agd(int idcli_agd) {
        this.idcli_agd = idcli_agd;
    }

    public String getNomecli_agd() {
        return nomecli_agd;
    }

    public void setNomecli_agd(String nomecli_agd) {
        this.nomecli_agd = nomecli_agd;
    }

    public String getData_agd() {
        return data_agd;
    }

    public void setData_agd(String data_agd) {
        this.data_agd = data_agd;
    }
    
}
