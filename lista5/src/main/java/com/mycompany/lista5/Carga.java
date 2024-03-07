package com.mycompany.lista5;

public class Carga extends Veiculo implements Calc{
    private int tara; 
    private int cargaMax;

// método construtor
    public Carga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
    }

    @Override
    public int calcVel() {
        int velocidade = 0;
        velocidade = this.getVelocMax() * 100000; 
        return velocidade;
    }
    
    // getter
    public int getTara() {
        return tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }
    
    // setter
    public void setTara(int tara) {
        this.tara = tara;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    @Override
    public int calcular() {
        int valor = 0;
        valor = this.getCargaMax() + this.getQtdRodas() + this.getTara() + this.getVelocMax();
        return valor;
    }
    
    
    
}
