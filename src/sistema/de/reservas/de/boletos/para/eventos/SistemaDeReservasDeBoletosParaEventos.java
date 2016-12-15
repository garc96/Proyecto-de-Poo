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
                                    Utilities.imprimirMenuCategoria();
                                    ArrayList<String[]> scenariosList = Utilities.returnAllRegisteredUsers("data/Escenarios.csv");
                                    int categoria = requestData.nextInt();
                                    String categoriaWriteToCsv="";
                                    Scanner requestProovedorData = new Scanner(System.in);
                                    switch (categoria) {
                                        case 1:
                                            System.out.println("Please enter the band name ");
                                            categoriaWriteToCsv = "Concierto";
                                            String nombreBanda = requestProovedorData.nextLine();
                                            descrpcionNewEevento += nombreBanda + " Concert";
                                            Utilities.imprimirEscenario(scenariosList);
                                            int escReq1 = requestProovedorData.nextInt()-1;
                                            Escenario escProov1 = new Escenario(scenariosList.get(escReq1)[0],scenariosList.get(escReq1)[1],scenariosList.get(escReq1)[2],scenariosList.get(escReq1)[3]);
                                            Funcion funci1 = userInside.setearFuncion(2);
                                            Evento eve1 = new Evento(Integer.parseInt(codigoNewEvento),nombreNewEvento,descrpcionNewEevento,escProov1,funci1);
                                            String msj = eve1.mensajeEscribir(categoriaWriteToCsv,userInside.getUsername());
                                            msj=funci1.keepWriting(msj) ;
                                            userInside.crearEvento("data/Eventos.csv", msj);    
                                        case 2:
                                            System.out.println("Please enter the group name ");
                                            categoriaWriteToCsv = "Teatro";
                                            String equipos = requestProovedorData.nextLine();
                                            descrpcionNewEevento+="Partido de Futbol: "+equipos;
                                            Utilities.imprimirEscenario(scenariosList);
                                            int esceRec2 = requestProovedorData.nextInt()-1;
                                            Escenario escProov2 = new Escenario(scenariosList.get(esceRec2)[0],scenariosList.get(esceRec2)[1],scenariosList.get(esceRec2)[2],scenariosList.get(esceRec2)[3]);
                                            Funcion funci2 = userInside.setearFuncion(2);
                                            Evento eve2 = new Evento(Integer.parseInt(codigoNewEvento),nombreNewEvento,descrpcionNewEevento,escProov2,funci2);
                                            String msj2 = eve2.mensajeEscribir(categoriaWriteToCsv,userInside.getUsername());
                                            msj2=funci2.keepWriting(msj2) ;
                                            userInside.crearEvento("data/Eventos.csv", msj2);
                                        case 3:
                                            System.out.println("Please enter the name teams slip by a vs");
                                            categoriaWriteToCsv = " Soccer Match";
                                            String groupName = requestProovedorData.nextLine();
                                            descrpcionNewEevento+="Obra de teatro dramatizada por: "+groupName;
                                            Utilities.imprimirEscenario(scenariosList);
                                            int esceRec3 = requestProovedorData.nextInt()-1;
                                            Escenario escProov3 = new Escenario(scenariosList.get(esceRec3)[0],scenariosList.get(esceRec3)[1],scenariosList.get(esceRec3)[2],scenariosList.get(esceRec3)[3]);
                                            Funcion funci3 = userInside.setearFuncion(1);
                                            Evento eve3 = new Evento(Integer.parseInt(codigoNewEvento),nombreNewEvento,descrpcionNewEevento,escProov3,funci3);
                                            String msj3 = eve3.mensajeEscribir(categoriaWriteToCsv,userInside.getUsername());
                                            msj3=funci3.keepWriting(msj3) ;
                                            userInside.crearEvento("data/Eventos.csv", msj3);
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
