
package com.mycompany.exercicio1;
public class Livro implements Publicação  {
    public String titulo;
    public String autor;
    public int totPaginas;
    public int pagAtual;
    public boolean aberto;
    public Pessoa leitor;
    
    
    
    // métados especiais 
    
    // construtor 
    
    
    public  Livro(String titulo,String autor,int tot){
      this.titulo=titulo;
      this.autor=autor;
      this.totPaginas=tot;
      this.aberto=false;
      
    
    
    
    }
    // getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    // Métados abstratos 
   
    @Override
    public void abrir() {
        this.setAberto(true);
        this.setPagAtual(1);
        
    }

   
    @Override
    public void fechar() {
        
       this.setAberto(false);
    }

   
    @Override
    @SuppressWarnings("empty-statement")
    public void folhear() {
        if(this.isAberto()==true){
           for( ;this.getPagAtual()<= this.getTotPaginas() ;this.setPagAtual(this.getPagAtual()+1) ){
               
                    System.out.println("Pagina : " +this.getPagAtual() );
           }
        
        }else{
        
            System.out.println("Abra o livro");
        
        }
        
        this.setPagAtual(this.getPagAtual()-1);
        
    }

    
    @Override
    public void avançarPag() {
        if(this.isAberto()== true && this.getPagAtual()<200){
        this.setPagAtual(this.getPagAtual()+1);
        }else{
            System.out.println("Abra o livro");
        }
    }

   
    @Override
    public void voltarPag() {
        if(this.isAberto()== true && this.getPagAtual()>1){
        this.setPagAtual(this.getPagAtual()-1);
        }else{
            System.out.println("Abra o livro");
        }
    }
    
   // métado Personalizado 
    
    public void detalhes(){
    
        System.out.println("Nome do livro :  " +this.getTitulo());
        System.out.println("Nome do autor : " +this.getAutor());
        System.out.println("totl de Paginas:" + this.getTotPaginas());
        System.out.println(" Atualmente com o Leitor :" + this.leitor.getNome());
        System.out.println("Possui tantos anos : " + this.leitor.getIdade());
        System.out.println(" Pagina Atual  do livro :"+ this.getPagAtual());
        
    
    
    
    }
    
    
}
