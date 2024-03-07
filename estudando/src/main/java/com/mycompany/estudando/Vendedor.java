
package com.mycompany.estudando;

import java.util.Scanner;

public  final class Vendedor extends Pessoa{
    // Vendedor é uma classe Final ,ou seja,  não pode ter herdeiros  ( não pode ser extendida por outra classe) 
    private float comissao;
    //método construtor
    public Vendedor() {
        
        empregado=true;
        
        
    }

    
    
    
    
    
    // métodos acessores
    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    
    
    // métodos  sobrescritos

    @Override
    public void cadastrar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println(">>>Cadastro de Vendedor <<<");
        System.out.println("Nome do vendedor : ");
        this.setNome(teclado.nextLine());
         System.out.println("Salario do Vendedor");
         this.setSalario(teclado.nextFloat());
         System.out.println(" Percentual de comissão :");
         this.setComissao(teclado.nextFloat());
        System.out.println("............................");
       
    }

    @Override
    public void apresentar() {
        System.out.println("<<<<< Vendedor >>>>>");
        System.out.println("Nome do vendedor : "+this.getNome());
        System.out.println("Salario do Vendedor : "+this.getSalario());
        System.out.println("Porcentual de comissão : "+ this.getComissao());
      
    }
    
    
}
