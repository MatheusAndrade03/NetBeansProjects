
package com.mycompany.dever3;

import java.util.Scanner;

public class Produto implements Tela{
    private float preco;
    private String nome;
    private String descricao;

    public Produto() {
    }
    
    
    

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void cadastrar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cadastro de  Produto ");
         System.out.println("Nome do Produto : ");
        this.setNome(teclado.nextLine());
        System.out.println("Descrilçao do Produto");
         this.setDescricao(teclado.nextLine());
        System.out.println("Valor  do Produto : ");
        this.setPreco(teclado.nextInt());
        
        
        
    }
    
    
    
    
    
    
    
    
    
}
