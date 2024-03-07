
package com.mycompany.compilador;


public class TelaIop extends javax.swing.JFrame {

    public TelaIop() {
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblNome = new javax.swing.JLabel();
        jlblNivel = new javax.swing.JLabel();
        jlblElemento = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfNivel = new javax.swing.JTextField();
        jtfElemento = new javax.swing.JTextField();
        jbtnCadastrar = new javax.swing.JButton();
        jbtnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblNome.setText("Nome");

        jlblNivel.setText("Nivel");

        jlblElemento.setText("Elemento");

        jbtnCadastrar.setText("Cadastrar");

        jbtnConsultar.setText("Consultar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnCadastrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblNome)
                        .addComponent(jlblElemento)
                        .addComponent(jlblNivel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnConsultar)
                    .addComponent(jtfNivel, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jtfNome)
                    .addComponent(jtfElemento))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNivel)
                    .addComponent(jtfNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblElemento)
                    .addComponent(jtfElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnCadastrar)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnConsultar)
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    public void setIop(Iop  i ){
        
        jtfNome.setText(i.getNome());
        jtfNivel.setText(Integer.toString(i.getNivel()));
        jtfElemento.setText(i.getElemento());
    
    }
    
    
    public int getNivel(){
   
        return Integer.parseInt(jtfNivel.getText());
    }
    
    public Iop getIop(){
        Iop i = new Iop();
        
        i.setNome(jtfNome.getText());
        i.setNivel(Integer.parseInt(jtfNivel.getText()));
        i.setElemento(jtfElemento.getText());
        return i ;
    
    }
    
    
    public void addListener(GerenciadorIop g){
    
        jbtnConsultar.addActionListener(g);
        jbtnCadastrar.addActionListener(g);
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaIop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JButton jbtnConsultar;
    private javax.swing.JLabel jlblElemento;
    private javax.swing.JLabel jlblNivel;
    private javax.swing.JLabel jlblNome;
    private javax.swing.JTextField jtfElemento;
    private javax.swing.JTextField jtfNivel;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
