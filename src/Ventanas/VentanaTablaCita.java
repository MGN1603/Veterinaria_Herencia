package Ventanas;

import Controladores.ControladorCita;
import Controladores.ControladorConsulta;
import Controladores.ControladorVeterinario;
import Modelo.Cita;
import javax.swing.JOptionPane;

public class VentanaTablaCita extends javax.swing.JDialog {

    private final ControladorCita controladorCita;
    private final ControladorVeterinario controladorveterinario;
    private final ControladorConsulta controladorConsulta;

    public VentanaTablaCita(java.awt.Frame parent, boolean modal, ControladorCita controladorCita,
            ControladorVeterinario controladorVeterinario, ControladorConsulta controladorConsulta) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.controladorveterinario = controladorVeterinario;
        this.controladorConsulta = controladorConsulta;
        this.controladorCita = controladorCita;
        mostrarTablaCita();
    }

    public void mostrarTablaCita() {
        System.out.println("Citas registradas: " + controladorCita.getCitas().size());
        tablaCitas.setModel(controladorCita.listarCitasTabla());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCitas = new javax.swing.JTable();
        btnVolverARegistro = new javax.swing.JButton();
        btnAgregarConsulta = new javax.swing.JButton();
        lblTablaCitas = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(0, 53, 84));
        panelFondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaCitas.setBackground(new java.awt.Color(10, 17, 40));
        tablaCitas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tablaCitas.setForeground(new java.awt.Color(254, 252, 251));
        tablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Hora", "Mascota", "Propietario", "estado"
            }
        ));
        jScrollPane2.setViewportView(tablaCitas);

        btnVolverARegistro.setBackground(new java.awt.Color(10, 17, 40));
        btnVolverARegistro.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnVolverARegistro.setForeground(new java.awt.Color(254, 252, 251));
        btnVolverARegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        btnVolverARegistro.setText("volver a Registro");
        btnVolverARegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverARegistroActionPerformed(evt);
            }
        });

        btnAgregarConsulta.setBackground(new java.awt.Color(10, 17, 40));
        btnAgregarConsulta.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAgregarConsulta.setForeground(new java.awt.Color(254, 252, 251));
        btnAgregarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario (4).png"))); // NOI18N
        btnAgregarConsulta.setText("Agregar Consulta");
        btnAgregarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarConsultaActionPerformed(evt);
            }
        });

        lblTablaCitas.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTablaCitas.setForeground(new java.awt.Color(254, 252, 251));
        lblTablaCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mascota.png"))); // NOI18N
        lblTablaCitas.setText("Tabla Citas");

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnAgregarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnVolverARegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTablaCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTablaCitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolverARegistro)
                    .addComponent(btnAgregarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarConsultaActionPerformed
        int filaSeleccionada = tablaCitas.getSelectedRow();
        if (filaSeleccionada >= 0) {
            Cita cita = controladorCita.getCitas().get(filaSeleccionada);
            VentanaRegistroConsulta dialog = new VentanaRegistroConsulta(null, true, cita, controladorConsulta, controladorveterinario);
            dialog.setVisible(true);
            mostrarTablaCita();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una cita primero.");
        }
    }//GEN-LAST:event_btnAgregarConsultaActionPerformed

    private void btnVolverARegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverARegistroActionPerformed
        VentanaPrincipal irVentana = new VentanaPrincipal();
        irVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverARegistroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarConsulta;
    private javax.swing.JButton btnVolverARegistro;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblTablaCitas;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaCitas;
    // End of variables declaration//GEN-END:variables
}
