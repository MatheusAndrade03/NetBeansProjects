
package com.mycompany.gestao_venda_estoque.modelo.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL implements Conexao {
    private final String USUARIO = "root";
    private final String SENHA= "";
    private final String URL = "jdbc:mysql://localhost/gestao_vendas?useTimezone=true&serverTimezone=America/Sao_Paulo";
    private Connection conectar;
            
    @Override
    public Connection obterConexao() throws SQLException {
       if(conectar==null){
           conectar= DriverManager.getConnection(URL, USUARIO, SENHA);
       
       
       }
       return conectar; 
    }
    
}
