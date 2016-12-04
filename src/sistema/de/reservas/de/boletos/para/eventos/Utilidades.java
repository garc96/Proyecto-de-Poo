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
public class Utilidades {
            public static ArrayList<Usuario> returnAllRegisteredUsers(String nombre_Archivo) {
        try {
            InputStream is = new FileInputStream(new File(nombre_Archivo));
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>(); 
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] i = linea.split(",");
                Usuario users = new Usuario (i[0].trim(), i[1].trim());
                listaUsuarios.add(users);
            }
            return listaUsuarios;
        } catch (FileNotFoundException mensajeError) {
            System.out.println("File " + nombre_Archivo + " not found");
        } catch (IOException mensajeError) {
            System.out.println("Error al tratar de abrir" + nombre_Archivo);
        }
        return null;
    }


          
}
