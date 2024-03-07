
package com.mycompany.deverfacul;

import java.util.Scanner;


public class Menu {
    
    
    
    
    
    Scanner teclado = new  Scanner(System.in);
    MenuCliente c = new MenuCliente();
    MenuFuncionario f = new MenuFuncionario();
    private int op;
    
    public void Menu(){
    do{

        System.out.println("digite 1 para abrir o menu do cliente");
        System.out.println("digite 2 para abrir o menu do funcionario");
        System.out.println("digite 0 para sair ");
        
        op=teclado.nextInt();
        switch(op){
            case 1 :  
                    c.menuCliente();
                
                break;
            
            case 2 :
                f.menuFuncionario();
                
                break;
            
        
        
        
        
        
        
        
        }



    


        }while( op != 0);
    
    }
}
