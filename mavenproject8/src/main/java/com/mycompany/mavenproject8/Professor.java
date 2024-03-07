
package com.mycompany.mavenproject8;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    
    public Professor(){
    }
// setters and getters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    // Métados publicos 
    
    public void receberAumento(float aumento){
        this.setSalario( aumento);
        
    
    
    }
    
}
