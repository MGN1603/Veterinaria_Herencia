package Ventanas;

import Controladores.ControladorVacuna;
import Modelo.Mascota;

public class VentanaTablaVacuna extends javax.swing.JDialog {

    private final ControladorVacuna controladorVacuna;
    private final Mascota mascota;

    public VentanaTablaVacuna(java.awt.Frame parent, boolean modal, Mascota mascota, ControladorVacuna controladorVacuna) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.mascota = mascota;
        this.controladorVacuna = controladorVacuna;
        setTitle("Vacunacion: " + mascota.getNombre());
        llenarTablaVacunas();
    }

    private void llenarTablaVacunas() {
        tablaVacunasMascota.setModel(controladorVacuna.TablaVacunasPorMascota(mascota));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenido = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVacunasMascota = new javax.swing.JTable();
        btnVolverARegistro = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelContenido.setBackground(new java.awt.Color(0, 53, 84));
        panelContenido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaVacunasMascota.setBackground(new java.awt.Color(10, 17, 40));
        tablaVacunasMascota.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tablaVacunasMascota.setForeground(new java.awt.Color(254, 252, 251));
        tablaVacunasMascota.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaVacunasMascota);

        btnVolverARegistro.setBackground(new java.awt.Color(10, 17, 40));
        btnVolverARegistro.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnVolverARegistro.setForeground(new java.awt.Color(254, 252, 251));
        btnVolverARegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        btnVolverARegistro.setText("Volver Registro");
        btnVolverARegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverARegistroActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(254, 252, 251));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacuna-para-mascotas (1).png"))); // NOI18N
        lblTitulo.setText("Tabla Vacunas");

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolverARegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolverARegistro)
                .addContainerGap(21, Short.MAX_VALUE))
        );

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
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverARegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverARegistroActionPerformed
        VentanaPrincipal irVentanaPrincipal = new VentanaPrincipal();
        irVentanaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverARegistroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverARegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JTable tablaVacunasMascota;
    // End of variables declaration//GEN-END:variables
}
