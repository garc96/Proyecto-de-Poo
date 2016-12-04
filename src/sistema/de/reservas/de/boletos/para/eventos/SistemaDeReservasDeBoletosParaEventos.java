/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.reservas.de.boletos.para.eventos;

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
        Authentication auth = new  Authentication() ;  
        Usuario gabriel = new Usuario("Garc", "1748"); 
        Usuario belen  =  new Usuario("Garc", "1748"); 
        System.out.println(belen.equals(gabriel));
        Scanner entradaEscaner = new Scanner (System.in); 
        String username = entradaEscaner.nextLine();
        String password = entradaEscaner.nextLine();
        Usuario user1 = new Usuario(username,password);   
        System.out.println(auth.validarUsuario(user1));     
    }
    
    
   
   
}
