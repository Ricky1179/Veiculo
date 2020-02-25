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
public class vehiculo {
    private String mara;
    private String modelo;
    private llanta llanata;
    private motor motor1;
    private motor motor2;
    private chasis chasis;

    public vehiculo() {
    }

    public vehiculo(String mara, String modelo, llanta llanata, motor motor1, motor motor2, chasis chasis) {
        this.mara = mara;
        this.modelo = modelo;
        this.llanata = llanata;
        this.motor1 = motor1;
        this.motor2 = motor2;
        this.chasis = chasis;
    }

    public chasis getChasis() {
        return chasis;
    }

    public void setChasis(chasis ch) {
        this.chasis = ch;
    }

    public String getMara() {
        return mara;
    }

    public void setMara(String mara) {
        this.mara = mara;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public llanta getLlanata() {
        return llanata;
    }

    public void setLlanata(llanta ll) {
        this.llanata = ll;
    }

    public motor getMotor1() {
        return motor1;
    }

    public void setMotor1(motor m1) {
        this.motor1 = m1;
    }

    public motor getMotor2() {
        return motor2;
    }

    public void setMotor2(motor m2) {
        this.motor2 = m2;
    }
    
    
}
