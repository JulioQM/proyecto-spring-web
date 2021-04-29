/**
 * 
 */
package com.devquinchi.proyecto_web.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devquinchi.proyecto_web.dao.EmpleadoDA0;
import com.devquinchi.proyecto_web.services.SpringService;

/**
 * @author Julio
 *
 */ 
@Service //si trabajo con otros componentes que no sea Spring uso esta anotacion @service
public class SpringServiceIMPL implements SpringService {

	@Autowired  // para inyectar con SPRING Y si se usa la anotacion @service
	private EmpleadoDA0 empleadoDAOImpl;
	@Override
	public String mostrarNombreEmpresa() {
		return "Anotaciones con Spring y JSF";
	}
	@Override
	public String mostrarNombreEmpleado() {
		return this.empleadoDAOImpl.consultarNombreEmpleado();
	}

}
