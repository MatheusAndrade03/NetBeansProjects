
package com.mycompany.mavenproject8;
public  abstract class  Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;
    
    // Métado construtor
    
    public Pessoa(){
    
    
    
    
    }
    
    
    //Métados Getters
    
    
    public String getNome(){
        
        return nome;
       
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }
    
  // Métados setters
    
    public void setNome(String nome){
        this.nome = nome;
       
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
      // MÉTADOS PUBLICOS
    
    
        public void fazerAniversario(){
        
            this.idade ++;
                    
        
        }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
        
        
    
    
    
    
}
