package ar.edu.unlam.pb2;

public class Ingredientes {
	
	private String nombre;
	private Double cantidadDeSal;
	private Double cantidadDeAzucar;

	  
	
	public Ingredientes(String nombre, Double cantidadDeSal, Double cantidadDeAzucar) {
		this.nombre = nombre;
		this.cantidadDeSal= cantidadDeSal;
		this.cantidadDeAzucar= cantidadDeAzucar;
		
		
	}
	public Double getCantidadDeSal() {
		return cantidadDeSal;
	}
	public void setCantidadDeSal(Double cantidadDeSal) {
		this.cantidadDeSal = cantidadDeSal;
	}
	public Double getCantidadDeAzucar() {
		return cantidadDeAzucar;
	}
	public void setCantidadDeAzucar(Double cantidadDeAzucar) {
		this.cantidadDeAzucar = cantidadDeAzucar;
	}
	

	@Override
	public String toString() {
		return "Ingredientes [nombre=" + nombre + ", cantidadDeSal=" + cantidadDeSal + ", cantidadDeAzucar="
				+ cantidadDeAzucar + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
