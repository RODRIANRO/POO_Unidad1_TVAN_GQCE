/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maven;

/**
 *
 * @author NOTEBOOK
 */
public class Empleado {
    String nombre;
    int horasTrabajadas;
    double costoHoras;
    int anoIngreso;
    int anoActual;
    
     public int anoYear(int currendYear )
     {
          var retorno=1000;
           retorno=currendYear-this.anoIngreso;
          return retorno;
     }
     
     public double calculoIngresos ( int currentYear, int anoIngreso){
       var retorno=100000d;
       retorno=((0.02)*(currentYear-anoIngreso)*(costoHoras*horasTrabajadas)+(costoHoras*horasTrabajadas));
       
       
     return retorno;
     
     }
}
