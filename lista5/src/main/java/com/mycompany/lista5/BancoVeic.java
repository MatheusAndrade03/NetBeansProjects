
package com.mycompany.lista5;

import java.util.ArrayList;

public class BancoVeic {
    
    
    private static ArrayList<Carga> veiculosDeCarga = new ArrayList<>();
    private static ArrayList<Passeio> veiculosDePasseio = new ArrayList<>();

    public static void adicionarVeiculoDeCarga(Carga veiculo) {
        veiculosDeCarga.add(veiculo);
    }

    public static void adicionarVeiculoDePasseio(Passeio veiculo) {
        veiculosDePasseio.add(veiculo);
    }

    
    
    
    
    
    
    
    
    
    
    
    public static void atualizarVeiculoDePasseio(Passeio veiculoAtualizado) {
        for (Passeio veiculo : veiculosDePasseio) {
            if (veiculo.getPlaca().equals(veiculoAtualizado.getPlaca())) {
                veiculo.setMarca(veiculoAtualizado.getMarca());
                veiculo.setModelo(veiculoAtualizado.getModelo());
                veiculo.setCor(veiculoAtualizado.getCor());
                veiculo.setQtdRodas(veiculoAtualizado.getQtdRodas());
                veiculo.setVelocMax(veiculoAtualizado.getVelocMax());
                veiculo.setDataCadastro(veiculoAtualizado.getDataCadastro());
                break; // Veículo encontrado, encerra o loop
            }
        }
    }


        public static void  atualizarVeiculoDeCarga(Carga veiculoAtualizado) {
        for (Carga veiculo : veiculosDeCarga) {
            if (veiculo.getPlaca().equals(veiculoAtualizado.getPlaca())) {
                veiculo.setMarca(veiculoAtualizado.getMarca());
                veiculo.setModelo(veiculoAtualizado.getModelo());
                veiculo.setCor(veiculoAtualizado.getCor());
                veiculo.setQtdRodas(veiculoAtualizado.getQtdRodas());
                veiculo.setVelocMax(veiculoAtualizado.getVelocMax());
                veiculo.setDataCadastro(veiculoAtualizado.getDataCadastro());
                
                break; // Veículo encontrado, encerra o loop
            }
        }
    }

    
     public static ArrayList<Carga> getVeiculosDeCarga() {
        return veiculosDeCarga;
    }

    public static ArrayList<Passeio> getVeiculosDePasseio() {
        return veiculosDePasseio;
    }
    
    
     public static Boolean removerVeiculoDeCarga(String placa) {
         for(int i=0; i<veiculosDeCarga.size();i++){
            veiculosDeCarga.get(i).getPlaca();
             if(placa.equals(veiculosDeCarga.get(i).getPlaca())){
                 
                 veiculosDeCarga.remove(veiculosDeCarga.get(i));
                    return true;
             }
        
         }
        return false;
    }

    public static Boolean removerVeiculoDePasseio(String placa) {
        
         for(int i=0; i<veiculosDePasseio.size();i++){
            veiculosDePasseio.get(i).getPlaca();
             if(placa.equals(veiculosDePasseio.get(i).getPlaca())){
                 
                 veiculosDePasseio.remove(veiculosDePasseio.get(i));
                    return true;
             }
        
         }
        return false;
        
        
    }
    
}
