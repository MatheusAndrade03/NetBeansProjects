
package com.mycompany.deverfacul;

import java.util.Scanner;

public class TelaC {
    
    Scanner teclado = new Scanner(System.in);
    
    public void cadastrar(Cliente cliente){
        
        System.out.println("Digite o nome do cliente : ");
        cliente.setNome(teclado.nextLine());
        System.out.println("Digite o Endereço do cliente : ");
        cliente.setEndereco(teclado.nextLine());
        System.out.println("Digite  a idade do cliente : ");
        cliente.setIdade(teclado.nextInt());
        System.out.println("Digite  o ano de nascimento do cliente : ");
        cliente.setAno(teclado.nextInt());
        
    }
    
    public void apresentar(Cliente cliente ){
        System.out.println(" o nome do cliente : "+cliente.getNome());
        
        System.out.println(" o Endereço do cliente : "+cliente.getEndereco());
        
        System.out.println(" a idade do cliente : "+cliente.getIdade());
        
        System.out.println("  o ano de nascimento do cliente : "+cliente.getAno());
       
        
    
    }
    
}
