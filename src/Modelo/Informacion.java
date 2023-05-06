/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author Martin
 */
public class Informacion {

    private Jugadores jugador1;
    private Jugadores jugador2;
    private int ganador;
    private final String[] categoria= new String[4];
    private final String[] acciones = new String[5];
    private final String[] animales = new String[5];
    private final String[] objetos = new String[5];
   
    
    

    public Informacion() {
        Jugadores j1 = new Jugadores(" ");
        Jugadores j2 = new Jugadores(" ");
      
        this.jugador1=j1;
        this.jugador2=j2;
     
    }

    public void generarPersonajes(String nombre, String nombre2) {
        
       jugador1.setNombre(nombre);
       jugador2.setNombre(nombre2);
       jugador1.setPuntaje(0);
       jugador2.setPuntaje2(0);
       
    }
    
    public int ganador(){
        
        int ganador1=0;
        
        if(jugador1.getPuntaje()>jugador2.getPuntaje2()){
            ganador1=1;
        }else if (jugador1.getPuntaje()<jugador2.getPuntaje2()){
            ganador1=2;
        }
        return ganador1;
    }

    public int getGanador() {
        return ganador;
    }
    
    
    
    
    public void mejoras(String texto) throws IOException{
        FileWriter mejoras = new FileWriter("C:\\Users\\Usuario\\Desktop\\UDA\\Laboratorio 2\\mejorasPictonary.txt");
        mejoras.write(texto);
        mejoras.close();         
    }
    
    public String[] categoriasTipos() throws FileNotFoundException{
        
        File file = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Pictonary\\src\\Modelo\\Categorias.txt");
        try{
           Scanner sc = new Scanner(file);
           String cate = sc.nextLine();
           categoria[0]=cate;
           categoria[1]=sc.nextLine();
           categoria[2]=sc.nextLine();
        }catch(IOException e){
            System.out.println("Archivo no encontrado"+e);
        }
      
                
        return categoria;
        
    }

    public String[] generarCatObjetos(){
        
        File file = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Pictonary\\src\\Modelo\\Objetos.txt");
         try{
           Scanner sc = new Scanner(file);
           String cate = sc.nextLine();
           objetos[0]=cate;
           objetos[1]=sc.nextLine();
           objetos[2]=sc.nextLine();
           objetos[3]=sc.nextLine();
           objetos[4]=sc.nextLine();
           
        }catch(IOException e){
            System.out.println("Archivo no encontrado"+e);
        }
        return objetos;
    }   
    
    public String[] generarCatAccion() {
        
        File file = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Pictonary\\src\\Modelo\\Acciones.txt");
         try{
           Scanner sc = new Scanner(file);
           String cate = sc.nextLine();
           acciones[0]=cate;
           acciones[1]=sc.nextLine();
           acciones[2]=sc.nextLine();
           acciones[3]=sc.nextLine();
           acciones[4]=sc.nextLine();
          
        }catch(IOException e){
            System.out.println("Archivo no encontrado"+e);
        }
        
        
        return acciones;
        
    }
    
    public String[] generarCatAnimales(){
        
        File file = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Pictonary\\src\\Modelo\\Animales.txt");
         try{
           Scanner sc = new Scanner(file);
           String cate = sc.nextLine();
           animales[0]=cate;
           animales[1]=sc.nextLine();
           animales[2]=sc.nextLine();
           animales[3]=sc.nextLine();
           animales[4]=sc.nextLine();
           
        }catch(IOException e){
            System.out.println("Archivo no encontrado"+e);
        }
        
     
        
        return animales;
        
    }
    
    public void reglasPdf() throws IOException {
        File path = new File("C:\\Users\\Usuario\\Desktop\\ReglamentoFinal.pdf");
        Desktop.getDesktop().open(path);
    }


    
    public Jugadores getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugadores jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugadores getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugadores jugador2) {
        this.jugador2 = jugador2;
    }
    

}
