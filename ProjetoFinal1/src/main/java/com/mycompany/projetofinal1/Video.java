
package com.mycompany.projetofinal1;
public final class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
   // Métado Construtor
    
    public Video(String titulo){
        
        this.titulo=titulo;
        this.avaliacao=1;
        this.views=0;
        this.curtidas=0;
        this.reproduzindo=false;
    
    }
    
    // Métados getters

    public String getTitulo() {
        return titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public int getViews() {
        return views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }
    
    // Métados setters 

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAvaliacao(int avaliacao) {
        float nova;
        nova=((this.avaliacao+avaliacao)/this.views);
        this.avaliacao  = (int) nova ;
        
    }

    public final void setViews(int views) {
        this.views = views;
    }

    public final void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public final void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
     // metados abstratos
    @Override
    public void play() {
        this.reproduzindo= true;
    }

    @Override
    public void pause() {
        this.reproduzindo=false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
