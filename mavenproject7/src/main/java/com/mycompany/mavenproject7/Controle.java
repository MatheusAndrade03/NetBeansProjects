
package com.mycompany.mavenproject7;

public class Controle implements Controlador  {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    
    // Métados especiais 
    
    // contrutor
    
    public Controle(){
        this.volume=50;
        this.tocando=false;
        this.ligado=false;
    }
    //Getters
    
    public  int getVolume(){
        return this.volume;
    
    
    }
    public boolean getLigado(){
        return this.ligado;
        
    
    
    }
    public boolean getTocando(){
        return this.tocando;
    }
    
    // setters
    
    public void setVolume(int v){
        
        this.volume = v;
    
    }
    public void setLigado(boolean l){
        this.ligado=l;
    
    
    }
   public void setTocando(boolean t){
       this.tocando=t;
   }
   // metodos abstratos (implementados da interface)

    @Override
    public void ligar() {
        this.setLigado(true);
        
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(">>>>>>MENU<<<<<<<<");
        System.out.println(" Esta ligado ? "+ this.getLigado());
        System.out.println(" Esta tocando ? "+this.getTocando());
        System.out.println(" Volume :"+ this.getVolume());
        
        for(int i =0 ; i<this.getVolume(); i+=10){
            System.out.print("| ");
        
        
        }
        
        
    }

    @Override
    public void fecharMenu() {
        System.out.println(" Fechando menu ..........");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()== true){
             this.setVolume(this.getVolume()+1);
             
        
        }
    }

    @Override
    public void menosVolume() {
       if(this.getLigado()== true){
           this.setVolume(this.getVolume()-1);
       
       
       }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado()==true && this.getVolume()>0 ){
            this.setVolume(0);
        
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado()==true && this.getVolume()==0 ){
        this.setVolume(50);
        
        }
    }

    @Override
    public void play() {
        if(this.getLigado()== true && this.getTocando()==false){
           this.setTocando(true);
       }
    }

    @Override
    public void pause() {
        if(this.getLigado()==true && this.getTocando()== true)
        {
            
            this.setTocando(false);
        
        
        }
    }
}
