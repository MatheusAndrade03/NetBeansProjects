
package com.mycompany.projetofinal1;

public class Usuario extends Pessoa{
    private String login;
    private int totAssistido;
    
 //  construtor
    public Usuario(String nome, int idade, char sexo,String login) {
        super(nome, idade, sexo);
        this.login=login;
        this.totAssistido=0;
    }
    
    // getters 
    public String getLogin() {
        return login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }
    // setters
    public void setLogin(String login) {
        this.login = login;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public void ganharExp() {
        this.setExperiencia(this.getExperiencia()+1);
    }
    // metado adcional 
    
    public void viuMaisUm(){
    
            this.totAssistido++;
    
    
    }

    @Override
    public String toString() {
        return "Usuario{" + super.toString()+ "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
    
    
    
    
    
    
    
}
