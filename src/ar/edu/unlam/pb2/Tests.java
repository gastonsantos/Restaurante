package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

class Tests {  

	@Test
	public void testQueVerificaQueNoAceptaPlatosRepetidos() {
		Mesa mesa1 = new Mesa();
		Ingredientes ingrediente1 = new Ingredientes("Huevo", 0.0, 0.0);
		
		Plato  plato1 = new Plato("Omelete");
		Plato plato2 = new Plato ("Omelete");
		
		plato1.AgregarIngrediente(ingrediente1);
		plato2.AgregarIngrediente(ingrediente1);
		
		mesa1.AgregarPlato(plato1);
		mesa1.AgregarPlato(plato2);
		
		Integer valorEsperado= 1;
		Integer valorObtenido = mesa1.contadorDePlatosEnMesa();
		assertEquals(valorEsperado, valorObtenido);
		
	
	}

}
