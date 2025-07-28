package Ventanas;

import Controladores.ControladorCita;
import Controladores.ControladorVeterinario;
import DTOs.CitaDTO;
import DTOs.MascotaDTO;
import DTOs.VeterinarioDTO;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class agendarCita extends javax.swing.JDialog {

    private JComboBox<VeterinarioDTO> comboBoxVeterinarios;
    private final ControladorVeterinario controladorVeterinario;
    private final ControladorCita controladorCita;
    private final MascotaDTO mascota;

    public agendarCita(java.awt.Frame parent, boolean modal, ControladorCita controladorCita,
            ControladorVeterinario controladorVeterinario, MascotaDTO mascota) {
        super(parent, modal);
        initComponents();
       // int idm = mascota.getIdMascota();
        setLocationRelativeTo(null);
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/veterinario (5).png"));
        setIconImage(icono.getImage());
        setTitle("Cita para la Mascota: " + mascota.getNombre());
        this.controladorCita = controladorCita;
        this.controladorVeterinario = controladorVeterinario;
        this.mascota = mascota;
        crearComboBoxVeterinarios();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        lblHoraCita = new javax.swing.JLabel();
        lblMotivo = new javax.swing.JLabel();
        lblVeterinario = new javax.swing.JLabel();
        txtHoraCita = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMotivo = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblFechaCita1 = new javax.swing.JLabel();
        txtFechaCita1 = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelTitulo.setBackground(new java.awt.Color(10, 17, 40));
        panelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(254, 252, 251));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portapapeles.png"))); // NOI18N
        lblTitulo.setText("Registrar Cita");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitulo)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelDatos.setBackground(new java.awt.Color(0, 53, 84));
        panelDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHoraCita.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblHoraCita.setForeground(new java.awt.Color(254, 252, 251));
        lblHoraCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoraCita.setText("Hora Cita:");
        panelDatos.add(lblHoraCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, -1));

        lblMotivo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblMotivo.setForeground(new java.awt.Color(254, 252, 251));
        lblMotivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMotivo.setText("Motivo");
        panelDatos.add(lblMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 90, -1));

        lblVeterinario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblVeterinario.setForeground(new java.awt.Color(254, 252, 251));
        lblVeterinario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVeterinario.setText("Veterinario:");
        panelDatos.add(lblVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 90, -1));
        panelDatos.add(txtHoraCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 191, -1));

        txtAreaMotivo.setColumns(20);
        txtAreaMotivo.setRows(5);
        jScrollPane1.setViewportView(txtAreaMotivo);

        panelDatos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 248, -1));

        btnGuardar.setBackground(new java.awt.Color(10, 17, 40));
        btnGuardar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(254, 252, 251));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario (3).png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelDatos.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 200, -1));

        btnCancelar.setBackground(new java.awt.Color(10, 17, 40));
        btnCancelar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(254, 252, 251));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacuna (2).png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelDatos.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 200, -1));

        lblFechaCita1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblFechaCita1.setForeground(new java.awt.Color(254, 252, 251));
        lblFechaCita1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaCita1.setText("Fecha Cita:");
        panelDatos.add(lblFechaCita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 90, -1));
        panelDatos.add(txtFechaCita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 191, -1));
        panelDatos.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            LocalDate fecha = LocalDate.parse(txtFechaCita1.getText());
            LocalTime hora = LocalTime.parse(txtHoraCita.getText());
            LocalDateTime fechaHora = LocalDateTime.of(fecha, hora);
            String descripcion = txtAreaMotivo.getText();

            VeterinarioDTO veterinario = (VeterinarioDTO) comboBoxVeterinarios.getSelectedItem();
            int idCita = controladorCita.generarIdCita();

            CitaDTO citaDTO = new CitaDTO(idCita, fecha, descripcion, fechaHora,false, veterinario.getDocumento(), mascota.getIdMascota(), -1);
            

            if (controladorCita.registrarCita(citaDTO)) {
                JOptionPane.showMessageDialog(this, "Cita registrada correctamente.");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar la cita.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void crearComboBoxVeterinarios() {
        comboBoxVeterinarios = new javax.swing.JComboBox<>();
        DefaultComboBoxModel<VeterinarioDTO> modelo = new DefaultComboBoxModel<>();
        comboBoxVeterinarios.setModel(modelo);

        for (VeterinarioDTO vet : controladorVeterinario.obtenerVeterinarios()) {
            if (vet.isDisponibilidad()) {
                modelo.addElement(vet);
            }
        }
        comboBoxVeterinarios.setBounds(140, 40, 190, 25);
        panelDatos.setLayout(null);
        panelDatos.add(comboBoxVeterinarios);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaCita1;
    private javax.swing.JLabel lblHoraCita;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVeterinario;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextArea txtAreaMotivo;
    private javax.swing.JTextField txtFechaCita1;
    private javax.swing.JTextField txtHoraCita;
    // End of variables declaration//GEN-END:variables
}
