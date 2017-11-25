
package boletin10.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class SwitchMenu {
    Juego juego1 = new Juego();
    int var;
    
    public void menuXogo(){
        String c = JOptionPane.showInputDialog("**** MENÚ ****\n1.- Comezar\n2.-Sair");
        var = Integer.parseInt(c);
        
       while (var ==1){
            switch (var){

               case 1: juego1.corpoXogo();
                   break;
               case 2: JOptionPane.showMessageDialog(null, "Saindo...");
                   break;

            }
            String b = JOptionPane.showInputDialog("**** MENU ****\n1.- Comezar\n2.-Sair");
            var = Integer.parseInt(b);
       }
    }    
}
