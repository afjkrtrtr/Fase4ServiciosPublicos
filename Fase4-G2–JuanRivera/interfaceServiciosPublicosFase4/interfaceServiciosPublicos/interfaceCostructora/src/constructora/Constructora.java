/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructora;
import vista.VistaInicioSesion;
/**
 *
 * @author Usuario
 */
public class Constructora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable(){
        public void run(){
            new VistaInicioSesion().setVisible(true);
        
        }
        
    
    });
    }
    
}
