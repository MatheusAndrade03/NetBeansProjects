
package com.mycompany.dever1;

public abstract class Monstro {
    private String nome;
    private int vida;
    private int def;
    private int atk;

    public Monstro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    @Override
    public String toString() {
        return "Monstro{" + "nome=" + nome + ", vida=" + vida + ", def=" + def + ", atk=" + atk + '}';
    }
    
    
    
    
}
