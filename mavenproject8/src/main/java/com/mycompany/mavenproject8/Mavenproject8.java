
package com.mycompany.mavenproject8;

public class Mavenproject8 {
    public static void main(String[] args) {
        
        
        
       
       Bolsista b1=new Bolsista();
       
       Aluno a1=new Aluno();
       a1.setNome("Matheus");
       a1.setIdade(20);
       a1.setSexo('M');
        System.out.println(a1.toString());
       a1.pagarMensalidade();
       b1.setNome("Julio");
       b1.setIdade(20);
       b1.setBolsa(300f);
       System.out.println(b1.toString());
       b1.pagarMensalidade();
        
        
        
    }
}
