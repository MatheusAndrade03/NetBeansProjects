
package com.mycompany.ultraemojicombat;

public class Ultraemojicombat {

    public static void main(String[] args) {
        
        
      Lutador lutador[] = new Lutador[6];
      
      Lutador l= new Lutador("Joao"," Itambaraca",21,74f,1.80f,10,2,3 );
      lutador[0] = new Lutador("Felipe","Itambaraca",20,65f,1.68f,8,1,4);
      lutador[1]=l;
      lutador[2]= new Lutador("Matheus","Itambaraca",21,60f,1.73f,10,0,3);
      lutador[3]= new Lutador("Lorenzo","Rio de Janeiro",21,60f,1.80f,7,1,3);
      lutador[4]= new Lutador("Pedro","Bandeirantes",21,86f,1.73f,9,4,1);
      lutador[5]= new Lutador("Antonio","Itambaraca",21,68f,1.67f,8,3,2);
      
       
       Luta ufc=new Luta();
       
       ufc.marcarLuta(lutador[5] , lutador[0]);
       
       ufc.lutar();

    }
}
