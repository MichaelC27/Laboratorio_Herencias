/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author dbpan
 */
public class cliente extends persona {
    private double limite_credito;
    public cliente (){}
    public cliente (String cedula, String nombre, String domicilio, double limite_credito){
        super (cedula,nombre,domicilio);
        this.limite_credito = limite_credito;
    }

    public double getLimite_credito() {
        return limite_credito;
    }

    public void setLimite_credito(double limite_credito) {
        this.limite_credito = limite_credito;
    }
     
}
