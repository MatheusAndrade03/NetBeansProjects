
package com.mycompany.compilador.Vendedor;

import com.mycompany.compilador.Vendedor.Vendedor;


public class DaoVendedor {
    
    public void setVendedor(Vendedor v ){
        System.out.println("Conectando.......");
        
        System.out.println("Executando....");
        System.out.printf("Executado :  Insert into Vendedor values :  %s / %s / %d  ",v.getNome(),v.getEndereco(),v.getCnpj());
         System.out.println("   ");
         System.out.println("Desconectando ...........");
    
    }
    
    
    
    public Vendedor getVendedor(int cnpj){
        Vendedor v = new Vendedor();
            System.out.println("Conectando..........");
            System.out.println("Executando ....");
            System.out.println("Executando : select * from Vendedor where Cnpj = "+ cnpj);
            
            v.setNome("joaozinho");
            v.setEndereco("Felipezinho");
            v.setCnpj(cnpj);
            System.out.println("Desconectando ......");
    
    
    
    
    
        return v ;
    }
    
    
    
    
    
    
    
    
    
}
