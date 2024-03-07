
package com.mycompany.gestao_venda_estoque;

import com.mycompany.gestao_venda_estoque.modelo.conexao.Conexao;
import com.mycompany.gestao_venda_estoque.modelo.conexao.ConexaoMySQL;
import com.mycompany.gestao_venda_estoque.modelo.dao.UsuarioDao;
import com.mycompany.gestao_venda_estoque.modelo.dominio.Categoria;
import com.mycompany.gestao_venda_estoque.modelo.dominio.Perfil;
import com.mycompany.gestao_venda_estoque.modelo.dominio.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Gestao_venda_estoque {
    
    public static void main(String[] args) throws SQLException {
       
        Usuario usuario = new Usuario( 0L,  "Joao Pedro", "123",  "JP",  Perfil.PADRAO,  null,  null);
        
        UsuarioDao usuarioDao= new UsuarioDao();
        
        String mensagem = usuarioDao.salvar(usuario);
        System.out.println(mensagem);
        
        
        
        
        
        
        
        
    }
}
