
package com.mycompany.mavenproject8;
public class Funcionario extends Pessoa {
    
    private String setor;
    private String trabalho;
    
    
    // construtor
    
    public Funcionario(){
    }
    // getters e setters

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }
    
    
    // Métados publicos
    
    public void MudarTrabalho(String tra){
        this.setTrabalho(tra);
        
    }
    
    
    
    
    
}
