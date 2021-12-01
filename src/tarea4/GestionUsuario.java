/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tarea4.personas;
import tarea4.ConexionDB;
/**
 *
 * @author IJAG
 */
public class GestionUsuario {
    
    	public personas obtenerUsuario(personas usu) {
		ConexionDB conexiondb = new ConexionDB();
		personas usuario= null;
	
                Connection cn = null;
		
		PreparedStatement pst = null;
		ResultSet rs = null;

		
		try {
			
			cn = (Connection) conexiondb.Conexion();
		
			String sql = ("SELECT * FROM  personas where Nombre_de_usuario = ? and contraseña = ?");
			
			pst = (PreparedStatement) cn.prepareStatement(sql);
			pst.setString(1, usu.getusuario().trim());
			pst.setString(2, usu.getcontraseña());
			System.out.println(pst);
			
			rs = pst.executeQuery();
			while (rs.next()) {
				
				usuario = new personas(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6));
				
			}
			
		} catch (SQLException e) {
					System.out.println("Error en obtener usuario");

		}
		return usuario;
				
	}
}
