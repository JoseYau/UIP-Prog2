import java.util.Scanner;

public class Laboratorios {
	float aum;
	float menor,suma=0; ;
	String[] estudiantes = new String[4];
	public void lab (){
		
		float califi[] = new float[6];
		aum=0;
		
		Scanner op = new Scanner (System.in);
		for ( int b=1; b<4 ;b++){
			
			System.out.println("Digite nombre del estudiante:");
			estudiantes [b] = op.next();
		}
		menor = 99999999;
		for(int a=1 ; a<6 ; a++){
		System.out.println("ingrese calificacion del laboratorio"+a);
		califi[a]=op.nextFloat();
		
		
			if ( califi [a] < menor){
				menor = califi[a];
			}
			
			}
		for(int a=1 ; a<4 ;a++){
		suma  = suma + califi[a]-menor;
		System.out.println("Estudiante "+estudiantes[a]);
		System.out.println("promedio es  "+suma/4);}
		System.out.println("su nota elminada fue " +menor);
		
	}
		
			

}
