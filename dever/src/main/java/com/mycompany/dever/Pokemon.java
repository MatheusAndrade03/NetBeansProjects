
package com.mycompany.dever;

public class Pokemon {
        private String nome;
        private String tipo;
        private int hp;
        private int atk;
        private int def;
        
        // Métado construtor 
        
        public Pokemon(){
        
        
        }
        // Métados getters 
    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }
    // Métado setters
    public void setTipo(String tipo){
        this.tipo=tipo;
    
    
    
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }
    
    
        
     public void apresentar(){
         
         System.out.println("Pokemon : "+this.nome);
         System.out.println("Tipo : "+ this.tipo);
         System.out.println("Hp : " +this.hp);
         System.out.println("Atk : " + this.atk);
         System.out.println("Def: " + this.def);
         
     
     }  
        
    
    
    
    
    
}
