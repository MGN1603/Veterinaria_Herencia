package Ventanas;

import javax.swing.ImageIcon;

public class VentanaBienvenida extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaBienvenida.class.getName());

    public VentanaBienvenida() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Bienvenidos Al sistema Gestion Veterinaria");
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/veterinario (5).png"));
        setIconImage(icono.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelContenido = new javax.swing.JPanel();
        btnIrGestionVeterinaria = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        panelContenido.setBackground(new java.awt.Color(0, 53, 84));
        panelContenido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIrGestionVeterinaria.setBackground(new java.awt.Color(10, 17, 40));
        btnIrGestionVeterinaria.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnIrGestionVeterinaria.setForeground(new java.awt.Color(254, 252, 251));
        btnIrGestionVeterinaria.setText("Ir a Gestion");
        btnIrGestionVeterinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrGestionVeterinariaActionPerformed(evt);
            }
        });
        panelContenido.add(btnIrGestionVeterinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 289, -1));

        lblTitulo.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(254, 252, 251));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Bienvenidos al sistema de gestion veterinaria");
        panelContenido.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 470, 100));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gato.png"))); // NOI18N
        panelContenido.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 130, 160));

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
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

    private void btnIrGestionVeterinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrGestionVeterinariaActionPerformed
        VentanaPrincipal irVentana = new VentanaPrincipal();
        irVentana.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnIrGestionVeterinariaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIrGestionVeterinaria;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
