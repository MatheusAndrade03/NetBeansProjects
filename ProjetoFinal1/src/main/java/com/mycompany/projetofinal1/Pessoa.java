
package com.mycompany.projetofinal1;
public abstract class Pessoa {
       protected String nome;
       protected int idade;
       protected char sexo;
       protected int experiencia;
        
        // construtor 
        
        
        public Pessoa(String nome, int idade, char sexo){
            this.nome=nome;
            this.idade=idade;
            this.sexo=sexo;
            this.experiencia=0;
        
        }
        
        // getters 

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }
        
        // setters 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    
    public abstract void ganharExp();

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + '}';
    }
    
    
    
    
    
}
