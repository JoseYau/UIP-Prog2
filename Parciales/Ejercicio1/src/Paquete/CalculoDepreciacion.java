package Paquete;
import java.text.DecimalFormat;

import java.util.Scanner;

public class CalculoDepreciacion {
	
	DecimalFormat df = new DecimalFormat("0.000000");

    public static double Fa, PFa, Cd;;
    public static int Sd, Vu;

 

    public  double Factor(int Vu) {
        Sd = (Vu * (Vu + 1)) / 2;
        Fa = Vu / Sd;
        return Fa;
    }

    public double Porcentage(double Fa) {
        PFa = Fa * 100;
        return PFa;
    }

    public double CuotaDepreciacion(double Vi) {
        
        
        Cd = Fa * Vi;
        return Cd;
    }
    
    void Salidas()
    {
        System.out.println(df.format(Fa));
        System.out.println(df.format(PFa));
        System.out.println(df.format(Cd));
    }
}
	


