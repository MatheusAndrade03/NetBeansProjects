
package com.mycompany.cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author paulo
 */
public class GerenciadorCliente implements ActionListener{

    private TelaCliente tp;
    private Cliente c;
    private DAOCliente daoC;
    
    public GerenciadorCliente(){
        System.out.println("Passo1");
        tp = new TelaCliente();
        tp.addListener(this);
        c = new Cliente();
        daoC = new DAOCliente();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         
        JButton botaoapertado = (JButton)e.getSource();
        String opc = botaoapertado.getName();
        
        switch(opc){
            case "consultar":
                int cod = tp.getCod();
                c = daoC.getCliente(cod);
                tp.setCliente(c);
                break;
            case "cadastrar":
                c = tp.getCliente();
                daoC.setCliente(c);
                break;
        }
    }
}
