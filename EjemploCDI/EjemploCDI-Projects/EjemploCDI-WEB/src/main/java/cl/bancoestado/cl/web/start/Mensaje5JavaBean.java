package cl.bancoestado.cl.web.start;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import cl.bancoestado.Mensaje5;

@ManagedBean(name = "Mensaje5JavaBean")
@ViewScoped
public class Mensaje5JavaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private Mensaje5 mensaje5;

	private String resultado;

	@PostConstruct
	public void inicializar() {
		System.out.println("Mensaje5JavaBean - init");
	}

	public void invocar5EJB() {
		System.out.println("invocar5EJB - init");
		this.resultado = this.mensaje5.retornarMensaje();
		System.out.println("invocar5EJB - fin");
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}
