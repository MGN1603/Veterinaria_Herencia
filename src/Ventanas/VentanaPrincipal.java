package Ventanas;

import Controladores.ControladorCita;
import Controladores.ControladorConsulta;
import Controladores.ControladorMascota;
import Controladores.ControladorPropietario;
import Controladores.ControladorVacuna;
import Controladores.ControladorVeterinario;
import DTOs.CitaDTO;
import DTOs.MascotaDTO;
import DTOs.PropietarioDTO;
import DTOs.VeterinarioDTO;
import Excepciones.MascotaExistenteExcepcion;
import Excepciones.MascotaNoEncontradaExcepcion;
import Excepciones.PropietarioExistenteExcepcion;
import Excepciones.PropietarioNoEncontradoExcepcion;
import Excepciones.VeterinarioExistenteExcepcion;
import Excepciones.VeterinarioNoEncontradoExcepcion;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    private final ControladorPropietario controladorPropietario;
    private final ControladorMascota controladorMascota;
    private final ControladorCita controladorCita;
    private final ControladorVeterinario controladorVet;
    private final ControladorConsulta controladorConsulta;
    private final ControladorVacuna controladorVacuna;
    private int idPropietarioActualMascota = 0;

    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Sistema Gestion Veterinaria");
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/veterinario (5).png"));
        setIconImage(icono.getImage());
        setVisible(true);
        controladorPropietario = new ControladorPropietario();
        controladorMascota = new ControladorMascota();
        controladorCita = new ControladorCita();
        controladorVet = new ControladorVeterinario();
        controladorConsulta = new ControladorConsulta();
        controladorVacuna = new ControladorVacuna();
        actualizarTablaPropietario();
        actualizarTablaVet();
        cargarTablaMascotas();
        listaCita();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pestanas = new javax.swing.JTabbedPane();
        panelRegistroPropietario = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        panelContendido = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDocumento = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDoumento = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnRegistrarPropietario = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        btnActualizarDatosPropietario = new javax.swing.JButton();
        btnBuscarPropietario = new javax.swing.JButton();
        btnEliminarPropietario = new javax.swing.JButton();
        separador1 = new javax.swing.JSeparator();
        lblImagenPropietario = new javax.swing.JLabel();
        panelRegistroMascota = new javax.swing.JPanel();
        lblRegistroMascota = new javax.swing.JLabel();
        lblNombreMascota = new javax.swing.JLabel();
        lblIdMascota = new javax.swing.JLabel();
        lblEspecie = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblDocPropietario = new javax.swing.JLabel();
        txtNombreMascota = new javax.swing.JTextField();
        txtDocPro = new javax.swing.JTextField();
        txtIdMascota = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        spinnerEdad = new javax.swing.JSpinner();
        txtRaza = new javax.swing.JTextField();
        btnRegistrarMascotaDueno = new javax.swing.JButton();
        btnBuscarMascota = new javax.swing.JButton();
        btnActualizarDatosMascota = new javax.swing.JButton();
        btnEliminarMascota = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnRegistrarMascotasindueno = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        lblImagenMascota = new javax.swing.JLabel();
        PanelRegistroVeterinario = new javax.swing.JPanel();
        panelFondoVeterinario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVeterinario = new javax.swing.JTable();
        lblDocVet = new javax.swing.JLabel();
        lblNombreVet = new javax.swing.JLabel();
        lblEspecialidad = new javax.swing.JLabel();
        lblDisponibilidad = new javax.swing.JLabel();
        txtNombreVet = new javax.swing.JTextField();
        txtDocVet = new javax.swing.JTextField();
        txtEspecialidadVet = new javax.swing.JTextField();
        checkDisponible = new javax.swing.JCheckBox();
        lblVeterinario = new javax.swing.JLabel();
        btnRegistrarVeterinario = new javax.swing.JButton();
        btnEliminarVeterinario = new javax.swing.JButton();
        btnBuscarVeterinario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblListaVeterinario = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblTelefonoVet = new javax.swing.JLabel();
        lblCorreoVet = new javax.swing.JLabel();
        txtTelefonoVet = new javax.swing.JTextField();
        txtCorreoVet = new javax.swing.JTextField();
        panelListaMascota = new javax.swing.JPanel();
        panelFondoMascota = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascota = new javax.swing.JTable();
        btnAgendarCita = new javax.swing.JButton();
        btnIrVacunas = new javax.swing.JButton();
        btnVerConsulta = new javax.swing.JButton();
        btnVerVacunas = new javax.swing.JButton();
        lblListaMascota = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnHistorial = new javax.swing.JButton();
        btnAsignarAPropietarioMascota = new javax.swing.JButton();
        panelListaPropietario = new javax.swing.JPanel();
        panelFondoPropietario = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPropietario = new javax.swing.JTable();
        btnVerMascotaPropietario = new javax.swing.JButton();
        lblListaPropietario = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        panelFondoCita = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCita = new javax.swing.JTable();
        btnAgregarConsulta = new javax.swing.JButton();
        lblListaCita = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pestanas.setBackground(new java.awt.Color(0, 0, 0));

        panelDatos.setBackground(new java.awt.Color(0, 0, 0));

        panelContendido.setBackground(new java.awt.Color(0, 53, 84));
        panelContendido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelContendido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(254, 252, 251));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registro Propietario");
        panelContendido.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 341, -1));

        lblNombre.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");
        panelContendido.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 78, 74, -1));

        lblDocumento.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblDocumento.setForeground(new java.awt.Color(255, 255, 255));
        lblDocumento.setText("Documento:");
        panelContendido.add(lblDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 122, 88, -1));

        lblTelefono.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Telefono:");
        panelContendido.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 166, 71, -1));

        lblCorreo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Corrreo:");
        panelContendido.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 210, 72, -1));
        panelContendido.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 74, 181, -1));
        panelContendido.add(txtDoumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 118, 181, -1));
        panelContendido.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 162, 181, -1));
        panelContendido.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 206, 181, -1));

        btnRegistrarPropietario.setBackground(new java.awt.Color(10, 17, 40));
        btnRegistrarPropietario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegistrarPropietario.setForeground(new java.awt.Color(254, 252, 251));
        btnRegistrarPropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario (4).png"))); // NOI18N
        btnRegistrarPropietario.setText("Registrar Datos");
        btnRegistrarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPropietarioActionPerformed(evt);
            }
        });
        panelContendido.add(btnRegistrarPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 190, -1));
        panelContendido.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 660, 10));

        btnActualizarDatosPropietario.setBackground(new java.awt.Color(10, 17, 40));
        btnActualizarDatosPropietario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnActualizarDatosPropietario.setForeground(new java.awt.Color(254, 252, 251));
        btnActualizarDatosPropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizarDatosPropietario.setText("Actualizar Datos");
        btnActualizarDatosPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosPropietarioActionPerformed(evt);
            }
        });
        panelContendido.add(btnActualizarDatosPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 190, -1));

        btnBuscarPropietario.setBackground(new java.awt.Color(10, 17, 40));
        btnBuscarPropietario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBuscarPropietario.setForeground(new java.awt.Color(254, 252, 251));
        btnBuscarPropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario (2).png"))); // NOI18N
        btnBuscarPropietario.setText("Buscar Datos");
        btnBuscarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPropietarioActionPerformed(evt);
            }
        });
        panelContendido.add(btnBuscarPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 180, -1));

        btnEliminarPropietario.setBackground(new java.awt.Color(10, 17, 40));
        btnEliminarPropietario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnEliminarPropietario.setForeground(new java.awt.Color(254, 252, 251));
        btnEliminarPropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        btnEliminarPropietario.setText("Eliminar");
        btnEliminarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPropietarioActionPerformed(evt);
            }
        });
        panelContendido.add(btnEliminarPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 180, -1));
        panelContendido.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 44, 664, 10));

        lblImagenPropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jugar-con-mascota.png"))); // NOI18N
        panelContendido.add(lblImagenPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 140, 180));

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContendido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContendido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelRegistroPropietarioLayout = new javax.swing.GroupLayout(panelRegistroPropietario);
        panelRegistroPropietario.setLayout(panelRegistroPropietarioLayout);
        panelRegistroPropietarioLayout.setHorizontalGroup(
            panelRegistroPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroPropietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRegistroPropietarioLayout.setVerticalGroup(
            panelRegistroPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroPropietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Pestanas.addTab("Registro Propietarios", panelRegistroPropietario);

        panelRegistroMascota.setBackground(new java.awt.Color(0, 53, 84));
        panelRegistroMascota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelRegistroMascota.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistroMascota.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblRegistroMascota.setForeground(new java.awt.Color(254, 252, 251));
        lblRegistroMascota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistroMascota.setText("Registro Mascota");
        panelRegistroMascota.add(lblRegistroMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 180, -1));

        lblNombreMascota.setForeground(new java.awt.Color(254, 252, 251));
        lblNombreMascota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMascota.setText("Nombre:");
        panelRegistroMascota.add(lblNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 70, -1));

        lblIdMascota.setForeground(new java.awt.Color(254, 252, 251));
        lblIdMascota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdMascota.setText("Id Mascota:");
        panelRegistroMascota.add(lblIdMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 82, -1));

        lblEspecie.setForeground(new java.awt.Color(254, 252, 251));
        lblEspecie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEspecie.setText("Especie:");
        panelRegistroMascota.add(lblEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 60, -1));

        lblRaza.setForeground(new java.awt.Color(254, 252, 251));
        lblRaza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRaza.setText("Raza:");
        panelRegistroMascota.add(lblRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 40, -1));

        lblEdad.setForeground(new java.awt.Color(254, 252, 251));
        lblEdad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEdad.setText("Edad:");
        panelRegistroMascota.add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 40, -1));

        lblPeso.setForeground(new java.awt.Color(254, 252, 251));
        lblPeso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeso.setText("Peso:");
        panelRegistroMascota.add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 60, -1));

        lblDocPropietario.setForeground(new java.awt.Color(254, 252, 251));
        lblDocPropietario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocPropietario.setText("Doc. Propietario:");
        panelRegistroMascota.add(lblDocPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, -1));

        txtNombreMascota.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        panelRegistroMascota.add(txtNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 126, 157, -1));

        txtDocPro.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        panelRegistroMascota.add(txtDocPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 86, 157, -1));

        txtIdMascota.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        panelRegistroMascota.add(txtIdMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 166, 157, -1));

        txtPeso.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        panelRegistroMascota.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 346, 157, -1));

        txtEspecie.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        panelRegistroMascota.add(txtEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 206, 157, -1));

        spinnerEdad.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        panelRegistroMascota.add(spinnerEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 296, 170, -1));

        txtRaza.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        panelRegistroMascota.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 246, 157, -1));

        btnRegistrarMascotaDueno.setBackground(new java.awt.Color(10, 17, 40));
        btnRegistrarMascotaDueno.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegistrarMascotaDueno.setForeground(new java.awt.Color(254, 252, 251));
        btnRegistrarMascotaDueno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario (4).png"))); // NOI18N
        btnRegistrarMascotaDueno.setText("Registrar Mascota");
        btnRegistrarMascotaDueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMascotaDuenoActionPerformed(evt);
            }
        });
        panelRegistroMascota.add(btnRegistrarMascotaDueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 180, -1));

        btnBuscarMascota.setBackground(new java.awt.Color(10, 17, 40));
        btnBuscarMascota.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBuscarMascota.setForeground(new java.awt.Color(254, 252, 251));
        btnBuscarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario (2).png"))); // NOI18N
        btnBuscarMascota.setText("Buscar Mascota");
        btnBuscarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMascotaActionPerformed(evt);
            }
        });
        panelRegistroMascota.add(btnBuscarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        btnActualizarDatosMascota.setBackground(new java.awt.Color(10, 17, 40));
        btnActualizarDatosMascota.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnActualizarDatosMascota.setForeground(new java.awt.Color(254, 252, 251));
        btnActualizarDatosMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizarDatosMascota.setText("Actualizar Datos");
        btnActualizarDatosMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosMascotaActionPerformed(evt);
            }
        });
        panelRegistroMascota.add(btnActualizarDatosMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 160, -1));

        btnEliminarMascota.setBackground(new java.awt.Color(10, 17, 40));
        btnEliminarMascota.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnEliminarMascota.setForeground(new java.awt.Color(254, 252, 251));
        btnEliminarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        btnEliminarMascota.setText("Eliminar");
        btnEliminarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMascotaActionPerformed(evt);
            }
        });
        panelRegistroMascota.add(btnEliminarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 160, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelRegistroMascota.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 10, 360));

        btnRegistrarMascotasindueno.setBackground(new java.awt.Color(10, 17, 40));
        btnRegistrarMascotasindueno.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegistrarMascotasindueno.setForeground(new java.awt.Color(254, 252, 251));
        btnRegistrarMascotasindueno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gatito.png"))); // NOI18N
        btnRegistrarMascotasindueno.setText(" En Adopcion");
        btnRegistrarMascotasindueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMascotasinduenoActionPerformed(evt);
            }
        });
        panelRegistroMascota.add(btnRegistrarMascotasindueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 160, -1));
        panelRegistroMascota.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 680, 10));

        lblImagenMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gato-negro.png"))); // NOI18N
        panelRegistroMascota.add(lblImagenMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 130, 170));

        Pestanas.addTab("Registro Mascotas", panelRegistroMascota);

        panelFondoVeterinario.setBackground(new java.awt.Color(0, 53, 84));
        panelFondoVeterinario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaVeterinario.setBackground(new java.awt.Color(10, 17, 40));
        tablaVeterinario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tablaVeterinario.setForeground(new java.awt.Color(254, 252, 251));
        tablaVeterinario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaVeterinario);

        lblDocVet.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblDocVet.setForeground(new java.awt.Color(254, 252, 251));
        lblDocVet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocVet.setText("Doc.Veterinario:");

        lblNombreVet.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblNombreVet.setForeground(new java.awt.Color(254, 252, 251));
        lblNombreVet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreVet.setText("Nombre:");

        lblEspecialidad.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblEspecialidad.setForeground(new java.awt.Color(254, 252, 251));
        lblEspecialidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEspecialidad.setText("Especialidad:");

        lblDisponibilidad.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblDisponibilidad.setForeground(new java.awt.Color(254, 252, 251));
        lblDisponibilidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisponibilidad.setText("Disponibilidad:");

        checkDisponible.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        checkDisponible.setForeground(new java.awt.Color(254, 252, 251));
        checkDisponible.setText("Disponible");

        lblVeterinario.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblVeterinario.setForeground(new java.awt.Color(254, 252, 251));
        lblVeterinario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario (1).png"))); // NOI18N
        lblVeterinario.setText("Registro Veterinario");

        btnRegistrarVeterinario.setBackground(new java.awt.Color(10, 17, 40));
        btnRegistrarVeterinario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegistrarVeterinario.setForeground(new java.awt.Color(254, 252, 251));
        btnRegistrarVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario (4).png"))); // NOI18N
        btnRegistrarVeterinario.setText("Registrar");
        btnRegistrarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVeterinarioActionPerformed(evt);
            }
        });

        btnEliminarVeterinario.setBackground(new java.awt.Color(10, 17, 40));
        btnEliminarVeterinario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnEliminarVeterinario.setForeground(new java.awt.Color(254, 252, 251));
        btnEliminarVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        btnEliminarVeterinario.setText("Eliminar");
        btnEliminarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVeterinarioActionPerformed(evt);
            }
        });

        btnBuscarVeterinario.setBackground(new java.awt.Color(10, 17, 40));
        btnBuscarVeterinario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBuscarVeterinario.setForeground(new java.awt.Color(254, 252, 251));
        btnBuscarVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario (2).png"))); // NOI18N
        btnBuscarVeterinario.setText("Buscar");
        btnBuscarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVeterinarioActionPerformed(evt);
            }
        });

        lblListaVeterinario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblListaVeterinario.setForeground(new java.awt.Color(254, 252, 251));
        lblListaVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario.png"))); // NOI18N
        lblListaVeterinario.setText("Lista Veterinario");

        lblTelefonoVet.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblTelefonoVet.setForeground(new java.awt.Color(254, 252, 251));
        lblTelefonoVet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoVet.setText("Telefono:");

        lblCorreoVet.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblCorreoVet.setForeground(new java.awt.Color(254, 252, 251));
        lblCorreoVet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoVet.setText("Correo:");

        javax.swing.GroupLayout panelFondoVeterinarioLayout = new javax.swing.GroupLayout(panelFondoVeterinario);
        panelFondoVeterinario.setLayout(panelFondoVeterinarioLayout);
        panelFondoVeterinarioLayout.setHorizontalGroup(
            panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoVeterinarioLayout.createSequentialGroup()
                .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoVeterinarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(panelFondoVeterinarioLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoVeterinarioLayout.createSequentialGroup()
                                .addComponent(lblDocVet, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDocVet, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFondoVeterinarioLayout.createSequentialGroup()
                                .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFondoVeterinarioLayout.createSequentialGroup()
                                        .addComponent(lblNombreVet, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombreVet, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelFondoVeterinarioLayout.createSequentialGroup()
                                        .addComponent(lblDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(checkDisponible))
                                    .addGroup(panelFondoVeterinarioLayout.createSequentialGroup()
                                        .addComponent(btnRegistrarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelFondoVeterinarioLayout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(btnEliminarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelFondoVeterinarioLayout.createSequentialGroup()
                                        .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblTelefonoVet, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblCorreoVet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelefonoVet, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEspecialidadVet, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCorreoVet, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFondoVeterinarioLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblListaVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoVeterinarioLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(61, 61, 61)))))))
                .addContainerGap())
            .addGroup(panelFondoVeterinarioLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(lblVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondoVeterinarioLayout.setVerticalGroup(
            panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoVeterinarioLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblVeterinario)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoVeterinarioLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDocVet)
                            .addComponent(txtDocVet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreVet)
                            .addComponent(txtNombreVet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEspecialidad)
                            .addComponent(txtEspecialidadVet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefonoVet)
                            .addComponent(txtTelefonoVet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorreoVet)
                            .addComponent(txtCorreoVet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDisponibilidad)
                            .addComponent(checkDisponible))
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarVeterinario)
                            .addComponent(btnBuscarVeterinario))
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarVeterinario)
                        .addGap(88, 88, 88))
                    .addGroup(panelFondoVeterinarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblListaVeterinario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout PanelRegistroVeterinarioLayout = new javax.swing.GroupLayout(PanelRegistroVeterinario);
        PanelRegistroVeterinario.setLayout(PanelRegistroVeterinarioLayout);
        PanelRegistroVeterinarioLayout.setHorizontalGroup(
            PanelRegistroVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoVeterinario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 712, Short.MAX_VALUE)
        );
        PanelRegistroVeterinarioLayout.setVerticalGroup(
            PanelRegistroVeterinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 433, Short.MAX_VALUE)
        );

        Pestanas.addTab("Registro Veterinarios", PanelRegistroVeterinario);

        panelFondoMascota.setBackground(new java.awt.Color(0, 53, 84));
        panelFondoMascota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelFondoMascota.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaMascota.setBackground(new java.awt.Color(10, 17, 40));
        tablaMascota.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tablaMascota.setForeground(new java.awt.Color(254, 252, 251));
        tablaMascota.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaMascota);

        panelFondoMascota.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 113, 672, 171));

        btnAgendarCita.setBackground(new java.awt.Color(10, 17, 40));
        btnAgendarCita.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAgendarCita.setForeground(new java.awt.Color(254, 252, 251));
        btnAgendarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario (3).png"))); // NOI18N
        btnAgendarCita.setText("Agendar Cita");
        btnAgendarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarCitaActionPerformed(evt);
            }
        });
        panelFondoMascota.add(btnAgendarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 172, 40));

        btnIrVacunas.setBackground(new java.awt.Color(10, 17, 40));
        btnIrVacunas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnIrVacunas.setForeground(new java.awt.Color(254, 252, 251));
        btnIrVacunas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacuna.png"))); // NOI18N
        btnIrVacunas.setText("Vacunas");
        btnIrVacunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrVacunasActionPerformed(evt);
            }
        });
        panelFondoMascota.add(btnIrVacunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 309, 170, 40));

        btnVerConsulta.setBackground(new java.awt.Color(10, 17, 40));
        btnVerConsulta.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnVerConsulta.setForeground(new java.awt.Color(254, 252, 251));
        btnVerConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historial-medico.png"))); // NOI18N
        btnVerConsulta.setText("Ver Consultas");
        btnVerConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerConsultaActionPerformed(evt);
            }
        });
        panelFondoMascota.add(btnVerConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 172, 40));

        btnVerVacunas.setBackground(new java.awt.Color(10, 17, 40));
        btnVerVacunas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnVerVacunas.setForeground(new java.awt.Color(254, 252, 251));
        btnVerVacunas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacuna-para-mascotas.png"))); // NOI18N
        btnVerVacunas.setText("Ver Vacunas");
        btnVerVacunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerVacunasActionPerformed(evt);
            }
        });
        panelFondoMascota.add(btnVerVacunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 172, 40));

        lblListaMascota.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblListaMascota.setForeground(new java.awt.Color(254, 252, 251));
        lblListaMascota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListaMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perro.png"))); // NOI18N
        lblListaMascota.setText("Lista Mascotas");
        panelFondoMascota.add(lblListaMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 17, 227, -1));
        panelFondoMascota.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 97, 672, 10));
        panelFondoMascota.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 296, 672, 10));

        btnHistorial.setBackground(new java.awt.Color(10, 17, 40));
        btnHistorial.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(254, 252, 251));
        btnHistorial.setText("Historial");
        panelFondoMascota.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 309, 200, 40));

        btnAsignarAPropietarioMascota.setBackground(new java.awt.Color(10, 17, 40));
        btnAsignarAPropietarioMascota.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAsignarAPropietarioMascota.setForeground(new java.awt.Color(254, 252, 251));
        btnAsignarAPropietarioMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jugar-con-mascota (1).png"))); // NOI18N
        btnAsignarAPropietarioMascota.setText("Asignar Propietario");
        btnAsignarAPropietarioMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarAPropietarioMascotaActionPerformed(evt);
            }
        });
        panelFondoMascota.add(btnAsignarAPropietarioMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 200, 40));

        javax.swing.GroupLayout panelListaMascotaLayout = new javax.swing.GroupLayout(panelListaMascota);
        panelListaMascota.setLayout(panelListaMascotaLayout);
        panelListaMascotaLayout.setHorizontalGroup(
            panelListaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaMascotaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondoMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelListaMascotaLayout.setVerticalGroup(
            panelListaMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaMascotaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondoMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );

        Pestanas.addTab("Lista Mascotas", panelListaMascota);

        panelFondoPropietario.setBackground(new java.awt.Color(0, 53, 84));
        panelFondoPropietario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaPropietario.setBackground(new java.awt.Color(10, 17, 40));
        tablaPropietario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tablaPropietario.setForeground(new java.awt.Color(254, 252, 251));
        tablaPropietario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaPropietario);

        btnVerMascotaPropietario.setBackground(new java.awt.Color(10, 17, 40));
        btnVerMascotaPropietario.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnVerMascotaPropietario.setForeground(new java.awt.Color(254, 252, 251));
        btnVerMascotaPropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mascota.png"))); // NOI18N
        btnVerMascotaPropietario.setText("Ver Mascotas");
        btnVerMascotaPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMascotaPropietarioActionPerformed(evt);
            }
        });

        lblListaPropietario.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblListaPropietario.setForeground(new java.awt.Color(254, 252, 251));
        lblListaPropietario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListaPropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista-de-contactos.png"))); // NOI18N
        lblListaPropietario.setText("Lista Propietarios");

        javax.swing.GroupLayout panelFondoPropietarioLayout = new javax.swing.GroupLayout(panelFondoPropietario);
        panelFondoPropietario.setLayout(panelFondoPropietarioLayout);
        panelFondoPropietarioLayout.setHorizontalGroup(
            panelFondoPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoPropietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelFondoPropietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator6)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoPropietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator8)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoPropietarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblListaPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(panelFondoPropietarioLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(btnVerMascotaPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondoPropietarioLayout.setVerticalGroup(
            panelFondoPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoPropietarioLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblListaPropietario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerMascotaPropietario)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelListaPropietarioLayout = new javax.swing.GroupLayout(panelListaPropietario);
        panelListaPropietario.setLayout(panelListaPropietarioLayout);
        panelListaPropietarioLayout.setHorizontalGroup(
            panelListaPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListaPropietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondoPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelListaPropietarioLayout.setVerticalGroup(
            panelListaPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaPropietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondoPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Pestanas.addTab("Lista Propietarios", panelListaPropietario);

        panelFondoCita.setBackground(new java.awt.Color(0, 53, 84));
        panelFondoCita.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaCita.setBackground(new java.awt.Color(10, 17, 40));
        tablaCita.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tablaCita.setForeground(new java.awt.Color(254, 252, 251));
        tablaCita.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablaCita);

        btnAgregarConsulta.setBackground(new java.awt.Color(10, 17, 40));
        btnAgregarConsulta.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnAgregarConsulta.setForeground(new java.awt.Color(254, 252, 251));
        btnAgregarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mascota.png"))); // NOI18N
        btnAgregarConsulta.setText("Agregar Consulta");
        btnAgregarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarConsultaActionPerformed(evt);
            }
        });

        lblListaCita.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblListaCita.setForeground(new java.awt.Color(254, 252, 251));
        lblListaCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListaCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informe-medico (2).png"))); // NOI18N
        lblListaCita.setText("Lista Citas");

        javax.swing.GroupLayout panelFondoCitaLayout = new javax.swing.GroupLayout(panelFondoCita);
        panelFondoCita.setLayout(panelFondoCitaLayout);
        panelFondoCitaLayout.setHorizontalGroup(
            panelFondoCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelFondoCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator9)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator10)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoCitaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblListaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(panelFondoCitaLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(btnAgregarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondoCitaLayout.setVerticalGroup(
            panelFondoCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoCitaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblListaCita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarConsulta)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondoCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondoCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Pestanas.addTab("Lista Citas", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pestanas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pestanas, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //===== CRUD Veterinario ========
    private void btnBuscarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVeterinarioActionPerformed
        try {
            String docVetStr = txtDocVet.getText().trim();

            if (!esEnteroPositivo(docVetStr)) {
                JOptionPane.showMessageDialog(this, "Documento inválido. Debe ser un número positivo.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int documento = Integer.parseInt(docVetStr);

            // Buscar y mostrar el veterinario
            VeterinarioDTO v = controladorVet.buscarVeterinario(documento);
            String datos = v.mostrarDatos();
            JOptionPane.showMessageDialog(this, datos, "Veterinario encontrado", JOptionPane.INFORMATION_MESSAGE);
            limpiarCamposVeterinario();

        } catch (VeterinarioNoEncontradoExcepcion e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "No encontrado", JOptionPane.WARNING_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Documento inválido. Asegúrate de ingresar solo números.", "Error de formato", JOptionPane.ERROR_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarVeterinarioActionPerformed

    private void btnEliminarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVeterinarioActionPerformed
        String docVetStr = txtDocVet.getText().trim();

        if (!esEnteroPositivo(docVetStr)) {
            JOptionPane.showMessageDialog(this, "Documento inválido.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int documento = Integer.parseInt(docVetStr);

        try {
            boolean eliminado = controladorVet.eliminarVeterinario(documento);
            if (eliminado) {
                JOptionPane.showMessageDialog(this, "Veterinario eliminado correctamente.");
                limpiarCamposVeterinario();
                actualizarTablaVet();
            }
        } catch (VeterinarioNoEncontradoExcepcion ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarVeterinarioActionPerformed

    private void btnRegistrarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVeterinarioActionPerformed
        String docVetStr = txtDocVet.getText().trim();
        String nombreVet = txtNombreVet.getText().trim();
        String especialidad = txtEspecialidadVet.getText().trim();
        boolean disponible = checkDisponible.isSelected();
        String telefonoStr = txtTelefonoVet.getText().trim();
        String correo = txtCorreoVet.getText().trim();

        if (camposVacios(docVetStr, nombreVet, especialidad, telefonoStr, correo)) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!esEnteroPositivo(docVetStr)) {
            JOptionPane.showMessageDialog(this, "El documento debe ser un número entero positivo.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int documento = Integer.parseInt(docVetStr);
        int telefono = Integer.parseInt(telefonoStr);

        if (idUsadoEnSistema(documento)) {
            JOptionPane.showMessageDialog(this, "Ese documento/ID ya está registrado en el sistema como propietario, veterinario o mascota.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        VeterinarioDTO v = new VeterinarioDTO(nombreVet, documento, telefono, correo, especialidad, disponible);

        try {
            boolean guardado = controladorVet.registrarVeterinario(v);
            if (guardado) {
                JOptionPane.showMessageDialog(this, "Veterinario registrado con éxito");
                limpiarCamposVeterinario();
                actualizarTablaVet();
            }
        } catch (VeterinarioExistenteExcepcion ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarVeterinarioActionPerformed

    //====== CRUD Mascota ======== 
    private void btnRegistrarMascotasinduenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMascotasinduenoActionPerformed
        String nombre = txtNombreMascota.getText().trim();
        String idMascotaStr = txtIdMascota.getText().trim();
        String especie = txtEspecie.getText().trim();
        String raza = txtRaza.getText().trim();
        String edadStr = spinnerEdad.getValue().toString();
        String pesoStr = txtPeso.getText().trim();

        if (camposVacios(nombre, idMascotaStr, especie, raza, edadStr, pesoStr)) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!validarCamposNumericos(idMascotaStr, edadStr)) {
            JOptionPane.showMessageDialog(this, "ID y edad deben ser números positivos.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!esDecimalPositivo(pesoStr)) {
            JOptionPane.showMessageDialog(this, "Peso debe ser un número positivo.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int idMascota = Integer.parseInt(idMascotaStr);
        int edad = Integer.parseInt(edadStr);
        double peso = Double.parseDouble(pesoStr);

        if (idUsadoEnSistema(idMascota)) {
            JOptionPane.showMessageDialog(this, "Ese documento/ID ya está registrado en el sistema como propietario, veterinario o mascota.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        MascotaDTO nueva = new MascotaDTO(nombre, idMascota, especie, raza, edad, peso, idPropietarioActualMascota);

        try {
            boolean guardada = controladorMascota.guardarMascota(nueva);
            if (guardada) {
                JOptionPane.showMessageDialog(this, "Mascota registrada correctamente sin dueño.");
                limpiarCamposMascota();
                cargarTablaMascotas();
            }
        } catch (MascotaExistenteExcepcion ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al registrar mascota", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarMascotasinduenoActionPerformed

    private void btnEliminarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMascotaActionPerformed
        String idMascotaStr = txtIdMascota.getText().trim();

        if (!esEnteroPositivo(idMascotaStr)) {
            JOptionPane.showMessageDialog(this, "ID inválido.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int idMascota = Integer.parseInt(idMascotaStr);

        try {
            boolean eliminado = controladorMascota.eliminarMascota(idMascota);
            if (eliminado) {
                JOptionPane.showMessageDialog(this, "Mascota eliminada correctamente.");
                limpiarCamposMascota();
                cargarTablaMascotas();
            }
        } catch (MascotaNoEncontradaExcepcion ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al eliminar mascota", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarMascotaActionPerformed

    private void btnActualizarDatosMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosMascotaActionPerformed
        try {
            String nombre = txtNombreMascota.getText().trim();
            String idMascotaStr = txtIdMascota.getText().trim();
            String especie = txtEspecie.getText().trim();
            String raza = txtRaza.getText().trim();
            String edadStr = spinnerEdad.getValue().toString();
            String pesoStr = txtPeso.getText().trim();

            if (camposVacios(nombre, idMascotaStr, especie, raza, edadStr, pesoStr)) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios para actualizar.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!validarCamposNumericos(idMascotaStr, edadStr)) {
                JOptionPane.showMessageDialog(this, "ID y edad deben ser números positivos.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!esDecimalPositivo(pesoStr)) {
                JOptionPane.showMessageDialog(this, "Peso debe ser un número positivo.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int idMascota = Integer.parseInt(idMascotaStr);
            int edad = Integer.parseInt(edadStr);
            double peso = Double.parseDouble(pesoStr);

            // Buscar la mascota existente para obtener su propietario actual
            MascotaDTO mascotaExistente = controladorMascota.buscarMascota(idMascota);
            if (mascotaExistente == null) {
                JOptionPane.showMessageDialog(this, "La mascota no existe para actualizar.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Crear DTO actualizado manteniendo el propietario actual
            MascotaDTO dtoActualizado = new MascotaDTO(nombre, idMascota, especie, raza, edad, peso, mascotaExistente.getIdPropietario());

            boolean actualizado = controladorMascota.actualizarMascota(dtoActualizado);

            if (actualizado) {
                JOptionPane.showMessageDialog(this, "Mascota actualizada correctamente.");
                limpiarCamposMascota();
                cargarTablaMascotas();
            }

        } catch (MascotaNoEncontradaExcepcion ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al Actualizar", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error en el formato de los números.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarDatosMascotaActionPerformed

    private void btnBuscarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMascotaActionPerformed
        try {
            String idMascotaStr = txtIdMascota.getText().trim();

            if (!esEnteroPositivo(idMascotaStr)) {
                JOptionPane.showMessageDialog(this, "ID inválido.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int idMascota = Integer.parseInt(idMascotaStr);
            MascotaDTO mascotaDTO = controladorMascota.buscarMascota(idMascota);

            if (mascotaDTO != null) {
                String datos = "Datos de la mascota:\n";
                datos += "• Nombre: " + mascotaDTO.getNombre() + "\n";
                datos += "• Especie: " + mascotaDTO.getEspecie() + "\n";
                datos += "• Raza: " + mascotaDTO.getRaza() + "\n";
                datos += "• Edad: " + mascotaDTO.getEdad() + " años\n";
                datos += "• Peso: " + mascotaDTO.getPeso() + " kg\n";
                datos += "• Propietario: " + (mascotaDTO.getIdPropietario() != 0 ? mascotaDTO.getIdPropietario() : "Sin dueño") + "\n";

                // Guardamos el propietario actual para que no se pierda al actualizar
                idPropietarioActualMascota = mascotaDTO.getIdPropietario();

                JOptionPane.showMessageDialog(this, datos, "Mascota encontrada", JOptionPane.INFORMATION_MESSAGE);
                limpiarCamposMascota();
            }

        } catch (MascotaNoEncontradaExcepcion ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al Buscar", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarMascotaActionPerformed

    private void btnRegistrarMascotaDuenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMascotaDuenoActionPerformed
        String nombre = txtNombreMascota.getText().trim();
        String idMascotaStr = txtIdMascota.getText().trim();
        String especie = txtEspecie.getText().trim();
        String raza = txtRaza.getText().trim();
        String edadStr = spinnerEdad.getValue().toString();
        String pesoStr = txtPeso.getText().trim();
        String documentoStr = txtDocPro.getText().trim();

        if (camposVacios(nombre, idMascotaStr, especie, raza, edadStr, pesoStr, documentoStr)) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!validarCamposNumericos(idMascotaStr, edadStr, documentoStr)) {
            JOptionPane.showMessageDialog(this, "ID, edad y documento del propietario deben ser números positivos.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!esDecimalPositivo(pesoStr)) {
            JOptionPane.showMessageDialog(this, "Peso debe ser un número positivo.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int idMascota = Integer.parseInt(idMascotaStr);
        int edad = Integer.parseInt(edadStr);
        double peso = Double.parseDouble(pesoStr);
        int idPropietario = Integer.parseInt(documentoStr);

        try {
            MascotaDTO dto = new MascotaDTO(nombre, idMascota, especie, raza, edad, peso, idPropietario);
            boolean guardado = controladorMascota.guardarMascotaPropietario(dto, idPropietario);

            if (guardado) {
                JOptionPane.showMessageDialog(this, "Mascota registrada correctamente con dueño.");
                limpiarCamposMascota();
                cargarTablaMascotas();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo guardar la mascota. Intenta de nuevo.", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (MascotaExistenteExcepcion ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Mascota ya registrada", JOptionPane.WARNING_MESSAGE);

        } catch (PropietarioNoEncontradoExcepcion ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Propietario no encontrado", JOptionPane.WARNING_MESSAGE);

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error de datos", JOptionPane.WARNING_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarMascotaDuenoActionPerformed

    //======= CRUD Propietario =======
    private void btnEliminarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPropietarioActionPerformed
        String documentoStr = txtDoumento.getText().trim();

        if (!esEnteroPositivo(documentoStr)) {
            JOptionPane.showMessageDialog(this, "Documento inválido.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int documento = Integer.parseInt(documentoStr);

        try {
            boolean eliminado = controladorPropietario.eliminarPropietario(documento);

            if (eliminado) {
                JOptionPane.showMessageDialog(this, "Propietario eliminado. Las mascotas ahora están en adopción.");
                actualizarTablaPropietario();
                cargarTablaMascotas();
                limpiarCamposPropietario();
            }

        } catch (PropietarioNoEncontradoExcepcion ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Propietario no encontrado", JOptionPane.WARNING_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarTablaPropietario() {
        tablaPropietario.setModel(controladorPropietario.obtenerTablaPropietarios());
    }//GEN-LAST:event_btnEliminarPropietarioActionPerformed

    private void btnBuscarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPropietarioActionPerformed
        String documentoStr = txtDoumento.getText().trim();

        if (!esEnteroPositivo(documentoStr)) {
            JOptionPane.showMessageDialog(this, "Documento inválido.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int documento = Integer.parseInt(documentoStr);

        try {
            PropietarioDTO p = controladorPropietario.buscarPropietario(documento);

            String datos = "Datos del Propietario\n";
            datos += "• Nombre: " + p.getNombre() + "\n";
            datos += "• Documento: " + p.getDocumento() + "\n";
            datos += "• Teléfono: " + p.getTelefono() + "\n";
            datos += "• Correo: " + p.getCorreo();

            JOptionPane.showMessageDialog(this, datos, "Propietario encontrado", JOptionPane.INFORMATION_MESSAGE);
            limpiarCamposPropietario();

        } catch (PropietarioNoEncontradoExcepcion ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "No encontrado", JOptionPane.WARNING_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarPropietarioActionPerformed

    private void btnActualizarDatosPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosPropietarioActionPerformed
        String nombre = txtNombre.getText().trim();
        String documentoStr = txtDoumento.getText().trim();
        String telefonoStr = txtTelefono.getText().trim();
        String correo = txtCorreo.getText().trim();

        if (camposVacios(nombre, documentoStr, telefonoStr, correo)) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios para actualizar.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!validarCamposNumericos(documentoStr, telefonoStr)) {
            JOptionPane.showMessageDialog(this, "Documento y teléfono deben ser números positivos.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int documento = Integer.parseInt(documentoStr);
        int telefono = Integer.parseInt(telefonoStr);

        PropietarioDTO actualizado = new PropietarioDTO(nombre, documento, telefono, correo);

        try {
            boolean actualizar = controladorPropietario.actualizarDatos(actualizado);

            if (actualizar) {
                JOptionPane.showMessageDialog(this, "✅ Datos actualizados correctamente.");
                actualizarTablaPropietario();
                limpiarCamposPropietario();
            }

        } catch (PropietarioNoEncontradoExcepcion ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "No encontrado", JOptionPane.WARNING_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarDatosPropietarioActionPerformed

    private void btnRegistrarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPropietarioActionPerformed
        String nombre = txtNombre.getText().trim();
        String documentoStr = txtDoumento.getText().trim();
        String telefonoStr = txtTelefono.getText().trim();
        String correo = txtCorreo.getText().trim();

        if (camposVacios(nombre, documentoStr, telefonoStr, correo)) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!validarCamposNumericos(documentoStr, telefonoStr)) {
            JOptionPane.showMessageDialog(this, "Documento y teléfono deben ser números positivos.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int documento = Integer.parseInt(documentoStr);
        int telefono = Integer.parseInt(telefonoStr);

        if (idUsadoEnSistema(documento)) {
            JOptionPane.showMessageDialog(this, "Ese documento/ID ya está registrado en el sistema como propietario, veterinario o mascota.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        PropietarioDTO propietario = new PropietarioDTO(nombre, documento, telefono, correo);
        try {
            boolean guardado = controladorPropietario.registrarPropietario(propietario);
            if (guardado) {
                JOptionPane.showMessageDialog(this, "Propietario guardado correctamente.");
                actualizarTablaPropietario();
                limpiarCamposPropietario();
            }
        } catch (PropietarioExistenteExcepcion ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Datos inválidos: " + ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnRegistrarPropietarioActionPerformed

    private void btnAgendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarCitaActionPerformed

        int fila = tablaMascota.getSelectedRow();
        if (fila >= 0) {
            int idMascota = Integer.parseInt(tablaMascota.getValueAt(fila, 0).toString());

            try {
                MascotaDTO mascota = controladorMascota.buscarMascota(idMascota);

                agendarCita dialog = new agendarCita(this, true, controladorCita, controladorVet, mascota);
                dialog.setVisible(true);
                listaCita();

            } catch (MascotaNoEncontradaExcepcion e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una mascota primero.");
        }
    }//GEN-LAST:event_btnAgendarCitaActionPerformed

    private void btnIrVacunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrVacunasActionPerformed
        int fila = tablaMascota.getSelectedRow();

        if (fila >= 0) {
            int idMascota = Integer.parseInt(tablaMascota.getValueAt(fila, 0).toString());

            try {
                MascotaDTO mascota = controladorMascota.buscarMascota(idMascota);

                VentanaRegistroVacuna dialog = new VentanaRegistroVacuna(null, true, mascota, controladorVacuna);
                dialog.setVisible(true);

            } catch (MascotaNoEncontradaExcepcion e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una mascota para registrar vacuna.");
        }
    }//GEN-LAST:event_btnIrVacunasActionPerformed

    private void btnVerVacunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVacunasActionPerformed
        int fila = tablaMascota.getSelectedRow();

        if (fila >= 0) {
            int idMascota = Integer.parseInt(tablaMascota.getValueAt(fila, 0).toString());

            try {
                MascotaDTO mascota = controladorMascota.buscarMascota(idMascota);

                VentanaTablaVacuna dialog = new VentanaTablaVacuna(null, true, mascota, controladorVacuna);
                dialog.setVisible(true);

            } catch (MascotaNoEncontradaExcepcion e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una mascota para ver sus vacunas.");
        }
    }//GEN-LAST:event_btnVerVacunasActionPerformed

    private void btnVerMascotaPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMascotaPropietarioActionPerformed
        int fila = tablaPropietario.getSelectedRow();

        if (fila >= 0) {
            int idPropietario = Integer.parseInt(tablaPropietario.getValueAt(fila, 0).toString());

            VentanaTablaMascota dialog = new VentanaTablaMascota(null, true, controladorPropietario);
            dialog.cargarMascota(idPropietario);
            dialog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un propietario para ver sus mascotas.");
        }
    }//GEN-LAST:event_btnVerMascotaPropietarioActionPerformed

    private void btnAgregarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarConsultaActionPerformed
        int filaSeleccionada = tablaCita.getSelectedRow();
        if (filaSeleccionada >= 0) {
            CitaDTO cita = controladorCita.obtenerCitaDTO().get(filaSeleccionada);
            VentanaRegistroConsulta dialog = new VentanaRegistroConsulta(this, true, cita, controladorConsulta, controladorVet);
            dialog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una cita primero.");
        }
    }//GEN-LAST:event_btnAgregarConsultaActionPerformed

    private void btnVerConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerConsultaActionPerformed
        int fila = tablaMascota.getSelectedRow();

        if (fila >= 0) {
            int idMascota = Integer.parseInt(tablaMascota.getValueAt(fila, 0).toString());

            try {
                MascotaDTO mascota = controladorMascota.buscarMascota(idMascota);

                VentanaTablaConsulta dialog = new VentanaTablaConsulta(null, true, mascota, controladorConsulta);
                dialog.setVisible(true);

            } catch (MascotaNoEncontradaExcepcion e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una mascota para ver sus consultas.");
        }
    }//GEN-LAST:event_btnVerConsultaActionPerformed


    private void btnAsignarAPropietarioMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarAPropietarioMascotaActionPerformed
        // TODO add your handling code here:
        try {
            // Verificar que hay una fila seleccionada en la tabla
            int filaSeleccionada = tablaMascota.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this,
                        "Debe seleccionar una mascota de la tabla primero.",
                        "Selección requerida",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Obtener el ID de la mascota desde la tabla.
            int idMascotaSeleccionada = (Integer) tablaMascota.getValueAt(filaSeleccionada, 0);
            String nombreMascota = (String) tablaMascota.getValueAt(filaSeleccionada, 1);

            // Verificar si la mascota ya tiene propietario
            boolean tienePropietario = controladorMascota.mascotaTienePropietario(idMascotaSeleccionada);

            if (tienePropietario) {
                int opcion = JOptionPane.showConfirmDialog(this,
                        "La mascota '" + nombreMascota + "' ya tiene un propietario.\n¿Desea cambiar el propietario?",
                        "Mascota con propietario",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                if (opcion != JOptionPane.YES_OPTION) {
                    return;
                }
            }

            // Solicitar el ID del propietario
            String idPropietarioStr = JOptionPane.showInputDialog(this,
                    "Ingrese el ID del propietario para la mascota '" + nombreMascota + "':",
                    "Asignar Propietario",
                    JOptionPane.QUESTION_MESSAGE);

            // Verificar si el usuario canceló
            if (idPropietarioStr == null) {
                return;
            }

            // Valida que no esté vacío
            if (idPropietarioStr.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "El ID del propietario no puede estar vacío.",
                        "Error de validación",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Valida que sea un número
            int idPropietario;
            try {
                idPropietario = Integer.parseInt(idPropietarioStr.trim());

                if (idPropietario <= 0) {
                    JOptionPane.showMessageDialog(this,
                            "El ID del propietario debe ser un número positivo.",
                            "Error de validación",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "El ID del propietario debe ser un número válido.",
                        "Error de formato",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Intentar asignar el propietario
            boolean asignado = controladorMascota.asignarPropietarioAMascota(idMascotaSeleccionada, idPropietario);

            if (asignado) {
                JOptionPane.showMessageDialog(this,
                        "Propietario asignado correctamente a la mascota '" + nombreMascota + "'.",
                        "Éxito",
                        JOptionPane.INFORMATION_MESSAGE);

                // Actualiza la tabla
                cargarTablaMascotas();

                if (filaSeleccionada < tablaMascota.getRowCount()) {
                    tablaMascota.setRowSelectionInterval(filaSeleccionada, filaSeleccionada);
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "No se pudo asignar el propietario. Intente nuevamente.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (MascotaNoEncontradaExcepcion ex) {
            JOptionPane.showMessageDialog(this,
                    "Error: " + ex.getMessage(),
                    "Mascota no encontrada",
                    JOptionPane.ERROR_MESSAGE);

        } catch (PropietarioNoEncontradoExcepcion ex) {
            JOptionPane.showMessageDialog(this,
                    "Error: " + ex.getMessage(),
                    "Propietario no encontrado",
                    JOptionPane.ERROR_MESSAGE);

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this,
                    "Error de validación: " + ex.getMessage(),
                    "Error",
                    JOptionPane.WARNING_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error inesperado: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAsignarAPropietarioMascotaActionPerformed

    private void cargarTablaMascotas() {
        tablaMascota.setModel(controladorMascota.listarMascotasTabla());
    }

    // ========================= MÉTODOS AUXILIARES DE VALIDACIÓN =========================
    private boolean camposVacios(String... campos) {
        for (String campo : campos) {
            if (campo == null || campo.trim().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private boolean esEnteroPositivo(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return false;
        }
        for (char c : texto.trim().toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return Integer.parseInt(texto.trim()) > 0;
    }

    private boolean esDecimalPositivo(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return false;
        }
        boolean puntoEncontrado = false;
        for (char c : texto.trim().toCharArray()) {
            if (c == '.' && !puntoEncontrado) {
                puntoEncontrado = true;
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        double valor = Double.parseDouble(texto.trim());
        return valor > 0;
    }

    private boolean validarCamposNumericos(String... campos) {
        for (String campo : campos) {
            if (!esEnteroPositivo(campo)) {
                return false;
            }
        }
        return true;
    }

    private boolean idUsadoEnSistema(int id) {
        try {
            if (controladorPropietario.buscarPropietario(id) != null) {
                return true;
            }
        } catch (PropietarioNoEncontradoExcepcion e) {
            // No pasa nada, el ID no pertenece a un propietario
        }

        try {
            if (controladorVet.buscarVeterinario(id) != null) {
                return true;
            }
        } catch (VeterinarioNoEncontradoExcepcion e) {
            // No pasa nada, el ID no pertenece a un veterinario
        }

        try {
            if (controladorMascota.buscarMascota(id) != null) {
                return true;
            }
        } catch (MascotaNoEncontradaExcepcion e) {
            // No pasa nada, el ID no pertenece a una mascota
        }

        return false;
    }

    // ========================= MÉTODOS AUXILIARES DE LIMPIEZA =========================
    private void limpiarCamposPropietario() {
        txtNombre.setText("");
        txtDoumento.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
    }

    private void limpiarCamposMascota() {
        txtNombreMascota.setText("");
        txtIdMascota.setText("");
        txtEspecie.setText("");
        txtRaza.setText("");
        spinnerEdad.setValue(0);
        txtPeso.setText("");
        txtDocPro.setText("");
    }

    private void limpiarCamposVeterinario() {
        txtDocVet.setText("");
        txtNombreVet.setText("");
        txtEspecialidadVet.setText("");
        checkDisponible.setSelected(false);
    }

    private void actualizarTablaVet() {
        tablaVeterinario.setModel(controladorVet.listarVeterinariosTabla());
    }

    private void listaCita() {
        tablaCita.setModel(controladorCita.listarCitas());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelRegistroVeterinario;
    private javax.swing.JTabbedPane Pestanas;
    private javax.swing.JButton btnActualizarDatosMascota;
    private javax.swing.JButton btnActualizarDatosPropietario;
    private javax.swing.JButton btnAgendarCita;
    private javax.swing.JButton btnAgregarConsulta;
    private javax.swing.JButton btnAsignarAPropietarioMascota;
    private javax.swing.JButton btnBuscarMascota;
    private javax.swing.JButton btnBuscarPropietario;
    private javax.swing.JButton btnBuscarVeterinario;
    private javax.swing.JButton btnEliminarMascota;
    private javax.swing.JButton btnEliminarPropietario;
    private javax.swing.JButton btnEliminarVeterinario;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnIrVacunas;
    private javax.swing.JButton btnRegistrarMascotaDueno;
    private javax.swing.JButton btnRegistrarMascotasindueno;
    private javax.swing.JButton btnRegistrarPropietario;
    private javax.swing.JButton btnRegistrarVeterinario;
    private javax.swing.JButton btnVerConsulta;
    private javax.swing.JButton btnVerMascotaPropietario;
    private javax.swing.JButton btnVerVacunas;
    private javax.swing.JCheckBox checkDisponible;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreoVet;
    private javax.swing.JLabel lblDisponibilidad;
    private javax.swing.JLabel lblDocPropietario;
    private javax.swing.JLabel lblDocVet;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblIdMascota;
    private javax.swing.JLabel lblImagenMascota;
    private javax.swing.JLabel lblImagenPropietario;
    private javax.swing.JLabel lblListaCita;
    private javax.swing.JLabel lblListaMascota;
    private javax.swing.JLabel lblListaPropietario;
    private javax.swing.JLabel lblListaVeterinario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreMascota;
    private javax.swing.JLabel lblNombreVet;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblRegistroMascota;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefonoVet;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVeterinario;
    private javax.swing.JPanel panelContendido;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelFondoCita;
    private javax.swing.JPanel panelFondoMascota;
    private javax.swing.JPanel panelFondoPropietario;
    private javax.swing.JPanel panelFondoVeterinario;
    private javax.swing.JPanel panelListaMascota;
    private javax.swing.JPanel panelListaPropietario;
    private javax.swing.JPanel panelRegistroMascota;
    private javax.swing.JPanel panelRegistroPropietario;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSpinner spinnerEdad;
    private javax.swing.JTable tablaCita;
    private javax.swing.JTable tablaMascota;
    private javax.swing.JTable tablaPropietario;
    private javax.swing.JTable tablaVeterinario;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoVet;
    private javax.swing.JTextField txtDocPro;
    private javax.swing.JTextField txtDocVet;
    private javax.swing.JTextField txtDoumento;
    private javax.swing.JTextField txtEspecialidadVet;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtIdMascota;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtNombreVet;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoVet;
    // End of variables declaration//GEN-END:variables
}
