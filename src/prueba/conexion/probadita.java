package prueba.conexion;

import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IJAG
 */
public class probadita {
   
    public static void main(String[] args) throws SQLException {
        Conexion db = new Conexion();
        db.getConnection();
    }
    
}
