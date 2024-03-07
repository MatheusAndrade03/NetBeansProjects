
package com.mycompany.mavenproject8;
public class Bolsista extends Aluno {
    protected float bolsa;
    
    
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do Aluno : " + this.nome);
    
    
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é Bolsista, pagamento facilitado ");
            
    
    }
    

    // setters e getters

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
}
