/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;
import java.sql.*;
/**
 *
 * @author IJAG
 */
public class ConexionDB {
    Connection cn;
    Statement st;
    public Connection Conexion(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/login?useSSL=false","root","JuniorAvila-19");
        System.out.println("Se hizo La conxion exitosa");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }return cn;
    }
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportdo");
    }
}
