package ar.edu.unlam.pb2;



import java.util.HashSet;

public class Mesa {  
	
	private HashSet<Plato> platos = new HashSet<Plato>();
	private Double contadorSal=0.0;
	private Double contadorAzucar= 0.0;
	

	
	public HashSet<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(HashSet<Plato> platos) {
		this.platos = platos;
	}

	

	public Mesa() {
		
		platos = new HashSet<Plato>();
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
	
	
	public Double contadorDeAzucarEnMesa() {
		
		for (Plato e: platos) {
			
			contadorAzucar+=e.getContadorAzucar();
		}
		return contadorAzucar;
	}
	


	public double ContadorDeSalEnMesa(){
		
			for(Plato e: platos){

			
				contadorSal+= e.getContadorSal();
			}
		
		System.out.println("LA MESA TIENE EN TOTAL: "+contadorSal);
		return contadorSal;
	}
	
public Boolean MesaAptaDiabeticos() {
	
	if(contadorAzucar>1.3) {
		
		return false;
		
	}else {
		return true;
	}
}

		public boolean MesaAptaParHipertensos(){
			
			if(contadorSal>1.3){
				
				System.out.println("Mesa No apta para Hipertensos");
				return false;
			}else{
				
				System.out.println("Mesa apta para Hipertensos");
				return true;
			}
		
			
		}
		
		public Integer contadorDePlatosEnMesa() {
			
			int contadorPlatos = platos.size();
			return contadorPlatos;
		}

		

}
