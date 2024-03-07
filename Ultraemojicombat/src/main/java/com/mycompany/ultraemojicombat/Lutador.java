
package com.mycompany.ultraemojicombat;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private float altura;
    private String categoria;
    private int vitorias , derrotas , empates;
    
    // métodos especiais 
    
    // construtor 
    
    
    public Lutador(String no,String naci,int id, float pe, float alt,int vit, int der, int emp){
            this.nome=no;
            this.nacionalidade=naci;
            this.idade=id;
            this.peso=pe;
            this.altura=alt;
            this.vitorias=vit;
            this.derrotas=der;
            this.empates=emp;


}
    
    
    // getter 

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public String getCategoria() {
        if(this.peso<=52.2){
            this.setCategoria("Invalido");
        
        
        }else if (this.peso<=70.3){
            this.setCategoria("Peso Leve");
        
        }else if (this.peso<=83.9){
            this.setCategoria("Peso Medio");
            
        
        
        }else if (this.peso<=120.3){
            this.setCategoria("Peso Pesado");
        }else {
            this.setCategoria("imvalido");
            
        }
        return categoria;
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    
    
    // setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    // métodos Personalizados
    
    
    // apresentar os lutadores
    public void apresentar(){
        System.out.println(".............................................");
        System.out.println("Chegouuu a horaaaa !!!! Entra na Arena o  ");
        System.out.println("Lutador : "+ this.getNome());
        System.out.println("Origem : "+ this.getNacionalidade());
        System.out.println( this.getIdade()+" Anos");
        System.out.println("Pesando : "+ this.getPeso());
        System.out.println("Ganhou : " + this.getVitorias());
        System.out.println("Perdeu : "+ this.getDerrotas());
        System.out.println("Empatou : " + this.getEmpates());
    
    }
    
    // status dos lutadores 
    
    public void status(){
        System.out.println( this.getNome());
        System.out.println("Sua categoria é : " + this.getCategoria());
        
        System.out.printf("Posui  %d Vitorias \n", this.getVitorias());
        System.out.printf(" Posui %d  Derrotas \n" , this.getDerrotas()  );
        System.out.printf(" possui  %d  Empates \n", this.getEmpates());
        
        
    
    
    }
    // vitorias 
    
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    
    }
    
    
    
    // derrotas 
    
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    
    }
    
    
    
    // empates
    
    
    public  void empatarLuta(){
        
        this.setEmpates(this.getEmpates()+1);
    }
    
    
    
}
