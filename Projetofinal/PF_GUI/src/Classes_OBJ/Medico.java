package Classes_OBJ;

/*
 * Nome: Tami Uemura
 * RA: 2525348
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Medico {
    /*
 * Nome: Tami Uemura
 * RA: 2525348
 */
    private String CRM;
    private String nome;
    private String especialidade;
    private ArrayList<String> horarios;

    public Medico(){
        setCRM("Não especificado");
        setNome("Não especificado");
        setEspecialidade("Não especificado");
        horarios = new ArrayList<>();

    }
    
    public Medico(String CRM, String nome, String especialidade){
        setCRM(CRM);
        setNome(nome);
        setEspecialidade(especialidade);
        horarios = new ArrayList<>();
    }
    
    public String getCRM() {
        return CRM;
    }


    public void setCRM(String CRM) {
        this.CRM = CRM;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEspecialidade() {
        return especialidade;
    }
    
    public ArrayList<String> getHR() {
        return horarios;
    }


    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean addHorario(String horario){
        for (int i = 0; i < horarios.size(); i++) {
            if(horarios.get(i).equals(horario)){
                return false;
            }
        }
        horarios.add(horario);
        return true;
    }
    
    //------------------------------------------------------------------
    // ITERATOR
    //------------------------------------------------------------------
    public void imprimirHR(ArrayList<String> lista){ //Pega o array de horarios e imprime
        Iterator i = lista.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
    //--------------------------------------------------------------------------
}
