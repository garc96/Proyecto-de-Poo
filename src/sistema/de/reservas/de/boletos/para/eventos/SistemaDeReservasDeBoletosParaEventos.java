/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.reservas.de.boletos.para.eventos;

import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
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
        int option = 0;
        int countFailedToLogin = 0;
        int optionProovedor;
        System.out.println("Hi, welcome to the Ticket booking systems for events");
        System.out.println("Please select an option");
        System.out.println("1.- Let's start");
        System.out.println("2.- Close");
        option = entradaEscaner.nextInt();
        while (option != 2) {

            String username = "";
            String password = "";
            ArrayList<String[]> userList = Utilities.returnAllRegisteredUsers("data/Usuarios.csv"); // Una coleccion de arreglos de String donde guarda toda la informacion de usuarios
            boolean validarError = false;

            do {
                if (countFailedToLogin >= 1) {
                    System.out.println("Please enter the data correctly ");
                }
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter your username: ");
                username = input.nextLine();
                System.out.print("Now your Password: ");
                password = input.nextLine();
                validarError = Utilities.validarUsuario(username, password, userList);
                countFailedToLogin++;
            } while (validarError != true);// mientras no este en el sistema estara en un loop infinito 

            String[] user = Utilities.returnsUserData(username, password, userList);
            System.out.println("Hi " + user[2] + " you are a " + user[4]);

            switch (user[4]) {
                case "provider":
                    boolean activeSupplier = true;
                    Proovedor userInside = new Proovedor(user[0], user[1], user[2], user[3]);
                    Utilities.imprimirMenuProovedor();
                    Scanner option2 = new Scanner(System.in);
                    try {
                        optionProovedor = option2.nextInt();
                        while (activeSupplier) {
                            switch (optionProovedor) {
                                case 1:
                                    Scanner requestData = new Scanner(System.in);
                                    System.out.println("Please enter the event code ");
                                    String codigoNewEvento = requestData.nextLine();
                                    System.out.println("Please enter the event name ");
                                    String nombreNewEvento = requestData.nextLine();
                                    String descrpcionNewEevento = "";
                                    System.out.println("Please select the category");
                                    System.out.println("1) Concert");
                                    System.out.println("2) Play");
                                    System.out.println("3) Soccer match ");
                                    int categoria = requestData.nextInt();
                                    
                                    switch (categoria) {
                                        case 1:
                                            Scanner requestProovedorData = new Scanner(System.in);
                                            System.out.println("Please enter the band name ");
                                            String categoriaWriteToCsv = "Concierto";
                                            String nombreBanda = requestProovedorData.nextLine();
                                            descrpcionNewEevento += nombreBanda + " concert";
                                            ArrayList<String[]> scenariosList = Utilities.returnAllRegisteredUsers("data/Escenarios.csv");
                                            System.out.println("Please select the scenario: ");
                                            for (int i = 0; i < scenariosList.size(); i++) {
                                                System.out.println((i+1)+") "+scenariosList.get(i)[0]+ " "+scenariosList.get(i)[1]);
                                            }
                                            int escenarioRequerido = requestProovedorData.nextInt()-1;
                                            System.out.println("How many performances would you like to set up");
                                            int numFunciones = requestProovedorData.nextInt();
                                            Escenario escenarioProovedor = new Escenario(scenariosList.get(escenarioRequerido)[0],scenariosList.get(escenarioRequerido)[1],scenariosList.get(escenarioRequerido)[2],scenariosList.get(escenarioRequerido)[3]);
                                            escenarioProovedor.getCapacidadAsistentes();
                                            
                                            for( int h = 0; h <numFunciones; h++ ){
                                                System.out.println(nombreNewEvento);
                                                requestData.nextLine();
                                                System.out.println("Funcion numero "+(h+1));
                                                System.out.println("Plase enter the date in this format day/mouth/year");
                                                String date = requestData.nextLine();
                                                String[]datedate= date.split("/");
                                                System.out.println("Plase enter the hour in this format hh:ss");
                                                String hora = requestData.nextLine();
                                                String[]datedate1 = hora.split(":");
                                                Date dated = new Date(Integer.parseInt(datedate[2]),Integer.parseInt(datedate[1])-1,Integer.parseInt(datedate[0]),Integer.parseInt(datedate1[0]),Integer.parseInt(datedate1[1]));                                               
                                                System.out.println("Please enter ticket price ");
                                                float precioBoleto = requestData.nextInt();
                                                Funcion funci = new Funcion(dated,precioBoleto,0);
                                                Evento eve = new Evento(Integer.parseInt(codigoNewEvento),nombreNewEvento,descrpcionNewEevento,escenarioProovedor,funci);
                                                String msj = eve.mensajeEscribir(categoriaWriteToCsv,userInside.getName());
                                                msj=funci.keepWriting(msj) ;
                                                System.out.println(msj);
                                                //Utilities.writeToCsv("data/Eventos.csv", msj);
                                            }
                                        case 2:
                                        case 3:
                                            break;
                                    }
                                case 2:
                                    break;
                                case 3:
                                    activeSupplier = false;
                                    break;
                                default:
                                    break;
                            }
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Enter a valid option");
                    }
                    break;

                case "client":

                case "vipcliente":
                    System.out.println("holi cliente vip");
                    break;
                default:
                    System.out.println("dklsjds");
                    break;
            }
            Utilities.imprimirMenu();
            option = entradaEscaner.nextInt();
        }

    }

}
