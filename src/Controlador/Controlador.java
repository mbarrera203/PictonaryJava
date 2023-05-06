/*Guardado linea 912*/

package Controlador;

import Modelo.Informacion;
import Vistas.VistaInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.Timer;
import java.util.TimerTask;

//Panel de dibujo
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Martin
 */
public class Controlador implements ActionListener, ChangeListener {

    private VistaInicio v1;
    
    private Informacion i;

    public Controlador() {
        VistaInicio v = new VistaInicio();
        Informacion i = new Informacion();
        this.v1 = v;
        this.i = i;

        v.setVisible(true);

    }

    //Metodos del menu principal
    public void IniciarJuego() {

        v1.getPanelInicio().setVisible(true);
        v1.getPanelJugadores().setVisible(false);
        v1.getPanelCategorias().setVisible(false);
        v1.getPanelDibujo().setVisible(false);
        v1.getPanelFinal().setVisible(false);
        //botones del juego
        v1.getjButton1Play().addActionListener(this);
        v1.getjButtonReglas().addActionListener(this);
        v1.getjButtonComentario().addActionListener(this);
        v1.getjButton3Salir().addActionListener(this);
        v1.getjButtonIngresoGrupos().addActionListener(this);
        v1.getjButtonSigGrupo().addActionListener(this);
        v1.getjButtonContinuarPanelGrupos().addActionListener(this);
        v1.getjButtonComienzoCat().addActionListener(this);
        v1.getjButtonPaneldeDibujo().addActionListener(this);
        v1.getjButtonRonda2().addActionListener(this);
        v1.getjButtonRonda3().addActionListener(this);
        v1.getjButtonNO().addActionListener(this);
        v1.getjButtonFinalizarPartida().addActionListener(this);
        v1.getjButtonSalirFinal().addActionListener(this);
        //RadioButton
        v1.getjRadioButtonMaximus().addChangeListener(this);
        v1.getjRadioButtonTimon().addChangeListener(this);
        v1.getjRadioButtonSabius().addChangeListener(this);
        v1.getjRadioButtonMaximus2().addChangeListener(this);
        v1.getjRadioButtonTimon2().addChangeListener(this);
        v1.getjRadioButtonSabius2().addChangeListener(this);

    }

    public void tiempoDibujo() {
        PanelDeDibujo dib = new PanelDeDibujo();
        Timer time = new Timer();
       

        TimerTask bloqueo = new TimerTask() {
            @Override
            public void run() {
                dib.getFrame().setEnabled(false);
            }
        };
        time.schedule(bloqueo, 5000, 10000);
//        TimerTask mostrar = new TimerTask() {
//            @Override
//            public void run() {
//                JOptionPane.showMessageDialog(dib.getFrame(), "Tiempo de dibujo terminado,HORA DE ADIVIANAR!");
//            }
//        };
//        time.schedule(mostrar, 6000);
        TimerTask cerrar = new TimerTask() {
            @Override
            public void run() {
                dib.getFrame().setVisible(false); 
            }
        };
        time.schedule(cerrar,10000);
   
    }

    public void validadorJugador1() {
        boolean salida = false;
        v1.getjButtonSigGrupo().setVisible(true);
        v1.getjButtonSigGrupo().setEnabled(false);
        //Utilice el try catch porque cuando precionaba el boton cancelar me mostraba un error de NullPointerException
        try {
            i.getJugador1().setNombre(JOptionPane.showInputDialog(v1, "Ingrese el nombre del Grupo 1","Equipo 1"));
            v1.getjLabelIngresoNombreGrupo1().setText(i.getJugador1().getNombre());
            String nombreJugador1 = v1.getjLabelIngresoNombreGrupo1().getText();
            do {
            if (nombreJugador1.equals("")) {
                JOptionPane.showMessageDialog(v1, "Por favor ingrese un nombre");
                i.getJugador1().setNombre(JOptionPane.showInputDialog(v1,"Ingrese el nombre del Grupo 1","Equipo 1"));
                v1.getjLabelIngresoNombreGrupo1().setText(i.getJugador1().getNombre());
                nombreJugador1 = v1.getjLabelIngresoNombreGrupo1().getText();
                if (nombreJugador1.equals("")) {
                    salida = true;
                } else {
                    salida = false;
                    v1.getjButtonSigGrupo().setEnabled(true);
                    v1.getjLabelIngresoNombreGrupo1().setEnabled(false);
                }
            }
        } while (salida != false);
            v1.getjButtonSigGrupo().setEnabled(true);
        } catch (NullPointerException e) {
            i.getJugador1().setNombre("Equipo 1");
            v1.getjLabelIngresoNombreGrupo1().setText(i.getJugador1().getNombre());
            String nombreJugador1 = v1.getjLabelIngresoNombreGrupo1().getText();
            v1.getjButtonSigGrupo().setEnabled(true);
        }


    }

    public void validadorJugador2() {
        boolean salida = false;

        v1.getjButtonContinuarPanelGrupos().setVisible(true);
        v1.getjButtonContinuarPanelGrupos().setEnabled(false);

        try {
            i.getJugador2().setNombre(JOptionPane.showInputDialog(v1, "Ingrese el nombre del Grupo 2", "Equipo 2"));
            v1.getjLabelIngresoNombreGrupo2().setText(i.getJugador2().getNombre());
            String nombreJugador2 = v1.getjLabelIngresoNombreGrupo2().getText();
            do {
                if (nombreJugador2.equals("")) {
                    JOptionPane.showMessageDialog(v1, "Por favor ingrese un nombre");
                    i.getJugador2().setNombre(JOptionPane.showInputDialog(v1, "Ingrese el nombre del Grupo 2", "Equipo 2"));
                    v1.getjLabelIngresoNombreGrupo2().setText(i.getJugador2().getNombre());
                    nombreJugador2 = v1.getjLabelIngresoNombreGrupo2().getText();
                    if (nombreJugador2.equals("")) {
                        salida = true;
                    } else {
                        salida = false;
                        v1.getjButtonContinuarPanelGrupos().setEnabled(true);
                        v1.getjLabelIngresoNombreGrupo2().setEnabled(false);
                    }

                }
            } while (salida != false);
             
        } catch (NullPointerException e) {
            i.getJugador2().setNombre("Equipo 2");
            v1.getjLabelIngresoNombreGrupo2().setText(i.getJugador2().getNombre());
            String nombreJugador2 = v1.getjLabelIngresoNombreGrupo2().getText();
            v1.getjButtonContinuarPanelGrupos().setEnabled(true);
        }

    }

    public void seleccionPersonajes(int turno) {
        ImageIcon icon;
        ImageIcon icon2;

        switch (turno) {
            case 1:
                if (v1.getjRadioButtonMaximus().isSelected() == true) {
                    icon = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Pictonary\\src\\Vistas\\imagenes\\personajes\\UseMind.png");
                    Image img = icon.getImage();
                    v1.getjLabelIconoJ1().setIcon(icon);
                    v1.getjLabelNombreGrupo1().setText(i.getJugador1().getNombre());
                    v1.getjLabelIconoJ1final().setIcon(icon);
                } else if (v1.getjRadioButtonSabius().isSelected() == true) {
                    icon = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Pictonary\\src\\Vistas\\imagenes\\personajes\\Perro.png");
                    Image img = icon.getImage();
                    v1.getjLabelIconoJ1().setIcon(icon);
                    v1.getjLabelNombreGrupo1().setText(i.getJugador1().getNombre());
                    v1.getjLabelIconoJ1final().setIcon(icon);
                } else if (v1.getjRadioButtonTimon().isSelected() == true) {
                    icon = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Pictonary\\src\\Vistas\\imagenes\\personajes\\Kid.png");
                    Image img = icon.getImage();
                    v1.getjLabelIconoJ1().setIcon(icon);
                    v1.getjLabelNombreGrupo1().setText(i.getJugador1().getNombre());
                    v1.getjLabelIconoJ1final().setIcon(icon);
                }
                
            case 2:
                if (v1.getjRadioButtonMaximus2().isSelected() == true) {
                    icon2 = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Pictonary\\src\\Vistas\\imagenes\\personajes\\UseMind.png");
                    Image img2 = icon2.getImage();
                    v1.getjLabelIconoJ2().setIcon(icon2);
                    v1.getjLabelNombreGrupo2().setText(i.getJugador2().getNombre());
                    v1.getjLabelIconoJ2final().setIcon(icon2);
                } else if (v1.getjRadioButtonSabius2().isSelected() == true) {
                    icon2 = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Pictonary\\src\\Vistas\\imagenes\\personajes\\Perro.png");
                    Image img2 = icon2.getImage();
                    v1.getjLabelIconoJ2().setIcon(icon2);
                    v1.getjLabelNombreGrupo2().setText(i.getJugador2().getNombre());
                    v1.getjLabelIconoJ2final().setIcon(icon2);
                } else if (v1.getjRadioButtonTimon2().isSelected() == true) {
                    icon2 = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Pictonary\\src\\Vistas\\imagenes\\personajes\\Kid.png");
                    Image img2 = icon2.getImage();
                    v1.getjLabelIconoJ2().setIcon(icon2);
                    v1.getjLabelNombreGrupo1().setText(i.getJugador2().getNombre());
                    v1.getjLabelIconoJ2final().setIcon(icon2);
                }
        }


    }
   
    public void designarCategoria() throws FileNotFoundException{  
        String[] cate= i.categoriasTipos();
        String[] obj = i.generarCatObjetos();
        String[] ani = i.generarCatAnimales();
        String[] acc = i.generarCatAccion();

        int op = (int) Math.floor(Math.random() *(3-1+1)+1);
        int ob = (int) Math.floor(Math.random() *(4-1+1)+1);
        
        switch(op){
            case 1:
                v1.getjLabelCategoria().setText(cate[0]);
                v1.getjLabelDibujo().setText(obj[ob]);
                break;
            case 2:
                v1.getjLabelCategoria().setText(cate[1]);
                v1.getjLabelDibujo().setText(acc[ob]);
                break;
            case 3:
                v1.getjLabelCategoria().setText(cate[2]);
                v1.getjLabelDibujo().setText(ani[ob]);
                break;
        } 
    }
    
    public void Ronda1(){
        
        //Llamo para que se muestre el icono y el nombre del Grupo1
        seleccionPersonajes(1);
        
        //Borro el boton de la siguiente ronda.
        
        v1.getjButtonRonda2().setVisible(false);
        v1.getjButtonRonda3().setVisible(false);
        v1.getjButtonFinalizarPartida().setVisible(false);
        
        //Oculto el label que especifica en que ronda estamos
        
        v1.getjLabelTurno1().setVisible(true);
        
        //Borro el boton si J2 para que no me genere problemas de suposicion.
        
        v1.getjButtonSiJ2().setVisible(false);
        
        //oculto el cambio de jugador de las otras rondas
        
        v1.getjButtonCambioDeJugadorRonda2().setVisible(false);
        v1.getjButtonCambioDeJugadorRonda3().setVisible(false);
        
        //contador de adivinadas Grupo 1.
        //Este ActionListener realiza la suma de puntajes.
        v1.getjButtonSiJ1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                i.getJugador1().setPuntaje(1+i.getJugador1().getPuntaje());
                System.out.println("Grupo 1: " + i.getJugador1().getPuntaje() + " adivinadas.");
                v1.getjButtonSiJ1().setEnabled(false);
                
            }
        });
        v1.getjButtonNO().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                v1.getjLabelMensajeNO().setText("Suerte la proxima Ronda");
            }
        });
       
        v1.getjButtonCambioDeJugadorRonda1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                v1.getjLabelTurno1().setVisible(true);
                v1.getjLabeldecoCategorias().setVisible(false);
                
                v1.getjLabeldecoCategorias1().setVisible(false);
                v1.getjLabeldecoCategorias2().setVisible(false);
                
                v1.getjLabelMensajeNO().setVisible(false);
                v1.getPanelDibujo().setVisible(false);
                v1.getPanelCategorias().setVisible(true);
                v1.getjButtonComienzoCat().setVisible(true);
                v1.getjButtonPaneldeDibujo().setVisible(false);
                //Dejo de mostrar el Icono de Grupo1,boton Si y label del nombre
                v1.getjLabelIconoJ1().setVisible(false);
                v1.getjLabelNombreGrupo1().setVisible(false);
                v1.getjButtonSiJ1().setVisible(false);
                //Muestro el icono del grupo 2 y nombre.
                seleccionPersonajes(2);
                v1.getjButtonSiJ2().setVisible(true);
                v1.getjButtonCambioDeJugadorRonda1().setVisible(false);
                v1.getjButtonCambioDeJugadorRonda2().setVisible(false);
                v1.getjButtonCambioDeJugadorRonda3().setVisible(false);
                v1.getjButtonRonda2().setVisible(true);
                v1.getjButtonRonda3().setVisible(false);
                v1.getjButtonFinalizarPartida().setVisible(false);

                v1.getjButtonNO().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        v1.getjLabelMensajeNO().setVisible(true);
                        v1.getjLabelMensajeNO().setText("Suerte la proxima Ronda");
                    }
                });
            }
        });
        v1.getjButtonSiJ2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                i.getJugador2().setPuntaje2(1 + i.getJugador2().getPuntaje2());
                System.out.println("Grupo 2: " + i.getJugador2().getPuntaje2()+ " adivinadas.");
                v1.getjButtonSiJ2().setEnabled(false);
            }

        });
        
    
    }
  
    public void Ronda2() {
        //Reinicio la jugada llamando al panel categoria
        v1.getjLabelMensajeNO().setVisible(false);
        v1.getjButtonSiJ1().setEnabled(true);
        v1.getPanelDibujo().setVisible(false);
        v1.getPanelCategorias().setVisible(true);
        v1.getjButtonComienzoCat().setVisible(true);
        v1.getjButtonPaneldeDibujo().setVisible(false);
        v1.getjLabeldecoCategorias().setVisible(false);
        v1.getjLabeldecoCategorias1().setVisible(false);
        v1.getjLabeldecoCategorias2().setVisible(false);
        
        //Oculto el label que especifica en que ronda estamos
        
        v1.getjLabelTurno1().setVisible(false);
        v1.getjLabelTurno2().setVisible(true);
        
        //Necesito borrar los labels que estan settiados como grupo 2
        
        v1.getjLabelIconoJ2().setVisible(false);
        v1.getjLabelNombreGrupo2().setVisible(false);
        
        //Llamo a los labels del con la info del grupo 1
        
        v1.getjLabelIconoJ1().setVisible(true);
        v1.getjLabelNombreGrupo1().setVisible(true);
        
        //Borro el boton de jugador 2 para que no me genere problemas
        
        v1.getjButtonSiJ2().setVisible(false);
        v1.getjButtonSiJ1().setVisible(true);
        
        //Borro el boton para pasar de ronda y el de siguiente jugador de la ronda 1
        
        v1.getjButtonRonda2().setVisible(false);
        v1.getjButtonRonda3().setVisible(false);
        v1.getjButtonFinalizarPartida().setVisible(false);
        v1.getjButtonFinalizarPartida().setVisible(false);
        v1.getjButtonCambioDeJugadorRonda1().setVisible(false);
        v1.getjButtonCambioDeJugadorRonda2().setVisible(true);
        v1.getjButtonCambioDeJugadorRonda3().setVisible(false);
        //setteo un nuevo boton para que me realice el cambio de jugador.
        //BOTON NO
        v1.getjButtonNO().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               v1.getjLabelMensajeNO().setText("Suerte la proxima Ronda");
            }
        });
        //BOTON SIGUIENTE JUGADOR
        v1.getjButtonCambioDeJugadorRonda2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                v1.getjLabelTurno1().setVisible(false);
                v1.getjLabelTurno2().setVisible(true);
        
                v1.getjLabeldecoCategorias().setVisible(false);
                v1.getjLabeldecoCategorias1().setVisible(false);
                v1.getjLabeldecoCategorias2().setVisible(false);
                v1.getjLabelMensajeNO().setVisible(false);
                v1.getPanelDibujo().setVisible(false);
                v1.getPanelCategorias().setVisible(true);
                v1.getjButtonComienzoCat().setVisible(true);
                v1.getjButtonPaneldeDibujo().setVisible(false);
                //Configuro la aparicion de la info del jugador 2

                v1.getjLabelIconoJ1().setVisible(false);
                v1.getjLabelNombreGrupo1().setVisible(false);
                v1.getjLabelIconoJ2().setVisible(true);
                v1.getjLabelNombreGrupo2().setVisible(true);

                //Botones de si
                v1.getjButtonSiJ2().setVisible(true);
                v1.getjButtonSiJ1().setVisible(false);

                //Borro el boton de siguiente jugador de la ronda 2
                v1.getjButtonCambioDeJugadorRonda2().setVisible(false);
                v1.getjButtonCambioDeJugadorRonda3().setVisible(false);
                v1.getjButtonFinalizarPartida().setVisible(false);
                v1.getjButtonRonda3().setVisible(true);
                v1.getjButtonSiJ2().setEnabled(true);

                v1.getjButtonNO().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        v1.getjLabelMensajeNO().setText("Suerte la proxima Ronda");
                    }
                });
            }
        });
    
    }
    
    public void Ronda3() {
        //Reinicio la jugada llamando al panel categoria
        v1.getjLabelMensajeNO().setVisible(false);
        v1.getjButtonSiJ1().setEnabled(true);
        v1.getPanelDibujo().setVisible(false);
        v1.getPanelCategorias().setVisible(true);
        v1.getjButtonComienzoCat().setVisible(true);
        v1.getjButtonPaneldeDibujo().setVisible(false);
        v1.getjLabeldecoCategorias().setVisible(false);
        v1.getjLabeldecoCategorias1().setVisible(false);
        v1.getjLabeldecoCategorias2().setVisible(false);
        //Oculto el label que especifica en que ronda estamos
        v1.getjLabelTurno1().setVisible(false);
        v1.getjLabelTurno2().setVisible(false);
        v1.getjLabelTurno3().setVisible(true);
        
        //Setteo como en la ronda pasada que empiece el grupo1 y borro el grupo 2
        v1.getjLabelIconoJ2().setVisible(false);
        v1.getjLabelNombreGrupo2().setVisible(false);
        //Llamo al icono y nombre del grupo 1
        v1.getjLabelIconoJ1().setVisible(true);
        v1.getjLabelNombreGrupo1().setVisible(true);
        //Borro el boton de si del grupo 2
        v1.getjButtonSiJ2().setVisible(false);
        v1.getjButtonSiJ1().setVisible(true);
        //borro el botno de ronda 3 y el de ronda 2 y muestro el de paso de jugador
        v1.getjButtonRonda2().setVisible(false);
        v1.getjButtonRonda3().setVisible(false);
        v1.getjButtonCambioDeJugadorRonda1().setVisible(false);
        v1.getjButtonCambioDeJugadorRonda2().setVisible(false);
        v1.getjButtonCambioDeJugadorRonda3().setVisible(true);
        
        //BOTON NO
        v1.getjButtonNO().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               v1.getjLabelMensajeNO().setText("Suerte la proxima Ronda");
            }
        });
        //setteo el cambio de jugador
        v1.getjButtonCambioDeJugadorRonda3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                v1.getjLabelTurno1().setVisible(false);
                v1.getjLabelTurno2().setVisible(false);
                v1.getjLabelTurno3().setVisible(true);
                
                v1.getjLabeldecoCategorias().setVisible(false);
                v1.getjLabeldecoCategorias1().setVisible(false);
                v1.getjLabeldecoCategorias2().setVisible(false);
                v1.getjLabelMensajeNO().setVisible(false);
                v1.getPanelDibujo().setVisible(false);
                v1.getPanelCategorias().setVisible(true);
                v1.getjButtonComienzoCat().setVisible(true);
                v1.getjButtonPaneldeDibujo().setVisible(false);

                v1.getjLabelIconoJ1().setVisible(false);
                v1.getjLabelNombreGrupo1().setVisible(false);
                v1.getjLabelIconoJ2().setVisible(true);
                v1.getjLabelNombreGrupo2().setVisible(true);

                v1.getjButtonSiJ2().setVisible(true);
                v1.getjButtonSiJ1().setVisible(false);

                v1.getjButtonCambioDeJugadorRonda2().setVisible(false);
                v1.getjButtonCambioDeJugadorRonda3().setVisible(false);
                v1.getjButtonSiJ2().setEnabled(true);

                v1.getjButtonFinalizarPartida().setVisible(true);

                v1.getjButtonNO().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        v1.getjLabelMensajeNO().setText("Suerte la proxima Ronda");
                    }
                });
            }
        });

    }
    
    public void finalizarPartida(){
        v1.getPanelDibujo().setVisible(false);
        v1.getPanelFinal().setVisible(true);
        v1.getjButtonComentario().setVisible(true);
        String resulG1 = String.valueOf(i.getJugador1().getPuntaje());
        String resulG2 = String.valueOf(i.getJugador2().getPuntaje2());
        
        switch (i.ganador()) {
            case 1:
                v1.getjLabelGanador().setText(i.getJugador1().getNombre());
                break;
            case 2:
                v1.getjLabelGanador().setText(i.getJugador2().getNombre());
                break;
            default:
                v1.getjLabelGanador().setText("Empate");
                break;
        }
        v1.getjLabelPuntajeFinalJ1().setText(resulG1);
        v1.getjLabelPuntajeFinalJ2().setText(resulG2);
        
    }
    //Acciones de los botones.
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == v1.getjButton1Play()) {
           
            accionesBotonPlay();

        } else if (evento.getSource() == v1.getjButton3Salir() || evento.getSource()==v1.getjButtonSalirFinal()) {
            
            System.exit(0);
            
        } else if (evento.getSource() == v1.getjButtonReglas()) {
            try {
                i.reglasPdf();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(v1, "No se encuentra el archivo");
            }
        } else if(evento.getSource()==v1.getjButtonComentario()){
            
            try {
                i.mejoras(JOptionPane.showInputDialog(v1,"Ingrese alguna mejora para el Juego"));
            } catch (IOException e) {
                e.printStackTrace();//me mas detalles del error
            }
            
        }else if (evento.getSource() == v1.getjButtonIngresoGrupos()) {
          
             accionesBotonIngresoGrupos();

        } else if (evento.getSource() == v1.getjButtonSigGrupo()) {

             accionesBotonSigGrupo();
            
        } else if (evento.getSource() == v1.getjButtonContinuarPanelGrupos()) {
            
             accionesBotonContinuarPanelGrupos();
            
        } else if (evento.getSource() == v1.getjButtonPaneldeDibujo()) {
            
             accionesBotonPanelDeDibujo();
                        
        }else if (evento.getSource() == v1.getjButtonComienzoCat()) {
             
             accionesBotonAccionesCategoria();
             
        }else if (evento.getSource() == v1.getjButtonRonda2()){
             Ronda2();
        }else if (evento.getSource() == v1.getjButtonRonda3()){
             Ronda3();
        }else if(evento.getSource()==v1.getjButtonFinalizarPartida()){
            finalizarPartida();
        }

    }
    //Hago los siguientes metodos para poder ordenar las acciones de los botones.
    private void accionesBotonPlay() {
        
        v1.getPanelInicio().setVisible(false);
        v1.getPanelJugadores().setVisible(true);
        v1.getPanelCategorias().setVisible(false);
        v1.getPanelFinal().setVisible(false);
        //OCULTO LOS LABELS Y TEXTFIELD CUANDO CAMBIA DE FRAME
        v1.getjLabelIngresoNombreGrupo1().setVisible(false);
        v1.getjLabelIngresoNombreGrupo2().setVisible(false);
        v1.getjLabelJugador1().setVisible(false);
        v1.getjLabelJugador2().setVisible(false);
        v1.getjButtonSigGrupo().setVisible(false);
        v1.getjButtonContinuarPanelGrupos().setVisible(false);
        v1.getjButtonIngresoGrupos().setEnabled(false);
        v1.getjButtonComentario().setVisible(false);
       
    }
    
    private void accionesBotonIngresoGrupos() {
        
        v1.getjButtonIngresoGrupos().setVisible(false);
        v1.getjRadioButtonMaximus2().setVisible(false);
        v1.getjRadioButtonTimon2().setVisible(false);
        v1.getjRadioButtonSabius2().setVisible(false);
        v1.getjLabelGP1posM().setVisible(false);
        v1.getjLabelGP1posT().setVisible(false);
        v1.getjLabelGP1posS().setVisible(false);
        v1.getjLabelIngresoNombreGrupo1().setVisible(true);
        v1.getjLabelJugador1().setVisible(true);
        validadorJugador1();
        
    }
    
    private void accionesBotonSigGrupo() {
        
        v1.getjLabelJugador1().setVisible(false);
        v1.getjLabelIngresoNombreGrupo1().setVisible(false);
        v1.getjButtonSigGrupo().setVisible(false);
        v1.getjRadioButtonMaximus().setVisible(false);
        v1.getjRadioButtonTimon().setVisible(false);
        v1.getjRadioButtonSabius().setVisible(false);
        v1.getjRadioButtonMaximus2().setVisible(true);
        v1.getjRadioButtonTimon2().setVisible(true);
        v1.getjRadioButtonSabius2().setVisible(true);
        v1.getjLabelJugador2().setVisible(true);
        v1.getjLabelIngresoNombreGrupo2().setVisible(true);
        v1.getjLabelTurno1().setVisible(false);
        v1.getjLabelTurno2().setVisible(false);
        v1.getjLabelTurno3().setVisible(false);
        
        
        if(v1.getjRadioButtonMaximus().isSelected()){
            v1.getjRadioButtonMaximus2().setVisible(false);
            v1.getjLabelGP1posM().setVisible(true);
        }else if(v1.getjRadioButtonTimon().isSelected()){
            v1.getjRadioButtonTimon2().setVisible(false);
            v1.getjLabelGP1posT().setVisible(true);
        }else if(v1.getjRadioButtonSabius().isSelected()){
            v1.getjRadioButtonSabius2().setVisible(false);
            v1.getjLabelGP1posS().setVisible(true);
        }
        validadorJugador2();
        Ronda1();
        
    }
    
    private void accionesBotonContinuarPanelGrupos() {

        v1.getPanelJugadores().setVisible(false);
        v1.getPanelCategorias().setVisible(true);
        v1.getjLabelCategoria().setVisible(false);
        v1.getjLabelDibujo().setVisible(false);
        v1.getjButtonPaneldeDibujo().setVisible(false);
         //oculto las decoraciones
        v1.getjLabeldecoCategorias().setVisible(false);
        v1.getjLabeldecoCategorias1().setVisible(false);
        v1.getjLabeldecoCategorias2().setVisible(false);
     

    }
    
    private void accionesBotonAccionesCategoria() {
        
        v1.getjButtonComienzoCat().setVisible(false);
        v1.getjLabelCategoria().setVisible(true);
        v1.getjLabelDibujo().setVisible(true);
        v1.getjButtonPaneldeDibujo().setVisible(true);
        v1.getjLabeldecoCategorias().setVisible(true);
        v1.getjLabeldecoCategorias1().setVisible(true);
        v1.getjLabeldecoCategorias2().setVisible(true);

        try {
            designarCategoria();
        } catch (FileNotFoundException ex) {
            System.out.println("Nose que paso aca je" + ex);
        }
    }
    
    private void accionesBotonPanelDeDibujo() {
        
        v1.getjLabelCategoria().setVisible(false);
        v1.getjLabelDibujo().setVisible(false);
        v1.getPanelCategorias().setVisible(false);
        v1.getPanelDibujo().setVisible(true);
        tiempoDibujo();
        
    }
    //Acciones de los Botones.
    @Override
    public void stateChanged(ChangeEvent ce) {

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(v1.getjRadioButtonMaximus());
        grupo.add(v1.getjRadioButtonTimon());
        grupo.add(v1.getjRadioButtonSabius());
        grupo.add(v1.getjRadioButtonMaximus2());
        grupo.add(v1.getjRadioButtonTimon2());
        grupo.add(v1.getjRadioButtonSabius2());

        if (v1.getjRadioButtonMaximus().isSelected()) {
            v1.getjButtonIngresoGrupos().setEnabled(true);
            v1.getjRadioButtonMaximus2().setVisible(false);
            v1.getjLabelGP1posM().setText(i.getJugador1().getNombre());

        } else if (v1.getjRadioButtonTimon().isSelected()) {
            v1.getjButtonIngresoGrupos().setEnabled(true);
            v1.getjRadioButtonTimon2().setVisible(false);
            v1.getjLabelGP1posT().setText(i.getJugador1().getNombre());

        } else if (v1.getjRadioButtonSabius().isSelected()) {
            v1.getjButtonIngresoGrupos().setEnabled(true);
            v1.getjRadioButtonSabius2().setVisible(false);
            v1.getjLabelGP1posS().setText(i.getJugador1().getNombre());

        } else {
            v1.getjButtonIngresoGrupos().setEnabled(false);

        }
        if (v1.getjRadioButtonMaximus2().isSelected() ) {
            v1.getjButtonContinuarPanelGrupos().setEnabled(true);

        } else if (v1.getjRadioButtonTimon2().isSelected())  {
            v1.getjButtonContinuarPanelGrupos().setEnabled(true);

        } else if (v1.getjRadioButtonSabius2().isSelected() ) {
            v1.getjButtonContinuarPanelGrupos().setEnabled(true);

        } else {
            v1.getjButtonContinuarPanelGrupos().setEnabled(false);

        }
    }

}

class ComponentesDelPanel extends JPanel {

    //Inicializo todos los componentes.
    public static final byte GOMA = 0;
    public static final byte LAPIZ = 1;
    private final JFileChooser jfc = new JFileChooser("C:/"); //Guardado del dibujo.
    private final String guardado = "png"; // Eligo el formato con el que quiero que se guarde la imagen.
    private Color colorPrincipal = Color.BLACK; //Color con el que comienza el lapiz
    private Color fondoLienzo = Color.WHITE;
    private boolean validador = true;
    private byte modoDibujo = LAPIZ; //setteo con que quiero que dibuje.
    private Graphics2D g2;
    private int currentX, currentY, oldX, oldY;// son los puntos donde el mouse hace click
    private float grosorDeLaLinea = 2.0f;
    private BufferedImage imagen;

    
    //Inicializo el mouseListner para los componentes
    public ComponentesDelPanel() {
        addMouseListener(new ComponentesDelPanel.ClickListener());
        addMouseMotionListener(new ComponentesDelPanel.DragListener());
    }

    // Lo utilizo solo para cuando el mouse es precionado.
    private class ClickListener extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            //Compruebo que se puede dibujar sobre el panel fijandome si hay algo dibujado
            if (g2 != null) {
                g2.setColor(colorPrincipal);
                oldX = e.getX();
                oldY = e.getY();

                //Si la goma esta seleccionada, la puedo utilizar borrando haciendo click continuo
                if (modoDibujo == 0) {
                    g2.setColor(fondoLienzo);
                    int ewidth = (int) (10 * grosorDeLaLinea);
                    g2.setColor(fondoLienzo);
                    g2.fill(new Rectangle(oldX - ewidth / 2,
                            oldY - ewidth / 2, ewidth, ewidth));
                    repaint();
                }
            }
        }
    }
    
    //La utilizo para escuchar lo que haga el mouse, en este caso se encarga de realizar el dibujo mientras el
    //mouse esta presionado.
    private class DragListener extends MouseMotionAdapter {

        @Override
        public void mouseDragged(MouseEvent e) {
            if (g2 != null) {
                int[] xpts;
                int[] ypts;
                switch (modoDibujo) {
                    case GOMA:
                        currentX = e.getX();
                        currentY = e.getY();
                        int ewidth = (int) (15 * grosorDeLaLinea);
                        g2.setColor(fondoLienzo);
                        g2.fill(new Rectangle(currentX - ewidth / 2,
                                currentY - ewidth / 2, ewidth, ewidth));//setteo la forma de la goma
                        repaint();
                        break;

                    case LAPIZ:
                        repaint();
                        currentX = e.getX();
                        currentY = e.getY();
                        g2.setStroke(new BasicStroke(grosorDeLaLinea));
                        g2.drawLine(oldX, oldY, currentX, currentY);
                        oldX = currentX;
                        oldY = currentY;
                        break;
                }
            }
        }
    }

    //setteo el modo de dibujo
    public void setModoDeDibujo(byte modoDibujo) {
        System.out.print("Modo de dibujado setteado en : ");
        String s = "";
        switch (modoDibujo) {
            case GOMA:
                s = "Goma.";
                break;
            case LAPIZ:
                s = "Lapiz.";
                break;
        }
        System.out.println(s);
        this.modoDibujo = modoDibujo;
    }

    //Logra que se vea más modernos los botones.
    public void suavizadoDeBordes(boolean b) {
        validador= b;
        if (b) {
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
        } else {
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_OFF);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        
        //Si la imagen es nula creo una imagen vacia
        if (imagen == null) {
            imagen = (BufferedImage) createImage(this.getSize().width,
                    this.getSize().height);
            g2 = (Graphics2D) imagen.getGraphics();
            g2.setColor(colorPrincipal);
            suavizadoDeBordes(validador);
            g2.setStroke(new BasicStroke());
            limpiar();
        }

        g2.setColor(colorPrincipal);
        g.drawImage(imagen, 0, 0, null);
    }
    
    //Realizo el GUARDADO de la imagen.
    public void guardado() throws IOException {
        jfc.setSelectedFile(new File("imagen." + guardado));//muestro con que nombre predeterminado se va a guardar el archivo
        int status = jfc.showSaveDialog(this);
        if (status == JFileChooser.APPROVE_OPTION) {
            ImageIO.write(imagen, guardado, new File(jfc.getSelectedFile().toString() + "." + guardado));
            System.out.println("Imagen guardada en: " + jfc.getSelectedFile().toString());
        }
        if (status == JFileChooser.CANCEL_OPTION) {
            System.out.println("Guardado cancelado.");
        }
    }
    
    //Funciona para limpiar la pantalla.
    public void limpiar() {
        if (g2 == null) {
            repaint();//limpia todo lo creado en el panel
        }
        Color temp = g2.getColor();
        g2.setColor(fondoLienzo);
        g2.fill(new Rectangle(this.getWidth(), this.getHeight()));//Agarra las medidas del lienzo de dibujo
        g2.setColor(temp);
        repaint();
    }
    public void setColorPrincipal(Color c) {
        colorPrincipal = c;
    }
    
}

class PanelDeDibujo {

    //Dimensiones del panel de dibujo.
    
    private static final Dimension FRAME_DIMENSION = new Dimension(800, 600);
    private static final Dimension BOTON_DIMENSION = new Dimension(22, 22);
    private static final Dimension PANEL_DIBUJO_DIMENSION = new Dimension(622, 545);
    private static final Dimension HERRAMIENTAS_PANEL_DIMENSION = new Dimension(144, 200);
    private static final Dimension PAINT_PANEL_DIMENSION = new Dimension(148, 50);
    private static final Dimension HERRAMIENTAS_BUTTON_DIMENSION = new Dimension(70, 25);

    //Bordes de los botones
    private static final int GROSOR_BORDE= 3;
    private static final Color BORDE_COLOR = Color.BLACK;

    //Light gray color of the unselected tools
    private static final Color UNSELECTED_COLOR = new Color(150, 150, 150);

    //The range of thicknesses for lines and shapes drawn
    private static final int THICKNESS_MIN = 1;
    private static final int THICKNESS_MAX = 10;

    //Creo el objeto de frame para por trabajarlo en esta clase y le hago un getter para
    //poder llamarlo y ejecutarlo en la clase principal.
    private JFrame frame = new JFrame("Paint");
    public JFrame getFrame() {
        return frame;
    }
  
    //Componentes
    private ComponentesDelPanel  pc = new ComponentesDelPanel();
    
    //Menu donde incluyo para guardar la imagen.
    private JMenuBar menuBar = new JMenuBar();
    private JMenu fileMenu = new JMenu("File");
    private JMenuItem saveMenuItem = new JMenuItem("Save");
    
    //Compruebo que el color este habilitado.
    private boolean primary = true;   

    private JPanel tamañoPanel = new JPanel();
    private JPanel panelDibujo = new JPanel();
    private JPanel colorPanel = new JPanel();
    private JPanel herramientasPanel = new JPanel();
   
    //Controles.
    private JButton primaryPreviewButton = new JButton();
    
    //Color buttons
    private JButton blanco = new JButton();
    private JButton negro = new JButton();
    private JButton gris = new JButton();
    private JButton azul = new JButton();
    private JButton rojo = new JButton();
    private JButton rosa = new JButton();
    private JButton amarillo = new JButton();
    private JButton verde = new JButton();
    private JButton lightGrayButton = new JButton();
    private JButton cyan = new JButton();
    private JButton magenta = new JButton();
    private JButton naranja = new JButton();
    private JButton goma = new JButton("Eraser");
    private JButton lapiz = new JButton("Pencil");
    private ArrayList<JButton> colorButtons = new ArrayList<JButton>();
    private ArrayList<JButton> herramientas = new ArrayList<JButton>();

    
    public PanelDeDibujo() {
        initColorButtons();
        componetesHerramientas();
        MenuBar();
        panelesYDiseño();
        initFrame();
    }

    //Inicializo los botones de los colores
    private void initColorButtons() {
        blanco.setBackground(Color.WHITE);
        negro.setBackground(Color.BLACK);
        gris.setBackground(Color.GRAY);
        azul.setBackground(Color.BLUE);
        rojo.setBackground(Color.RED);
        rosa.setBackground(Color.PINK);
        amarillo.setBackground(Color.YELLOW);
        cyan.setBackground(Color.CYAN);
        magenta.setBackground(Color.MAGENTA);
        naranja.setBackground(Color.ORANGE);
        verde.setBackground(Color.GREEN);
        lightGrayButton.setBackground(Color.LIGHT_GRAY);

        colorButtons.addAll(new ArrayList<>(Arrays.asList(negro,gris, lightGrayButton, azul, cyan,verde, blanco, amarillo, naranja,rosa, magenta, rojo)));

        //Establezco el estilo, tamaño y escucha de acciones para cada botón.
        for (int i = 0; i < colorButtons.size(); i++) {
            final int buttonIndex = i;
            colorButtons.get(i).setBorder(
                    BorderFactory.createRaisedBevelBorder());
            colorButtons.get(i).setPreferredSize(BOTON_DIMENSION);
            colorButtons.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Color tmp = colorButtons.get(buttonIndex).getBackground();
                    if (primary) {
                        pc.setColorPrincipal(tmp);
                        primaryPreviewButton.setBackground(tmp);
                    }
                }
            });
            colorPanel.add(colorButtons.get(i));
        }
    }
    private void MenuBar() {

        //Agrego la opcion de guardado al panel.
        
        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    pc.guardado();
                } catch (IOException ex) {
                    Logger.getLogger(PanelDeDibujo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu); 
    }

    
    public final void componetesHerramientas() {

        herramientas.addAll(new ArrayList<JButton>(Arrays.asList(goma,lapiz)));

        // Setteo el estilo,tamaño y actionLiseners para cada herramienta
        for (int i = 0; i < herramientas.size(); i++) {
            herramientas.get(i).setBorder(BorderFactory.createEmptyBorder());
            herramientas.get(i).setPreferredSize(HERRAMIENTAS_BUTTON_DIMENSION);
            final int toolIndex = i;
            herramientas.get(i).setForeground(UNSELECTED_COLOR);
            herramientas.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pc.setModoDeDibujo((byte) toolIndex);
                }
            });
            lapiz.setForeground(Color.BLACK);
            herramientasPanel.add(herramientas.get(i));
        }
    }

    //Especifico el lugar y tamaño de los panels
    private void panelesYDiseño() {
        
        //Paneles de colores
        GridLayout colorButtonLayout = new GridLayout(2, 6);
        colorButtonLayout.setHgap(2);//separacion horizontal entre los colores 
        colorButtonLayout.setVgap(2);//separacion horizontal entre los colores 
        colorPanel.setLayout(colorButtonLayout);
        colorPanel.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
        colorPanel.setPreferredSize(PAINT_PANEL_DIMENSION);


        //Herramientas
        herramientasPanel.setLayout(new GridLayout(herramientas.size(), 1));
        herramientasPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLoweredBevelBorder(),
                BorderFactory.createEmptyBorder(3, 3, 3, 3)));
        herramientasPanel.setPreferredSize(HERRAMIENTAS_PANEL_DIMENSION);

        //Tamaño del panel
        GridBagLayout sideLayout = new GridBagLayout();
        GridBagConstraints c;
        tamañoPanel.setBorder(BorderFactory.createEtchedBorder());
        tamañoPanel.setLayout(sideLayout);

  
        panelDibujo.setLayout(new FlowLayout(FlowLayout.LEFT));

        //Agrego los componentes al panel.
       
        panelDibujo.add(pc);

        c = new GridBagConstraints();
        tamañoPanel.add(colorPanel, c);

        c.fill = GridBagConstraints.NORTH;
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 0.0;
        c.weighty = 1.0;
        tamañoPanel.add(herramientasPanel, c);

        c.fill = GridBagConstraints.REMAINDER;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1.0;
        c.weighty = 1.0;
        tamañoPanel.add(new JPanel());
    }

    //Inicializo el Frame.
    private void initFrame() {  
        pc.setPreferredSize(PANEL_DIBUJO_DIMENSION);
        frame.add(tamañoPanel, BorderLayout.WEST);
        frame.add(panelDibujo, BorderLayout.EAST);
        //Frame Atributos.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setEnabled(true);
        frame.setResizable(false);
        frame.setJMenuBar(menuBar);
        frame.setSize(FRAME_DIMENSION);
        frame.setVisible(true);
    }

}
