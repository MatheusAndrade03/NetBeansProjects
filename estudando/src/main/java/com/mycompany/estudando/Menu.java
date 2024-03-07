
package com.mycompany.estudando;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    
    // método, final  ou seja , o métado menu() não podera ser  sobreescrito caso seja passado a uma proxima classe
    public  final void menu(){
    
                GerenciadorV  gerenciadorv= new GerenciadorV();
                GerenciadorG gerenciadorg = new GerenciadorG();
                Scanner teclado= new Scanner(System.in);
               
                int opc;
               
               
                do{
                    System.out.println("1-Gerenciador de Vendedor ");
                    System.out.println("2- Gerenciador de Genrente ");
  
                    System.out.println("0-voltar");
                
                
                
                opc=teclado.nextInt();
                switch(opc){
                    case 1 : 
                            gerenciadorv.menuV();
                         
                        break;
                        
                    case 2: 
                        
                        gerenciadorg.menuG();
                        
                        break;
                        
               
                        
                        
                        
                        }
                        
                       
                
                    
                
                
                
                
                
                
                
                
                }while(opc!=0);
                
                
                
         
    
    
    
    }
    
    
    
    
}
