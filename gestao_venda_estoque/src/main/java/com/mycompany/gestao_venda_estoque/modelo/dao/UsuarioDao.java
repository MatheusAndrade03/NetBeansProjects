
package com.mycompany.gestao_venda_estoque.modelo.dao;

import com.mycompany.gestao_venda_estoque.modelo.conexao.Conexao;
import com.mycompany.gestao_venda_estoque.modelo.conexao.ConexaoMySQL;
import com.mycompany.gestao_venda_estoque.modelo.dominio.Perfil;
import com.mycompany.gestao_venda_estoque.modelo.dominio.Usuario;
import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
    
    private final Conexao conexao;

    
    
    
    // Constructor 
    public UsuarioDao() {
        this.conexao = new ConexaoMySQL();
    }
    
    
    // Métados auxiliaares 
    
    
    // Salvar 
    public String salvar(Usuario usuario ){
        return usuario.getId()== 0L ? adicionar(usuario): editar(usuario);
    
    }  

    private String adicionar(Usuario usuario) {
     String sql = "INSERT INTO usuario(nome,usuario,senha,perfil,estado) VALUES(?,?,?,?,?)";
     
     Usuario usuarioTemp = buscarUsuarioPeloUsuario(usuario.getUsuario());
     
     if(usuarioTemp!=null){
         
         return String.format("Error : usuario %s ja existe  no banco de dados", usuario.getUsuario());
     
     
     
     }
     
     
     try{
         PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(sql);
         
         preencherValoresPreparedStatement(preparedStatement,usuario);
         
         int resultado= preparedStatement.executeUpdate();
         
         return resultado == 1? "Usuario adicionado com sucesso":"Não foi possivel adicionar o Usuario";
     } catch(SQLException e){
         
         return String.format("Error : %s",e.getMessage());
     }
     
}

    // editar
    private String editar(Usuario usuario) {
        
    
       String sql = "UPDATE usuario SET nome = ?, senha = ?, perfil = ?, estado = ? WHERE id = ?";   
       
        try{
         PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(sql);
         
         preencherValoresPreparedStatement(preparedStatement,usuario);
         
         int resultado= preparedStatement.executeUpdate();
         
         return resultado == 1? "Usuario adicionado com sucesso":"Não foi possivel adicionar o Usuario";
     } catch(SQLException e){
         
         return String.format("Error : %s",e.getMessage());
     }
       
        
    }

    //  preencher valores 
    private void preencherValoresPreparedStatement(PreparedStatement preparedStatement, Usuario usuario) throws SQLException {
        
        
       
         
        
        
        preparedStatement.setString(1,usuario.getNome());
        preparedStatement.setString(2,usuario.getUsuario());
        preparedStatement.setString(3,usuario.getSenha());
        preparedStatement.setString(4,usuario.getPerfil().name());
        preparedStatement.setBoolean(5,usuario.isEstado());
        
        if(usuario.getId()!= 0L){
            
            preparedStatement.setLong(6, usuario.getId());
            
            
            
        }}
    
    
    // buscar todos os usuarios 
        
        public List<Usuario> buscarTodosUsuarios() {
        
            String sql= "SELECT * FROM  usuario ";
        
            List<Usuario> usuarios = new ArrayList<>();
        
        try{
            ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();
            
            while(result.next()){
                usuarios.add(getUsuario(result));
                
            
            }
        
        }catch(SQLException e){
            System.out.println(String.format("Error", e.getMessage()));
        
        
        }
        
        return usuarios;
        }
    
        // pegar usuario do banco de daados
        private Usuario getUsuario(ResultSet result) throws SQLException{
        
            Usuario usuario= new Usuario();
            
            usuario.setId(result.getLong("id"));
            usuario.setNome(result.getString("nome"));
            usuario.setUsuario(result.getString("usuario"));
            usuario.setSenha(result.getString("senha"));
            usuario.setPerfil(Perfil.valueOf(result.getString("perfil")));
            usuario.setEstado(result.getBoolean("estado"));
            usuario.setDataHoraCriacao(result.getObject("data_hora_criacao",LocalDateTime.class));
            usuario.setUltimoLogin(result.getObject("ultimo_login",LocalDateTime.class));
            
        return usuario;
        }
    
        
        
        
        
        
        // busca por id
        
         public Usuario buscarUsuarioPeloId(Long id) {
        
            String sql= String.format("SELECT * FROM usuario WHERE id = %d", id);
        
            
        
        try{
            ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();
            
            if(result.next()){
               return getUsuario(result);
                
            
            }
        
        }catch(SQLException e){
            System.out.println(String.format("Error", e.getMessage()));
        
        
        }
        
        return null;
        }
    
         
         // Busca por  usuario
         
         public Usuario buscarUsuarioPeloUsuario(String usuario) {
        
            String sql= String.format("SELECT * FROM usuario WHERE usuario = '%s'", usuario);
        
           
        
        try{
            ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();
            
            if(result.next()){
               return getUsuario(result);
                
            
            }
        
        }catch(SQLException e){
            System.out.println(String.format("Error", e.getMessage()));
        
        
        }
        
        return null;
        }
         
         
         
    }
