/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class Conectar {
    String url= "jdbc:mysql://localhost:3306/tiendacom";
     
     Connection con = null ;
     
    public Connection iniciarConexion(){
     
        if (con==null){
            try{
        con = DriverManager.getConnection(url,"root","12345");
         System.out.println("conexion fue exitosa");
         
         //con.close();
                   
    } catch (SQLException e){
        e.printStackTrace();
    }
        }
     return con;
    } 
    
    public void cerrarConexion(){
        if(con != null){
            try {
                con.close();
                con=null;
              System.out.println("Cierre exitoso");
                        
            }catch (SQLException e ){
                 e.printStackTrace();
            }
        }
    }
}
