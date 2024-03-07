
package com.mycompany.gestao_venda_estoque.modelo.dao;

import com.mycompany.gestao_venda_estoque.modelo.dominio.Perfil;
import com.mycompany.gestao_venda_estoque.modelo.dominio.Usuario;
import com.mycompany.gestao_venda_estoque.modelo.exception.NegocioException;
import com.mycompany.gestao_venda_estoque.view.modelo.LoginDto;
import javax.swing.JOptionPane;

public class AutenticacaoDao {
    
    private final UsuarioDao usuarioDao;

    
    
    // construtor
    public AutenticacaoDao() {
        this.usuarioDao = new UsuarioDao();
    }
    
    // Métodos de permissao
    public boolean temPermissao(Usuario usuario){
    
      try{
      permissao(usuario);
      return true;
      
      }catch(Exception e){
      JOptionPane.showMessageDialog(null, e.getMessage()
      ,"Usuario sem Permissao",0);
      
      
          return false;
          
      }
    
      
    }
    
    
    private void permissao(Usuario usuario){
    
        if(!Perfil.ADMIN.equals(usuario.getPerfil())){
    
            throw new NegocioException("Sem Permissao Para realizar essa açao ");
    
      }
    
    
    
    }
    
    
    //  Login 
    public Usuario  login(LoginDto login){
    
        Usuario usuario = usuarioDao.buscarUsuarioPeloUsuario(login.getUsuario());
        if(usuario == null || !usuario.isEstado())
            return null;
        
        if(usuario.isEstado() && validarSenha(usuario.getSenha(),login.getSenha()
        )){
            
            return usuario;
        
        }
       
        
    
      return null;
    
    }
    // validação 
    private boolean validarSenha(String senhaUsuario, String senhaLogin) {
        return senhaUsuario.equals(senhaLogin);
        
        
    }
    
}
