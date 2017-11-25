
package boletin10.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Juego {
    int var;
   
    public void corpoXogo(){

       JOptionPane.showMessageDialog(null, "Xogador 1. Elixa un número entre 1 e 50");
       String a = JOptionPane.showInputDialog("Agrega un numero: ");
       int numero1 = Integer.parseInt(a);
       
       while (numero1>50 || numero1<1){
           System.out.println("");
           String b = JOptionPane.showInputDialog("Error, non pode ser maior de 50 nin menor de 1");
           numero1 = Integer.parseInt(b);
       }

       String b = JOptionPane.showInputDialog("Introduce o número de intentos");
       int intentNum = Integer.parseInt(b);

        JOptionPane.showMessageDialog(null, "Comecemos!");
        
        while (intentNum!=0){
          String d = JOptionPane.showInputDialog("Número de intentos: "+intentNum+"\nIntroduzca un número:");
          int numero2 = Integer.parseInt(d);
          
            if (numero1 == numero2){
                JOptionPane.showMessageDialog(null, "Acertaches!");
            } else if (numero1 > numero2){
                JOptionPane.showMessageDialog(null, "O número é maior que "+numero2);
            } else {
                JOptionPane.showMessageDialog(null, "O número é menor que "+numero2);
            }
            if (numero1 == numero2){
                intentNum = 0;
            }else{
                intentNum--;
            }
            if (intentNum == 0){
                JOptionPane.showMessageDialog(null, "Fin da partida");
            }
        }
    }
}
