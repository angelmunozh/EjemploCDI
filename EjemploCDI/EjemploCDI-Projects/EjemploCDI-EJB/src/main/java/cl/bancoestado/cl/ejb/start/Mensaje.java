package cl.bancoestado.cl.ejb.start;

import java.io.Serializable;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Mensaje implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String retornarMensaje() {
		String temp = "mensaje desde EjemploCDI-EJB";
		return temp;
	}
}