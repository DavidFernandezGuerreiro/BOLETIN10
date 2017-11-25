
package boletin10.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class SwitchMenu {
    Juego juego1 = new Juego();
    int var;
    
    public void menuXogo(){
        
        String a = JOptionPane.showInputDialog("**** MENU ****\n1.- Comezar\n2.-Sair");
        var = Integer.parseInt(a);
        
        while (var==1){
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
