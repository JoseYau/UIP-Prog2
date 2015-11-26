
public class DepreciacionDeActivos {

	public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner esc = new Scanner(System.in);
        CalculoDepreciacion cdl = new CalculoDepreciacion();

        int b;
        double a = 0, d = 0, c = 0;
        int cant = 0, resp;

       
            System.out.println("Depreciacion de los activos");
            System.out.println("Inserte el valor del inmueble");
            double Vi = esc.nextDouble();
            System.out.println("Inserte el tiempo de vida util ");
            int Vu = esc.nextInt();
           do {  System.out.println("Menu de tabla\n 1. Ver años. \n 2. Factor "
                    + " \n 3. Porcentage. ");
            int aux4 = esc.nextInt();
            if (aux4 == 1) {
                while (cant < Vu) {
                    System.out.println(Vu);
                    Vu--;
                }
            }
            else if (aux4 == 2)
            {
                d = cdl.Factor(Vu);
           
                while (cant < Vu) {
                    System.out.println(df.format(d));
                    Vu--;
                    cdl.Salidas();
                }
            }

            System.out.println("Para Regresar la menu teclee 1 y para terminar 0: \n");
            resp = esc.nextInt();
        } while (resp == 1);

    }



	}


