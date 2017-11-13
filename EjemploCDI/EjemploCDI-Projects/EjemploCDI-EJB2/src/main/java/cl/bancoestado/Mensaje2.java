package cl.bancoestado;

import java.io.Serializable;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Mensaje2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String retornarMensaje() {
		String temp = "mensaje desde EjemploCDI-EJB2";
		return temp;
	}
}