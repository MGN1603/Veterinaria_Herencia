package Ventanas;

import Controladores.ControladorVacuna;
import Modelo.Mascota;
import Modelo.Vacuna;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class VentanaRegistroVacuna extends javax.swing.JDialog {

    private final ControladorVacuna controladorVacuna;
    private final Mascota mascota;

    public VentanaRegistroVacuna(java.awt.Frame parent, boolean modal, Mascota mascota, ControladorVacuna controladorVacuna) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.mascota = mascota;
        this.controladorVacuna = controladorVacuna;
        setTitle("Registro de vacuna para: " + mascota.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenido = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblTipoVacuna = new javax.swing.JLabel();
        lblLoteVacuna = new javax.swing.JLabel();
        lblFechaAplicacion = new javax.swing.JLabel();
        lblFechaProx = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtLote = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtFechaProx = new javax.swing.JTextField();
        btnRegistrarVacuna = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblImagenRegistroVacuna = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelContenido.setBackground(new java.awt.Color(0, 53, 84));
        panelContenido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitulo.setBackground(new java.awt.Color(10, 17, 40));
        panelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(254, 252, 251));
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacuna (1).png"))); // NOI18N
        lblTitulo.setText("Registro Vacunas Mascotas");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(133, 133, 133))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitulo)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelContenido.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 4, 510, 70));

        lblTipoVacuna.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblTipoVacuna.setForeground(new java.awt.Color(254, 252, 251));
        lblTipoVacuna.setText("Tipo Vacuna:");
        panelContenido.add(lblTipoVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lblLoteVacuna.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblLoteVacuna.setForeground(new java.awt.Color(254, 252, 251));
        lblLoteVacuna.setText("Lote Vacuna:");
        panelContenido.add(lblLoteVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, -1));

        lblFechaAplicacion.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblFechaAplicacion.setForeground(new java.awt.Color(254, 252, 251));
        lblFechaAplicacion.setText("Fecha Aplicacion:");
        panelContenido.add(lblFechaAplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, -1));

        lblFechaProx.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblFechaProx.setForeground(new java.awt.Color(254, 252, 251));
        lblFechaProx.setText("Fecha Proxima:");
        panelContenido.add(lblFechaProx, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        panelContenido.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 164, -1));
        panelContenido.add(txtLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 140, 164, -1));
        panelContenido.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 164, -1));
        panelContenido.add(txtFechaProx, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 164, -1));

        btnRegistrarVacuna.setBackground(new java.awt.Color(10, 17, 40));
        btnRegistrarVacuna.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegistrarVacuna.setForeground(new java.awt.Color(254, 252, 251));
        btnRegistrarVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario (3).png"))); // NOI18N
        btnRegistrarVacuna.setText("Registrar ");
        btnRegistrarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVacunaActionPerformed(evt);
            }
        });
        panelContenido.add(btnRegistrarVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, -1));

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
        panelContenido.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 210, -1));
        panelContenido.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 510, -1));

        lblImagenRegistroVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacuna (4).png"))); // NOI18N
        panelContenido.add(lblImagenRegistroVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 140, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVacunaActionPerformed
        int id = controladorVacuna.generarIdVacunas();
        String tipoVacuna = txtTipo.getText().trim();
        String lote = txtLote.getText().trim();
        LocalDate fechaAplicacion = LocalDate.now();
        String fechaProxima = txtFechaProx.getText().trim();
        if (tipoVacuna.isEmpty() || lote.isEmpty() || fechaProxima.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Completa todos los campos.");
            return;
        }
        Vacuna vacuna = new Vacuna(id, fechaAplicacion, mascota, fechaProxima, tipoVacuna, lote, fechaProxima);
        boolean registrada = controladorVacuna.registrarVacuna(vacuna);

        if (registrada) {
            JOptionPane.showMessageDialog(this, "Vacuna registrada con éxito");
            cargarTablaVacunas();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar la vacuna");
        }

    }//GEN-LAST:event_btnRegistrarVacunaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cargarTablaVacunas() {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrarVacuna;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFechaAplicacion;
    private javax.swing.JLabel lblFechaProx;
    private javax.swing.JLabel lblImagenRegistroVacuna;
    private javax.swing.JLabel lblLoteVacuna;
    private javax.swing.JLabel lblTipoVacuna;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaProx;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
