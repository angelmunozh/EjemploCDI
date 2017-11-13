package cl.bancoestado;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Mensaje4 implements Serializable{

	/**
	 * 
	 */
	@EJB 
	Mensaje3 mensaje3;
	
	private static final long serialVersionUID = 1L;

	public String retornarMensaje() {
		String temp = mensaje3.retornarMensaje();
		return temp;
	}
}