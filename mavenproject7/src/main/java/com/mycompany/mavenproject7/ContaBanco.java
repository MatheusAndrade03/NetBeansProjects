
package com.mycompany.mavenproject7;
public class ContaBanco {
    public int numconta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
  // Contrutor :  
  public ContaBanco(){
    this.status = false;
    this.saldo=0;
    
    
    }
        
      
  
  
  
 
    // Getters
    public int getNumconta() {
        return numconta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }
    // Setters

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean Status) {
        this.status = Status;
    }
    
  // Metodos
    // abrir conta
    public void abrirConta(String d, String t){
        
        this.setDono(d);
        this.setTipo(t);
        this.setStatus( true);
        if(t.equals("Corrente")|| t.equals("corrente")){
            this.setSaldo( 50f);
             
        
        }else if(t.equals("Poupança")|| t.equals("poupança")){
            this.setSaldo ( 150f);
        
        
        
        
    
    }
    
    
   
    
    }
    
  // fechar conta 
    
    
    public void fecharConta(){
        
        
        if(this.saldo>0){
            System.out.println("Conta com dinheiro");
        
            
        }else if(this.saldo<0){
            System.out.println("Conta em débito");
        }else{
        
        this.status= false;
        }
        
        
        
    
            
    }
    
    // depositar 
    
    public void depositar(float d){
    if(this.status==true){
    
    
    
    
        this.setSaldo(this.saldo+d);
    }else{
         System.out.println("impossivel depositar");
             
        
    } 
    
    }
    
    // depositar 
    
    public void  retirar (float r){
        if(this.status==true){
            
         if(saldo>r){   
        this.setSaldo(this.saldo-r);
         }else{
             System.out.println("Voce não possui saldo suficiente ");
         
         }
         
        }else{
        
            System.out.println(" Conta inativa ");
        
        }
    
    
    
    
    
    }
    
    // pagar mensalidade
    
    public void mensalidade(){
    float v=0 ;
    
    if(this.tipo.equals("corrente")|| this.tipo.equals("Corrente")){
        
        v=12;
        
    
    }else if (this.tipo.equals("poupança")|| this.tipo.equals("Poupança")){
        v=20;
    
    
    
    }
    
    if(this.status==true){
        
        if(this.saldo> v){
            this.saldo = this.saldo - v;
        
        
        
        }else{
        
            System.out.println("Saldo insuficiente");
        
        }
    
    
    
    
    
    
    }else {
        System.out.println("Conta não existe");
    }
    
    
    
    }
    
    
}
