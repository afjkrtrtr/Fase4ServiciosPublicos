/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import configuracion.conexion;
 package controlador;

/**
 *
 * @author Usuario
 */
public class UsuarioControlador { 
     public boolean validarCliente(String usuario, String contrasenia){
         conexion conn=new conexion();
         conn.conectar();
         boolean flag=false;
    
}
