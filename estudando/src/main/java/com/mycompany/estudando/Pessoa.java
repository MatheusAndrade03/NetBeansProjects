
package com.mycompany.estudando;

public abstract class Pessoa implements Tela {
    // Pessoa é um  Classe abstrata ,  ou seja  , ele não pode ser insttanciado ( não se pode ter um objeto de  Pessoa)
    protected  String nome;
    protected float salario;
    protected boolean empregado;
    
    
    
    
    
   // método construtor  
    public Pessoa() {
        
        
    }

    
    
    
    
    // métodos  acessores 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean isEmpregado() {
        return empregado;
    }

    public void setEmpregado(boolean empregado) {
        this.empregado = empregado;
    }
    
    
    // métodos complementares
    
    
    
    
    
    
}
