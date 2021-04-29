/**
 * 
 */
package com.devquinchi.proyecto_web.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.devquinchi.proyecto_web.impl.SpringServiceIMPL;
import com.devquinchi.proyecto_web.services.SpringService;

/**
 * @author Julio Controlador de ejemplo para demostrar la integracion de Spring
 *         con JSF
 */
@ManagedBean // notacion controlador
@ViewScoped // notacion para la secion,alcanse de la informacion a nivel de la pantalla
public class SpringJSFController {
	/**
	 *  CREANDO OBJETO SIN SPRING
	 */
//	SpringService springService=new SpringServiceIMPL();
	
	// SIRVE PARA INYECTAR EN OBJETOS DE TIPO @SERVICE ,U¿INTERFAS O CLASE DAO
	// ESTE PARAMETRO SE DEBE GENERAR SET Y GET
	private String nombreEmpresa;
	private String nombreEmpleado;
	
	@ManagedProperty("#{springServiceIMPL}")
	private SpringService springServiceIMPL;	
	
	
	@PostConstruct
	public void init() {
		String nombre=this.springServiceIMPL.mostrarNombreEmpresa();
		System.out.println(nombre);
		this.nombreEmpresa=nombre;
		
		String nombreEmpleado=this.springServiceIMPL.mostrarNombreEmpleado();
		System.out.println(nombreEmpleado);
		this.nombreEmpleado=nombreEmpleado;
		
	}

	// Generacion de get y set
	/**
	 * @return the springServiceIMPL
	 */
	public SpringService getSpringServiceIMPL() {
		return springServiceIMPL;
	}

	/**
	 * @param springServiceIMPL the springServiceIMPL to set
	 */
	public void setSpringServiceIMPL(SpringService springServiceIMPL) {
		this.springServiceIMPL = springServiceIMPL;
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	/**
	 * @return the nombreEmpleado
	 */
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	/**
	 * @param nombreEmpleado the nombreEmpleado to set
	 */
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	
}
