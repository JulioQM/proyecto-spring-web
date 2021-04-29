/**
 * 
 */
package com.devquinchi.proyecto_web.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.devquinchi.proyecto_web.services.SpringService;

/**
 * @author Julio
 *	Clase de prueba unitaria con Spring y JUNIT 4
 *	NOTA: No tiene soporte Spring Test para JUnit 5
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-test.xml"})
public class SpringJunit4Test {
	
	@Autowired
	private SpringService springServiceIMPL;
	
	@Test
	public void test() {
		assertNotNull(springServiceIMPL);
		System.out.println(this.springServiceIMPL.mostrarNombreEmpleado());
	}

}
