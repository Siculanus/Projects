import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        double v0 = 0;
        double t0 = 0;
        double g = 9.81;
        double surface = 2.0;
        double vitesse = v0;
        double hauteur = h0;
        double accel = g;
        double t = t0;
        System.out.printf("%.0f, %.4f, %.4f, %.5f\n",
        		t, hauteur, vitesse, accel);
        double s = surface / masse;
        double q = Math.exp(-s * (t - t0));
        double v = (g/s) * (1-q) + v0 * q;
        double h =  h0 - g/s * (t-t0) - ((v0 - g/s)/s) * (1 -q);
        double a = g - s * v;
        double times = 0;
        double timing = 0;
        double timings = 0;
        while (h > 0) {
        	t = t+1;
            q = Math.exp(-s * (t - t0));
            v = (g/s) * (1-q) + v0 * q;
            h =  h0 - (g/s) * (t-t0) - ((v0 - g/s)/s) * (1 -q);
            a = g - s * v;
            if (h < 2500 & timings==0) {
        		surface = 25;
        		s = surface/masse;
        		h0=h;
        		v0=v;
        		t0=t;
        		timings=1;
        		System.out.println("## Felix ouvre son parachute");
        	}
            if(v >=343 & timing ==0) {
            	System.out.println("## Felix depasse la vitesse du son");
            	timing=1;
            	}
            if (a < 0.5 & times ==0) {
            		System.out.println("## Felix a atteint sa vitesse maximale");
            		times = 1;
            	}
            if (h>0) {
            	
        	System.out.printf("%.0f, %.4f, %.4f, %.5f\n",
            		t, h, v, a);
            }
        }
        
        
        
        
        
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
