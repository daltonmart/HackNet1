/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacknet;

import Equipo.EquipoPC;
import terminal.Terminal;

/**
 *
 * @author junta
 */
public class Principal {
    
     public static void main(String[] args) {
         
         EquipoPC pc1 = new EquipoPC("pc001");
         
         String resultado = pc1.boot();
         
         System.out.println(">>>>"+resultado);
         
         Terminal consola = pc1.connect();
         
        
        //Konsole1 consola = new Konsole();
        consola.setSize(800, 600);
        consola.setVisible(true);

    }
}
