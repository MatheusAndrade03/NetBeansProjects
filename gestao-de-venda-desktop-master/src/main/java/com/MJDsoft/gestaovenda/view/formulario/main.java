
package com.MJDsoft.gestaovenda.view.formulario;

import com.MJDsoft.gestaovenda.modelo.dao.UsuarioDao;
import com.MJDsoft.gestaovenda.modelo.entidades.PERFIL;
import static com.MJDsoft.gestaovenda.modelo.entidades.PERFIL.ADMIN;
import com.MJDsoft.gestaovenda.modelo.entidades.Usuario;
import java.sql.SQLException;

/**
 *
 * @Matheus
 */
public class main {
    
    
    public static void main(String[] args) throws SQLException {
       
        Usuario usuario = new Usuario( 0L,  "Matheus", "Andrade",  "1234",  ADMIN,  null,  null);
        
        UsuarioDao usuarioDao= new UsuarioDao();
        
        String mensagem = usuarioDao.salvar(usuario);
        System.out.println(mensagem);
        
        
        
       
        
        
        
        
        
    }
}
