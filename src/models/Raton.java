package models;

public class Raton {

    float precio;
    String modelo;

    public Raton(){
        precio = 5;
        modelo = "logi";
    }

    public Raton(String modelo, float precio){
        this.modelo = modelo;
        this.precio = precio;
    }

    public String toString(){
        return "El modelo " + modelo + " vale " + precio + " €";
    }

}
