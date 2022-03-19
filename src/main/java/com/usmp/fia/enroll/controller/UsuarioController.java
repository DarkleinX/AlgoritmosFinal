package com.usmp.fia.enroll.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.usmp.fia.enroll.model.dao.UsuarioDao;
import com.usmp.fia.enroll.model.entity.UsuarioEntity;

@Controller
public class UsuarioController {

	
	UsuarioDao usuarioDao = new UsuarioDao();
	
	//probandoComentario
	@RequestMapping({"/","","/index"})
	public String index(Model model) {
		
		
		return "frmIndex";
		
		
	}
	
	
	@RequestMapping("/login")
	public String Login(Model model) {
		
		
		return "frmLogin";
		
	}
	
	@RequestMapping("/listaUsuarios")
	public String ListaUsuarios(Model model) {
		
		ArrayList<UsuarioEntity> usuarios = new ArrayList<>();
		
		usuarios = usuarioDao.getListaUsuario();
		model.addAttribute("userlist", usuarios);
		
		
		return "frmLista";
		
		
	}
	
	@RequestMapping("/registro")
	public String register(Model model) {
		
		
		return "registroUsuario";
		
		
	}
	
	
	@PostMapping("/registroUsuario")
	public String registroUsuario(@Validated UsuarioEntity usuario) {
		
		if(usuario != null) {	
			
			usuarioDao.registrarUsuario(usuario);		
			
		}	
		
		return "registroUsuario";
		
		
	}
	
}
