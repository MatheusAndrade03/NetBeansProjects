package com.mycompany.mavenproject9;


public class Caneta {
    // atributos 
    private  String cor ;
    private  String marca;
    private  String tinta;
        
    
    
    // métodos 
    
    public void escrever(){
    
        System.out.println("escrevendo..........");}
    
    
    public void mudarCor(String cor){
      
        this.cor =  cor;
    }
    
    public  String  ver(){
        return cor;
    
    }
    
    // métados

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTinta() {
        return tinta;
    }

    public void setTinta(String tinta) {
        this.tinta = tinta;
    }
    
    
}
