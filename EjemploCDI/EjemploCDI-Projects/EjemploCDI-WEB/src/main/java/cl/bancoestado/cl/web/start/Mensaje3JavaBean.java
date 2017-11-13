package cl.bancoestado.cl.web.start;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import cl.bancoestado.Mensaje3;

@ManagedBean(name = "Mensaje3JavaBean")
@ViewScoped
public class Mensaje3JavaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private Mensaje3 mensaje3;

	private String resultado;

	@PostConstruct
	public void inicializar() {
		System.out.println("Mensaje3JavaBean - init");
	}

	public void invocar3EJB() {
		System.out.println("invocar3EJB - init");
		this.resultado = this.mensaje3.retornarMensaje();
		System.out.println("invocar3EJB - fin");
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}
