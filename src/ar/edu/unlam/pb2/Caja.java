package ar.edu.unlam.pb2;

public class Caja {

	public static void main(String[] args) {
		
		
		Mesa mesa1 = new Mesa();
		Ingredientes ingrediente1 = new Ingredientes("Huevo", 0.0, 0.0);
		Ingredientes ingrediente2 = new Ingredientes("Fideos", 0.2, 0.0);
		Ingredientes ingrediente3 = new Ingredientes ("Queso", 0.5, 0.0);
		
		Plato plato1 = new Plato ("Omelete");
		Plato plato2 = new Plato ("Bolognesa");
		
		plato2.AgregarIngrediente(ingrediente1);
		plato2.AgregarIngrediente(ingrediente2);
		plato2.AgregarIngrediente(ingrediente2);
		
		plato2.ContadorDeSalEnPLato();
		plato2.PlatoDisponibleParaHipertensos();
		
		plato1.AgregarIngrediente(ingrediente1);
		plato1.AgregarIngrediente(ingrediente2);
		plato1.AgregarIngrediente(ingrediente3);
		
		plato1.ContadorDeSalEnPLato();
		plato1.PlatoDisponibleParaHipertensos();
		
		mesa1.AgregarPlato(plato1);
		mesa1.AgregarPlato(plato2);
		mesa1.ContadorDeSalEnMesa();
		mesa1.MesaAptaParHipertensos();
		//mesa1.MostrarNombreEIngredietes();
		
		
	}  

}