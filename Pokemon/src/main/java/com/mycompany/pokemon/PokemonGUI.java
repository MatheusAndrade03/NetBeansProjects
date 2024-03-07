
package com.mycompany.pokemon;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


class PokemonGUI extends JFrame implements ActionListener {
    private JTextField nomeField, vidaField, ataqueField, defesaField;
    private JLabel nomeLabel, vidaLabel, ataqueLabel, defesaLabel;
    private JButton cadastrarButton, apresentarButton;

    public PokemonGUI() {
        // Configurações da janela
        setTitle("Gerenciador de Pokémon");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);
        setLayout(new GridLayout(5, 2));

        // Campos de entrada
        nomeLabel = new JLabel("Nome:");
        add(nomeLabel);
        nomeField = new JTextField();
        add(nomeField);

        vidaLabel = new JLabel("Vida:");
        add(vidaLabel);
        vidaField = new JTextField();
        add(vidaField);

        ataqueLabel = new JLabel("Ataque:");
        add(ataqueLabel);
        ataqueField = new JTextField();
        add(ataqueField);

        defesaLabel = new JLabel("Defesa:");
        add(defesaLabel);
        defesaField = new JTextField();
        add(defesaField);

        // Botões
        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(this);
        add(cadastrarButton);

        apresentarButton = new JButton("Apresentar");
        apresentarButton.addActionListener(this);
        add(apresentarButton);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cadastrarButton) {
            String nome = nomeField.getText();
            int vida = Integer.parseInt(vidaField.getText());
            int ataque = Integer.parseInt(ataqueField.getText());
            int defesa = Integer.parseInt(defesaField.getText());

            Pokemonn pokemon = new Pokemonn(nome, vida, ataque, defesa);

            JOptionPane.showMessageDialog(this, "Pokémon cadastrado com sucesso!");
        } else if (e.getSource() == apresentarButton) {
            JOptionPane.showMessageDialog(this, "Vou aprender a pegar os dados do Pokémon da tela para o objeto Pokémon e vice-versa na próxima aula!");
        }
    }
}
