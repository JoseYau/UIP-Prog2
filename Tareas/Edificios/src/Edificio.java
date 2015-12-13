
public abstract class Edificio {
	
	private int Altura;
	
	private int CantidadDep;
		
	private int Estacionamientos;
	
	public void Piscina (){
		
		System.out.println("Nuestro Edificio consta de piscina, la cual ofrece mas confort del que ya le ofrecemos");
		
	}
	
	public void Parque (){
		
		System.out.println("Nuestro Edificio consta de un Parque recreativo, donde usted podra recrearse en familia");	
		
	}

	public int getEstacionamientos() {
		return Estacionamientos;
	}

	public void setEstacionamientos(int estacionamientos) {
		Estacionamientos = estacionamientos;
	}

	public int getCantidadDep() {
		return CantidadDep;
	}

	public void setCantidadDep(int cantidadDep) {
		CantidadDep = cantidadDep;
	}

	public int getAltura() {
		return Altura;
	}

	public void setAltura(int altura) {
		Altura = altura;
	}
	

		

}
