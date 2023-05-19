/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuracion;



import java.sql.*;
import java.util.logging.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Stiven
 */
public class conexion {
    String bd="ServiciosPublicos";
    String url="jdbc:mysql://localhost:3306/ServiciosPublicos";
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;
    public conexion(){
    
}
    public Connection conectar(){
        try{
            Class.forName(driver);
            cx=(Connection)DriverManager.getConnection(url, user, password);
            System.out.println("Se ha conectado a la base de datos  :  " +  bd);
        }catch(SQLException | ClassNotFoundException ex ){
          
        
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se conecto a la base de datos" + bd);
        }
        return cx;
    }
    public void desconectar (){
            try{
                cx.close();
            }catch(SQLException ex){
                Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    public static void main(String[] args) {
        conexion conn = new conexion();
        conn.conectar();
    }
    
    public int ejecutarSentenciaSql (String sentSQL){
        try{
            PreparedStatement preSt=cx.prepareStatement(sentSQL);
            preSt.execute();
            return 1;
        }catch(SQLException ex){
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }


    public ResultSet consultarReg(String sentSQL){
        try{
            PreparedStatement preSt=cx.prepareStatement(sentSQL);
            
            ResultSet res=preSt.executeQuery();
            return res;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }


}




    

 
