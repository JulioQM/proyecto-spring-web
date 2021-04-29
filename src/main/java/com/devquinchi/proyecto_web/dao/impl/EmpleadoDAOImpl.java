/**
 * 
 */
package com.devquinchi.proyecto_web.dao.impl;

import org.springframework.stereotype.Repository;

import com.devquinchi.proyecto_web.dao.EmpleadoDA0;

/**
 * @author Julio
 *
 */
@Repository  // bean de Spring ,usa esta anotacion,ara que toda la clase con esta anotacion Spring Lo reconocera como CLASE DAO
public class EmpleadoDAOImpl implements EmpleadoDA0 {

	@Override
	public String consultarNombreEmpleado() {
		// TODO Auto-generated method stub
		return "Diego lopex";
	}

}
