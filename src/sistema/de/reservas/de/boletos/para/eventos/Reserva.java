/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.reservas.de.boletos.para.eventos;

import java.util.Date;

/**
 *
 * @author edward
 */
public class Reserva {
   private String evento;
   private int numBoletos;
   private String escenario;
   private Date fecha;
   private int costoTotal;
   private Date fechaCompra;

    public Reserva(String evento, int numBoletos, String escenario, Date fecha, int costoTotal, Date fechaCompra) {
        this.evento = evento;
        this.numBoletos = numBoletos;
        this.escenario = escenario;
        this.fecha = fecha;
        this.costoTotal = costoTotal;
        this.fechaCompra = fechaCompra;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public int getNumBoletos() {
        return numBoletos;
    }

    public void setNumBoletos(int numBoletos) {
        this.numBoletos = numBoletos;
    }

    public String getEscenario() {
        return escenario;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
   
   
}
