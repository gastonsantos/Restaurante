package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Plato {
	private ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
	private String nombrePlato;
	private Double contadorSal=0.0;
	
	  
	
	public Plato(Double contadorSal) {
		
		this.contadorSal = contadorSal;
		
				  
	}

	public Double getContadorSal() {
		return contadorSal;
	}

	public Plato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
		ingredientes = new ArrayList<Ingredientes>();
		
	}
	
	public void AgregarIngrediente(Ingredientes ingrediente1) {
		ingredientes.add(ingrediente1);
		
	}
	
	public void EliminarIngrediente(Ingredientes ingrediente1) {
		
		ingredientes.remove(ingrediente1);
	}
	


	public Double ContadorDeSalEnPLato(){
		
		for(Ingredientes e : ingredientes){
			contadorSal+=e.getCantidadDeSal();
			
		}
		System.out.println("SAL: "+contadorSal);
		return contadorSal;
	}
	
	public Boolean PlatoDisponibleParaHipertensos(){
		if(contadorSal >0.5){
			System.out.println("El PLATO NO ES APTO");
			return false;
		}else{
			System.out.println("El PLATO  ES APTO");
			return true;
		}
		
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombrePlato == null) ? 0 : nombrePlato.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plato other = (Plato) obj;
		if (nombrePlato == null) {
			if (other.nombrePlato != null)
				return false;
		} else if (!nombrePlato.equals(other.nombrePlato))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Plato: "+nombrePlato+" \nIngredientes:\n"+ingredientes+"\n";
	}

	

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}
}
