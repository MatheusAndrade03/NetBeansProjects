
package com.mycompany.polimofirmo;

public class Ave extends Animal{
    protected String corPenas;

    // métados
    
    public void fazerNinho(){
        System.out.println(" Fazendo ninho ");
    
    }
    @Override
    public void locomover() {
        System.out.println(" Voando ");
    }

    @Override
    public void alimentar() {
        System.out.println(" Comendo Insetos e Peixes ");
    }

    @Override
    public void somEmitido() {
        System.out.println("Som de  Ave");
        // getters and setters 
        
    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }
    
    
}
