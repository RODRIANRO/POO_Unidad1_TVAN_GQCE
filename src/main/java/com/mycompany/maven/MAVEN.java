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
       
        var empleadoNuevo= new Empleado();
        empleadoNuevo.nombre="Julian";
        empleadoNuevo.horasTrabajadas=100;
        empleadoNuevo.costoHora=6;
        empleadoNuevo.anoIngreso=2010;  
        
        System.out.println( empleadoNuevo.nombre+" | "+
                            empleadoNuevo.horasTrabajadas+" | "+
                            empleadoNuevo.costoHora+" | "+
                            empleadoNuevo.anoIngreso+" | ");
        
        var ingresos=empleadoNuevo.calculoIngreso(2022);
        System.out.println("El valor de ingresos es: "+ingresos);
        var bono=empleadoNuevo.calcularBonoHorasExtra(150);
        System.out.println("El valor del bono es: "+bono);
        var impuestos=empleadoNuevo.calculoImpuesto(500, 1000, 2000);
        System.out.println("El impuesto es: "+empleadoNuevo.calculoImpuesto(500, 1000, 2000));
        var resta=ingresos+bono-impuestos;
        System.out.println("El valor total a pagar es: "+resta);
        
        var empleadoNuevo2= new Empleado();
        empleadoNuevo2.nombre="Marta";
        empleadoNuevo2.horasTrabajadas=200;
        empleadoNuevo2.costoHora=5;
        empleadoNuevo2.anoIngreso=2020;  
        System.out.println( empleadoNuevo2.nombre+" | "+
                            empleadoNuevo.horasTrabajadas+" | "+
                            empleadoNuevo2.costoHora+" | "+
                            empleadoNuevo2.anoIngreso+" | "); 
        
        var ingresos2=empleadoNuevo2.calculoIngreso(2022);
        System.out.println("El valor de ingresos es: "+ingresos2);
        var bono2=empleadoNuevo2.calcularBonoHorasExtra(100);
        System.out.println("El valor del bono es: "+bono2);
        var impuestos2=empleadoNuevo2.calculoImpuesto(500, 1000, 2000);
        System.out.println("El impuesto es: "+empleadoNuevo2.calculoImpuesto(500, 1000, 2000));
        var resta2=ingresos2+bono2-impuestos2;
        System.out.println("El valor total a pagar es: "+resta2);
        
        var empleadoNuevo3= new Empleado();
        empleadoNuevo3.nombre="Esteban";
        empleadoNuevo3.horasTrabajadas=150;
        empleadoNuevo3.costoHora=8;
        empleadoNuevo3.anoIngreso=2018;  
        
        System.out.println( empleadoNuevo3.nombre+" | "+
                            empleadoNuevo3.horasTrabajadas+" | "+
                            empleadoNuevo3.costoHora+" | "+
                            empleadoNuevo3.anoIngreso+" | ");
        
        var ingresos3=empleadoNuevo3.calculoIngreso(2022);
        System.out.println("El valor de ingresos es: "+ingresos3);
        var bono3=empleadoNuevo3.calcularBonoHorasExtra(100);
        System.out.println("El valor del bono es: "+bono3);
        var impuestos3=empleadoNuevo3.calculoImpuesto(500, 1000, 2000);
        System.out.println("El impuesto es: "+empleadoNuevo.calculoImpuesto(500, 1000, 2000));
        var resta3=ingresos3+bono3-impuestos3;
        System.out.println("El valor total a pagar es: "+resta3);
        
    }
}