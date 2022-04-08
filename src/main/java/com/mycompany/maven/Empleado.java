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
    double costoHora;
    int anoIngreso;
    String nombre;
    int horasTrabajadas;
    
    public double calculoIngreso(int añoActual){
        var retorno=100000d;
        if(this.anoIngreso<añoActual){
            retorno=(this.costoHora*this.horasTrabajadas)*((añoActual-this.anoIngreso)*0.02)+(this.costoHora*this.horasTrabajadas);
        }else{
            retorno=(this.costoHora*this.horasTrabajadas);
        }
        return retorno;      
    }
    public double calcularBonoHorasExtra(int maxHorasTrabajadas){
        var retorno= 1000000d;
        if(this.horasTrabajadas>=maxHorasTrabajadas){
            retorno=(this.horasTrabajadas-maxHorasTrabajadas)*(this.costoHora*2);
        }else{
            retorno=0;
        }
        return retorno;
    }
    public double calculoImpuesto(int limite1, int limite2, int limite3){
        var retorno=100000d;
        double r;
        r=this.costoHora*this.horasTrabajadas;
        if(r>0 && r<limite1){
            retorno=0;
        }else{
            if(r>=limite1 && r<limite2){
                retorno=this.costoHora*this.horasTrabajadas*0.05;
            }else{
                if(r>=limite2 && r<=limite3){
                    retorno=this.costoHora*this.horasTrabajadas*0.12;
                }else{
                    if(r>limite3){
                        retorno=this.costoHora*this.horasTrabajadas*0.25;
                    }
                }      
            }
        }
        return retorno;
    }
}
