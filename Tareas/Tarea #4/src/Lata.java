import java.util.Scanner;
public class Lata {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float h, superficie, v, r;
		double pi = 3.1416;
		
		System.out.print("Introduzca el radio:");
		r = sc.nextFloat();
		System.out.print("\nIntroduzca la altura:");
		h = sc.nextFloat();
		
		
		v = (float) (pi * r * r * h);{
			
		}
		
		superficie = (float) ((2 * pi) * (r * r) + (2 * pi) * (r * h));{
			
		}
		
		System.out.print("\n\n");
		System.out.print("El Volumen con respescto a los datos introducidos de la figura es de:"+v);
		
		System.out.print("\nLa Superficie con respescto a los datos introducidos de la figura es de:"+superficie);
		
		
	}

}
