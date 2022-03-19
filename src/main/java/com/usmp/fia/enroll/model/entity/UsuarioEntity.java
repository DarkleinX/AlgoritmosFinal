package com.usmp.fia.enroll.model.entity;

public class UsuarioEntity {

	
	private String usuario, password, nombre, apellido;

	public UsuarioEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioEntity(String usuario, String password, String nombre, String apellido) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
	
}
