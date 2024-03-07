
package com.mycompany.pro1;

public class Digimon {
    private int hp;
    private int atk;
    private int def;
// getter and setters
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
    
    // Métado 
    
    
    public void apresentar(){
    
        System.out.println("ATK : "+this.getAtk());
        System.out.println("HP : "+this.getHp());
        System.out.println("DEF : "+this.getDef());
    
    }
    
    
    
    
    
}
