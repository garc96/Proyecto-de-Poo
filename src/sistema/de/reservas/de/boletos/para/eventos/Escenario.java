/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.reservas.de.boletos.para.eventos;

/**
 *
 * @author Garc
 */
public class Escenario {
     private String nombreEscenario ; 
     private String capacidadAsistentes ;
     private String ubicacion ;
     private String codigoEscenario ; 
     
     
     public Escenario (){
     }
     
     public Escenario ( String codigoEscenario, String nombreEscenario, String ubicacion , String capacidadAsistentes ){
     this.codigoEscenario = codigoEscenario; 
     this.nombreEscenario = nombreEscenario; 
     this.ubicacion= ubicacion; 
     this.capacidadAsistentes=capacidadAsistentes; 
     }

    public String getNombreEscenario() {
        return nombreEscenario;
    }

    public void setNombreEscenario(String nombreEscenario) {
        this.nombreEscenario = nombreEscenario;
    }

    public String getCapacidadAsistentes() {
        return capacidadAsistentes;
    }

    public void setCapacidadAsistentes(String capacidadAsistentes) {
        this.capacidadAsistentes = capacidadAsistentes;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCodigoEscenario() {
        return codigoEscenario;
    }

    public void setCodigoEscenario(String codigoEscenario) {
        this.codigoEscenario = codigoEscenario;
    }
     
     
     
    
     
     
}
