/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;



import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Martin
 */
public class VistaInicio extends javax.swing.JFrame {

    /**
     * Creates new form VistaInicio
     */
    public VistaInicio() {
        initComponents();
    }
    //Lo creo para setear el icono de la aplicacion.
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Vistas/imagenes/logo/Pencil.png"));
        return retValue;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInicio = new javax.swing.JPanel();
        jLabel2Titulo = new javax.swing.JLabel();
        jButton1Play = new javax.swing.JButton();
        jButton3Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonReglas = new javax.swing.JButton();
        jLabel1Fondo = new javax.swing.JLabel();
        panelJugadores = new javax.swing.JPanel();
        jLabel5Titulo = new javax.swing.JLabel();
        jLabel4subtitulo = new javax.swing.JLabel();
        jLabel6Maximus = new javax.swing.JLabel();
        jLabel7Timon = new javax.swing.JLabel();
        jLabel8Sabius = new javax.swing.JLabel();
        jRadioButtonMaximus = new javax.swing.JRadioButton();
        jRadioButtonMaximus2 = new javax.swing.JRadioButton();
        jLabelGP1posM = new javax.swing.JLabel();
        jRadioButtonTimon = new javax.swing.JRadioButton();
        jRadioButtonTimon2 = new javax.swing.JRadioButton();
        jLabelGP1posT = new javax.swing.JLabel();
        jRadioButtonSabius = new javax.swing.JRadioButton();
        jRadioButtonSabius2 = new javax.swing.JRadioButton();
        jLabelGP1posS = new javax.swing.JLabel();
        jLabelJugador1 = new javax.swing.JLabel();
        jLabelJugador2 = new javax.swing.JLabel();
        jButtonIngresoGrupos = new javax.swing.JButton();
        jButtonSigGrupo = new javax.swing.JButton();
        jButtonContinuarPanelGrupos = new javax.swing.JButton();
        jLabelIngresoNombreGrupo1 = new javax.swing.JLabel();
        jLabelIngresoNombreGrupo2 = new javax.swing.JLabel();
        jLabel3Fondo = new javax.swing.JLabel();
        panelCategorias = new javax.swing.JPanel();
        jLabel9Titulo = new javax.swing.JLabel();
        jLabelIconoJ1 = new javax.swing.JLabel();
        jLabelIconoJ2 = new javax.swing.JLabel();
        jLabelNombreGrupo1 = new javax.swing.JLabel();
        jLabelNombreGrupo2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonComienzoCat = new javax.swing.JButton();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelDibujo = new javax.swing.JLabel();
        jButtonPaneldeDibujo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabeldecoCategorias2 = new javax.swing.JLabel();
        jLabeldecoCategorias1 = new javax.swing.JLabel();
        jLabeldecoCategorias = new javax.swing.JLabel();
        jLabelTurno1 = new javax.swing.JLabel();
        jLabelTurno2 = new javax.swing.JLabel();
        jLabelTurno3 = new javax.swing.JLabel();
        jLabel8Fondo = new javax.swing.JLabel();
        panelDibujo = new javax.swing.JPanel();
        jLabelAdivino = new javax.swing.JLabel();
        jButtonSiJ1 = new javax.swing.JButton();
        jButtonSiJ2 = new javax.swing.JButton();
        jButtonNO = new javax.swing.JButton();
        jButtonCambioDeJugadorRonda1 = new javax.swing.JButton();
        jButtonCambioDeJugadorRonda2 = new javax.swing.JButton();
        jButtonCambioDeJugadorRonda3 = new javax.swing.JButton();
        jButtonRonda2 = new javax.swing.JButton();
        jButtonRonda3 = new javax.swing.JButton();
        jLabelMensajeNO = new javax.swing.JLabel();
        jButtonFinalizarPartida = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelfONDO = new javax.swing.JLabel();
        panelFinal = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabelIconoJ1final = new javax.swing.JLabel();
        jLabelIconoJ2final = new javax.swing.JLabel();
        jLabelPuntajeFinalJ2 = new javax.swing.JLabel();
        jLabelPuntajeFinalJ1 = new javax.swing.JLabel();
        jButtonSalirFinal = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabelGanador = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButtonComentario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(700, 540));

        panelInicio.setMaximumSize(new java.awt.Dimension(700, 540));
        panelInicio.setMinimumSize(new java.awt.Dimension(700, 540));
        panelInicio.setPreferredSize(new java.awt.Dimension(700, 540));
        panelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2Titulo.setFont(new java.awt.Font("Felix Titling", 1, 100)); // NOI18N
        jLabel2Titulo.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2Titulo.setText("PICTONARY");
        panelInicio.add(jLabel2Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jButton1Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/botones/Play96.png"))); // NOI18N
        jButton1Play.setBorder(null);
        jButton1Play.setBorderPainted(false);
        jButton1Play.setContentAreaFilled(false);
        jButton1Play.setFocusPainted(false);
        jButton1Play.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1Play.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/botones/Play96.png"))); // NOI18N
        jButton1Play.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/botones/Play128.png"))); // NOI18N
        jButton1Play.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelInicio.add(jButton1Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 160, 160));

        jButton3Salir.setForeground(new java.awt.Color(255, 255, 255));
        jButton3Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/botones/Salir48.png"))); // NOI18N
        jButton3Salir.setToolTipText("Salir");
        jButton3Salir.setBorder(null);
        jButton3Salir.setBorderPainted(false);
        jButton3Salir.setContentAreaFilled(false);
        jButton3Salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3Salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/botones/Salir48.png"))); // NOI18N
        jButton3Salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/botones/salir64.png"))); // NOI18N
        jButton3Salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelInicio.add(jButton3Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 90, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/logo/Loguito.png"))); // NOI18N
        panelInicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 280, -1));

        jButtonReglas.setBackground(new java.awt.Color(255, 255, 255));
        jButtonReglas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReglas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/botones/Reglas.png"))); // NOI18N
        jButtonReglas.setBorderPainted(false);
        jButtonReglas.setContentAreaFilled(false);
        jButtonReglas.setRolloverEnabled(true);
        panelInicio.add(jButtonReglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        jLabel1Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/fondo/fondo canva.jpg"))); // NOI18N
        panelInicio.add(jLabel1Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelJugadores.setMaximumSize(new java.awt.Dimension(700, 540));
        panelJugadores.setMinimumSize(new java.awt.Dimension(700, 540));
        panelJugadores.setPreferredSize(new java.awt.Dimension(700, 540));
        panelJugadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5Titulo.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        jLabel5Titulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5Titulo.setText("p  i  c  t  I  O  N  A  R  Y ");
        panelJugadores.add(jLabel5Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 530, 50));

        jLabel4subtitulo.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel4subtitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4subtitulo.setText("Elegí un personaje para tu equipo:");
        panelJugadores.add(jLabel4subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel6Maximus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/personajes/UseMind.png"))); // NOI18N
        panelJugadores.add(jLabel6Maximus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 210));

        jLabel7Timon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/personajes/Kid.png"))); // NOI18N
        panelJugadores.add(jLabel7Timon, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jLabel8Sabius.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/personajes/Perro.png"))); // NOI18N
        panelJugadores.add(jLabel8Sabius, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jRadioButtonMaximus.setContentAreaFilled(false);
        panelJugadores.add(jRadioButtonMaximus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jRadioButtonMaximus2.setContentAreaFilled(false);
        panelJugadores.add(jRadioButtonMaximus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jLabelGP1posM.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabelGP1posM.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGP1posM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelJugadores.add(jLabelGP1posM, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 100, 30));

        jRadioButtonTimon.setContentAreaFilled(false);
        panelJugadores.add(jRadioButtonTimon, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 30, 60));

        jRadioButtonTimon2.setContentAreaFilled(false);
        panelJugadores.add(jRadioButtonTimon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 30, 40));

        jLabelGP1posT.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabelGP1posT.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGP1posT.setAlignmentX(0.5F);
        panelJugadores.add(jLabelGP1posT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 110, 30));

        jRadioButtonSabius.setContentAreaFilled(false);
        panelJugadores.add(jRadioButtonSabius, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));

        jRadioButtonSabius2.setContentAreaFilled(false);
        panelJugadores.add(jRadioButtonSabius2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));

        jLabelGP1posS.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabelGP1posS.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGP1posS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelJugadores.add(jLabelGP1posS, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 80, 30));

        jLabelJugador1.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jLabelJugador1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelJugador1.setText("Nombre del Grupo 1:");
        panelJugadores.add(jLabelJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabelJugador2.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jLabelJugador2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelJugador2.setText("Nombre del Grupo 2:");
        panelJugadores.add(jLabelJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jButtonIngresoGrupos.setBackground(new java.awt.Color(153, 153, 255));
        jButtonIngresoGrupos.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        jButtonIngresoGrupos.setForeground(new java.awt.Color(0, 0, 0));
        jButtonIngresoGrupos.setText("Ingresar nombre del equipo número 1:");
        panelJugadores.add(jButtonIngresoGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, 40));

        jButtonSigGrupo.setBackground(new java.awt.Color(153, 153, 255));
        jButtonSigGrupo.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        jButtonSigGrupo.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSigGrupo.setText("Confirmar equipo 1");
        panelJugadores.add(jButtonSigGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, 50));

        jButtonContinuarPanelGrupos.setBackground(new java.awt.Color(153, 153, 255));
        jButtonContinuarPanelGrupos.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        jButtonContinuarPanelGrupos.setForeground(new java.awt.Color(0, 0, 0));
        jButtonContinuarPanelGrupos.setText("Continuar");
        jButtonContinuarPanelGrupos.setContentAreaFilled(false);
        jButtonContinuarPanelGrupos.setOpaque(true);
        panelJugadores.add(jButtonContinuarPanelGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, 50));

        jLabelIngresoNombreGrupo1.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabelIngresoNombreGrupo1.setForeground(new java.awt.Color(0, 0, 0));
        panelJugadores.add(jLabelIngresoNombreGrupo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 150, 30));

        jLabelIngresoNombreGrupo2.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabelIngresoNombreGrupo2.setForeground(new java.awt.Color(0, 0, 0));
        panelJugadores.add(jLabelIngresoNombreGrupo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 200, 30));

        jLabel3Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/fondo/CANVA.png"))); // NOI18N
        jLabel3Fondo.setText("jLabel3");
        jLabel3Fondo.setMaximumSize(new java.awt.Dimension(700, 540));
        jLabel3Fondo.setMinimumSize(new java.awt.Dimension(700, 540));
        jLabel3Fondo.setPreferredSize(new java.awt.Dimension(700, 540));
        panelJugadores.add(jLabel3Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelCategorias.setMaximumSize(new java.awt.Dimension(700, 540));
        panelCategorias.setMinimumSize(new java.awt.Dimension(700, 540));
        panelCategorias.setPreferredSize(new java.awt.Dimension(700, 540));
        panelCategorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9Titulo.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel9Titulo.setForeground(new java.awt.Color(102, 0, 51));
        jLabel9Titulo.setText("Es el turno de: ");
        panelCategorias.add(jLabel9Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 180, 60));

        jLabelIconoJ1.setMaximumSize(new java.awt.Dimension(200, 200));
        jLabelIconoJ1.setMinimumSize(new java.awt.Dimension(200, 200));
        jLabelIconoJ1.setPreferredSize(new java.awt.Dimension(200, 200));
        panelCategorias.add(jLabelIconoJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabelIconoJ2.setMaximumSize(new java.awt.Dimension(200, 200));
        jLabelIconoJ2.setMinimumSize(new java.awt.Dimension(220, 220));
        jLabelIconoJ2.setPreferredSize(new java.awt.Dimension(200, 200));
        panelCategorias.add(jLabelIconoJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabelNombreGrupo1.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabelNombreGrupo1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombreGrupo1.setToolTipText("");
        panelCategorias.add(jLabelNombreGrupo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 180, 30));

        jLabelNombreGrupo2.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabelNombreGrupo2.setForeground(new java.awt.Color(51, 51, 51));
        panelCategorias.add(jLabelNombreGrupo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 180, 30));

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("Oprimí el botón \"iniciar\" para ver que debes dibujar!");
        panelCategorias.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 690, -1));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("¡OJO! Asegurate de que ningún miembro de tu equipo esté viendo la pantalla");
        panelCategorias.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 337, 620, 20));

        jButtonComienzoCat.setBackground(new java.awt.Color(153, 153, 255));
        jButtonComienzoCat.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jButtonComienzoCat.setForeground(new java.awt.Color(255, 255, 255));
        jButtonComienzoCat.setText("Iniciar");
        panelCategorias.add(jButtonComienzoCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        jLabelCategoria.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(102, 0, 0));
        jLabelCategoria.setText("lholacomoestas\n");
        panelCategorias.add(jLabelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 120, 50));

        jLabelDibujo.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jLabelDibujo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDibujo.setText("hhhhhhhhhhhhhhhhhhhhhhhhh");
        panelCategorias.add(jLabelDibujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 180, 50));

        jButtonPaneldeDibujo.setBackground(new java.awt.Color(153, 153, 255));
        jButtonPaneldeDibujo.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jButtonPaneldeDibujo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPaneldeDibujo.setText("Panel De Dibujo");
        panelCategorias.add(jButtonPaneldeDibujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 230, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/logo/dangerhd_106103.png"))); // NOI18N
        panelCategorias.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 50));

        jLabeldecoCategorias2.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabeldecoCategorias2.setForeground(new java.awt.Color(102, 0, 51));
        jLabeldecoCategorias2.setText("Te toca dibujar ");
        panelCategorias.add(jLabeldecoCategorias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 180, 50));

        jLabeldecoCategorias1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/logo/flechita.png"))); // NOI18N
        panelCategorias.add(jLabeldecoCategorias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, 50));

        jLabeldecoCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/logo/categoria final.png"))); // NOI18N
        panelCategorias.add(jLabeldecoCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 392, -1, 60));

        jLabelTurno1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTurno1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTurno1.setText("Ronda 1");
        panelCategorias.add(jLabelTurno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabelTurno2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTurno2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTurno2.setText("Ronda 2");
        panelCategorias.add(jLabelTurno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabelTurno3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTurno3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTurno3.setText("Ronda 3");
        panelCategorias.add(jLabelTurno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel8Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/fondo/CANVA.png"))); // NOI18N
        panelCategorias.add(jLabel8Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelDibujo.setMaximumSize(new java.awt.Dimension(700, 540));
        panelDibujo.setMinimumSize(new java.awt.Dimension(700, 540));
        panelDibujo.setPreferredSize(new java.awt.Dimension(700, 540));
        panelDibujo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAdivino.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabelAdivino.setForeground(new java.awt.Color(102, 0, 0));
        jLabelAdivino.setText("¿Adivinaron?");
        panelDibujo.add(jLabelAdivino, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 160, -1));

        jButtonSiJ1.setBackground(new java.awt.Color(153, 153, 255));
        jButtonSiJ1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jButtonSiJ1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSiJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/logo/tic correcto.png"))); // NOI18N
        jButtonSiJ1.setBorderPainted(false);
        jButtonSiJ1.setContentAreaFilled(false);
        panelDibujo.add(jButtonSiJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 70, 70));

        jButtonSiJ2.setBackground(new java.awt.Color(153, 153, 255));
        jButtonSiJ2.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jButtonSiJ2.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSiJ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/logo/tic correcto.png"))); // NOI18N
        jButtonSiJ2.setBorderPainted(false);
        jButtonSiJ2.setContentAreaFilled(false);
        jButtonSiJ2.setFocusPainted(false);
        panelDibujo.add(jButtonSiJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 70, 70));

        jButtonNO.setBackground(new java.awt.Color(153, 153, 255));
        jButtonNO.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jButtonNO.setForeground(new java.awt.Color(0, 0, 0));
        jButtonNO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/logo/incorrecto.png"))); // NOI18N
        jButtonNO.setBorderPainted(false);
        jButtonNO.setContentAreaFilled(false);
        panelDibujo.add(jButtonNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 70, 70));

        jButtonCambioDeJugadorRonda1.setBackground(new java.awt.Color(153, 153, 255));
        jButtonCambioDeJugadorRonda1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jButtonCambioDeJugadorRonda1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCambioDeJugadorRonda1.setText("Cambio de Jugador");
        panelDibujo.add(jButtonCambioDeJugadorRonda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        jButtonCambioDeJugadorRonda2.setBackground(new java.awt.Color(153, 153, 255));
        jButtonCambioDeJugadorRonda2.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jButtonCambioDeJugadorRonda2.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCambioDeJugadorRonda2.setText("Cambio de Jugador");
        panelDibujo.add(jButtonCambioDeJugadorRonda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        jButtonCambioDeJugadorRonda3.setBackground(new java.awt.Color(153, 153, 255));
        jButtonCambioDeJugadorRonda3.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jButtonCambioDeJugadorRonda3.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCambioDeJugadorRonda3.setText("Cambio de jugador");
        panelDibujo.add(jButtonCambioDeJugadorRonda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 220, -1));

        jButtonRonda2.setBackground(new java.awt.Color(153, 153, 255));
        jButtonRonda2.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jButtonRonda2.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRonda2.setText("Ronda 2");
        panelDibujo.add(jButtonRonda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jButtonRonda3.setBackground(new java.awt.Color(153, 153, 255));
        jButtonRonda3.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jButtonRonda3.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRonda3.setText("Ronda 3");
        panelDibujo.add(jButtonRonda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jLabelMensajeNO.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelMensajeNO.setForeground(new java.awt.Color(0, 0, 0));
        panelDibujo.add(jLabelMensajeNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 470, 30));

        jButtonFinalizarPartida.setBackground(new java.awt.Color(153, 153, 255));
        jButtonFinalizarPartida.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jButtonFinalizarPartida.setForeground(new java.awt.Color(0, 0, 0));
        jButtonFinalizarPartida.setText("FINALIZAR PARTIDA");
        panelDibujo.add(jButtonFinalizarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 220, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/logo/signo pregunta.png"))); // NOI18N
        panelDibujo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("Perpetua Titling MT", 1, 53)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("¡CUIDADO!");
        panelDibujo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/logo/warning.png"))); // NOI18N
        panelDibujo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jLabel13.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Tomense su tiempo para decidir si adivinó el otro equipo");
        panelDibujo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Ya que no se puede volver atrás con selección del botón!");
        panelDibujo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabelfONDO.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelfONDO.setForeground(new java.awt.Color(0, 0, 0));
        jLabelfONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/fondo/CANVA.png"))); // NOI18N
        jLabelfONDO.setMaximumSize(new java.awt.Dimension(700, 540));
        jLabelfONDO.setMinimumSize(new java.awt.Dimension(700, 540));
        jLabelfONDO.setPreferredSize(new java.awt.Dimension(700, 540));
        panelDibujo.add(jLabelfONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelFinal.setMaximumSize(new java.awt.Dimension(700, 540));
        panelFinal.setMinimumSize(new java.awt.Dimension(700, 540));
        panelFinal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 26, 32));
        jLabel6.setText("RESULTADOS");
        panelFinal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));
        panelFinal.add(jLabelIconoJ1final, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 200, 200));
        panelFinal.add(jLabelIconoJ2final, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 200, 200));

        jLabelPuntajeFinalJ2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelPuntajeFinalJ2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPuntajeFinalJ2.setAutoscrolls(true);
        jLabelPuntajeFinalJ2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelFinal.add(jLabelPuntajeFinalJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 30, 60));

        jLabelPuntajeFinalJ1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelPuntajeFinalJ1.setForeground(new java.awt.Color(51, 51, 51));
        panelFinal.add(jLabelPuntajeFinalJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 30, 60));

        jButtonSalirFinal.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSalirFinal.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSalirFinal.setText("Salir");
        panelFinal.add(jButtonSalirFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 200, -1));

        jLabel15.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Ganador:");
        panelFinal.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 140, 50));

        jLabelGanador.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabelGanador.setForeground(new java.awt.Color(51, 51, 255));
        panelFinal.add(jLabelGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 210, 50));

        jLabel16.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Felicitaciones.");
        panelFinal.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, 50));

        jButtonComentario.setBackground(new java.awt.Color(0, 255, 255));
        jButtonComentario.setText("Comentario");
        panelFinal.add(jButtonComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 482, 110, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/logo/Trofeo.png"))); // NOI18N
        panelFinal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/logo/Trofeo.png"))); // NOI18N
        panelFinal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/fondo/fondo canva.jpg"))); // NOI18N
        panelFinal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelDibujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelDibujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-------------------------------------
    //----------Panel Jugadores------------
    //-------------------------------------
    
    //LABELS QUE MUESTRAN INFORMACION
    
    public JLabel getjLabelIngresoNombreGrupo1() {
        return jLabelIngresoNombreGrupo1;
    }

    public JLabel getjLabelIngresoNombreGrupo2() {
        return jLabelIngresoNombreGrupo2;
    }
    
    //Decorativos
    public JLabel getjLabelJugador1() {
        return jLabelJugador1;
    }

    public JLabel getjLabelJugador2() {
        return jLabelJugador2;
    }
    
    public JLabel getjLabelGP1posM() {
        return jLabelGP1posM;
    }

    public JLabel getjLabelGP1posS() {
        return jLabelGP1posS;
    }

    public JLabel getjLabelGP1posT() {
        return jLabelGP1posT;
    }
     public JLabel getjLabel6Maximus() {
        return jLabel6Maximus;
    }

    public JLabel getjLabel7Timon() {
        return jLabel7Timon;
    }

    public JLabel getjLabelSabius() {
        return jLabel8Sabius;
    }
    
    //-------------------------------------
    //----------Panel Categorias-----------
    //-------------------------------------
    
    //Labels que muestran informacion
    
    public JLabel getjLabelNombreGrupo1() {
        return jLabelNombreGrupo1;
    }

    public JLabel getjLabelNombreGrupo2() {
        return jLabelNombreGrupo2;
    }

    public JLabel getjLabelCategoria() {
        return jLabelCategoria;
    }
    
    public JLabel getjLabelDibujo() {
        return jLabelDibujo;
    }
    
    public JLabel getjLabelIconoJ1() {
        return jLabelIconoJ1;
    }

    public JLabel getjLabelIconoJ2() {
        return jLabelIconoJ2;
    }
    
    //Decorativos
    
    public JLabel getjLabeldecoCategorias() {
        return jLabeldecoCategorias;
    }

    public JLabel getjLabeldecoCategorias1() {
        return jLabeldecoCategorias1;
    }

    public JLabel getjLabeldecoCategorias2() {
        return jLabeldecoCategorias2;
    }

    public JLabel getjLabelTurno1() {
        return jLabelTurno1;
    }

    public JLabel getjLabelTurno2() {
        return jLabelTurno2;
    }

    public JLabel getjLabelTurno3() {
        return jLabelTurno3;
    }
    
    
    
    //-------------------------------------
    //------------Panel Dibujo-------------
    //-------------------------------------
    //Labels que muestran informacion
    
    public JLabel getjLabelMensajeNO() {
        return jLabelMensajeNO;
    }
    

   
    //-------------------------------------
    //-------------Panel Final-------------
    //-------------------------------------
    
    //Labels que muestran informacion
    public JLabel getjLabelIconoJ1final() {
        return jLabelIconoJ1final;
    }

    public JLabel getjLabelIconoJ2final() {
        return jLabelIconoJ2final;
    }
    
     public JLabel getjLabelGanador() {
        return jLabelGanador;
    }  
     
    public JLabel getjLabelPuntajeFinalJ1() {
        return jLabelPuntajeFinalJ1;
    }

    public JLabel getjLabelPuntajeFinalJ2() {    
        return jLabelPuntajeFinalJ2;
    }
    //decorativos
    public JLabel getjLabelAdivino() {
        return jLabelAdivino;
    }
    
    
    //GETTERS DE LOS PANELES
    

    public JPanel getPanelCategorias() {
        return panelCategorias;
    }

    public JPanel getPanelInicio() {
        return panelInicio;
    }

    public JPanel getPanelJugadores() {
        return panelJugadores;
    }

    public JPanel getPanelDibujo() {
        return panelDibujo;
    }

    public JPanel getPanelFinal() {
        return panelFinal;
    }
    
    
   

    
    //GETTERS DE LOS BOTONES
    
   
    public JButton getjButton1Play() {
        return jButton1Play;
    }

    public JButton getjButton3Salir() {
        return jButton3Salir;
    }

    public JButton getjButtonComentario() {
        return jButtonComentario;
    }
    
    public JButton getjButtonContinuarPanelGrupos() {
        return jButtonContinuarPanelGrupos;
    }

    public JButton getjButtonComienzoCat() {
        return jButtonComienzoCat;
    }

    public JButton getjButtonPaneldeDibujo() {
        return jButtonPaneldeDibujo;
    }

    public JButton getjButtonReglas() {
        return jButtonReglas;
    }

    public JButton getjButtonIngresoGrupos() {
        return jButtonIngresoGrupos;
    }

    public JButton getjButtonSigGrupo() {
        return jButtonSigGrupo;
    }

    public JButton getjButtonSalirFinal() {   
        return jButtonSalirFinal;
    }

    public JButton getjButtonNO() {
        return jButtonNO;
    }

    public JButton getjButtonSiJ1() {
        return jButtonSiJ1;
    }

    public JButton getjButtonSiJ2() {
        return jButtonSiJ2;
    }

    public JButton getjButtonRonda2() {
        return jButtonRonda2;
    }

    public JButton getjButtonRonda3() {
        return jButtonRonda3;
    }

    public JButton getjButtonFinalizarPartida() {
        return jButtonFinalizarPartida;
    }
    
    public JButton getjButtonCambioDeJugadorRonda1() {
        return jButtonCambioDeJugadorRonda1;
    }

    public JButton getjButtonCambioDeJugadorRonda2() {
        return jButtonCambioDeJugadorRonda2;
    }

    public JButton getjButtonCambioDeJugadorRonda3() {
        return jButtonCambioDeJugadorRonda3;
    }
    
    
    
     //GETTERS DE LOS CHECKBOXS

    public JRadioButton getjRadioButtonMaximus() {
        return jRadioButtonMaximus;
    }

    public JRadioButton getjRadioButtonTimon() {
        return jRadioButtonTimon;
    }

    public JRadioButton getjRadioButtonSabius() {
        return jRadioButtonSabius;
    }

    public JRadioButton getjRadioButtonMaximus2() {
        return jRadioButtonMaximus2;
    }

    public JRadioButton getjRadioButtonSabius2() {
        return jRadioButtonSabius2;
    }

    public JRadioButton getjRadioButtonTimon2() {
        return jRadioButtonTimon2;
    }
    
   

  
   

    
    
 

  

    

   

   

    

    
    
    

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Play;
    private javax.swing.JButton jButton3Salir;
    private javax.swing.JButton jButtonCambioDeJugadorRonda1;
    private javax.swing.JButton jButtonCambioDeJugadorRonda2;
    private javax.swing.JButton jButtonCambioDeJugadorRonda3;
    private javax.swing.JButton jButtonComentario;
    private javax.swing.JButton jButtonComienzoCat;
    private javax.swing.JButton jButtonContinuarPanelGrupos;
    private javax.swing.JButton jButtonFinalizarPartida;
    private javax.swing.JButton jButtonIngresoGrupos;
    private javax.swing.JButton jButtonNO;
    private javax.swing.JButton jButtonPaneldeDibujo;
    private javax.swing.JButton jButtonReglas;
    private javax.swing.JButton jButtonRonda2;
    private javax.swing.JButton jButtonRonda3;
    private javax.swing.JButton jButtonSalirFinal;
    private javax.swing.JButton jButtonSiJ1;
    private javax.swing.JButton jButtonSiJ2;
    private javax.swing.JButton jButtonSigGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel1Fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Titulo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3Fondo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4subtitulo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel5Titulo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6Maximus;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel7Timon;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel8Fondo;
    private javax.swing.JLabel jLabel8Sabius;
    private javax.swing.JLabel jLabel9Titulo;
    private javax.swing.JLabel jLabelAdivino;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelDibujo;
    private javax.swing.JLabel jLabelGP1posM;
    private javax.swing.JLabel jLabelGP1posS;
    private javax.swing.JLabel jLabelGP1posT;
    private javax.swing.JLabel jLabelGanador;
    private javax.swing.JLabel jLabelIconoJ1;
    private javax.swing.JLabel jLabelIconoJ1final;
    private javax.swing.JLabel jLabelIconoJ2;
    private javax.swing.JLabel jLabelIconoJ2final;
    private javax.swing.JLabel jLabelIngresoNombreGrupo1;
    private javax.swing.JLabel jLabelIngresoNombreGrupo2;
    private javax.swing.JLabel jLabelJugador1;
    private javax.swing.JLabel jLabelJugador2;
    private javax.swing.JLabel jLabelMensajeNO;
    private javax.swing.JLabel jLabelNombreGrupo1;
    private javax.swing.JLabel jLabelNombreGrupo2;
    private javax.swing.JLabel jLabelPuntajeFinalJ1;
    private javax.swing.JLabel jLabelPuntajeFinalJ2;
    private javax.swing.JLabel jLabelTurno1;
    private javax.swing.JLabel jLabelTurno2;
    private javax.swing.JLabel jLabelTurno3;
    private javax.swing.JLabel jLabeldecoCategorias;
    private javax.swing.JLabel jLabeldecoCategorias1;
    private javax.swing.JLabel jLabeldecoCategorias2;
    private javax.swing.JLabel jLabelfONDO;
    private javax.swing.JRadioButton jRadioButtonMaximus;
    private javax.swing.JRadioButton jRadioButtonMaximus2;
    private javax.swing.JRadioButton jRadioButtonSabius;
    private javax.swing.JRadioButton jRadioButtonSabius2;
    private javax.swing.JRadioButton jRadioButtonTimon;
    private javax.swing.JRadioButton jRadioButtonTimon2;
    private javax.swing.JPanel panelCategorias;
    private javax.swing.JPanel panelDibujo;
    private javax.swing.JPanel panelFinal;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelJugadores;
    // End of variables declaration//GEN-END:variables

}
