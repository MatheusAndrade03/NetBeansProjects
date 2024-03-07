

package com.mycompany.estruturascondicionais;

import java.util.Scanner;

public class Estruturascondicionais {

    public static void main(String[] args) {
        
            Scanner teclado = new Scanner(System.in);
            
            System.out.println("Digite o numero de pernas do animal ");
            int pernas = teclado.nextInt();
            String tipo;
            
            switch (pernas)
            {
    
                case 1: 
                    tipo = "Saci";
                break;    
                case 2:
                    tipo="Bipede";
                break;
                case 4:
                    tipo="Quadrupede";
                break;
                case 6,8:
                    tipo = "Inseto";
                break;
                default:
                    tipo="ET";
            }
                System.out.println(tipo);    
    
    
    
    
            }
                
        
        
        
        
        
    }
        
        
        
        
        
        
        
        
        
  
}
