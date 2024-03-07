
package com.mycompany.estudando;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorV {
    
    
            public void menuV(){
            
                ArrayList<Pessoa > lista = new <Pessoa>ArrayList();
                Scanner teclado= new Scanner(System.in);
                CadastroGeral  cadastro = new CadastroGeral();
                int opc;
                int i =0;
                int posicao;
                int pos;
                do{
                    System.out.println("1-Cadastrar Vendedor");
                    System.out.println("2- ver 1 vendedor ");
                    System.out.println("3- Ver  todos os  Vendedores");
                    System.out.println("4- remover 1 Vendedor ");
                    System.out.println("0-voltar");
                
                
                
                opc=teclado.nextInt();
                switch(opc){
                    case 1 : 
                        
                         lista.add(new Vendedor());
                         cadastro.cadastrar(lista.get(i));
                         i++;
                        break;
                        
                    case 2: 
                        System.out.println(" qual a posição  do Vendedor que voce deseja ver : ");
                        posicao=teclado.nextInt();
                        
                        cadastro.apresentar(lista.get(posicao));
                        
                        
                        
                        break;
                        
                    case 3 : 
                        
                        for(int j =0;j<lista.size();j++){
                            
                            
                          cadastro.apresentar(lista.get(j));
                        
                        
                        }
                        
                        break;
                        
                    case 4 : 
                        
                        System.out.println("qual a posição do vendedor que deseja remover ");
                        pos=teclado.nextInt();
                        
                        lista.remove(pos);
                        
                        
                        
                        break;
                    
                
                
                
                }
                
                
                
                
                }while(opc!=0);
                
                
                
                
                
                
                
                
            
            }
    
}
