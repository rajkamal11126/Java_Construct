import java.util.*;

public class Charge
{
 private final double rx, ry;
 private final double q;

 public Charge( double x0, double y0, double q0)

 {
    rx = x0;
    ry = y0;
    q = q0;
 }
 public double potentialAt( double x, double y)
   {
   double k = 8.99e09;
   double dx = x - rx;
   double dy = y - ry;
   return k * q / Math.sqrt( dx * dx + dy * dy );

   }
 public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Charge ch1 = new Charge( 0.51, 0.63, 21.3 );
        Charge ch2 = new Charge( 0.13, 0.94, 81.9 );
        double v1 = ch1.potentialAt( x, y );
        double v2 = ch2.potentialAt( x, y );
        System.out.println(v1 + v2);

        }

  }

