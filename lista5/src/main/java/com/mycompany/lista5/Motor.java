package com.mycompany.lista5;

public class Motor {
    private int qtdPistoes;
    private int potencia;
    
    // métodos construtores

    public Motor(int qtdPistoes, int potencia) {
        this.qtdPistoes = qtdPistoes;
        this.potencia = potencia;
    }
    
    // getter
    public int getQtdPistoes() {
        return qtdPistoes;
    }

    public int getPotencia() {
        return potencia;
    }
    
    // setter
    public void setQtdPistoes(int qtdPistoes) {
        this.qtdPistoes = qtdPistoes;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    

}
