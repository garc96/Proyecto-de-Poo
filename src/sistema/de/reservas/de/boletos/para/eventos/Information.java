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
public class Information {

    public String nombre_Archivo;
    protected String dato0;
    protected String dato1;
    protected String dato2;
    protected String dato3;

    public Information() {
    }

    public Information(String d0, String d1, String d2, String d3) {
        this.dato0 = d0;
        this.dato1 = d1;
        this.dato2 = d2;
        this.dato3 = d3;
    }

    public static ArrayList<Information> readFromFileToArray(String nombre_Archivo) {
        try {
            InputStream is = new FileInputStream(new File(nombre_Archivo));
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            String line;
            Information inf = new Information();
            ArrayList<Information> informacion = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                inf = inf.mapToCsv(line);
                informacion.add(inf);
            }
            return informacion;
        } catch (FileNotFoundException mensajeError) {
            System.out.println("File " + nombre_Archivo + " not found");
        } catch (IOException mensajeError) {
            System.out.println("Error al tratar de abrir" + nombre_Archivo);
        }
        return null;
    }

    public Information mapToCsv(String line) {
        String[] i = line.split(", ");
        return new Information(i[0], i[1], i[2], i[3]);
    }

    public String getDato0() {
        return dato0;
    }

    public void setDato0(String dato0) {
        this.dato0 = dato0;
    }

    public String getDato1() {
        return dato1;
    }

    public void setDato1(String dato1) {
        this.dato1 = dato1;
    }

    public String getDato2() {
        return dato2;
    }

    public void setDato2(String dato2) {
        this.dato2 = dato2;
    }

    public String getDato3() {
        return dato3;
    }

    public void setDato3(String dato3) {
        this.dato3 = dato3;
    }
    
    

    public String toString() {
        String mensaje = "";
        mensaje += dato0 +"\n";
        mensaje += dato1 +"\n"; 
        mensaje += dato2 +"\n";
        mensaje += dato3 +"\n";
        return mensaje;
    }

}
