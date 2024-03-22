/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2labp2_linsyposso;

import java.io.Serializable;

/**
 *
 * @author 29164
 */
public class Carro implements Serializable{
    private String marca;
    private String modelo;
    private int velocidad;
    private long SerialUID = 888L;

    public Carro() {
    }

    public Carro(String carro, String modelo, int velocidad) {
        this.marca = carro;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return marca + " "+ modelo;
    }
    
    
}
