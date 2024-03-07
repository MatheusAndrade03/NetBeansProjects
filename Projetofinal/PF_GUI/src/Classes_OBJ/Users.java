
package Classes_OBJ;



import java.util.ArrayList;
import Classes_OBJ.Paciente;


public class Users {
    /*
 * Nome: Tami Uemura
 * RA: 2525348
 */
    private String indent;
    private String senha;
    public Users(){
        setIndent("Empty");
        setSenha("Empty");
    }
    
    public Users(String indent, String senha){
        setIndent(indent);
        setSenha(senha);
    }
    

    public String getIndent() {
        return indent;
    }

    public void setIndent(String indent) {
        this.indent = indent;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
