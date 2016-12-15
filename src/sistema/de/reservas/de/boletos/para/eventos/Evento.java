/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.reservas.de.boletos.para.eventos;

import java.util.ArrayList;

/**
 *
 * @author Garc
 */
public class Evento {
    private String nombreEvento ; 
    private String descripcionEvento; 
    private Escenario escenario ; 
    private int codigo; 
    private Funcion func;   
 
    
    public Evento(){}
    
    public Evento(int codigo, String name, String desEv, Escenario esc, Funcion func ){
    this.nombreEvento=name;
    this.codigo=codigo;
    this.escenario=esc;
    this.descripcionEvento=desEv;
    this.func=func;
    
    
    }
    public enum Categoria {  Concierto,  PartidoDeFútbol,   Teatro}
    

    
    

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String mensajeEscribir(String categoriaa,String nombreUser){
    String msj="";
    msj+=getCodigo()+", "+getNombreEvento()+", "+getDescripcionEvento()+", "+categoriaa+", "+escenario.getCodigoEscenario()+", "+ nombreUser+", ";
    return msj ;
    }
    
    
}
