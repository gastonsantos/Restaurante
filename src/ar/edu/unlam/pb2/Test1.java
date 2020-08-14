package ar.edu.unlam.pb2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test1 {


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

	@Test
public void TestQueCuentaSalEnPlato(){

	Ingredientes ingrediente1 = new Ingredientes("Huevo", 1.0, 0.0);
	Ingredientes ingrediente2 = new Ingredientes("Queso", 4.0, 0.0);
	
	Plato  plato1 = new Plato("Omelete");

	plato1.AgregarIngrediente(ingrediente1);
	plato1.AgregarIngrediente(ingrediente2);
	
	
	
	Double valorEsperado = 5.0;
	Double valorObtenido= plato1.ContadorDeSalEnPLato();
	
	assertEquals(valorEsperado, valorObtenido);

	
}
	@Test
public void TestQueVerificaPlatoAptoParaHipertensos(){
	Ingredientes ingrediente1 = new Ingredientes("Huevo", 0.2, 7.0);
	Ingredientes ingrediente2 = new Ingredientes("Queso", 0.2, 1.9);
	
	Plato  plato1 = new Plato("Omelete");

	plato1.AgregarIngrediente(ingrediente1);
	plato1.AgregarIngrediente(ingrediente2);
	
	plato1.ContadorDeSalEnPLato();
	
	plato1.PlatoDisponibleParaHipertensos();
Boolean valorEsperado= true;
Boolean valorObtenido = plato1.PlatoDisponibleParaHipertensos();
assertEquals(valorEsperado, valorObtenido);
	
}
	
	@Test
	public void TestQueCuentaAzucarEnPLato() {
		
		Ingredientes ingrediente1 = new Ingredientes("Huevo", 0.0, 0.2);
		Ingredientes ingrediente2 = new Ingredientes("Queso", 0.0, 0.5);
		
		Plato  plato1 = new Plato("Omelete");

		plato1.AgregarIngrediente(ingrediente1);
		plato1.AgregarIngrediente(ingrediente2);
		
		
		Double valorEsperado = 0.7;
		Double valorObtenido = plato1.contadorDeAzucarEnPLato();
		assertEquals(valorEsperado, valorObtenido);
	}
 
	
}
