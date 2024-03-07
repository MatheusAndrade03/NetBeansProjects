package com.mycompany.lista5;

public abstract class Veiculo {
    private String placa; 
    private String marca;
    private String modelo; 
    private String cor; 
    private int qtdRodas; 
    private int velocMax;
    private Motor motor;
    private String dataCadastro;
    
    // método construtor
    public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.qtdRodas = qtdRodas;
        if (velocMax > 250 ||  velocMax < 10 ) {
            System.out.println("A velocidade está fora dos limites brasileiros");
            this.velocMax = 100;
        } else {
            System.out.println("Velocidade permitida");
            this.velocMax = velocMax;
        }
        this.motor = motor;
        this.dataCadastro = dataCadastro;
    }
    
    // getter
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }
    
    // setter
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public void setVelocMax(int velocMax) {
        if (this.velocMax < 10 || this.velocMax > 250) {
            System.out.println("A velocidade está fora dos limites brasileiros");
            this.velocMax = 100;
        } else {
            this.velocMax = velocMax;
        }
        
        
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    // métodos complementares
    public abstract int calcVel();

    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", qtdRodas=" + qtdRodas + ", velocMax=" + velocMax + ", motor=" + motor + ", dataCadastro=" + dataCadastro + '}';
    }
    
    
    
}
