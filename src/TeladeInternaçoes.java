import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeladeInternaçoes extends JFrame {

    private JTable TabeladeInternações;
    private DefaultTableModel modeloTabela;
    private JButton btnInternações;

    public TeladeInternaçoes() {
        setTitle("Tela de Internações");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel titulo = new JLabel("Internações Atuais");
        titulo.setBounds(180, 10, 200, 25);
        add(titulo);

        modeloTabela = new DefaultTableModel(new Object[]{"Paciente", "Quarto"}, 0);
        tabeladeInternações = new JTable(modeloTabela);
        JScrollPane scrollPane = new JScrollPane(tabeladeInternações);
        scrollPane.setBounds(30, 50, 420, 180);
        add(scrollPane);

        btnInternações = new JButton("Nova Internação");
        btnInternações.setBounds(160, 250, 160, 30);
        add(btnInternações);

        // Dados fictícios para teste
        adicionarInternacao("João Silva", "Quarto 101");
        adicionarInternacao("Maria Oliveira", "Quarto 102");

        // Evento do botão
        btnInternações.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnInternaçõesActionPerformed(evt);
            }
        });
    }

    // Método para adicionar nova internação à tabela
    private void adicionarInternacao(String paciente, String quarto) {
        modeloTabela.addRow(new Object[]{paciente, quarto});
    }

    // Evento do botão "Nova Internação"
    private void btnInternaçõesActionPerformed(ActionEvent evt) {
        String paciente = JOptionPane.showInputDialog(this, "Nome do Paciente:");
        String quarto = JOptionPane.showInputDialog(this, "Número do Quarto:");

        if (paciente != null && quarto != null && !paciente.trim().isEmpty() && !quarto.trim().isEmpty()) {
            adicionarInternacao(paciente.trim(), "Quarto " + quarto.trim());
        } else {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos corretamente.");
        }
    }

    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeladeInternações = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INTERNAÇÕES");

        button1.setLabel("NOVAS INTERNAÇÕES");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInternações(evt);
            }
        });

        tabeladeInternações.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "PACIENTE", "QUARTO"
            }
        ));
        jScrollPane1.setViewportView(tabeladeInternações);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInternações(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInternações
       
    }//GEN-LAST:event_btnInternações

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeladeInternações;
    // End of variables declaration//GEN-END:variables
public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TeladeInternaçoes().setVisible(true));
    }
}