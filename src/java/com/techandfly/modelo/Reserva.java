
package com.techandfly.modelo;


public class Reserva {
    
    private String nombre;
    private String identificacion;
    private int edad;
    
    private Vuelo vuelo;
    
 

    public Reserva(String nombre, String identificacion, int edad, Vuelo vuelo){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.vuelo = vuelo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
  
       public String reservarVuelo(String nombre, String identificacion, int edad, Vuelo vuelo){
           
           
           if (edad >=18){
               Reserva reservar = new Reserva(nombre, identificacion, edad, vuelo);
               return "Su reserva fue EXITOSA";
           } 
           else{
               return "Fallo al reservar, no eres mayor de edad!";
           }
           
        
    }
       
    
       
}
