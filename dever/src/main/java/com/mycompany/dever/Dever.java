
package com.mycompany.dever;
public class Dever {
    public static void main(String[] args) {
        
        
        Pokemon p1= new Pokemon();
        Treinador t1=new Treinador();
        t1.setNome("Red");
        t1.setIdade(16);
        t1.setPoke(p1);
        
        
        
        p1.setAtk(65);
        p1.setNome("Charrizard");
        p1.setDef(50);
        p1.setHp(85);
        p1.setTipo("Fogo");
        
        t1.apresentar();
        
        
        
        
    }
}
