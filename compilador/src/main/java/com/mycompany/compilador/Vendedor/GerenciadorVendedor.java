
package com.mycompany.compilador.Vendedor;

import com.mycompany.compilador.Vendedor.TelaVendedor;
import com.mycompany.compilador.Vendedor.Vendedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class GerenciadorVendedor implements ActionListener {
    private TelaVendedor tv;
    private Vendedor v;
    private DaoVendedor dao;
    
    
    public GerenciadorVendedor(){
        tv = new TelaVendedor();
        v= new Vendedor();
        dao = new DaoVendedor();
        tv.addListener(this);
    
    
    
    }
    
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton buton = (JButton)e.getSource();
        String opc = buton.getText();
        
        switch(opc){
            
            
            case "Consultar" : 
                
                int cnpj = tv.getCnpj();
                v=dao.getVendedor(cnpj);
                tv.setVendedor(v);
                
                break;
                
             case"Cadastrar" :
                 v=tv.getVendedor();
                 dao.setVendedor(v);
                 
                 
                 
                 
                 break;
        
        
        
        
        }
        
        
        
        
        
        
        
    }
    
}
