/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.reservas.de.boletos.para.eventos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Galo
 */
public class Proovedor extends Usuario {
    private final String Tipo="Proovedor"; 

    public Proovedor ( String username, String password, String name, String correo){
    super (username,password,name,correo);
    }

    public String getTipo() {
        return Tipo;
    }
    public void crearEvento(Evento eve, Funcion fun, int numFunciones) {
        BufferedWriter pw = null;
        try {
            pw = new BufferedWriter(new FileWriter("data/Eventos.csv", true));
        for(int j=0;j<numFunciones;j++){
            pw.write(eve.getCodigo()+", "+eve.getNombreEvento()+", "+eve.getDescripcionEvento());      
        }
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("el archivo "+"data/Eventos.csv" +"no existe");
        } catch (IOException ex) {
            System.out.println("se produjo error al escribir "+"data/Eventos.csv");
        }
        
    
    }
    
    
    
}
