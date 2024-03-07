
package com.mycompany.gestao_venda_estoque.modelo.dominio;

public class Categoria {
    private String nome;
    private Long id;
    private String descricao;
    
    
    // Constructors
    public Categoria(){
    
    
    }

    public Categoria(String nome, Long id, String descricao) {
        this.nome = nome;
        this.id = id;
        this.descricao = descricao;
    }
    
    

    
    
    
    // Getters

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
    
    // Setters 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
