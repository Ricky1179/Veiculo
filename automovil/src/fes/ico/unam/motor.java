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
public class motor {
    private int pistones;
    private float caballosDeFuerza;
    private boolean cpu;

    public motor() {
    }

    public motor(int pistones, float caballosDeFuerza, boolean cpu) {
        this.pistones = pistones;
        this.caballosDeFuerza = caballosDeFuerza;
        this.cpu = cpu;
    }

    public boolean isCpu() {
        return cpu;
    }

    public void setCpu(boolean cpu) {
        this.cpu = cpu;
    }

    public int getPistones() {
        return pistones;
    }

    public void setPistones(int pistones) {
        this.pistones = pistones;
    }

    public float getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(float caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }
    
    public void encender(){
        System.out.println("el motor esta encendido...");
    }
    
    
    
}
