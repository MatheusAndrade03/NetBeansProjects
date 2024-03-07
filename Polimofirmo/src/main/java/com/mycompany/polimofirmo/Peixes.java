
package com.mycompany.polimofirmo;
public class Peixes  extends Animal {
    protected String corScama;

    // metados 
    
    public void soltarBolha(){
    
        System.out.println("Soltando bolha ");
    
    }
    
    
    @Override
    public void locomover() {
        System.out.println("Nadando ");
      
    }

    @Override
    public void alimentar() {
        System.out.println(" comendo substancias ");
    }

    @Override
    public void somEmitido() {
        System.out.println(" Peixe não emite som ");
    }
    // getters and setters 

    public String getCorScama() {
        return corScama;
    }

    public void setCorScama(String corScama) {
        this.corScama = corScama;
    }
    
    
    
    
    
    
}
