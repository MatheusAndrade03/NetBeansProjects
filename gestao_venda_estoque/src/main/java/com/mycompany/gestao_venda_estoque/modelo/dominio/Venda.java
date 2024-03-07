
package com.mycompany.gestao_venda_estoque.modelo.dominio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Venda {
    private Long id;
    private Usuario usuario;
    private Cliente cliente;
    private BigDecimal totalDaVenda;
    private BigDecimal valorPago;
    private BigDecimal desconto;
    private BigDecimal troco;
    private LocalDateTime ultimaAtualizacao;
    private LocalDateTime dataHoraCriacao;
    
    
    // Constructors 
    
    public Venda(){
    
    
    }

    public Venda(Long id, Usuario usuario, Cliente cliente, BigDecimal totalDaVenda, BigDecimal valorPago, BigDecimal desconto, BigDecimal troco, LocalDateTime ultimaAtualizacao, LocalDateTime dataHoraCriacao) {
        this.id = id;
        this.usuario = usuario;
        this.cliente = cliente;
        this.totalDaVenda = totalDaVenda;
        this.valorPago = valorPago;
        this.desconto = desconto;
        this.troco = troco;
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.dataHoraCriacao = dataHoraCriacao;
    }
    
    
    // getters 

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public BigDecimal getTotalDaVenda() {
        return totalDaVenda;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }
    
    
    
    // setters 

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTotalDaVenda(BigDecimal totalDaVenda) {
        this.totalDaVenda = totalDaVenda;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }
    
    
    
    
}
