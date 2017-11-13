package cl.bancoestado;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Mensaje5 implements Serializable{

	/**
	 * 
	 */
	@EJB 
	Mensaje2 mensaje2;
	
	private static final long serialVersionUID = 1L;

	public String retornarMensaje() {
		String temp = mensaje2.retornarMensaje();
		return temp;
	}
}