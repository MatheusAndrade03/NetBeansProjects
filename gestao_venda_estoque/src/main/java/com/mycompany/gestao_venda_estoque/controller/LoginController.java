
package com.mycompany.gestao_venda_estoque.controller;

import com.mycompany.gestao_venda_estoque.modelo.dao.AutenticacaoDao;
import com.mycompany.gestao_venda_estoque.modelo.dominio.Usuario;
import com.mycompany.gestao_venda_estoque.view.formulario.Login;
import com.mycompany.gestao_venda_estoque.view.modelo.LoginDto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class LoginController implements ActionListener{

    private final Login login;
    private final AutenticacaoDao autenticacao; 
    
    public LoginController(Login login) {
        this.login = login;
        this.autenticacao = new AutenticacaoDao();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        JButton  button = (JButton)ae.getSource();
        
        String opc = button.getText();
        
        
        
        switch(opc){
            
            case "Login": 
                
                System.out.println("Login");
                login();
                
                break;
            case "Cancelar" : 
                System.out.println("cancelar");
                cancelar();
                
                break;
        
        
        
        }
        
        
        
        
    }

    private void login() {
        String  usuario =login.getTxtUsuario().getText();
        String senha = login.getTxtSenha().getText();
        if(usuario.equals("") || senha.equals("")){
            
            login.getJlblMensagem().setText("Campo de senha ou login  não preenchidos");
                    
                 return;   
        
        }
        LoginDto loginDto = new LoginDto(usuario,senha);
        
        Usuario usuarioTemp = autenticacao.login(loginDto);
        if(usuarioTemp != null){
        JOptionPane.showConfirmDialog(null, usuarioTemp.getNome());
         limparCampos();
        
        }else{
            this.login.getJlblMensagem().setText("Senha e Usuario incorreto");
        }
       
        
    }

    private void cancelar() {
        
        int cancelar = JOptionPane.showConfirmDialog(login, "Tem certeza que deseja sair ?", "Sair do sistema", JOptionPane.YES_NO_OPTION);
        
        if(cancelar==JOptionPane.YES_OPTION){
            System.exit(0);
        
        }
        
     }
    
    
    public void limparCampos(){
            this.login.getTxtUsuario().setText("");
            this.login.getTxtSenha().setText("");
            this.login.getJlblMensagem().setText("");
    }
    
    
        
}
