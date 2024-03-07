package Classes_OBJ;

/*
 * Nome: Tami Uemura
 * RA: 2525348
 */

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class BD {
    private ArrayList<Paciente> pc;
    private ArrayList<Medico> md;
    private ArrayList<Atendente> atd;
    
    public BD(){
        pc = new ArrayList<>();
        md = new ArrayList<>();
        atd = new ArrayList<>();    
    }
    //-------------------------------------------------------------------------
    // LISTA
    //-------------------------------------------------------------------------
    public ArrayList<Medico> ListaMedicos(){
        return md;
    }
    
    public ArrayList<Atendente> ListaAtendente(){
        return atd;
    }
    
    public ArrayList<Paciente> ListaPaciente(){
        return pc;
    }
    
     //-------------------------------------------------------------------------
    // POLIMORFISMO
    //--------------------------------------------------------------------------
    public ArrayList<Users> ListaUsers(){
        ArrayList<Users> us = new ArrayList<>();
        for (int i = 0; i < pc.size(); i++) {
            us.add(pc.get(i));
        }
        
        for (int i = 0; i < atd.size(); i++) {
            us.add(atd.get(i));
        }
        return us;
    }
    //-------------------------------------------------------------------------
    
    //-------------------------------------------------------------------------
    // CADASTRAR
    //-------------------------------------------------------------------------
    public void cadastrarPaciente(Paciente paciente){
        pc.add(paciente);
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void cadastrarMedico(Medico medico){
        md.add(medico);
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void cadastrarAtendente(Atendente atendente){  
        atd.add(atendente);
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
    }
    //-------------------------------------------------------------------------
    
    //-------------------------------------------------------------------------
    // REMOVER
    //-------------------------------------------------------------------------
    public void removerPaciente(Paciente paciente){
        pc.remove(paciente);
    }
    //-------------------------------------------------------------------------
    
    //-------------------------------------------------------------------------
    //TRATAMENTO DE EXCEÇÕES VERIFICADA E PERSONALIZADA
    //-------------------------------------------------------------------------
    public void removerMedico(String CRM){
       try {
            for (int i = 0; i < md.size(); i++) {
                System.out.println("Procurando medico");
                if(md.get(i).getCRM().equals(CRM)){
                    System.out.println("Medico encontrado");
                    md.remove(i);
                    JOptionPane.showMessageDialog(null, "Removido com sucesso!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            throw new Exception_personal();
        } catch (Exception_personal e) { 
        //try catch está supervisionando
        }
        
    }
    //-------------------------------------------------------------------------
    
    public void removerAtendente(Atendente atendente){
        atd.remove(atendente);
    }
    //-------------------------------------------------------------------------
    
    //-------------------------------------------------------------------------
    // VERIFICAR
    //-------------------------------------------------------------------------
    public boolean verificaPaciente(String CPF){
        for (int i = 0; i < pc.size(); i++) {
            if(pc.get(i).getIndent().equals(CPF)){
                return true;
            }
        }
        return false;
    }
    
    public boolean verificaMedico(String CRM){
        for (int i = 0; i < md.size(); i++) {
            if(md.get(i).getCRM().equals(CRM)){
                return true;
            }
        }
        return false;
    }
    
    public boolean verificaAtendente(String login){
        for (int i = 0; i < atd.size(); i++) {
            if(atd.get(i).getIndent().equals(login)){
                return true;
            }
        }
        return false;
    }
    //-------------------------------------------------------------------------
    
    //-------------------------------------------------------------------------
    // CONSULTAR
    //-------------------------------------------------------------------------
    public Paciente consultarPaciente(String CPF){
        for (int i = 0; i < pc.size(); i++) {
            if(pc.get(i).getIndent().equals(CPF)){
                return pc.get(i);
            }
        }
        return new Paciente();
    }
    
    public Medico consultarMedico(String CRM){
        for (int i = 0; i < md.size(); i++) {
            if(md.get(i).getCRM().equals(CRM)){
                return md.get(i);
            }
        }
        return new Medico();
    }
    
    public Atendente consultarAtendente(String login){
        for (int i = 0; i < atd.size(); i++) {
            if(atd.get(i).getIndent()== login){
                return atd.get(i);
            }
        }
        return new Atendente();
    }
    //-------------------------------------------------------------------------
    
    //-------------------------------------------------------------------------
    // LOGIN -- IMPLEMENTADO
    //-------------------------------------------------------------------------
    public boolean loginPaciente(Paciente paciente){
        for (int i = 0; i < pc.size(); i++) {
            if(pc.get(i).getIndent().equals(paciente.getIndent())){
                if(pc.get(i).getSenha().equals(paciente.getSenha())){
                    JOptionPane.showMessageDialog(null, "Logado com sucesso!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
                    return true;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Dados Inválidos ou não está cadastrado no sistema!", "Notificação",
                    JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public boolean loginAtendente(Atendente atendente){
        for (int i = 0; i < atd.size(); i++) {
            if(atd.get(i).getIndent().equals(atendente.getIndent())){
                if(atd.get(i).getSenha().equals(atendente.getSenha())){
                    JOptionPane.showMessageDialog(null, "Logado com sucesso!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
                    return true;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Dados Inválidos ou não está cadastrado no sistema!", "Notificação",
                    JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    
    //-------------------------------------------------------------------------
    // AGENDAR
    //-------------------------------------------------------------------------
    public boolean agendarMedico(Medico medico, String horario){
        for (int i = 0; i < md.size(); i++) {
            if(md.get(i).getCRM().equals(medico.getCRM()) && md.get(i).getNome().equals(medico.getNome())&&md.get(i).getEspecialidade().equals(medico.getEspecialidade())){
                boolean marcou = md.get(i).addHorario(horario);
                //--------------------------------------------
                // //USAMOS O ITERATOR PARA MOSTRAR O HORÁRIO imprimirHR();
                //--------------------------------------------
                    System.out.println("Dr(a). " + md.get(i).getNome());
                    System.out.println("Horarios agendados: "); 
                    md.get(i).imprimirHR(md.get(i).getHR());
                    System.out.println("");
                if(marcou){
                    JOptionPane.showMessageDialog(null, "Agendado com sucesso!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
                
                    return true;
                }else{
                    JOptionPane.showMessageDialog(null, "Dados: Horário Indisponível!", "Notificação",
                    JOptionPane.ERROR_MESSAGE);
                    
                    return false;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Dados inválidos!", "Notificação",
                    JOptionPane.ERROR_MESSAGE);
        return false;
    }
    //-------------------------------------------------------------------------

}
