/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.reservas.de.boletos.para.eventos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Galo
 */
public class Informacion {
    public String nombre_Archivo ;
    protected String dato0; 
    protected String dato1;
    protected String dato2;
    protected String dato3;
  
    public Informacion(){
    }
    
    public Informacion (String d0, String d1, String d2,  String d3 ){
        this.dato0=d0;
        this.dato1=d1; 
        this.dato2=d2;
        this.dato3=d3; 
    }
    
    public static ArrayList<Informacion> readFronmFileToArray (String nombre_Archivo) {
        try {
            InputStream is = new FileInputStream (new File(nombre_Archivo));
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            String line; 
            Informacion i = new Informacion(); 
                ArrayList<Informacion> informacion = new ArrayList<>() ;
                while ((line= br.readLine()) != null ) {
                    i=i.mapToCsv(line);
                }
            return informacion;
            }
        catch (FileNotFoundException mensajeError){
            System.out.println("File " + nombre_Archivo + " not found");
            }
        catch (IOException mensajeError){
            System.out.println("Error al tratar de abrir" + nombre_Archivo); 
            }
        return null; 
    }
    
    public Informacion mapToCsv (String line){
        String []  i = line.split(","); 
        return new Informacion(i[0],i[1],i[2],i[3]);  
    }
    
}
