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
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Galo
 */
public class Proovedor extends Usuario {

    private final String Tipo = "Proovedor";

    public Proovedor(String username, String password, String name, String correo) {
        super(username, password, name, correo);
    }

    public String getTipo() {
        return Tipo;
    }

    public void crearEvento(String nombre_Archhivo, String write) {
        try {

            Writer output = new BufferedWriter(new FileWriter(nombre_Archhivo, true));
            output.append("\n");
            output.append(write);

            output.close();
        } catch (IOException ex) {

        } finally {

        }
    }

    public Funcion setearFuncion(int a) {
        Scanner pedirHoraYfecha = new Scanner(System.in);
        if (a != 1) {

            System.out.println("How many performances would you like to set up");
            int numFunciones = pedirHoraYfecha.nextInt();
            for (int h = 0; h < numFunciones; h++) {
                Scanner requestSomeData = new Scanner(System.in);
                System.out.println("Funcion numero " + (h + 1) + "\nPlase enter the date in this format day/mouth/year ");
                String date = requestSomeData.nextLine();
                String[] datedate = date.split("/");
                System.out.println("Plase enter the hour in this format hh:ss");
                String hora = requestSomeData.nextLine();
                String[] datedate1 = hora.split(":");
                float precioBoleto = pedirHoraYfecha.nextInt();
                Date dated = new Date(Integer.parseInt(datedate[2]), Integer.parseInt(datedate[1]) - 1, Integer.parseInt(datedate[0]), Integer.parseInt(datedate1[0]), Integer.parseInt(datedate1[1]));
                return new Funcion(dated, precioBoleto, 0);
            }

        } else {
            System.out.println("You just set up one soccer match");
            Scanner requestSomeData = new Scanner(System.in);
            System.out.println("Plase enter the date in this format day/mouth/year ");
            String date = requestSomeData.nextLine();
            String[] datedate = date.split("/");
            System.out.println("Plase enter the hour in this format hh:ss");
            String hora = requestSomeData.nextLine();
            String[] datedate1 = hora.split(":");
            float precioBoleto = pedirHoraYfecha.nextInt();
            Date dated = new Date(Integer.parseInt(datedate[2]), Integer.parseInt(datedate[1]) - 1, Integer.parseInt(datedate[0]), Integer.parseInt(datedate1[0]), Integer.parseInt(datedate1[1]));
            return new Funcion(dated, precioBoleto, 0);
       }
        return null;
    }
}
