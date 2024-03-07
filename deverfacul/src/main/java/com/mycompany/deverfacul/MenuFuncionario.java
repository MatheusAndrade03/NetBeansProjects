
package com.mycompany.deverfacul;

import java.util.Scanner;

public class MenuFuncionario {
    
    
    



    Funcionario funcionario = new Funcionario();
    TelaF  tela = new TelaF();
    Scanner teclado = new Scanner(System.in);
    private int op;
    public void menuFuncionario(){
    
            
        do{
        
            System.out.println("Digite 1 Para cadastrar o Funcionario ");
            System.out.println("Digite 2 Para ver o Funcionario ");
            System.out.println("Digite 0 para sair ");
            
            op=teclado.nextInt();
            switch(op){
            
                case 1 ->  {
                    tela.cadastrar(funcionario);
                    
                    break;
                }    
                
                case 2 ->  {
                    tela.apresentar(funcionario);
                    break;
                  
                }     
            
            }
            
            
        
        
        
        
        
        
        
        
        
        }while(op!=0);
        
    }
    
}
        
        
    
    
    
    
    
    
    

