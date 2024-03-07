
package com.mycompany.pro1;

public class Treinador {
    
    private String nome ; 
    private String cidade ;
    private int idade;
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    // métado 
    public void  apresentar(){
        
            
        System.out.println(" Nome do trinador : "+ this.nome);
        System.out.println("idade do ttreinador : " + this.idade);
        System.out.println("cidade de origem : " + this.cidade);
    
    }
    
    
    
    
    
    
    
    
}
