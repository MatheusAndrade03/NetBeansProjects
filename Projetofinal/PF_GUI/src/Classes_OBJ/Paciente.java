package Classes_OBJ;

import java.util.ArrayList;

public class Paciente extends Users{
    /*
 * Nome: Tami Uemura
 * RA: 2525348
 */
    private String nome;
    private String genero;
    private String endereco;
    private boolean plano_saude;
    
    public Paciente(){
        super("Não informado","Não informado");
        setNome("Não informado");
        setEndereco("Não informado");
    }
    
    public Paciente(String CPF, String senha){
        super(CPF,senha);
        setNome("Não informado");
        setEndereco("Não informado");
        
    }
    
    public Paciente(String nome, String CPF, String senha, String genero, String endereco, boolean plano_saude){
        super(CPF,senha);
        setNome(nome);
        setGenero(genero);
        setEndereco(endereco);
        setPlano_saude(plano_saude);
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean getPlano_saude() {
        return plano_saude;
    }

    public void setPlano_saude(boolean plano_saude) {
        this.plano_saude = plano_saude;
    }
    
    
}
