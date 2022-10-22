import java.util.Scanner;
public class LinearEquationsRunner {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        // LinearEquations eq1 = new LinearEquations(1,5,3,11);
        //  System.out.println(eq1.distance() + "\n" + eq1.slope() + "\n" + eq1.equation() + "\n" + eq1.yIntercept());
        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");// (1, 2)
        String XY1 = scan.nextLine();
        int X1 =Integer.parseInt( XY1.substring(1,XY1.indexOf(",")));
        int Y1 = Integer.parseInt(XY1.substring(XY1.indexOf(",")+ 1, XY1.indexOf(")")));
        //System.out.print("This is X1: " + X1 + " and this is y1: " + Y1);

        System.out.println("Enter coordinate 2: ");// (1, 2)
        String XY2 = scan.nextLine();
        int X2 = Integer.parseInt(XY2.substring(1,XY2.indexOf(",")));
        int Y2 = Integer.parseInt(XY2.substring(XY2.indexOf(",")+ 1, XY2.indexOf(")")));
        // System.out.print("This is X1: " + X2 + " and this is y1: " + Y2);

        LinearEquations eq1 = new LinearEquations(X1, Y1, X2, Y2);

        System.out.println("Enter a value for x: ");
        double newX = scan.nextDouble();
        System.out.println("The point on the line is: " + eq1.chooseVal(newX));
    }
}

