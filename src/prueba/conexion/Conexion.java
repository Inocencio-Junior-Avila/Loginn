package prueba.conexion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IJAG
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static String Driver = "com.mysql.jdbc.Driver";
    private static String Usuario = "usuariojava";
    private static String password = "12345";
    private static String url = "jdbc:mysql://localhost:3306/dblogin?useSSL=false";
    
    
    static{
        try{
            Class.forName(Driver);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Error en el driver: "+e);
        }
    }
    
    public Connection getConnection() throws SQLException{
        Connection con = null;
        try {
            con=DriverManager.getConnection(url,Usuario,password);
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error en la Conexion"+e);
        }
        return con;
    }
}
