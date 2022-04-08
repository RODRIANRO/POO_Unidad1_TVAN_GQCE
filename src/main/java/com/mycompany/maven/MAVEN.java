/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maven;

/**
 *
 * @author NOTEBOOK
 */
public class MAVEN {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        var empleadoNuevo = new Empleado();
        empleadoNuevo.nombre="Juan";
        empleadoNuevo.costoHoras= 6;
        empleadoNuevo.horasTrabajadas= 100;
        empleadoNuevo.anoIngreso= 2010;
        empleadoNuevo.anoActual=2022;
        
        
        System.out.println("Nombre :"+ empleadoNuevo.nombre + " ingreso hace :" + empleadoNuevo.anoYear(2020)
                            + "años en la enpresa");
        
        System.out.println(" Su Ingreso es:"+empleadoNuevo.calculoIngresos(2022, 2010));
      
        
    }
}
