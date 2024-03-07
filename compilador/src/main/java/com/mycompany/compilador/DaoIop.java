
package com.mycompany.compilador;

public class DaoIop {
            public void setIop(Iop i ){
                
                System.out.println("Conectando............");
                System.out.println("Executando....");
                System.out.printf("Executado :   Insert into Iop values : (  %s / %d , %s  )  \n",i.getNome(),i.getNivel(),i.getElemento());
                System.out.println("Desconectando.......");
            
           
   
            }
    
               
            
            
            
            public Iop getIop(int nivel){
            Iop i = new Iop();
                System.out.println("Conectando ......");
                System.out.println("Executando .........");
                System.out.println("Executado :  Select *from Iop where nivel = "+nivel);
                
                i.setNome("Hizie");
                i.setNivel(nivel);
                i.setElemento("Terra");
                System.out.println("Desconectando......");
            
            
            return i;
            
            }
    
}
