package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.curso.java.utils.UtilidadesMatematicas;

public class UtilidadesMtematicasTest {
	@Test // anotacion;Sirve para relalizar difrentes anotaciones
	public void testSumar() {
		int resultado = UtilidadesMatematicas.funcionSumar(2, 3);

		assertEquals(5, resultado);
	}
	@Test
	public void testfuncionOperacion(int a, int b, String operador) {
		int resultado = UtilidadesMatematicas.funcionOperacion(5,3, "+");
			
			assertEquals(8, resultado);
			
		}
			
			
		
				
			
		
		}

	
		
	
			
	
