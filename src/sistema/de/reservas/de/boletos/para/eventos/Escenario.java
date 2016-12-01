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
     private int capacidadAsistentes ;
     private String ubicacion ;
     private String codigoEscenario ; 
     
     
     public Escenario (){
     }
     
     public Escenario ( String codigoEscenario, String nombreEscenario, String ubicacion , int capacidadAsistentes ){
     this.codigoEscenario = codigoEscenario; 
     this.nombreEscenario = nombreEscenario; 
     this.ubicacion= ubicacion; 
     this.capacidadAsistentes=capacidadAsistentes; 
     }
}
