
package com.mycompany.deverfacul;

import java.util.Scanner;

public class TelaF {
    
    Scanner teclado = new Scanner(System.in);
    
    public void cadastrar(Funcionario funcionario){
        
        System.out.println("Digite o nome do funcionario : ");
        funcionario.setNome(teclado.nextLine());
        System.out.println("Digite o Endereço do funcionario : ");
        funcionario.setEndereco(teclado.nextLine());
        System.out.println("Trabalho do funcionario : ");
        funcionario.setTrabalho(teclado.nextLine());
        System.out.println("Digite  a idade do funcionario : ");
        funcionario.setIdade(teclado.nextInt());
        System.out.println("Digite  o ano de nascimento do funcionario : ");
        funcionario.setAno(teclado.nextInt());
        System.out.println("Digite o salario do funcionario : ");
        funcionario.setSalario(teclado.nextFloat());
        
    }
    
    public void apresentar(Funcionario funcionario ){
        System.out.println(" o nome do funcionario : " + funcionario.getNome() );
        System.out.println(" o Endereço do funcioario : " +funcionario.getEndereco());
        System.out.println(" o seu Trabalho : "+funcionario.getTrabalho());
        System.out.println(" a idade do funcioario : " +funcionario.getIdade());
        System.out.println(" o Salario : "+funcionario.getSalario());
        System.out.println("  o ano de nascimento do funcioario : " +funcionario.getAno());
        
       
        
    
    }

    
}
