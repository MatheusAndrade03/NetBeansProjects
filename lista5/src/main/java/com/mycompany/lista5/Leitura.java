package com.mycompany.lista5;

public class Leitura {
    
    // métodos complementares
    public String entDados (String texto) {
        
        if (texto.equals("carga") || texto.equals("Carga")) {
        return "1";
        }
        
        else if (texto.equals("passeio") || texto.equals("Passeio")) {
        return "2";
        }
        
        return null;
    }
    
}
