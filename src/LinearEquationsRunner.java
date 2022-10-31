import java.util.Scanner;
public class LinearEquationsRunner {
    public static void main(String [] args){


        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String XY1 = scan.nextLine();
        int X1 =Integer.parseInt( XY1.substring(1,XY1.indexOf(",")));
        int Y1 = Integer.parseInt(XY1.substring(XY1.indexOf(",")+ 1, XY1.indexOf(")")));

        System.out.println("Enter coordinate 2: ");
        String XY2 = scan.nextLine();
        int X2 = Integer.parseInt(XY2.substring(1,XY2.indexOf(",")));
        int Y2 = Integer.parseInt(XY2.substring(XY2.indexOf(",")+ 1, XY2.indexOf(")")));

 // check if vertical line or not
     if (X1 != X2){
         LinearEquations eq1 = new LinearEquations(X1, Y1, X2, Y2);
         System.out.println(eq1.lineInfo());
         System.out.println("Enter a value for x: ");
         double newX = scan.nextDouble();
         System.out.println("The point on the line is: " + eq1.coordinateForX(newX));}
     else {
         System.out.println("These points are on a vertical line: x = " + X1);
}


//test case 16 prints y = -2.0 instead of y=-2 is this an issue??
    }
}

