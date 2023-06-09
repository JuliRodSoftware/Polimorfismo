/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ragjc.software.labpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author RodAlejo
 */
public class ViajeFamiliar extends Viaje{
    private int familia;

    public ViajeFamiliar( String origen, String destino,  int costo, Date fechaSalida, Date fechaLlegada, int familia) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }

    @Override
    public String descripcion(){
       return "Viaje para disfrutar con toda tu familia";
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }
     
    @Override
    public String cualquierMetodo2(){
        return "Método implementado en la clase hija viaje familiar";
    }
}
