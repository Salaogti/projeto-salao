/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salao.Controle;

import salao.Model.Cliente;

/**
 *
 * @author KAIQUE
 */
public class ClienteControle {
    
    Cliente cliente ;
    
    public ClienteControle (Cliente cliente){
        this.cliente = cliente ;
    }
    
    public String ValidaCliente(){
        
        //verifica se ha contato selecionado.
        if (this.cliente == null) {
            return "Informe um contato!";
        }
        
        // valida se preencheu o nome do contato.
        if (this.cliente.getNome().trim().length()==0) {
            return "Você precisa preencher o nome do cliente!";
        }
        
        // valida se nome do contato tem mais de 2 caracter
        if (this.cliente.getNome().trim().length()<3) {
            return "O nome do cliente deve possuir mais de 2 caracter!";
        }
        //retorna OK se tudo estiver valido. 
        return "OK";
    }
}
