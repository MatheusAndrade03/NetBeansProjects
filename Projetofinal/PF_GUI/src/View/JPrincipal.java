package View;

import Classes_OBJ.BD;
import Classes_OBJ.Atendente;
import Classes_OBJ.Medico;
import Classes_OBJ.Paciente;
import Classes_OBJ.Users;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPrincipal extends javax.swing.JFrame {
    private BD banco_dados;
    private boolean logado_paciente;
    private boolean logado_atendente;

    public JPrincipal() {
        banco_dados = new BD();
        logado_atendente = false;
        logado_paciente = false;
        initComponents();
        ListarMedicos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JSelection_Principal = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        JPPaciente = new javax.swing.JPanel();
        JSelection_Paciente = new javax.swing.JTabbedPane();
        PLogin = new javax.swing.JPanel();
        TxtLCPF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        BtnCadastro = new javax.swing.JButton();
        TxtLSenha = new javax.swing.JPasswordField();
        jLabel26 = new javax.swing.JLabel();
        PCadastro = new javax.swing.JPanel();
        TxtCCPF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Btn_Cadastro = new javax.swing.JButton();
        Btrn_Limpar = new javax.swing.JButton();
        Btn_Login = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TxtCNome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtCEndenreço = new javax.swing.JTextField();
        TxtCSenha = new javax.swing.JPasswordField();
        jLabel29 = new javax.swing.JLabel();
        JPAtendente = new javax.swing.JPanel();
        JSelection_Atendente = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TxtLogin_atendente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtSenhaAtendente = new javax.swing.JPasswordField();
        Btn_Login_atendente = new javax.swing.JButton();
        Btn_Limpar_Login = new javax.swing.JButton();
        Btrn_Troca_Cadastro = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        TxtLoginAtendente_Cadastro = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TxtAtendenteSenha_Cadastro = new javax.swing.JPasswordField();
        Btn_CadastrarAtendente = new javax.swing.JButton();
        Btn_Limpar_Atendente = new javax.swing.JButton();
        Btn_Troca_Login = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        JVerificaDispon = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Disp = new javax.swing.JTable();
        JAgendamen = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_nome_agendar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_especialiazacao_agendar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_CRM_agendar = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_horario_agendar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        JAdmin = new javax.swing.JPanel();
        TxtNome = new javax.swing.JTextField();
        TxtCRM = new javax.swing.JTextField();
        TxtEspecializacao = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btn_CadastrarMedico = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Btn_attLista = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Lista_Users = new javax.swing.JScrollPane();
        Tbl_Users = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Agenda Exame");

        JSelection_Principal.setToolTipText("bem vindo");
        JSelection_Principal.setName(""); // NOI18N
        JSelection_Principal.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JSelection_PrincipalAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        JSelection_Principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JSelection_PrincipalMouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel23.setText("BEM VINDO(A) AO SISTEMA");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel24.setText("AGENDA EXAME!");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/RECETIONISTDETAILS.png"))); // NOI18N

        jLabel25.setText("Clique nas abas para prosseguir seu agendamento!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        JSelection_Principal.addTab("Boas Vindas", jPanel2);

        jLabel1.setText("CPF*:");

        jLabel2.setText("Senha*:");

        jLabel3.setText("Login Paciente");

        BtnLogin.setText("Login");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        BtnCadastro.setText("Cadastro");
        BtnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastroActionPerformed(evt);
            }
        });

        TxtLSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLSenhaActionPerformed(evt);
            }
        });

        jLabel26.setText("Não possui cadastro? Clique aqui abaixo!");

        javax.swing.GroupLayout PLoginLayout = new javax.swing.GroupLayout(PLogin);
        PLogin.setLayout(PLoginLayout);
        PLoginLayout.setHorizontalGroup(
            PLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PLoginLayout.createSequentialGroup()
                .addGroup(PLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PLoginLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(PLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtLCPF)
                            .addComponent(TxtLSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)))
                    .addGroup(PLoginLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PLoginLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(BtnCadastro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(BtnLimpar)
                .addGap(36, 36, 36))
            .addGroup(PLoginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnLogin)
                .addGap(105, 105, 105))
        );
        PLoginLayout.setVerticalGroup(
            PLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PLoginLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(PLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtLCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(PLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtLSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnLogin)
                .addGap(50, 50, 50)
                .addComponent(jLabel26)
                .addGroup(PLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(BtnLimpar)
                        .addGap(23, 23, 23))))
        );

        JSelection_Paciente.addTab("Login", PLogin);

        TxtCCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCCPFActionPerformed(evt);
            }
        });

        jLabel7.setText("CPF*:");

        jLabel8.setText("Senha*:");

        jLabel9.setText("Cadastro Paciente");

        Btn_Cadastro.setText("Cadastrar");
        Btn_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CadastroActionPerformed(evt);
            }
        });

        Btrn_Limpar.setText("Limpar");
        Btrn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btrn_LimparActionPerformed(evt);
            }
        });

        Btn_Login.setText("Login");
        Btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LoginActionPerformed(evt);
            }
        });

        jLabel10.setText("Nome*:");

        jLabel11.setText("Endereço*:");

        jLabel29.setText("Já possui cadastro? Faça o login clicando aqui abaixo!");

        javax.swing.GroupLayout PCadastroLayout = new javax.swing.GroupLayout(PCadastro);
        PCadastro.setLayout(PCadastroLayout);
        PCadastroLayout.setHorizontalGroup(
            PCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCadastroLayout.createSequentialGroup()
                .addGroup(PCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCadastroLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PCadastroLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(PCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCNome, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PCadastroLayout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtCCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PCadastroLayout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtCSenha)))
                            .addGroup(PCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtCEndenreço, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PCadastroLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PCadastroLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(Btn_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btrn_Limpar)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Cadastro)
                .addGap(84, 84, 84))
        );
        PCadastroLayout.setVerticalGroup(
            PCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCadastroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addGap(8, 8, 8)
                .addGroup(PCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtCCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtCSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxtCNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtCEndenreço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(Btn_Cadastro)
                .addGap(48, 48, 48)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Login)
                    .addComponent(Btrn_Limpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JSelection_Paciente.addTab("Cadastro", PCadastro);

        javax.swing.GroupLayout JPPacienteLayout = new javax.swing.GroupLayout(JPPaciente);
        JPPaciente.setLayout(JPPacienteLayout);
        JPPacienteLayout.setHorizontalGroup(
            JPPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JSelection_Paciente)
        );
        JPPacienteLayout.setVerticalGroup(
            JPPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JSelection_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 338, Short.MAX_VALUE)
        );

        JSelection_Principal.addTab("Paciente", JPPaciente);

        jLabel4.setText("Login Atendente");

        jLabel5.setText("Login*:");

        jLabel6.setText("Senha*:");

        Btn_Login_atendente.setText("Login");
        Btn_Login_atendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Login_atendenteActionPerformed(evt);
            }
        });

        Btn_Limpar_Login.setText("Limpar");
        Btn_Limpar_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Limpar_LoginActionPerformed(evt);
            }
        });

        Btrn_Troca_Cadastro.setText("Cadastrar");
        Btrn_Troca_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btrn_Troca_CadastroActionPerformed(evt);
            }
        });

        jLabel27.setText("Não possui cadastro? Clique aqui abaixo!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtSenhaAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtLogin_atendente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Btn_Login_atendente)
                        .addGap(111, 111, 111))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(Btrn_Troca_Cadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Limpar_Login)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtLogin_atendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtSenhaAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(Btn_Login_atendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btrn_Troca_Cadastro)
                    .addComponent(Btn_Limpar_Login))
                .addGap(23, 23, 23))
        );

        JSelection_Atendente.addTab("Login", jPanel3);

        jLabel15.setText("Cadastro Atendente");

        jLabel16.setText("Login*:");

        jLabel17.setText("Senha*:");

        Btn_CadastrarAtendente.setText("Cadastrar");
        Btn_CadastrarAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CadastrarAtendenteActionPerformed(evt);
            }
        });

        Btn_Limpar_Atendente.setText("Limpar");
        Btn_Limpar_Atendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Limpar_AtendenteActionPerformed(evt);
            }
        });

        Btn_Troca_Login.setText("Login");
        Btn_Troca_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Troca_LoginActionPerformed(evt);
            }
        });

        jLabel28.setText("Já possui cadastro? Faça o login clicando aqui abaixo!");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addComponent(TxtAtendenteSenha_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(Btn_CadastrarAtendente)
                        .addGap(96, 96, 96))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(Btn_Troca_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Limpar_Atendente)
                .addGap(20, 20, 20))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(173, Short.MAX_VALUE)
                    .addComponent(TxtLoginAtendente_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(195, 195, 195)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel15)
                .addGap(45, 45, 45)
                .addComponent(jLabel16)
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TxtAtendenteSenha_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(Btn_CadastrarAtendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Troca_Login)
                    .addComponent(Btn_Limpar_Atendente))
                .addGap(23, 23, 23))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(TxtLoginAtendente_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(199, Short.MAX_VALUE)))
        );

        JSelection_Atendente.addTab("Cadastro", jPanel5);

        javax.swing.GroupLayout JPAtendenteLayout = new javax.swing.GroupLayout(JPAtendente);
        JPAtendente.setLayout(JPAtendenteLayout);
        JPAtendenteLayout.setHorizontalGroup(
            JPAtendenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAtendenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JSelection_Atendente)
                .addContainerGap())
        );
        JPAtendenteLayout.setVerticalGroup(
            JPAtendenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JSelection_Atendente)
        );

        JSelection_Principal.addTab("Atendente", JPAtendente);

        Table_Disp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Especilidade", "CRM"
            }
        ));
        Table_Disp.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(Table_Disp);
        Table_Disp.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jScrollPane3.setViewportView(jScrollPane2);

        javax.swing.GroupLayout JVerificaDisponLayout = new javax.swing.GroupLayout(JVerificaDispon);
        JVerificaDispon.setLayout(JVerificaDisponLayout);
        JVerificaDisponLayout.setHorizontalGroup(
            JVerificaDisponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JVerificaDisponLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        JVerificaDisponLayout.setVerticalGroup(
            JVerificaDisponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JVerificaDisponLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Médicos Cadastrados", JVerificaDispon);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Nome médico*:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Especialização*:");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("CRM*:");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Horário | Data*:");

        jButton1.setText("Agendar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JAgendamenLayout = new javax.swing.GroupLayout(JAgendamen);
        JAgendamen.setLayout(JAgendamenLayout);
        JAgendamenLayout.setHorizontalGroup(
            JAgendamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JAgendamenLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(JAgendamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JAgendamenLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nome_agendar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JAgendamenLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_CRM_agendar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JAgendamenLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_especialiazacao_agendar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JAgendamenLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_horario_agendar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JAgendamenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(58, 58, 58))
        );
        JAgendamenLayout.setVerticalGroup(
            JAgendamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JAgendamenLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(JAgendamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_nome_agendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JAgendamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_especialiazacao_agendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JAgendamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_CRM_agendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JAgendamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt_horario_agendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agendamento", JAgendamen);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Nome*:");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("CRM*:");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Especialização*:");

        btn_CadastrarMedico.setText("Cadastrar");
        btn_CadastrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarMedicoActionPerformed(evt);
            }
        });

        jButton3.setText("Procurar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Remover");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Btn_attLista.setText("Atualizar Tabelas");
        Btn_attLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_attListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JAdminLayout = new javax.swing.GroupLayout(JAdmin);
        JAdmin.setLayout(JAdminLayout);
        JAdminLayout.setHorizontalGroup(
            JAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JAdminLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(JAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JAdminLayout.createSequentialGroup()
                        .addGroup(JAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JAdminLayout.createSequentialGroup()
                                .addComponent(TxtEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JAdminLayout.createSequentialGroup()
                                .addComponent(Btn_attLista)
                                .addGap(18, 18, 18)))
                        .addGroup(JAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(btn_CadastrarMedico)
                            .addComponent(jButton4)))
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        JAdminLayout.setVerticalGroup(
            JAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JAdminLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(JAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(32, 32, 32)
                .addGroup(JAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(34, 34, 34)
                .addGroup(JAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CadastrarMedico)
                    .addComponent(TxtEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(30, 30, 30)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(JAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(Btn_attLista))
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Cadastrar Médicos", JAdmin);

        Tbl_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Identificador", "Senha"
            }
        ));
        Lista_Users.setViewportView(Tbl_Users);

        jButton2.setText("Revelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(Lista_Users, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Lista_Users, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Usuários Cadastrados", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        JSelection_Principal.addTab("Agendamentos", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JSelection_Principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JSelection_Principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtLSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLSenhaActionPerformed

    private void BtnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastroActionPerformed
        this.JSelection_Paciente.setSelectedIndex(1);
    }//GEN-LAST:event_BtnCadastroActionPerformed

    private void Btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LoginActionPerformed
        this.JSelection_Paciente.setSelectedIndex(0);
    }//GEN-LAST:event_Btn_LoginActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        //login e senha
        int aux = 0;
        if(TxtLCPF.getText().equals("")){
            aux++;
        }
        if(TxtLSenha.getText().equals("")){
            aux++;
        }
        if(aux == 0){
            Paciente temp = new Paciente(TxtLCPF.getText(),TxtLSenha.getText());
            if(!logado_paciente && !logado_atendente){
                logado_paciente = banco_dados.loginPaciente(temp);
                if(logado_paciente){
                    System.out.println("Logado!");
                }
            }
            }else{
        JOptionPane.showMessageDialog(null, "Usuário já está logado!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);}
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void Btn_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CadastroActionPerformed
        if(TxtCNome.getText().equals("")||TxtCSenha.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
        }else{    
            Paciente temp = new Paciente(TxtCNome.getText(),TxtCCPF.getText(),TxtCSenha.getText(),"SLA",TxtCEndenreço.getText(),true);
            if(false == banco_dados.verificaPaciente(temp.getIndent())){
                banco_dados.cadastrarPaciente(temp);
            }
        }
    }//GEN-LAST:event_Btn_CadastroActionPerformed

    private void Btrn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btrn_LimparActionPerformed
        TxtCCPF.setText("");
        TxtCEndenreço.setText("");
        TxtCNome.setText("");
        TxtCSenha.setText("");
    }//GEN-LAST:event_Btrn_LimparActionPerformed

    private void Btn_Login_atendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Login_atendenteActionPerformed
       //LOGIN E SENHA ATENDENTE
        int aux = 0;
        if(TxtLogin_atendente.getText().equals("")){
            aux++;
        }
        if(TxtSenhaAtendente.equals("")){
            aux++;
        }
        if(aux == 0){
            Atendente temp = new Atendente(TxtLogin_atendente.getText(),TxtSenhaAtendente.getText());
            if(!logado_paciente && !logado_atendente){
                logado_atendente = banco_dados.loginAtendente(temp);
                if(logado_atendente){
                System.out.println("Logado!");
                }
            }
        }else{
        JOptionPane.showMessageDialog(null, "Usuário já está logado!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);}
        
    }//GEN-LAST:event_Btn_Login_atendenteActionPerformed

    private void Btn_CadastrarAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CadastrarAtendenteActionPerformed
        if(TxtLoginAtendente_Cadastro.getText().equals("")||TxtAtendenteSenha_Cadastro.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campos Obrigatórios não preenchidos!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
        Atendente temp = new Atendente(TxtLoginAtendente_Cadastro.getText(),TxtAtendenteSenha_Cadastro.getText());
            if(false == banco_dados.verificaAtendente(temp.getIndent())){
                banco_dados.cadastrarAtendente(temp);
            }
        }
    }//GEN-LAST:event_Btn_CadastrarAtendenteActionPerformed

    private void Btrn_Troca_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btrn_Troca_CadastroActionPerformed
       this.JSelection_Atendente.setSelectedIndex(1);
    }//GEN-LAST:event_Btrn_Troca_CadastroActionPerformed

    private void Btn_Troca_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Troca_LoginActionPerformed
         this.JSelection_Atendente.setSelectedIndex(0);
    }//GEN-LAST:event_Btn_Troca_LoginActionPerformed

    private void JSelection_PrincipalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JSelection_PrincipalAncestorAdded
    }//GEN-LAST:event_JSelection_PrincipalAncestorAdded

    private void JSelection_PrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JSelection_PrincipalMouseClicked
     
    }//GEN-LAST:event_JSelection_PrincipalMouseClicked

    private void Btn_attListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_attListaActionPerformed
        if(logado_atendente){
            ListarMedicos();
        }else{
            JOptionPane.showMessageDialog(null, "Somente ATENDENTES podem agendar consulta!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_Btn_attListaActionPerformed

    private void btn_CadastrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarMedicoActionPerformed
        if(logado_atendente){
            if(TxtCRM.getText().equals("")||TxtNome.getText().equals("")||TxtEspecializacao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campos Obrigatórios não preenchidos!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
            }else{
                Medico temp = new Medico(TxtCRM.getText(),TxtNome.getText(),TxtEspecializacao.getText());
                if(false == banco_dados.verificaMedico(temp.getCRM())){
                    banco_dados.cadastrarMedico(temp);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Somente ATENDENTES podem cadastrar médicos!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_CadastrarMedicoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if(logado_atendente){
            Medico med = banco_dados.consultarMedico(TxtCRM.getText());
                if(!med.getNome().equals("Não especificado")){
                TxtCRM.setText(med.getCRM());
                TxtNome.setText(med.getNome());
                TxtEspecializacao.setText(med.getEspecialidade());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Somente ATENDENTES podem agendar consulta!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(logado_atendente){
            banco_dados.agendarMedico(new Medico(txt_CRM_agendar.getText(),txt_nome_agendar.getText(),txt_especialiazacao_agendar.getText()),txt_horario_agendar.getText());
        }else{
            JOptionPane.showMessageDialog(null, "Somente ATENDENTES podem agendar consulta!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        TxtLCPF.setText("");
        TxtLSenha.setText("");
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void TxtCCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCCPFActionPerformed

    private void Btn_Limpar_AtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Limpar_AtendenteActionPerformed
       TxtLoginAtendente_Cadastro.setText("");
       TxtAtendenteSenha_Cadastro.setText("");
    }//GEN-LAST:event_Btn_Limpar_AtendenteActionPerformed

    private void Btn_Limpar_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Limpar_LoginActionPerformed
        TxtLogin_atendente.setText("");
        TxtSenhaAtendente.setText("");
    }//GEN-LAST:event_Btn_Limpar_LoginActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(logado_atendente){
            if(TxtNome.getText().equals("")||TxtCRM.getText().equals("")||TxtEspecializacao.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
            }else{
                banco_dados.removerMedico(TxtCRM.getText());
            }
        }else{
        if(TxtNome.getText().equals("")||TxtCRM.getText().equals("")||TxtEspecializacao.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Somente o ATENDENTE pode remover!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(logado_atendente){
           ListarUsers();
       }else{
           JOptionPane.showMessageDialog(null, "Somente os ATENDENTES podem ver a lista de cadastrados!!", "Notificação",
                    JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public void ListarMedicos(){
            DefaultTableModel model = (DefaultTableModel) Table_Disp.getModel();
            model.setNumRows(0);
           
            ArrayList<Medico> md_temp = banco_dados.ListaMedicos();
            for (int i = 0; i < md_temp.size(); i++) {
                model.addRow(new Object[]{
                    
                    md_temp.get(i).getNome(),
                    md_temp.get(i).getEspecialidade(),
                    md_temp.get(i).getCRM()
                    
                });
                
            }
    }
    
    public void ListarUsers(){
            DefaultTableModel model = (DefaultTableModel) Tbl_Users.getModel();
            model.setNumRows(0);
           
            ArrayList<Users> temp = banco_dados.ListaUsers();
            for (int i = 0; i < temp.size(); i++) {
                model.addRow(new Object[]{
                    temp.get(i).getIndent(),
                    temp.get(i).getSenha(),
                    
                });
            }
            
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastro;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnLogin;
    private javax.swing.JButton Btn_CadastrarAtendente;
    private javax.swing.JButton Btn_Cadastro;
    private javax.swing.JButton Btn_Limpar_Atendente;
    private javax.swing.JButton Btn_Limpar_Login;
    private javax.swing.JButton Btn_Login;
    private javax.swing.JButton Btn_Login_atendente;
    private javax.swing.JButton Btn_Troca_Login;
    private javax.swing.JButton Btn_attLista;
    private javax.swing.JButton Btrn_Limpar;
    private javax.swing.JButton Btrn_Troca_Cadastro;
    private javax.swing.JPanel JAdmin;
    private javax.swing.JPanel JAgendamen;
    private javax.swing.JPanel JPAtendente;
    private javax.swing.JPanel JPPaciente;
    private javax.swing.JTabbedPane JSelection_Atendente;
    private javax.swing.JTabbedPane JSelection_Paciente;
    private javax.swing.JTabbedPane JSelection_Principal;
    private javax.swing.JPanel JVerificaDispon;
    private javax.swing.JScrollPane Lista_Users;
    private javax.swing.JPanel PCadastro;
    private javax.swing.JPanel PLogin;
    private javax.swing.JTable Table_Disp;
    private javax.swing.JTable Tbl_Users;
    private javax.swing.JPasswordField TxtAtendenteSenha_Cadastro;
    private javax.swing.JTextField TxtCCPF;
    private javax.swing.JTextField TxtCEndenreço;
    private javax.swing.JTextField TxtCNome;
    private javax.swing.JTextField TxtCRM;
    private javax.swing.JPasswordField TxtCSenha;
    private javax.swing.JTextField TxtEspecializacao;
    private javax.swing.JTextField TxtLCPF;
    private javax.swing.JPasswordField TxtLSenha;
    private javax.swing.JTextField TxtLoginAtendente_Cadastro;
    private javax.swing.JTextField TxtLogin_atendente;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JPasswordField TxtSenhaAtendente;
    private javax.swing.JButton btn_CadastrarMedico;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txt_CRM_agendar;
    private javax.swing.JTextField txt_especialiazacao_agendar;
    private javax.swing.JTextField txt_horario_agendar;
    private javax.swing.JTextField txt_nome_agendar;
    // End of variables declaration//GEN-END:variables

}
