
package com.mycompany.exercicio1;
public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    
  // Métodos especiais 
    
    
  // construtor 
 public Pessoa(String nom, int id, char sex){
     this.nome=nom;
     this.idade=id;
     this.sexo=sex;


}    
    
 //getters 

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public char getSexo() {
        return this.sexo;
    }
//setters
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    // métodos personalizados 
    
    public void fazerAniversario(){
        
        this.setIdade(this.getIdade()+1);
        
    
    
    
    }
    
    
}
