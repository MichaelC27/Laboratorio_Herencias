/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author dbpan
 */
public class empleado extends persona {
   private double horas_trabajadas;
   private double salario_x_hora;
   private double salario_final;
   
   public empleado (){}
   public empleado (String cedula, String nombre, String domicilio,double ht,double sh){
       super (cedula,nombre,domicilio);
       this.horas_trabajadas = ht;
       this.salario_x_hora  = sh;
       this.salario_final = 0;
      
   }

    public double getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(double horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public double getSalario_x_hora() {
        return salario_x_hora;
    }

    public void setSalario_x_hora(double salario_x_hora) {
        this.salario_x_hora = salario_x_hora;
    }

    public double getSalario_final() {
        return salario_final;
    }

    public void calcular_salario (){
        this.salario_final = this.horas_trabajadas * this.salario_x_hora;
    }
   
}
