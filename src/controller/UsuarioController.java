package controller;

import dao.UsuarioDao;

public class UsuarioController {
	
	//private UsuarioDao usuarioDao;
	
	public Boolean verificarLogin(String usuario, String clave) {
		return new UsuarioDao().login(usuario, clave);
		
	}
	

}
