/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.reservas.de.boletos.para.eventos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Galo
 */
public class Informacion {
    protected String nombre; 
    public String nombre_Archivo ; 
    
    
    public Informacion(){
    }
    
    public Informacion ( String nombreArchivo, String nombre ){
    this.nombre=nombre; 
    this.nombre_Archivo= nombre; 
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    
    public ArrayList<Informacion> readFronFileToArray () {
        try {
            InputStream is = new FileInputStream (new File(Nombre_Archivo));
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            String line; 
            Informacion i = new Informacion(); 
                ArrayList<Informacion> informacion = new ArrayList<>() ;
                while ((line= br.readLine()) != null ) {
                    i= i.M
                
                }
            }
    
    
    }
    
    public Informacion mapToCsv (String line){
        String []  i = line.split(","); 
        return new Informacion 
    }
    
}
