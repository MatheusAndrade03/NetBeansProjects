/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente;

/**
 *
 * @author paulo
 */
public class DAOCliente {
    
    
    
    public void setCliente(Cliente c){
        System.out.println("CONECTAR!!!!");
        //insert into cliente values(1, "Miguel", "Rua A")
        String sql = "insert into cliente values (" + 
                                                   c.getCod()+
                                                  ", \"" +  c.getNome()+
                                                  "\",\"" + c.getEndereco()+
                                                  "\")";
        System.out.println("Executando no banco: " + sql);
        System.out.println("Desconectando...");
    }
    
    public Cliente getCliente(int cod){
        //Conectar ao banco
        System.out.println("Conectando...");
        //Consultar o cliente cujo código foi passado para o parâmetro
        //select * from cliente where cod = 1
        String sql = "select * from cliente where cod =" + cod;
        System.out.println("Executando no banco: " + sql);
        //Atribuir os valores recebidos para um objeto cliente
        Cliente c = new Cliente();
        c.setCod(cod);
        c.setNome("Yoda");
        c.setEndereco("Dagobah");
        //Desconectar
        System.out.println("Desconectando...");
        
        //Retornar o cliente
        return c;
    }
}
