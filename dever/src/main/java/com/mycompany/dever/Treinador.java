
package com.mycompany.dever;

public class Treinador {
    
        private String nome;
        private int idade;
        private Pokemon poke;

    public Treinador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pokemon getPoke() {
        return poke;
    }

    public void setPoke(Pokemon poke) {
        this.poke = poke;
    }
        
        
        
       public void apresentar(){
       
           System.out.println("Treinador : " + this.nome);
           System.out.println("idade : " +this.idade);
           this.poke.apresentar();
            
       
       
       }
    
    
    
    
    
}
