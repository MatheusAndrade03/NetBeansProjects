
package com.mycompany.polimofirmo;
public abstract class Animal {
    // atributos
    protected float peso;
    protected int idade;
    protected int membros;
    // metados abstratos
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void somEmitido();
    
    // getters and setters

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
    
    
    
}
