
package com.mycompany.pokemon;

public class Pokemonn {
    
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Pokemonn(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }
    
}
