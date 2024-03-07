
package com.mycompany.deverr;

public class Fornecedor extends Pessoa implements NewInterface {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Fornecedor");
    }
    
    
}
