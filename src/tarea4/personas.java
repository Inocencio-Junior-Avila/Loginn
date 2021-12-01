/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

/**
 *
 * @author IJAG
 */

    public class personas {
	private String usuario;
	private String contraseña;
	private String nombre;
	private String apellido;
	private String correo;
	private String telefono;

	public personas(String nombre, String apellido, String correo_eletronico, String Nombre_de_usuario, String telefono, String contraseña) {

		
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo_eletronico;
		this.usuario = Nombre_de_usuario;
		this.telefono = telefono;
                this.contraseña = contraseña;

	}

	public personas() {
	
	}

	public String getusuario() {
		return usuario;
	}

	public void setusuario(String usuario) {
		this.usuario = usuario;
	}

	public String getcontraseña() {
		return contraseña;
	}

	public void setcontraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getapellido() {
		return apellido;
	}

	public void setapellido(String apellido) {
		this.apellido = apellido;
	}

	public String getcorreo() {
		return correo;
	}

	public void setcorreo(String correo) {
		this.correo = correo;
	}

	public String gettelefono() {
		return telefono;
	}

	public void settelefono(String telefono) {
		this.telefono = telefono;
	}

    void getusuario(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getcontraseña(String clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    
