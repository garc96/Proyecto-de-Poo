/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/**
 *
 * @author edward
 */
public class Cliente extends Usuario{
    private String NumeroCedula,numeroTelefono;
    private int NumroBoletosCompra;
    private float valorTotalCompra;

    public String getNumeroCedula() {
        return NumeroCedula;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public int getNumroBoletosCompra() {
        return NumroBoletosCompra;
    }

    public float getValorTotalCompra() {
        return valorTotalCompra;
    }
    
}
