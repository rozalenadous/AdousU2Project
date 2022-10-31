public class LinearEquations {
    //instance variables
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    //constructor with x1y1 and x2y2 parameters
    public LinearEquations(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //distance method
    public double distance(){
        double dis = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
        return roundedToHundredth(Math.pow(dis, 0.5));
    }

    //slope method
    public double slope(){
        return roundedToHundredth(((double) y2-y1)/(x2-x1));
    }

    //y-intercept method
    public double yIntercept(){
        double b = y1-(slope()*x1);
        return roundedToHundredth(b);
    }
    //equation method
    public String equation(){
        int num = y2-y1;
        int den = x2-x1;
        String interceptString;

        // horizontal slope
        if(num == 0){
            return "y = " + yIntercept();
        }
        // change location of (-)
        else if (den < 0) {
            num *= -1;
            den *= -1;
        }
        int slope = num % den;
        String slopeString = "";

        if(slope == 0){ // if slope is a whole number
          if(Math.abs(num/den) != 1){
              slopeString = "" + num/den;
          }  else if(num/den < 0){ // negative slope
              slopeString = "-"; // ensures negative sign is on one side??
          }else {
              slopeString = ""; // positive slope equal to 1
          }
        }else{
            slopeString = num + "/" + den; // fractional slope
        }
        if(yIntercept() != 0){ // if y intercept exists
            if(yIntercept()> 0){
                interceptString = " + " + Math.abs(yIntercept()); // positive y-intercept
            } else{
                interceptString = " - " + Math.abs(yIntercept()); // negative y-intercept
            }
        } else{
           interceptString = ""; // if no y-intercept
        }
        return "y = " + slopeString + "x" + interceptString; // final equation
    }
// do the if else statements need to be spaced out?

    //input your x value method
    public String coordinateForX(double yourX){
        double yourY = roundedToHundredth(slope()*yourX + yIntercept());
        return "(" + yourX + ", " + yourY + ")";
    }

    // all line information method
    public String lineInfo(){
        return "The two points are: (" + x1 + ", " + y1 + ")" + " and (" + x2 + ", " + y2 + ")" + "\n The equation of the line between these points is: " + equation() + "\n The slope of this line is: " + slope() + "\n The y-intercept of the line is: " + yIntercept() + " \n The distance between the two points is: " + distance() ;
    }

    //round to hundredth helper method
    public double roundedToHundredth(double toRound) {
        return (double) Math.round(toRound * 100) / 100; // round to the nearest hundredth


        // start method to welcome user
    }

}


