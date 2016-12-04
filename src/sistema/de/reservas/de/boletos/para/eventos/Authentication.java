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
 * @author Garc96
 */
public class Authentication {

    private static String nombre_Archivo = "data/Usuarios.csv";
    private Usuario person;

    public Authentication() {
    }

    public  boolean validarUsuario(Usuario person) {
        ArrayList<Usuario> data = Utilidades.returnAllRegisteredUsers(nombre_Archivo);
        for (int i = 0; i < data.size(); i++) {
            if (person.getUsername().equals(data.get(i).getUsername()) && person.getPassword().equals(data.get(i).getPassword()) ) {
                return true;
            }
        }
        return false ; 

    }

}
