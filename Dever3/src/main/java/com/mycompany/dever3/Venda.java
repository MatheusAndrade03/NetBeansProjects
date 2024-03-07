
package com.mycompany.dever3;

import java.util.ArrayList;

public class Venda{
    private Cliente cliente;
    private int codigo;
    private ArrayList<Produto> p = new <Produto>ArrayList();

    public Venda() {
        
        }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Produto> getP() {
        return p;
    }

    public void setP(ArrayList<Produto> p) {
        this.p = p;
    }
    
    
    
    public void Venda(){
        if(p.get(1)!=null && p.get(0)!=null){
            
           
        
          System.out.println("Cliente : " +this.cliente.getNome());
          System.out.println("Esta fazendo a compra do Produto :  "+this.p.get(0).getNome());
          System.out.println("que Custa : "+this.p.get(0).getPreco());
          System.out.println("Esta fazendo a compra do Produto :  "+this.p.get(1).getNome());
          System.out.println("que Custa : "+this.p.get(1).getPreco());
          
        }else {
            System.out.println("Venda não pode ser efetuado pois  Não existe um cliente ou não possui 2 ");
        
        }
        
    }

    
    public void cadastrar(Cliente cliente ,ArrayList<Produto> produto ) {
        
        
         this.setCliente(cliente);
         this.p=produto;
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
}
