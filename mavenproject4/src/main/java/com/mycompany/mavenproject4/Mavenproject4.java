
package com.mycompany.mavenproject4;


public class Mavenproject4 {

    public static void main(String[] args) {
       
        
        int n1 ,n2 ;
        n1=6;
        n2=8;
       
        String nome1 ="Matheus";
        String nome2 = (String) "Matheus";
        String nome3 = new String("Matheus");
        String r;
        r=nome2.equals(nome3)?"igual":"Diferente";
        
        
        System.out.println(r);
        System.out.println(nome1);
        System.out.println(nome3);
        
        
        
        
        
    }
}
