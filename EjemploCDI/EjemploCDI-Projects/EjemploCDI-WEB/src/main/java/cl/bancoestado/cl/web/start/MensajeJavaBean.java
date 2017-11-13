package cl.bancoestado.cl.web.start;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import cl.bancoestado.cl.ejb.start.Mensaje;

@ManagedBean(name = "MensajeJavaBean")
@ViewScoped
public class MensajeJavaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private Mensaje mensaje;

	private String resultado;

	@PostConstruct
	public void inicializar() {
		System.out.println("MensajeJavaBean - init");
	}

	public void invocarEJB() {
		System.out.println("invocarEJB - init");
		this.resultado = this.mensaje.retornarMensaje();
		System.out.println("invocarEJB - fin");
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}
