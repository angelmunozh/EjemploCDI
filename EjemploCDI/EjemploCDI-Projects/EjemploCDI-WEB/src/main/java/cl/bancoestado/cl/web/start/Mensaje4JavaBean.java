package cl.bancoestado.cl.web.start;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import cl.bancoestado.Mensaje4;

@ManagedBean(name = "Mensaje4JavaBean")
@ViewScoped
public class Mensaje4JavaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private Mensaje4 mensaje4;

	private String resultado;

	@PostConstruct
	public void inicializar() {
		System.out.println("Mensaje4JavaBean - init");
	}

	public void invocar4EJB() {
		System.out.println("invocar4EJB - init");
		this.resultado = this.mensaje4.retornarMensaje();
		System.out.println("invocar4EJB - fin");
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}
