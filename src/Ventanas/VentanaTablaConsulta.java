package Ventanas;

import Controladores.ControladorConsulta;
import DTOs.MascotaDTO;
import Excepciones.MascotaNoEncontradaExcepcion;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaTablaConsulta extends javax.swing.JDialog {

    private final ControladorConsulta controladorConsulta;
    private final MascotaDTO mascota;

    public VentanaTablaConsulta(java.awt.Frame parent, boolean modal, MascotaDTO mascota, ControladorConsulta controladorConsulta) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/veterinario (5).png"));
        setIconImage(icono.getImage());
        this.mascota = mascota;
        this.controladorConsulta = controladorConsulta;
        setTitle("Consultas de: " + mascota.getNombre());
        mostrarTablaConsulta();
    }

    private void mostrarTablaConsulta() {
        try {
            tablaConsultaMascota.setModel(controladorConsulta.tablaConsultasPorMascota(mascota.getIdMascota()));
        } catch (MascotaNoEncontradaExcepcion ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultaMascota = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnVolverRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(0, 53, 84));
        panelFondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaConsultaMascota.setBackground(new java.awt.Color(10, 17, 40));
        tablaConsultaMascota.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tablaConsultaMascota.setForeground(new java.awt.Color(254, 252, 251));
        tablaConsultaMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaConsultaMascota);

        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(254, 252, 251));
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informe-medico (1).png"))); // NOI18N
        lblTitulo.setText("Tabla Consultas Mascota");

        btnVolverRegistro.setBackground(new java.awt.Color(10, 17, 40));
        btnVolverRegistro.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnVolverRegistro.setForeground(new java.awt.Color(254, 252, 251));
        btnVolverRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        btnVolverRegistro.setText("Volver Registro");
        btnVolverRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(121, 121, 121))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btnVolverRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolverRegistro)
                .addContainerGap(13, Short.MAX_VALUE))
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

    private void btnVolverRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverRegistroActionPerformed
        VentanaPrincipal irVentanaPrincipal = new VentanaPrincipal();
        irVentanaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverRegistroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaConsultaMascota;
    // End of variables declaration//GEN-END:variables
}
