import java.util.Scanner;

public class Principal {
	public static Scanner keyboard;

	public static void main(String[] args) {
		
		int opc;
		int op;
        keyboard = new Scanner(System.in);
        
		System.out.println("Bienvenido al Centro de ayuda para elegir su Edificio Perfecto");
		System.out.println("Edificios a Escoger");
		System.out.println("-------------------");
		System.out.println("1. Edificio Rojo");
		System.out.println("2. Edificio Verde");
		System.out.println("3. Edificio Amarillo");
		System.out.println("4. Salir");
		
		opc = keyboard.nextInt();
		
		switch (opc){
		
		case 1 :
			System.out.println("Ha elegido el Edificio Rojo");
			System.out.println("\n");
			
			EdificioRojo n = new EdificioRojo();
			
			n.getAdministrador();
			
			n.setAltura(50);
			n.getAltura();
			System.out.println("Altura:"+ n.getAltura()+"mts");
			n.getCantidadDep();
			n.setCantidadDep(10);
			System.out.println("\nLa cantidad de departamentos que ofrecemos es de:"+ n.getCantidadDep());
			n.getEstacionamientos();
			n.setEstacionamientos(20);
			System.out.println("\nConsta de:"+n.getEstacionamientos()+" Estacionamientos");
			n.Parque();
			n.Piscina();
		
			keyboard = new Scanner(System.in);
			System.out.println("Eliga el tamaño de su Apartamento:");
			System.out.println("\n");
		
			System.out.println("1. Apartamento Grande");
			System.out.println("2. Apartamento Mediano");
			System.out.println("3. Apartamento pequeño");
			
			op = keyboard.nextInt();
			
			if (op == 1){
				
				System.out.println("Ha elegido el apartamento Grande, mide 60 mts cuadrados, capacidad para 6 personas y su costo es de 100 dolares");
				
			}
			else if (op == 2){
				
				System.out.println("Ha elegido el apartamento Mediano, mide 50 mts cuadrados, capacidad para 4 personas y su costo es de 75 dolares");
			}
			else if (op == 3){
				
				System.out.println("Ha elegido el apartamento Pequeño, mide 40 mts cuadrados, capacidad para 2 personas y su costo es de 50 dolares");
			}
			break;
			
		case 2 :
			System.out.println("Ha elegido el Edificio Verde");
			System.out.println("\n");
			
			EdificioVerde b = new EdificioVerde();
			
			b.getAdministrador();
			
			b.setAltura(60);
			b.getAltura();
			System.out.println("Altura:"+ b.getAltura()+"mts");
			b.getCantidadDep();
			b.setCantidadDep(20);
			System.out.println("\nLa cantidad de departamentos que ofrecemos es de:"+ b.getCantidadDep());
			b.getEstacionamientos();
			b.setEstacionamientos(30);
			System.out.println("\nConsta de:"+b.getEstacionamientos()+" Estacionamientos");
			b.Parque();
			b.Piscina();
			
			keyboard = new Scanner(System.in);
			System.out.println("Eliga el tamaño de su Apartamento:");
			System.out.println("\n");
		
			System.out.println("1. Apartamento Grande");
			System.out.println("2. Apartamento Mediano");
			System.out.println("3. Apartamento pequeño");
			
			op = keyboard.nextInt();
			
			if (op == 1){
				
				System.out.println("Ha elegido el apartamento Grande, mide 80 mts cuadrados, capacidad para 6 personas y su costo es de 200 dolares");
				
			}
			else if (op == 2){
				
				System.out.println("Ha elegido el apartamento Mediano, mide 70 mts cuadrados, capacidad para 4 personas y su costo es de 175 dolares");
			}
			else if (op == 3){
				
				System.out.println("Ha elegido el apartamento Pequeño, mide 60 mts cuadrados, capacidad para 2 personas y su costo es de 150 dolares");
			}
			break;
			
		case 3:
			System.out.println("Ha elegido el Edificio Amarillo");
			System.out.println("\n");
			
			EdificioAmarillo x = new EdificioAmarillo();
			
			x.getAdministrador();
			
			x.setAltura(70);
			x.getAltura();
			System.out.println("Altura:"+ x.getAltura()+"mts");
			x.getCantidadDep();
			x.setCantidadDep(40);
			System.out.println("\nLa cantidad de departamentos que ofrecemos es de:"+ x.getCantidadDep());
			x.getEstacionamientos();
			x.setEstacionamientos(45);
			System.out.println("\nConsta de:"+x.getEstacionamientos()+" Estacionamientos");
			x.Parque();
			x.Piscina();
			keyboard = new Scanner(System.in);
			System.out.println("Eliga el tamaño de su Apartamento:");
			System.out.println("\n");
		
			System.out.println("1. Apartamento Grande");
			System.out.println("2. Apartamento Mediano");
			System.out.println("3. Apartamento pequeño");
			
			op = keyboard.nextInt();
			
			if (op == 1){
				
				System.out.println("Ha elegido el apartamento Grande, mide 90 mts cuadrados, capacidad para 6 personas y su costo es de 300 dolares");
				
			}
			else if (op == 2){
				
				System.out.println("Ha elegido el apartamento Mediano, mide 80 mts cuadrados, capacidad para 4 personas y su costo es de 200 dolares");
			}
			else if (op == 3){
				
				System.out.println("Ha elegido el apartamento Pequeño, mide 70 mts cuadrados, capacidad para 2 personas y su costo es de 100 dolares");
			}
			break;
			
		case 4:
			System.out.println("Saliste de Elegir Tu mejor edificio, Buen Dia!");
			break;
		
		}
	}

}
