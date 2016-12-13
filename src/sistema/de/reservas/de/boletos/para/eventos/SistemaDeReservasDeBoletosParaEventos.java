/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.reservas.de.boletos.para.eventos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Garc
 */
public class SistemaDeReservasDeBoletosParaEventos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entradaEscaner = new Scanner(System.in); 
        ArrayList<String[]> userList = Utilities.returnAllRegisteredUsers("data/Usuarios.csv"); // Una coleccion de arreglos de String donde guarda toda la informacion de usuarios
        String username = "" ; 
        String password = "" ; 
        boolean validarError = true;
        do {
            try {
                System.out.println("Enter your username ");
                username = entradaEscaner.nextLine();
                System.out.println("Enter your Password ");
                password = entradaEscaner.nextLine();
                validarError=Utilities.validarUsuario(username, password, userList); // validamos que este en el sitema
            } catch (Exception e) {
                System.out.println("Ingresa bien los datos ");
            }
        } while (validarError);
        
        String[] user = Utilities.returnsUserData(username, password, userList);
        System.out.println("Hi "+user[2]+" you are a " + user[3]);
        
        
    }

}
