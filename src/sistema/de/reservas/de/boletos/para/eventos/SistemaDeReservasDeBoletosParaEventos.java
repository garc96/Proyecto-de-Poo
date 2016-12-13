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

        Utilities.imprimirMenu();
        Scanner entradaEscaner = new Scanner(System.in);
        int option = 0;
        option = entradaEscaner.nextInt();
        while (option != 2) {
            ArrayList<String[]> userList = Utilities.returnAllRegisteredUsers("data/Usuarios.csv"); // Una coleccion de arreglos de String donde guarda toda la informacion de usuarios
            String username = "";
            String password = "";
            boolean validarError = true;
            
            while (validarError) {
                System.out.println("Please enter your username ");
                username = entradaEscaner.nextLine();
                System.out.println("Now your Password ");
                password = entradaEscaner.nextLine();
                validarError = Utilities.validarUsuario(username, password, userList); 
            } // mientras no este en el sistema estara en un loop infinito 

            String[] user = Utilities.returnsUserData(username, password, userList);
            System.out.println("Hi " + user[2] + " you are a " + user[4]);

            if (user[4].equals("proovedor")) {

            } else if (user[4].equals("cliente") || user[4].equals("clientevip")) {

            }
        }
    }

}
