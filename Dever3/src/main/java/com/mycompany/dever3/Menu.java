
package com.mycompany.dever3;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    ArrayList<Cliente>  cliente= new <Cliente>ArrayList();
    ArrayList<Produto>  produto= new <Produto>ArrayList();
    Venda v = new Venda();
    int op;
    int i=0;
    int j =0;
    int cliente1;
    int produto1;
    
    public void menu(){
    do{

        System.out.println("1-Cadastrar Cliente ");
        System.out.println("2-Cadastrar Produto");
        System.out.println("3-Cadastrar  Venda ");
        System.out.println("0-sair");




    op=teclado.nextInt();

    switch(op){
    
    
        case 1 : 
            cliente.add(new Cliente());
             cliente.get(i).cadastrar();
             i++;
        break;
                    
        case 2 :
            produto.add(new Produto());
            produto.get(j).cadastrar();
            
        break;
        case 3 : 
            
            System.out.println(" qual Cliente   gostaria de fazer uma venda : ");
            cliente1=teclado.nextInt();
            
            
            
            v.cadastrar(cliente.get(cliente1), produto);
            
            
            
         break;
    
    
    
    
    
    
    }





    

        





    }while(op!=0);
    
    
    
    
    
    }
    
    
    
    
}
