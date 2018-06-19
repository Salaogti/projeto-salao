/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salao.Model.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author KAIQUE
 * @param <T>
 */
public interface IntefaceDao<T> {
    
    /**
     *
     * @param objT
     * @throws SQLException
     */
    public void inserir(T objT) throws SQLException ;
   
    /**
     *
     * @param obtT
     * @throws SQLException
     */
    public void gravar(T obtT) throws SQLException ;
   
    /**
     *
     * @param objT
     * @throws SQLException
     */
   public void deletar(T objT) throws SQLException ;
   
    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public T getRegistro (int id) throws SQLException ;
   
    /**
     *
     * @param condicao
     * @return
     * @throws SQLException
     */
    public List<T> getRegistro (String condicao) throws SQLException ;
   
 }
