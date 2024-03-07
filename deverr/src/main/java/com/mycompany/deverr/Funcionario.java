
package com.mycompany.deverr;


public class Funcionario extends Pessoa implements NewInterface {
    
    private  float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public void desligar() {
        System.out.println("desligando funcionario");
    }
    
    
    
}
