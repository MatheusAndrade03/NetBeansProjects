
package Cliente;

import Cliente.Cliente;
import Cliente.DaoCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class GerenciadorCliente implements ActionListener {
    
    
    
    private Cliente c;
    private TelaCliente tc ;
    private DaoCliente dao;
    
    public GerenciadorCliente(){
        c = new Cliente();
        tc = new TelaCliente();
        dao  = new DaoCliente();
        tc.addListener(this);
    
    
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            JButton botao = (JButton)e.getSource();
            String opc = botao.getText();
            
            
            switch(opc){
                case"Cadastrar":
                   c = tc.getCliente();
                   dao.setCliente(c);
                   
                    
                    
                    break;
                    
                case"Consultar":
                   int id =0;
                   id= tc.getId();
                   c=dao.getCliente(id);
                   tc.setCliente(c);
                    
                    break;
            
            
            
            }
        
        
        
        
        
        
           }
    
    
    
    
    
}
