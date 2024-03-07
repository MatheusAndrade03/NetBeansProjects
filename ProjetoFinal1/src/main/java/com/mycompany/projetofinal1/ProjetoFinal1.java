
package com.mycompany.projetofinal1;
public class ProjetoFinal1 {
    public static void main(String[] args) {
        
        Video v[]= new Video[3];
        v[0]= new Video("JOgando com os amigos");
        v[1]=new Video("Play insana");
        
        Usuario g[]=new Usuario[2];
        g[0]= new Usuario("JOao",20,'m',"Might");
  
        Visualizacao p1= new Visualizacao(g[0],v[0]);
        
        
       
        System.out.println("llllll");
        System.out.println(p1.toString());
        p1.avaliar();
        System.out.println(p1.toString());
        p1.avaliar(10);
        System.out.println(p1.toString());
        p1.avaliar(5.0f);
        System.out.println(p1.toString());
        
    }
}
