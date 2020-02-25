/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.ico.unam;

/**
 *
 * @author User
 */
public class llanta {
    private String tamaño;
    private float diametroCm;
    private String marca;

    public llanta() {
    }

    public llanta(String tamaño, float diametroCm, String marca) {
        this.tamaño = tamaño;
        this.diametroCm = diametroCm;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public float getDiametroCm() {
        return diametroCm;
    }

    public void setDiametroCm(float diametroCm) {
        this.diametroCm = diametroCm;
    }
    
    public void rodar(){
        System.out.println("Las ruedas del automovil girando ban");
    }
    
}
