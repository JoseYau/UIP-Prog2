import java.util.Scanner;

public class Ambu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		float t, v, d, seg;
		
		System.out.print("Introduzca la velocidad de la ambulancia:");
		v = sc.nextFloat();
		
		System.out.print("\nIntroduzca la distancia recorrida de la ambulancia:");
		d = sc.nextFloat();
		
		t = (d/v);
		
		seg = (t*3600);
		
		System.out.print("\n\nEl tiempo recorrido en horas es de:"+t+" y su tiempo total en segundo es de:"+seg);
	}

}
