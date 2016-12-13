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
public class Utilities {

    public static ArrayList<String[]> returnAllRegisteredUsers(String nombre_Archivo) {
        try {
            InputStream is = new FileInputStream(new File(nombre_Archivo));
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            ArrayList<String[]> datos = new ArrayList();
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] i = linea.split(", ");
                datos.add(i);
            }
            return datos;
        } catch (FileNotFoundException mensajeError) {
            System.out.println("File " + nombre_Archivo + " not found");
        } catch (IOException mensajeError) {
            System.out.println("Error al tratar de abrir" + nombre_Archivo);
        }
        return null;
    }

    public static boolean validarUsuario(String username, String password, ArrayList<String[]> listaDeUsuarios) {

        for (int i = 0; i < listaDeUsuarios.size(); i++) {
            for (int k = 0; k < listaDeUsuarios.get(i).length - 1; k++) {
                if (listaDeUsuarios.get(i)[k].equals(username) && listaDeUsuarios.get(i)[k + 1].equals(password)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String[] returnsUserData(String username, String password, ArrayList<String[]> listaDeUsuarios){
        for (int i = 0; i < listaDeUsuarios.size(); i++) {
            for (int k = 0; k < listaDeUsuarios.get(i).length - 1; k++) {
                if (listaDeUsuarios.get(i)[k].equals(username) && listaDeUsuarios.get(i)[k + 1].equals(password)) {
                    return listaDeUsuarios.get(i);
                }
            }
        }
        return null; 
    }
}
