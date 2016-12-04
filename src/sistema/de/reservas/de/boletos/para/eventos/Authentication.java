/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.reservas.de.boletos.para.eventos;

import java.util.ArrayList;

/**
 *
 * @author Garc96
 */
public class Authentication {
    protected Information info; 
    protected static String nombre_Archivo="data/Usuarios.csv";
    
    public Authentication (){
    }
    
    
    public  boolean validarUsuario(){
        ArrayList<Information> data = new ArrayList<Information>(); 
        data = MoreInformation.readFromFileToArray(Authentication.nombre_Archivo);
        for (int i=0; i<data.size() ; i++){
            System.out.println(data.get(i));
        }
        return true; 
    }
    
}
