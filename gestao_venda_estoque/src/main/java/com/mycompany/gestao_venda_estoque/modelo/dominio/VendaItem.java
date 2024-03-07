
package com.mycompany.gestao_venda_estoque.modelo.dominio;

import java.math.BigDecimal;

public class VendaItem {
    private Venda venda;
    private Produto produto;
    private Integer quantidade;
    private BigDecimal  total;
    private BigDecimal desconto;
    
    // Constructors
    public VendaItem(){
    
    }

    public VendaItem(Venda venda, Produto produto, Integer quantidade, BigDecimal total, BigDecimal desconto) {
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
        this.total = total;
        this.desconto = desconto;
    }
    
    // setters

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }
    
    
    // getters

    public Venda getVenda() {
        return venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }
    
    
    
    
    
    
}
