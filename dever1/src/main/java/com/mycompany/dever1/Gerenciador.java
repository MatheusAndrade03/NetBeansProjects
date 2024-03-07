
package com.mycompany.dever1;

import java.util.Scanner;

public class Gerenciador {
    
    Scanner teclado = new Scanner(System.in);
   
    
    public void menu(){
        int apresentar;
        int op;
        int alterar;
     Pokemon[] lista = new Pokemon[5];
     TelaPokemon tela= new TelaPokemon();
     lista[0] = new Pokemon();
     lista[1]= new Pokemon();
     lista[2]= new Pokemon();
     lista[3]= new Pokemon();
     lista[4]= new Pokemon();
     
     
     
     do{
         System.out.println("1- para Criar o Pokemon ");
         System.out.println("2- para Atualizar o Pokemon ");
         System.out.println("3-  para apresentar o pokemon ");
         System.out.println("4- Apresentar a lista de Pokemon");
         System.out.println("0- para sair");
         
     op=teclado.nextInt();
     switch(op){
     
         case 1 :
             for(int i = 0; i<5;i++){
                 
                 if(lista[i] == null){
                     tela.Criar(lista[i]);
                    break;
                 }
                 
             
             };
             if(lista[4]!= null){
                 System.out.println("Lista cheia ");
             
             }
             break;
         case 2 :
             System.out.println("Digite o numero do pokemon a ser alterado ");
             alterar=teclado.nextInt();
             if(lista[alterar] == null){
                 System.out.println(" Pokemon não cadastrado");
                 
             
             }else{
                  tela.alterar(lista[alterar]);
             
             
             }
             break;
         case 3 : 
             System.out.println("Digite o numero do pokemon a ser Apresentado ");
             apresentar=teclado.nextInt();
             if(lista[apresentar] == null){
                 System.out.println(" Pokemon não cadastrado");
                 
             
             }else{
                  tela.apresentar(lista[apresentar]);
             
             
             }
             break;
         case 4 : 
             for(int j = 0; j<5;j++){
                 if(lista[j] != null){
                     tela.apresentar(lista[j]);
                    
                 }
                 
             
             };
             break;
     
     
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     }while(op!=0);
    
    
    
    
    }
    
    
    
    
    
    
}
