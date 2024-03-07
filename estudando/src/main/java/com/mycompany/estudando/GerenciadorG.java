
package com.mycompany.estudando;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorG {
    
    
    
    
            public void menuG(){
                 Pessoa lista[]=new Pessoa[5];    
                Scanner teclado= new Scanner(System.in);
                CadastroGeral  cadastro = new CadastroGeral();
                int opc;
                int i =0;
                int posicao;
                int pos;
                int ant;
                do{
                    System.out.println("1-Cadastrar Gerente");
                    System.out.println("2- ver 1 Gerente ");
                    System.out.println("3- Ver  todos os  Gerentes");
                    System.out.println("4- remover um Gerente ");
                    System.out.println("0-voltar");
                
                
                
                opc=teclado.nextInt();
                switch(opc){
                    case 1 : 
                        
                        if(lista[i]==null){
                         lista[i]= new Gerente();
                         cadastro.cadastrar(lista[i]);
                         
                         i++;
                        }else{
                        
                            i++;
                        }
                        if(i>=5){
                            i=0;
                        
                        
                        }
                        
                        break;
                        
                    case 2: 
                        System.out.println(" qual a posição  do Vendedor que voce deseja ver : ");
                        posicao=teclado.nextInt();
                        
                        cadastro.apresentar(lista[posicao]);
                        
                        
                        
                        break;
                        
                    case 3 : 
                        
                        for(int j =0;j<5;j++){
                            
                          if(lista[j]!=null){  
                          cadastro.apresentar(lista[j]);
                          }
                        
                        }
                        
                        break;
                
                    case 4 :
                            System.out.println("qual  a posição ");
                            pos=teclado.nextInt();
                            
                            lista[pos]=null;
                            
                            
                        
                        
                        break;
                
                
                }
                
                
                
                
                }while(opc!=0);
                
                
                
                    
            
            
            
            }
                    
    
    
    
    
    
    
}
