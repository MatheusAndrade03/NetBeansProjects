
package com.mycompany.vendedor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class GerenciadorVendedor implements ActionListener{
    private TelaVendedor tv;
    private Vendedor v;
    private DAOVendedor daoV;
    
    public GerenciadorVendedor(){
        tv = new TelaVendedor();
        v = new Vendedor();
        daoV = new DAOVendedor();
        tv.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botaoapertado = (JButton)e.getSource();
        String opc = botaoapertado.getName();
        
        switch(opc){
            case "consultar":
                int cnpj = tv.getCnpj();
                v = daoV.getVendedor(cnpj);
                tv.setVendedor(v);
                break;
            case "cadastrar":
                v = tv.getVendedor();
                daoV.setVendedor(v);
                break;
        }
    }
    
}
