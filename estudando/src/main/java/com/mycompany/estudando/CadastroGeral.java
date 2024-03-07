
package com.mycompany.estudando;


public class CadastroGeral {
    
    
    
    
    //  aki existe um Polimorfismo ,   estes Metodos funcionam de  formas diferentes dependendo do objeto que seja passado por parametro (se for Vendedor ou se for Gerente) 
    
    public void cadastrar(Pessoa p){
    
    
            p.cadastrar();
    
    }
    
    
    public void apresentar(Pessoa p ){
    
            p.apresentar();
    }
}
