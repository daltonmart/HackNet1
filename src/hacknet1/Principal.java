/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacknet1;

import Equipo.EquipoPC;
import Equipo.EquipoPC;
import terminal.Konsole1;

/**
 *
 * @author junta
 */
public class Principal {
     public static void main(String[] args) {
         EquipoPC pc1 = new EquipoPC("pc001");
         String resultado = pc1.bootstrap();
         System.out.println(">>>>>>"+resultado);
         Konsole1 consola = pc1.connect();
        //Konsole1 consola = new Konsole1();
        consola.setSize(800, 600);
        consola.setVisible(true);

    }
}
