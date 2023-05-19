
package interfaz;

import vista.MenuPrincipal;


/**
 *
 * @author Stiven
 */
public class Main {

    
     
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable(){
           public void run(){
               new MenuPrincipal().setVisible(true);
           }
       });
    }
    
}
