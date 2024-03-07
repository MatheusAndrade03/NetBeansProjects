
package com.mycompany.lista5;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


public class VeiculosGUI extends JFrame {
    
    private JButton btnVeiculoDeCarga;
    private JButton btnVeiculoDePasseio;
    private JTable tabela;
    private DefaultTableModel tableModel;

    public VeiculosGUI() {
        setTitle("Cadastro de Veículos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        btnVeiculoDeCarga = new JButton("Veículo de Carga");
        
        btnVeiculoDeCarga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfaceVeiculoDeCarga();
            }
        });
        panel.add(btnVeiculoDeCarga);

        btnVeiculoDePasseio = new JButton("Veículo de Passeio");
        
        btnVeiculoDePasseio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfaceVeiculoDePasseio();
            }
        });
        panel.add(btnVeiculoDePasseio);

        add(panel);
    }

    
    
    
    private void abrirInterfaceVeiculoDeCarga() {
        JFrame frameVeiculoDeCarga = new JFrame();
        frameVeiculoDeCarga.setTitle("Cadastro de Veículo de Carga");
        frameVeiculoDeCarga.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameVeiculoDeCarga.setSize(1000, 500);
        frameVeiculoDeCarga.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2));

       JLabel lblPlaca = new JLabel("Placa:");
        JTextField txtPlaca = new JTextField();
        JLabel lblMarca = new JLabel("Marca:");
        JTextField txtMarca = new JTextField();
        JLabel lblModelo = new JLabel("Modelo:");
        JTextField txtModelo = new JTextField();
        JLabel lblCor = new JLabel(" Cor :");
        JTextField txtCor = new JTextField();
        JLabel lblQtdRodas= new JLabel("QtdRodas:");
        JTextField txtQtdRodas = new JTextField();
        JLabel lblVelocMax = new JLabel("VelocMax:");
        JTextField txtVelocMax = new JTextField();
        JLabel lblDataCadastro = new JLabel("DataCadastro");
        JTextField txtDataCadastro = new JTextField();
        

        panel.add(lblPlaca);
        panel.add(txtPlaca);
        panel.add(lblMarca);
        panel.add(txtMarca);
        panel.add(lblModelo);
        panel.add(txtModelo);
        panel.add(lblCor);
        panel.add(txtCor);
        panel.add(lblQtdRodas);
        panel.add(txtQtdRodas);
        panel.add(lblVelocMax);
        panel.add(txtVelocMax);
        
        panel.add(lblDataCadastro);
        panel.add(txtDataCadastro);
       

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Motor motor = new Motor(6,500);
                String placa = txtPlaca.getText();
                String marca = txtMarca.getText();
                String modelo = txtModelo.getText();
                String cor = txtCor.getText();
                Integer qtdRodas =  Integer.parseInt(txtQtdRodas.getText());
                Integer velocmax =  Integer.parseInt(txtVelocMax.getText());
                String data = txtDataCadastro.getText();

                Carga veiculo = new Carga(placa, marca, modelo,cor,qtdRodas,velocmax,motor,data);
                BancoVeic.adicionarVeiculoDeCarga(veiculo);

                JOptionPane.showMessageDialog(frameVeiculoDeCarga, "Veículo de carga cadastrado com sucesso!");

                // Limpar os campos de texto após cadastrar o veículo
               txtPlaca.setText("");
                txtMarca.setText("");
                txtModelo.setText("");
                txtCor.setText("");
                txtQtdRodas.setText("");
                txtVelocMax.setText("");
                txtDataCadastro.setText("");
            }
        });
        panel.add(btnCadastrar);
        
        
        

        JButton btnAtualizar = new JButton("Atualizar");
        btnAtualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfaceAtualizarVeiculoDeCarga();
            }
        });
        panel.add(btnAtualizar);

        frameVeiculoDeCarga.add(panel);
        frameVeiculoDeCarga.setVisible(true);
        
        
        
        JButton btnConsultar = new JButton("Consultar");
        btnConsultar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        abrirInterfaceConsultarVeiculosDeCarga();
    }
});
panel.add(btnConsultar);


        JButton btnExcluir = new JButton("Excluir");
         btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluirVeiculoDeCarga();
            }
        });
        panel.add(btnExcluir);

        
        
        
       




    }
    
    
    // Interfaces 
    
    
private void excluirVeiculoDeCarga() {
        String placa = JOptionPane.showInputDialog(null, "Digite a placa do veículo de carga a ser excluído:");
        if (placa != null && !placa.isEmpty()) {
            boolean veiculoRemovido = BancoVeic.removerVeiculoDeCarga(placa);
            if (veiculoRemovido== true) {
                JOptionPane.showMessageDialog(null, "Veículo de carga removido com sucesso!");
                
            } else {
                JOptionPane.showMessageDialog(null, "Veículo de carga não encontrado.");
            }
        }
    }     
    
    
   
    
    
    
    
    
    
    
    
    
    private void abrirInterfaceConsultarVeiculosDeCarga() {
    ArrayList<Carga> veiculosDeCarga = BancoVeic.getVeiculosDeCarga();
    InterfaceConsultarVeiculosDeCarga consultarVeiculosDeCarga = new InterfaceConsultarVeiculosDeCarga(veiculosDeCarga);
    consultarVeiculosDeCarga.setVisible(true);
}
    
    
    
    
    
    
    
    
    
    
    
    // interface do atualizar
    
    private void abrirInterfaceAtualizarVeiculoDeCarga() {
        JFrame frameAtualizarVeiculoDeCarga = new JFrame();
        frameAtualizarVeiculoDeCarga.setTitle("Atualizar Veículo de Carga");
        frameAtualizarVeiculoDeCarga.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameAtualizarVeiculoDeCarga.setSize(1000, 500);
        frameAtualizarVeiculoDeCarga.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2));

       JLabel lblPlaca = new JLabel("Placa:");
        JTextField txtPlaca = new JTextField();
        JLabel lblMarca = new JLabel("Marca:");
        JTextField txtMarca = new JTextField();
        JLabel lblModelo = new JLabel("Modelo:");
        JTextField txtModelo = new JTextField();
        JLabel lblCor = new JLabel(" Cor :");
        JTextField txtCor = new JTextField();
        JLabel lblQtdRodas= new JLabel("QtdRodas:");
        JTextField txtQtdRodas = new JTextField();
        JLabel lblVelocMax = new JLabel("VelocMax:");
        JTextField txtVelocMax = new JTextField();
        JLabel lblDataCadastro = new JLabel("DataCadastro");
        JTextField txtDataCadastro = new JTextField();
        
        panel.add(lblPlaca);
        panel.add(txtPlaca);
        panel.add(lblMarca);
        panel.add(txtMarca);
        panel.add(lblModelo);
        panel.add(txtModelo);
        panel.add(lblCor);
        panel.add(txtCor);
        panel.add(lblQtdRodas);
        panel.add(txtQtdRodas);
        panel.add(lblVelocMax);
        panel.add(txtVelocMax);
        
        panel.add(lblDataCadastro);
        panel.add(txtDataCadastro);
       

        JButton btnConcluir = new JButton("Concluir");
        btnConcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Motor motor = new Motor(6,500);
                String placa = txtPlaca.getText();
                String marca = txtMarca.getText();
                String modelo = txtModelo.getText();
                String cor = txtCor.getText();
                Integer qtdRodas =  Integer.parseInt(txtQtdRodas.getText());
                Integer velocmax =  Integer.parseInt(txtVelocMax.getText());
                String data = txtDataCadastro.getText();
                 Carga veiculo = new Carga(placa, marca, modelo,cor,qtdRodas,velocmax,motor,data);
                BancoVeic.atualizarVeiculoDeCarga(veiculo);

                JOptionPane.showMessageDialog(frameAtualizarVeiculoDeCarga, "Veículo de carga atualizado com sucesso!");

                // Limpar os campos de texto após atualizar o veículo
                txtPlaca.setText("");
                txtMarca.setText("");
                txtModelo.setText("");
                txtCor.setText("");
                txtQtdRodas.setText("");
                txtVelocMax.setText("");
                txtDataCadastro.setText("");
            }
        });
        panel.add(btnConcluir);

        frameAtualizarVeiculoDeCarga.add(panel);
        frameAtualizarVeiculoDeCarga.setVisible(true);
        
        
        
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void abrirInterfaceVeiculoDePasseio() {
        JFrame frameVeiculoDePasseio = new JFrame();
        frameVeiculoDePasseio.setTitle("Cadastro de Veículo de Passeio");
        frameVeiculoDePasseio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameVeiculoDePasseio.setSize(1000, 500);
        frameVeiculoDePasseio.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2));

        JLabel lblPlaca = new JLabel("Placa:");
        JTextField txtPlaca = new JTextField();
        JLabel lblMarca = new JLabel("Marca:");
        JTextField txtMarca = new JTextField();
        JLabel lblModelo = new JLabel("Modelo:");
        JTextField txtModelo = new JTextField();
        JLabel lblCor = new JLabel(" Cor :");
        JTextField txtCor = new JTextField();
        JLabel lblQtdRodas= new JLabel("QtdRodas:");
        JTextField txtQtdRodas = new JTextField();
        JLabel lblVelocMax = new JLabel("VelocMax:");
        JTextField txtVelocMax = new JTextField();
        JLabel lblDataCadastro = new JLabel("DataCadastro:");
        JTextField txtDataCadastro = new JTextField();
        
        panel.add(lblPlaca);
        panel.add(txtPlaca);
        panel.add(lblMarca);
        panel.add(txtMarca);
        panel.add(lblModelo);
        panel.add(txtModelo);
        panel.add(lblCor);
        panel.add(txtCor);
        panel.add(lblQtdRodas);
        panel.add(txtQtdRodas);
        panel.add(lblVelocMax);
        panel.add(txtVelocMax);
        
        panel.add(lblDataCadastro);
        panel.add(txtDataCadastro);
       


        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Motor motor = new Motor(4,200);
                String placa = txtPlaca.getText();
                String marca = txtMarca.getText();
                String modelo = txtModelo.getText();
                String cor = txtCor.getText();
                Integer qtdRodas =  Integer.parseInt(txtQtdRodas.getText());
                Integer velocmax =  Integer.parseInt(txtVelocMax.getText());
                String data = txtDataCadastro.getText();
                
                
                Passeio veiculo = new Passeio(placa, marca, modelo,cor,qtdRodas,velocmax,motor,data );
                BancoVeic.adicionarVeiculoDePasseio(veiculo);

                JOptionPane.showMessageDialog(frameVeiculoDePasseio, "Veículo de passeio cadastrado com sucesso!");

                // Limpar os campos de texto após cadastrar o veículo
                txtPlaca.setText("");
                txtMarca.setText("");
                txtModelo.setText("");
                txtCor.setText("");
                txtQtdRodas.setText("");
                txtVelocMax.setText("");
                txtDataCadastro.setText("");
                
            }
        });
        panel.add(btnCadastrar);

        JButton btnAtualizar = new JButton("Atualizar");
        btnAtualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               abrirInterfaceAtualizarVeiculoDePasseio();
            }
        });
        panel.add(btnAtualizar);

        frameVeiculoDePasseio.add(panel);
        frameVeiculoDePasseio.setVisible(true);
        
        
        
        JButton btnConsultar = new JButton("Consultar");
btnConsultar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        abrirInterfaceConsultarVeiculosPasseio();
    }
});
panel.add(btnConsultar);




        JButton btnExcluir = new JButton("Excluir");
         btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluirVeiculoDePasseio();
            }
        });
        panel.add(btnExcluir);
        
    }
    
    

    
    private void excluirVeiculoDePasseio() {
        String placa = JOptionPane.showInputDialog(null, "Digite a placa do veículo de carga a ser excluído:");
        if (placa != null && !placa.isEmpty()) {
            boolean veiculoRemovido = BancoVeic.removerVeiculoDePasseio(placa);
            if (veiculoRemovido== true) {
                JOptionPane.showMessageDialog(null, "Veículo de carga removido com sucesso!");
                
            } else {
                JOptionPane.showMessageDialog(null, "Veículo de carga não encontrado.");
            }
        }
    }     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void abrirInterfaceConsultarVeiculosPasseio() {
    ArrayList<Passeio> veiculosDePasseio = BancoVeic.getVeiculosDePasseio();
    InterfaceConsultarVeiculosDePasseio consultarVeiculosDePasseio = new InterfaceConsultarVeiculosDePasseio(veiculosDePasseio);
    consultarVeiculosDePasseio.setVisible(true);
}
    
    
    
    
    
    
    
    
    
    
    
    
    
        private void abrirInterfaceAtualizarVeiculoDePasseio() {
        JFrame frameAtualizarVeiculoDePasseio = new JFrame();
        frameAtualizarVeiculoDePasseio.setTitle("Atualizar Veículo de Passeio");
        frameAtualizarVeiculoDePasseio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameAtualizarVeiculoDePasseio.setSize(300, 200);
        frameAtualizarVeiculoDePasseio.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

         JLabel lblPlaca = new JLabel("Placa:");
        JTextField txtPlaca = new JTextField();
        JLabel lblMarca = new JLabel("Marca:");
        JTextField txtMarca = new JTextField();
        JLabel lblModelo = new JLabel("Modelo:");
        JTextField txtModelo = new JTextField();
        JLabel lblCor = new JLabel(" Cor :");
        JTextField txtCor = new JTextField();
        JLabel lblQtdRodas= new JLabel("QtdRodas:");
        JTextField txtQtdRodas = new JTextField();
        JLabel lblVelocMax = new JLabel("VelocMax:");
        JTextField txtVelocMax = new JTextField();
        JLabel lblDataCadastro = new JLabel("DataCadastro:");
        JTextField txtDataCadastro = new JTextField();
        
        
         panel.add(lblPlaca);
        panel.add(txtPlaca);
        panel.add(lblMarca);
        panel.add(txtMarca);
        panel.add(lblModelo);
        panel.add(txtModelo);
        panel.add(lblCor);
        panel.add(txtCor);
        panel.add(lblQtdRodas);
        panel.add(txtQtdRodas);
        panel.add(lblVelocMax);
        panel.add(txtVelocMax);
        
        panel.add(lblDataCadastro);
        panel.add(txtDataCadastro);
       

        JButton btnConcluir = new JButton("Concluir");
        btnConcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Motor motor = new Motor(4,200);
                String placa = txtPlaca.getText();
                String marca = txtMarca.getText();
                String modelo = txtModelo.getText();
                String cor = txtCor.getText();
                Integer qtdRodas =  Integer.parseInt(txtQtdRodas.getText());
                Integer velocmax =  Integer.parseInt(txtVelocMax.getText());
                String data = txtDataCadastro.getText();


                 Passeio veiculo = new Passeio(placa, marca, modelo,cor,qtdRodas,velocmax,motor,data );
                BancoVeic.atualizarVeiculoDePasseio(veiculo);

                JOptionPane.showMessageDialog(frameAtualizarVeiculoDePasseio, "Veículo de passeio atualizado com sucesso!");

                // Limpar os campos de texto após atualizar o veículo
                txtPlaca.setText("");
                txtMarca.setText("");
                txtModelo.setText("");
            }
        });
        panel.add(btnConcluir);

        frameAtualizarVeiculoDePasseio.add(panel);
        frameAtualizarVeiculoDePasseio.setVisible(true);
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
