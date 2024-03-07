
package com.mycompany.deverfacul;

import java.util.Scanner;

public class MenuCliente {
    Cliente cliente = new Cliente();
    TelaC  tela = new TelaC();
    Scanner teclado = new Scanner(System.in);
    private int op;
    public void menuCliente(){
    
            
        do{
        
            System.out.println("Digite 1 Para cadastrar o Cliente ");
            System.out.println("Digite 2 Para ver o Cliente ");
            System.out.println("Digite 0 para sair ");
            
            op=teclado.nextInt();
            switch(op){
            
                case 1 ->  {
                    tela.cadastrar(cliente);
                    
                    break;
                }    
                
                case 2 ->  {
                    tela.apresentar(cliente);
                    break;
                }     
            
            }
            
            
        
        
        
        
        
        
        
        
        
        }while(op!=0);
        
        
        
        
    
    
    }
    
}
