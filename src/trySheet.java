import javax.swing.JOptionPane;
import java.util.Scanner;


public class trySheet {

    public static void main(String[]args) {
        //double x =3.14;
        //double y = -10;

        //double z =Math.max(x, y);

        //double a =Math.min(x, y);

        //double b =Math.abs(y);

        //System.out.println(z);
        //System.out.println(a);
       // System.out.println(b);

        double x;
        double y;
        double z;


        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter side x: ");
        x= scanner.nextDouble();
        System.out.println("Enter side y: ");
        y= scanner.nextDouble();
        z=Math.sqrt((x*x)+(y*y));


        System.out.println("The hypotenuse is :  " +z);
        scanner.close();
    }

}
