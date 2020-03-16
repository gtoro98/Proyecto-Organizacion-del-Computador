/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorga;

/**
 *
 * @author gusta
 */
public class Carros {
    
    private String placa, marca, modelo, color;
    private int mensualidad;

    public Carros(String placa, String marca, String modelo, String color, int mensualidad) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.mensualidad = mensualidad;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public int getMensualidad() {
        return mensualidad;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

   
   
    
    
    
    
    
}
