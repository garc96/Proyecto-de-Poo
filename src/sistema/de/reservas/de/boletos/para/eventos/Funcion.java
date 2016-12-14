/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.reservas.de.boletos.para.eventos;

import java.util.Date;

/**
 *
 * @author FIMCP
 */
public class Funcion {
    private String nameFuncion; 
    private Date date;
    private float PrecioBoleto;
    private int BoletosVendidos;
    private int Boletos;

    public Funcion(int numFunciones, Date date, float PrecioBoleto, int BoletosVendidos) {
       
        this.date = date;
        this.PrecioBoleto = PrecioBoleto;
        this.BoletosVendidos = BoletosVendidos;
    }

    public String getNameFuncion() {
        return nameFuncion;
    }

    public void setNameFuncion(String nameFuncion) {
        this.nameFuncion = nameFuncion;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getPrecioBoleto() {
        return PrecioBoleto;
    }

    public void setPrecioBoleto(float PrecioBoleto) {
        this.PrecioBoleto = PrecioBoleto;
    }

    public int getBoletosVendidos() {
        return BoletosVendidos;
    }

    public void setBoletosVendidos(int BoletosVendidos) {
        this.BoletosVendidos = BoletosVendidos;
    }
    
    public int getBoletosDisponibles(){
        return this.Boletos - this.BoletosVendidos;
    }
   
    
}
