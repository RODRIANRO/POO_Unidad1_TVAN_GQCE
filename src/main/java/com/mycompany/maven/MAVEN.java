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
        empleadoNuevo.anoActual=2020;
        
        System.out.println(empleadoNuevo.nombre+" | "+
                           empleadoNuevo.costoHoras+" | "+
                           empleadoNuevo.horasTrabajadas+" | "+
                           empleadoNuevo.anoIngreso+" | ");
        
        
         var aPagar=1000d;
        aPagar=empleadoNuevo.valorPagar(0 ,1000);
        System.out.println("El ingreso es:"(+0.02*anoActual-anoIngreso)*horasTrabajadas);
        
      
        
    }
}
