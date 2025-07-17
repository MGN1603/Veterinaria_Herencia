package Ventanas;

import Controladores.ControladorPropietario;

public class VentanaTablaMascota extends javax.swing.JDialog {

    private final ControladorPropietario controladorPropietario;

    public VentanaTablaMascota(java.awt.Frame parent, boolean modal, ControladorPropietario controladorPropietario) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.controladorPropietario = controladorPropietario;

    }

    public void cargarMascota(int documento) {
        TablaMascotaPropietario.setModel(controladorPropietario.listaPropietariosMascota(documento));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        PanelContenido = new javax.swing.JPanel();
        lblTabla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMascotaPropietario = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnVolverRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelContenido.setBackground(new java.awt.Color(0, 53, 84));
        PanelContenido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTabla.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTabla.setForeground(new java.awt.Color(254, 252, 251));
        lblTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mascota.png"))); // NOI18N
        lblTabla.setText("Tabla Mascotas Propietario");

        TablaMascotaPropietario.setBackground(new java.awt.Color(10, 17, 40));
        TablaMascotaPropietario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        TablaMascotaPropietario.setForeground(new java.awt.Color(254, 252, 251));
        TablaMascotaPropietario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaMascotaPropietario);

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

        javax.swing.GroupLayout PanelContenidoLayout = new javax.swing.GroupLayout(PanelContenido);
        PanelContenido.setLayout(PanelContenidoLayout);
        PanelContenidoLayout.setHorizontalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(btnVolverRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelContenidoLayout.setVerticalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolverRegistro)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverRegistroActionPerformed
        VentanaPrincipal irVentana = new VentanaPrincipal();
        irVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverRegistroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JTable TablaMascotaPropietario;
    private javax.swing.JButton btnVolverRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTabla;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
