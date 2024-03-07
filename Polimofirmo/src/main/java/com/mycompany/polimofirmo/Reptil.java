
package com.mycompany.polimofirmo;
public class Reptil extends Animal{
    protected String corScama;
// métados 
    
    
    @Override
    public void locomover() {
        System.out.println("Rastejando ");
        
    }

    @Override
    public void alimentar() {
        System.out.println(" Comendo Insetos e  pequenos animais ");
    }

    @Override
    public void somEmitido() {
        System.out.println("Som de Reptil ");
        
    }
    // getters and setters 

    public String getCorScama() {
        return corScama;
    }

    public void setCorScama(String corScama) {
        this.corScama = corScama;
    }
    
    
    
    
}
