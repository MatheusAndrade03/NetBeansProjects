/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import com.mycompany.cliente.GerenciadorCliente;
import com.mycompany.vendedor.GerenciadorVendedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

/**
 *
 * @author paulo
 */
public class GerenciadorPrincipal implements ActionListener{
    TelaPrincipal tp;
    
    public GerenciadorPrincipal(){
        tp = new TelaPrincipal();
        tp.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem itemapertado = (JMenuItem)e.getSource();
        String opc = itemapertado.getName();
        
        switch(opc){
            case "cliente":
                new GerenciadorCliente();
                break;
            case "vendedor":
                new GerenciadorVendedor();
                break;
        }
        
    }
    
}
