import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TeladeRelatorios extends JFrame {

    private JLabel lblPeriodo, lblPsicologo, lblTipoConsulta;
    private JTextField txtPeriodo;
    private JComboBox<String> comboPsicologo, comboTipoConsulta;
    private JButton btnGerarRelatorio;

    public TeladeRelatorios() {
        setTitle("Relatórios");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        lblPeriodo = new JLabel("Período:");
        txtPeriodo = new JTextField();

        lblPsicologo = new JLabel("Psicólogo:");
        comboPsicologo = new JComboBox<>(new String[] {
            "Selecione", "Dra. Ana Costa", "Dr. João Silva", "Dra. Paula Mendes"
        });

        lblTipoConsulta = new JLabel("Tipo de Consulta:");
        comboTipoConsulta = new JComboBox<>(new String[] {
            "Selecione", "Psicoterapia", "Avaliação", "Retorno", "Emergencial"
        });

        btnGerarRelatorio = new JButton("Gerar Relatório");

        btnGerarRelatorio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String periodo = txtPeriodo.getText();
                String psicologo = (String) comboPsicologo.getSelectedItem();
                String tipoConsulta = (String) comboTipoConsulta.getSelectedItem();

                JOptionPane.showMessageDialog(null,
                    "Relatório gerado para:\n" +
                    "Período: " + periodo + "\n" +
                    "Psicólogo: " + psicologo + "\n" +
                    "Tipo de Consulta: " + tipoConsulta);
            }
        });

        add(lblPeriodo);
        add(txtPeriodo);
        add(lblPsicologo);
        add(comboPsicologo);
        add(lblTipoConsulta);
        add(comboTipoConsulta);
        add(new JLabel()); // espaço vazio
        add(btnGerarRelatorio);

        setVisible(true);
    }

    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        button1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("RELATÓRIOS");

        jLabel2.setText("PERÍODOS:");

        jLabel3.setText("PSICOLÓGOS:");

        jLabel4.setText("TIPO DE CONSULTA:");

        button1.setLabel("GERAR RELATORIO");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorios(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRelatorios(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorios
      
    }//GEN-LAST:event_btnRelatorios

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
public static void main(String[] args) {
        new TeladeRelatorios();
    }
}
