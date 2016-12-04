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
