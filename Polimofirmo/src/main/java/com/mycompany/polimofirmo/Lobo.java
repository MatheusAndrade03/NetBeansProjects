
package com.mycompany.polimofirmo;
public class Lobo extends Mamifero {
    
    
    
    // métados 
    
      @Override
      public void somEmitido(){
          System.out.println(" auuuuuuuuuuuuuuu!!!! ");
      
      }
    
        
    public void reagir(String frase ){
        
        if(frase.equals("Toma comida ") || frase.equals("Cheguei")|| frase.equals("oi")){
            System.out.println("Abanar o rabinho e latir");
        
        
        }else{
            System.out.println("Rosnar");
            
        }
    
    }
    public void reagir(int hora){
            if (hora<12) {
                System.out.println("Latir e Brincar");
            
        } else if(hora>=18 ) {
                System.out.println("Ignorar");
        }else{
                System.out.println("Abanar o rabinho");
        }
                  
    
    
    }
    public void reagir(boolean dono ){
        
        if(dono == true){
        
            System.out.println("Abanar o rabinho  feliz ");
        
        }else{
            System.out.println("Rosnar e latir ");
        }
    }
    
    public void reagir(int idade , float peso){
        
            if(idade < 5){
                if(peso<10){
                    System.out.println("Abanar o rabinho");
                
                
                }else{
                    System.out.println("Latir");
                
                }
            
            
            }else if (peso < 10){
                
                System.out.println("Rosnar");
            
            
            
            
            }else{
            
                System.out.println("Ignorar");
            }
            
        
    
    
    
    
    }    
    
    
    
    
}