package com.mycompany.lista5;

public class Passeio extends Veiculo implements Calc{
    private int qtdePassageiro;

    // método construtor
    public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
    }
    
    // getter
    public int getQtdePassageiro() {
        return qtdePassageiro;
    }
    
    // setter
    public void setQtdePassageiro(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }

    @Override
    public int calcVel() {
        int velocidade = 0;
        velocidade = this.getVelocMax() * 1000;
        return velocidade;
    }

    @Override
    public int calcular() {
        int valor = 0;
        valor = this.getPlaca().length() + this.getModelo().length() + this.getCor().length() + this.getDataCadastro().length() + this.getMarca().length();
        return valor;
    }
    
    
}
