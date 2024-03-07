
package com.mycompany.exercicio1;
public class Exercicio1 {
    public static void main(String[] args) {
       
        
        Pessoa p1= new Pessoa("Joao", 20,'M');
        Livro l1 = new Livro("Pescador de agua","Chico Bento",200 );
        
        l1.setLeitor(p1);
        
        l1.detalhes();
        l1.getLeitor().fazerAniversario();
        l1.abrir();
        l1.detalhes();
        l1.folhear();
        l1.detalhes();
    }
}
