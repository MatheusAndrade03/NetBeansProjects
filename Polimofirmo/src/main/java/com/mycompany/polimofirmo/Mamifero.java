
package com.mycompany.polimofirmo;
public class Mamifero extends Animal{
    protected String corPelo;
    
    
    
    // Métados 
    @Override
    public void locomover() {
        
        System.out.println("Correndo ");
        
            }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void somEmitido() {
        System.out.println(" Som de mamifero ");
    }
    // getters e setters 

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
    
    
}
