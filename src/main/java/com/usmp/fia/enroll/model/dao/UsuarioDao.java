package com.usmp.fia.enroll.model.dao;

import java.util.ArrayList;

import com.usmp.fia.enroll.model.entity.UsuarioEntity;

public class UsuarioDao {

	
	ArrayList<UsuarioEntity> listaUsuario = new ArrayList<>();
	
	
	
	public ArrayList<UsuarioEntity> getListaUsuario(){
		
		
		return listaUsuario;
		
		
	}
	
	
	
	public void registrarUsuario(UsuarioEntity objUsuario) {
		
		
		listaUsuario.add(objUsuario);
		
		
		
	}
	
	
	
	
	
	
	
}
