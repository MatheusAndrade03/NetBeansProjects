
package com.mycompany.lista5;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class InterfaceConsultarVeiculosDePasseio extends JFrame {
    private JTable tabela;

    public InterfaceConsultarVeiculosDePasseio(ArrayList<Passeio> veiculosDePasseio) {
        setTitle("Consultar Veículos de Passeio");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        String[] colunas = {"Placa", "Marca", "Modelo","Cor"," qtdRodas","VelocidadeMax","dataCadastro"};
        Object[][] dados = new Object[veiculosDePasseio.size()][7];

        for (int i = 0; i < veiculosDePasseio.size(); i++) {
            Passeio veiculo = veiculosDePasseio.get(i);
            dados[i][0] = veiculo.getPlaca();
            dados[i][1] = veiculo.getMarca();
            dados[i][2] = veiculo.getModelo();
            dados[i][3] = veiculo.getCor();
            dados[i][4] = veiculo.getQtdRodas();
            dados[i][5] = veiculo.getVelocMax();
            dados[i][6] = veiculo.getDataCadastro();
            
        }

        tabela = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabela);
        panel.add(scrollPane, BorderLayout.CENTER);

        add(panel);
    }
}