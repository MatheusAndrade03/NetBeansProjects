
package com.mycompany.mavenproject8;
public class Aluno extends Pessoa {
    protected boolean matricula;
    protected String curso;
    
    
    
    // métado construtor 
   
    public Aluno(){
        this.matricula=true;
    
    }
    
    // Setters and getters
    
    
    public boolean getMatricula(){
    
        return matricula;
    
    }
    public String getCurso(){
        return curso;
    
    }
    
    public void setMatricula(boolean matricula){
        this.matricula=matricula;
        
    
    }
    public void setCurso(String curso){
        this.curso=curso;
    }
    
    // Métados publicos 
    
    public void cancelarCurso(){
        this.setMatricula(false);
        
        
    }
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno : " + this.getNome());
    
    
    
    
    }
    
    
    
}
