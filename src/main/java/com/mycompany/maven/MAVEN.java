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
        
        
        var anoPagar=empleadoNuevo.anoYear(2022);
        System.out.println("el total a pagar es"+0.02*empleadoNuevo.anoActual+"dolares");
        
        
      
        
    }
}
