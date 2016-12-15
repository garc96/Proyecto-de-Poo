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
import java.io.Writer;

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
       
    public static void writeToCsv(String nombre_Archhivo,String write){
        try{   
        
        Writer output = new BufferedWriter(new FileWriter (nombre_Archhivo, true));
        output.append(write);
        output.close();
        }
        catch(IOException ex){
            
        }finally{
        
        }
    }
    
    
    
}
