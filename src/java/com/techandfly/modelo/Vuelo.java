/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techandfly.modelo;

import java.util.ArrayList;

import java.util.List;



public class Vuelo {
    
    private String destino;
    private int hora;
    private int minutos;
    private String dia;
    private double precio;

    
      public Vuelo(String destino, int hora, int minutos, String dia, double precio){
        this.destino=destino;
        this.hora=hora;
        this.minutos=minutos;
        this.dia=dia;
        this.precio=precio;
        
    }
    
    
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public List<Vuelo> consultarVuelo(){
        Vuelo vuelo = new Vuelo("Panama", 10, 45, "Jueves", 250000);
        Vuelo vuelo1 = new Vuelo("Mexico", 20, 30, "Sabado", 1500000);
        Vuelo vuelo2 = new Vuelo("Costa Rica", 14, 0, "Jueves", 500000);
        Vuelo vuelo3 = new Vuelo("USA", 16, 19, "Lunes", 5000000);
        
        
        List<Vuelo> vuelos = new ArrayList<>();
        
        vuelos.add(vuelo);
        vuelos.add(vuelo1);
        vuelos.add(vuelo2);  
        vuelos.add(vuelo3);   
        
        return vuelos;
        
        
    }
   
}
