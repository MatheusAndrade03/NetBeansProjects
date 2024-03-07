
package com.mycompany.ultraemojicombat;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rauds;
    private boolean aprovada;
    
    
    
    //métodos especiais 
     // construtor 
    
    public Luta(){


}
    // getters
    
    public  int getRauds(){
        return rauds;
    
    
    }
    public boolean getAprovada(){
        return aprovada;



}
 

    public Lutador getDesafiante() {
        return desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }
    
    //setters

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    
    
    
    
    
    public void setRauds(int r){
        this.rauds=r;
    
    
    
    }
    
    public void setAprovada(boolean a){
        this.aprovada=a;
    
    }
    
    // Metados personalizados 
    
    public void marcarLuta(Lutador l1 , Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) &&  l1!= l2){
            
            this.aprovada= true;
            this.desafiado= l1;
            this.desafiante=l2;
        }else {
        
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        
        
        }
    
    
    
    
    }
    
    public void lutar(){
        if(this.aprovada==true){
            System.out.println(">>>>Desafiado<<<<");
            this.desafiado.apresentar();
            
            System.out.println(">>>>Desafiante<<<<<");
            this.desafiante.apresentar();
             Random aleatorio = new Random();
             int vencedor = aleatorio.nextInt(3);
             
             
             switch(vencedor ) {
             
                 case 0:
                     System.out.println("Luta Empatou ");
                     this.desafiado.empatarLuta();
                     this.desafiante.empatarLuta();
                     
                     break;
                 case 1:
                     System.out.println("O vencedor foi "+ this.desafiado.getNome());
                     this.desafiado.ganharLuta();
                     this.desafiante.perderLuta();
                     break;
                     
                 case 2:    
                     System.out.println("O vencedor foi "+this.desafiante.getNome());
                     this.desafiado.perderLuta();
                     this.desafiante.ganharLuta();
                     
             
             
                     break;
             
             }
             
        
        }else{
            System.out.println("Luta não pode acontecer ");
        
        
        }
    
    }
    
    
    
}
