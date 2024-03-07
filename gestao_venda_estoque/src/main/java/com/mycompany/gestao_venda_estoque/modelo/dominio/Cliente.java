
package com.mycompany.gestao_venda_estoque.modelo.dominio;

public class Cliente {
    
    private Long id;
    private String nome;
    private String telefone;
    private String endereco;
    
    
    // constructors 
    
    
    public Cliente(){
    
    }

    public Cliente(Long id, String nome, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    
    // getters 

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }
    
    
    // setters 

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
    
    
}
