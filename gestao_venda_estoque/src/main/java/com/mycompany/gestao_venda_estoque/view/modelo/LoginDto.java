
package com.mycompany.gestao_venda_estoque.view.modelo;

public class LoginDto {
   
    private String usuario;
    private String senha;
    
    
    // constructor
    
   public LoginDto(String usuario, String senha){
   this.usuario = usuario;
   this.senha= senha;
           
   
   }
    
   
   
   // getters 

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
   
   // setters 

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
    
    
   
   
    
}
