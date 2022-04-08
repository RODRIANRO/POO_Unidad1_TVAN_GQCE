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
          var retorno=2020;
           retorno=currendYear-this.year;
          return retorno;
     }
}
