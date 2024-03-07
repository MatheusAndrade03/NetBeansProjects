
package com.mycompany.compilador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class GerenciadorIop implements ActionListener {
    
    private TelaIop ti ;
    private Iop i ;
    private DaoIop dao;
    
    public GerenciadorIop(){
    ti=new TelaIop();
    i = new Iop();
    dao= new DaoIop();
    ti.addListener(this);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton b = (JButton)e.getSource();
        String opc= b.getText();
        
        switch(opc){
        
        case"Consultar":
            int nivel;
            nivel = ti.getNivel();
            i=dao.getIop(nivel);
            ti.setIop(i);
            
            
            
            break;
            
            
         case"Cadastrar" :
             i=ti.getIop();
             dao.setIop(i);
             
             break;
        
        
        
        
        
        }
        
        
        
        
        
        
        
        
        
    }
    
}
