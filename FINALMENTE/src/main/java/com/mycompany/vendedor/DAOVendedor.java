/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendedor;

/**
 *
 * @author paulo
 */
public class DAOVendedor {
    
    public void setVendedor(Vendedor v){
        System.out.println("Conectando...");
        
        String sql = "insert into vendedor values(\"" +
                                                v.getNome() + 
                                               "\",\"" +
                                               v.getEndereco() +
                                               "\"," +
                                               v.getSalario() +
                                               "," +
                                               v.getCnpj()+
                                               ")";
        System.out.println("Executando: " + sql);
        System.out.println("Desconectando...");
    }
    
    public Vendedor getVendedor(int cnpj){
        Vendedor v = new Vendedor();
        System.out.println("Conectando...");
        String sql = "select * from vendedor where cnpj=" + cnpj;
        System.out.println("Executando: " + sql);
        v.setNome("Luke");
        v.setEndereco("Rua A");
        v.setSalario(2000);
        v.setCnpj(123456);
        System.out.println("Desconectando...");
        return v;
    }
}
