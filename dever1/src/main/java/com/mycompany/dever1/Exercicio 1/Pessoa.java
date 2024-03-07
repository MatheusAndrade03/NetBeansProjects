
package com.mycompany.dever1;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private int cpf;
    
    
    
    
    public Pessoa(){
    
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
    
    
}
