package Ventanas;

import Controladores.ControladorConsulta;
import Controladores.ControladorVeterinario;
import DTOs.CitaDTO;
import DTOs.ConsultaDTO;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaRegistroConsulta extends javax.swing.JDialog {
    
    private final CitaDTO cita;
    private final ControladorConsulta controladorConsulta;
    
    public VentanaRegistroConsulta(java.awt.Frame parent, boolean modal, CitaDTO cita, ControladorConsulta controladorConsulta, ControladorVeterinario controladorVet) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cita de la Mascota con ID: " + cita.getIdMascota());
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/veterinario (5).png"));
        setIconImage(icono.getImage());
        setVisible(true);
        this.cita = cita;
        this.controladorConsulta = controladorConsulta;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        lblDiagnostico = new javax.swing.JLabel();
        lblTratamiento = new javax.swing.JLabel();
        lblMedicamento = new javax.swing.JLabel();
        txtDiagnostico = new javax.swing.JTextField();
        txtMedicamento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTratamiento = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        panelTitulo.setBackground(new java.awt.Color(10, 17, 40));
        panelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(254, 252, 251));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portapapeles.png"))); // NOI18N
        lblTitulo.setText("Registrar Consulta");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitulo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelDatos.setBackground(new java.awt.Color(0, 53, 84));
        panelDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDiagnostico.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblDiagnostico.setForeground(new java.awt.Color(254, 252, 251));
        lblDiagnostico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiagnostico.setText("Dianostico:");
        panelDatos.add(lblDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, -1));

        lblTratamiento.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblTratamiento.setForeground(new java.awt.Color(254, 252, 251));
        lblTratamiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTratamiento.setText("Tratamiento:");
        panelDatos.add(lblTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, -1));

        lblMedicamento.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblMedicamento.setForeground(new java.awt.Color(254, 252, 251));
        lblMedicamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedicamento.setText("Medicamentos:");
        panelDatos.add(lblMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 113, -1));
        panelDatos.add(txtDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 191, -1));
        panelDatos.add(txtMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 191, -1));

        txtAreaTratamiento.setColumns(20);
        txtAreaTratamiento.setRows(5);
        jScrollPane1.setViewportView(txtAreaTratamiento);

        panelDatos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 248, -1));

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
        panelDatos.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 200, -1));

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
        panelDatos.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 200, -1));

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String diagnostico = txtDiagnostico.getText().trim();
        String tratamiento = txtAreaTratamiento.getText();
        String medicamentos = txtMedicamento.getText().trim();
        String descripcion = txtDiagnostico.getText().trim();
        
        if (diagnostico.isEmpty() || tratamiento.isEmpty() || medicamentos.isEmpty() || descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int idConsulta = controladorConsulta.generarIdConsulta();
        LocalDate fecha = cita.getFecha();
        int idVeterinario = cita.getIdVeterinario();
        int idCita = cita.getIdCita();
        int idMascota = cita.getIdMascota();
        
        ConsultaDTO consultaDTO = new ConsultaDTO(
                idConsulta,
                fecha,
                diagnostico,
                tratamiento,
                medicamentos,
                descripcion,
                idVeterinario,
                idCita,
                idMascota
        );
        
        try {
            boolean registrada = controladorConsulta.registrarConsulta(consultaDTO);
            if (registrada) {
                JOptionPane.showMessageDialog(this, "Consulta registrada con éxito.");

                // Opción 2: Si la tabla está en otra ventana (ventana padre)
                // if (ventanaPadre != null) {
                //     ventanaPadre.actualizarTablaCitas();
                // }
                // this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo registrar la consulta.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al registrar la consulta: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDiagnostico;
    private javax.swing.JLabel lblMedicamento;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTratamiento;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextArea txtAreaTratamiento;
    private javax.swing.JTextField txtDiagnostico;
    private javax.swing.JTextField txtMedicamento;
    // End of variables declaration//GEN-END:variables
}
