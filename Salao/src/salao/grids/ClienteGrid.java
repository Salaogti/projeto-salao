/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salao.grids;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import salao.Model.Cliente;

/**
 *
 * @author KAIQUE
 */
public class ClienteGrid extends AbstractTableModel{
    
    List<Cliente> lista_clientes;
    
    String[] colunas = {"CPF", "Nome", "Telefone", "Email", "Data de Nascimento"};
    
    public ClienteGrid(List<Cliente> lista_clientes){
        this.lista_clientes = lista_clientes;
    }

    @Override
    public int getRowCount() {
        return lista_clientes.size() ;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
        
    }

    @Override
    public String getColumnName(int column) {
        return colunas [ column ];
    }

    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch ( columnIndex ){
            case 0 :  //caso sejá a coluna ID retorna o mesmo
               return lista_clientes.get(rowIndex).getId();
            case 1 :  //caso sejá a coluna Nome retorna o mesmo
                return lista_clientes.get(rowIndex).getNome(); 
            case 2 :  //caso sejá a coluna Telefone retorna o mesmo
                return lista_clientes.get(rowIndex).getTelefone();
            case 3 :  //caso sejá a coluna Email retorna o mesmo
                return lista_clientes.get(rowIndex).getEmail();
            case 4 :  //caso sejá a coluna Data de Nascimento retorna o mesmo
                return lista_clientes.get(rowIndex).getDatanasc(); 
            default: return ""; //retorna vazio caso seja algo não definido
    }
    
  }        
      
 
    public Cliente getItem( int index ){
        return lista_clientes.get(index);
                
    }
        

}