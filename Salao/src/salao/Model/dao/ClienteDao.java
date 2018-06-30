/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salao.Model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import salao.Model.Cliente;

/**
 *
 * @author KAIQUE
 */
public class ClienteDao implements IntefaceDao<Cliente>{

    private Conexaobd conex;
    
    public ClienteDao(Conexaobd conex){
        
        this.conex = conex;
        
    }
    
    
    
    @Override
    public void inserir(Cliente objT) throws SQLException {
        String sql = "INSERT INTO cliente (nome_cli) values (?)";
        PreparedStatement ps = conex.getConexao().prepareStatement(sql);
        ps.setString(1, objT.getNome());
        ps.execute();
    }

    @Override
    public void gravar(Cliente obtT) throws SQLException {
        String sql = "UPDATE cliente SET nome_cli = ? WHERE id=?";
        PreparedStatement ps = conex.getConexao().prepareStatement(sql);
        ps.setString(1, obtT.getNome());
        ps.setInt(2, obtT.getId());
         
        ps.executeUpdate();
    }

    @Override
    public void deletar(Cliente objT) throws SQLException {
        String sql = "DELETE FROM cliente WHERE id=?";
        PreparedStatement ps = conex.getConexao().prepareStatement(sql);
        ps.setInt(1, objT.getId());
        ps.execute();
    }

    @Override
    public Cliente getRegistro(int id) throws SQLException {
        String sql = "SELECT id_cli, nome_cli, tel_cli, email_cli, datanasc_cli FROM cliente WHERE id=?";
        PreparedStatement ps = conex.getConexao().
        prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();
        Cliente novo = new Cliente();
        while (rs.next()) {
            novo.setId( rs.getInt("id_cli") );
            novo.setNome( rs.getString("nome_cli") );
            novo.setTelefone(rs.getString("tel_cli") );
            novo.setEmail(rs.getString("email_cli") );
            novo.setDatanasc(rs.getString("datanasc_cli") );
        }
        return novo;
    }

    @Override
    public List<Cliente> getRegistro(String condicao) throws SQLException {
        String sql = "SELECT id_cli, nome_cli, tel_cli, email_cli, datanasc_cli FROM cliente " + condicao ;
        PreparedStatement ps = conex.getConexao().
                prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        List<Cliente> lista = new ArrayList<>();
        while (rs.next()) {
            Cliente novo = new Cliente();
            novo.setId( rs.getInt("id_cli") );
            novo.setNome( rs.getString("nome_cli") );
            novo.setTelefone(rs.getString("tel_cli") );
            novo.setEmail(rs.getString("email_cli") );
            novo.setDatanasc(rs.getString("datanasc_cli") );
            lista.add(novo);
        }
        return lista;
    }
    
}
