import java.util.Scanner;
public class Descuento_emperador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		 float cant, descuento = 0;
		 
		 System.out.println("Introduzca su monto:");
		 cant = sc.nextFloat();
		 
		 if (cant>=500){
		 
		 descuento =(float) (cant*0.30);
	}
	
	else if (cant>=200 && cant<500) {
		descuento=(float) (cant*0.20);
	}
	
	    else if (cant>=100 && cant<200) {
		descuento=(float) (cant*0.10);
	}
	
		 System.out.print("\n\t");
		 System.out.print("La cantidad total es de:"+cant+"\n y el descuento fue de:"+descuento);
		 
	}
}


