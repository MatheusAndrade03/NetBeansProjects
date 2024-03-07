
package com.mycompany.gestao_venda_estoque.modelo.conexao;

import java.sql.Connection;
import java.sql.SQLException;

public interface Conexao {
    
    public Connection obterConexao() throws SQLException;
    
    
}
