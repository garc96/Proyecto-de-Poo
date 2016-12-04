/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.reservas.de.boletos.para.eventos;

/**
 *
 * @author PaulaCh96
 */
public class MoreInformation extends Information {
    private String dato4;

    
    public MoreInformation(){
        super();
    }
    
    public MoreInformation(String d0, String d1, String d2, String d3, String d4){
    super(d0,d1,d2,d3);
    this.dato4=d4; 
    }
    
    public Information mapToCsv (String line){
    String []  i = line.split(","); 
    return new MoreInformation(i[0],i[1],i[2],i[3],i[4]);  
    }
    
    public String toString(){
    String mensaje=super.toString();
    mensaje+=dato4;
    return mensaje; 
    }
    
}
