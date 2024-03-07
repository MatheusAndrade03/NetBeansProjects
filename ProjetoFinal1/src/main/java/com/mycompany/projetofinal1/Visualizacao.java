
package com.mycompany.projetofinal1;
public class Visualizacao {
    
    
    private Usuario espectador;
    private Video filme;
    
    
    // constructor
    
    public  Visualizacao(Usuario espectador,Video filme){
        
        this.espectador=espectador;
        this.filme=filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1 );
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
//  Métados getters and setters 
    
    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    // metados 
    
    
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    
    
    }
    
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    
    }
    
    
    public void avaliar(float porc){
        int tot;
        
        if(porc<=20){
            tot=3;
        
        
        }else if(porc<=50){
            tot=5;
        
        }else if(porc<=90){
            tot=8;
        
        
        }else{
        tot=10;
        }
        this.filme.setAvaliacao(tot);
        
    
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + this.espectador.toString() + ", filme=" + this.filme.toString() + '}';
    }
    
    
    
    
    
    
    
}
