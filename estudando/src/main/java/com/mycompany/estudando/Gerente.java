
package com.mycompany.estudando;

import java.util.Scanner;

public final class Gerente extends Pessoa {
      //  Gerente é uma classe Final ,ou seja,  não pode ter herdeiros  ( não pode ser extendida por outtra classe) 
    private String departamento;

    
    // Método construtor
    public Gerente() {
        
        empregado=true;
    }

    
    
    // métodos acessores
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void cadastrar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println(">>>Cadastro de Gerente <<<");
        System.out.println("Nome do Gerente : ");
        this.setNome(teclado.nextLine());
        System.out.println(" Departamento do Gerente :");
        this.setDepartamento(teclado.nextLine());
        System.out.println("Salario do Gerente");
        this.setSalario(teclado.nextFloat());
         
        System.out.println("............................");
       
    }

    @Override
    public void apresentar() {
            System.out.println(" <<<<<<<Gerente >>>>>>");
            System.out.println("Nome do Gerente : "+this.getNome());
            System.out.println("Salaraio do Gerente : "+this.getSalario());
            System.out.println("Departamento do Gerente : "+ this.getDepartamento());
            
            
        
            }
    
    
    
    
    
    
    
    
}
