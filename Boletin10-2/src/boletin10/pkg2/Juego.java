
package boletin10.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Juego {
    int cond; //Esta variable é para a condición das pistas do if

    public void corpoXogo(){
       int numa=(int) (Math.random() * 50) + 1;
        
       String c = JOptionPane.showInputDialog("Introduce o número de intentos");
       int intentNum = Integer.parseInt(c);

        JOptionPane.showMessageDialog(null, "Comecemos!");
        
        while (intentNum!=0){
         
          String d = JOptionPane.showInputDialog("Número de intentos: "+intentNum+"\nIntroduzca un número:");
          int numero2 = Integer.parseInt(d);
          
          
          if (numa > numero2){
          cond = numa - numero2;
          } else if (numa < numero2){
          cond = numero2 - numa;
          }

            if (numa == numero2){
                JOptionPane.showMessageDialog(null, "Acertaches o número!"); //Se acertas
            } else if (cond > 20){
                JOptionPane.showMessageDialog(null, "Estás moi lonxe! Proba de novo"); //Se pasa de 20
            } else if((cond>= 10) && (cond<= 20)){
                JOptionPane.showMessageDialog(null, "Estás lonxe! Proba de novo"); //Se está entre 10 e 20
            } else if ((cond < 10) && (cond>5)){
                JOptionPane.showMessageDialog(null, "Estás preto! Proba de novo"); //Se está entre 10 e 5 
            } else if (cond<=5){
                JOptionPane.showMessageDialog(null, "Estás moi preto! Proba de novo"); //Se é igual ou menor de 5
            }

            if (numa == numero2){   
            
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
