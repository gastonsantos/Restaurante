package ar.edu.unlam.pb2;


import java.util.ArrayList;

public class Mesa {  
	
	private ArrayList<Plato> platos = new ArrayList<Plato>();
	private double contadorSal;
	
	
	
	public ArrayList<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(ArrayList<Plato> platos) {
		this.platos = platos;
	}

	

	public Mesa() {
		
		platos = new ArrayList<Plato>();
	}
	
	public void AgregarPlato(Plato plato1) {
		
		platos.add(plato1);
	}
	public void EliminarPlato(Plato plato1) {
		
		platos.remove(plato1);
	}
	
	public void MostrarNombreEIngredietes() {
		
		System.out.println(platos.toString());
	}
	
	
	public double ContadorDeSalEnMesa(){
		for(Plato e: platos){
			
			contadorSal+=e.ContadorDeSalEnPLato();
				
		}
		System.out.println("LA MESA TIENE EN TOTAL: "+contadorSal);
		return contadorSal;
	}
	
		public boolean MesaAptaParHipertensos(){
			
			if(contadorSal>1.3){
				System.out.println("LA MESA TIENE EN TOTAL: "+contadorSal);
				System.out.println("Mesa No apta para Hipertensos");
				return false;
			}else{
				System.out.println("LA MESA TIENE EN TOTAL: "+contadorSal);
				System.out.println("Mesa apta para Hipertensos");
				return true;
			}
		
			
		}
		
	
	
	
	
	

}
