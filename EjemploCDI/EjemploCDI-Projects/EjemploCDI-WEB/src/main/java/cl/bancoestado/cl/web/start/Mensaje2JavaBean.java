package cl.bancoestado.cl.web.start;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import cl.bancoestado.Mensaje2;


@ManagedBean(name = "Mensaje2JavaBean")
@ViewScoped
public class Mensaje2JavaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private Mensaje2 mensaje2;

	private String resultado;

	@PostConstruct
	public void inicializar() {
		System.out.println("Mensaje2JavaBean - init");
	}

	public void invocar2EJB() {
		System.out.println("invocar2EJB - init");
		this.resultado = this.mensaje2.retornarMensaje();
		System.out.println("invocar2EJB - fin");
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}
