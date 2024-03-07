
package com.mycompany.dever1;

import java.util.Scanner;

public class TelaPokemon {
    
    
    Scanner teclado = new Scanner(System.in);
    
    
    
    
    
     public void Criar(Pokemon pokemon){
         
         System.out.println("Digite o nome  do pokemon : "); 
         pokemon.setNome(teclado.nextLine());
         System.out.println("Digite o Hp do Pokemon : ");
         pokemon.setHp(teclado.nextInt());
         System.out.println("Digite a def do Pokemon : " );
         pokemon.setDef(teclado.nextInt());
         System.out.println("Digite o atk do  Pokemon : ");
         pokemon.setAtk(teclado.nextInt());
         
     
     
     }
     
     
     public void apresentar(Pokemon pokemon){
         
         
         System.out.println("..........................................");
          System.out.println(" o nome  do pokemon : "+pokemon.getNome()); 
         
         System.out.println(" o Hp do Pokemon : "+pokemon.getHp());
         
         System.out.println(" a def do Pokemon : "+pokemon.getDef());
        
         System.out.println(" o atk do  Pokemon : "+pokemon.getAtk());
        
         System.out.println("..............................................");
     
     
     }
     public void  alterar( Pokemon pokemon){
         System.out.println("Digite o nome  do pokemon : "); 
         pokemon.setNome(teclado.nextLine());
         System.out.println("Digite o Hp do Pokemon : ");
         pokemon.setHp(teclado.nextInt());
         System.out.println("Digite a def do Pokemon : " );
         pokemon.setDef(teclado.nextInt());
         System.out.println("Digite o atk do  Pokemon : ");
         pokemon.setAtk(teclado.nextInt());
         
     }
     
    
    
}
