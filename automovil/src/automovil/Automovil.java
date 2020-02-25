/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovil;

import fes.ico.unam.llanta;
import fes.ico.unam.vehiculo;

/**
 *
 * @author User
 */
public class Automovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vehiculo ve=new vehiculo();
        ve.setMara("Nisan");
        ve.setLlanata(new llanta("mediano", 56.3f, "Micheline"));
        
        ve.getLlanata().setTamaño("Pequeño");
        System.out.println("Tu choche "+ve.getMara()+" tiene llanatas "+ ve.getLlanata().getTamaño());
    }
    
}
