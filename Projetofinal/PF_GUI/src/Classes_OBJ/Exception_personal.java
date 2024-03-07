package Classes_OBJ;

/*
 * Nome: Tami Uemura
 * RA: 2525348
 */

import javax.swing.JOptionPane;


public class Exception_personal extends Exception {

     public Exception_personal(){
        JOptionPane.showMessageDialog(null, "Erro ao Remover.", "Janela Cadastro",
                    JOptionPane.ERROR_MESSAGE);
    }
    
}
