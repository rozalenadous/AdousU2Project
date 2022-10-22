public class LinearEquations {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LinearEquations(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    //distance method
    public double distance(){
        double dis = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
        return Math.pow(dis, 0.5);
    }
    //slope method
    public double slope(){
        return ((double) y2-y1)/(x2-x1);
    }

    //y-intercept method
    public double yIntercept(){
        double b = y1-(slope()*x1);
        return b;
    }
    //equation method
    public String equation(){
        int num = y2-y1;
        int den = x2-x1;
        boolean negY;
        boolean origin;
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
        if(slope == 0){
          if(Math.abs(num/den) != 1){
              slopeString = "" + num/den;
          }  else if(num/den < 0){
              slopeString = "-";
          }else {
              slopeString = "";
          }
        }else{
            slopeString = num + "/" + den;
        }
String interceptString;
        if(yIntercept() != 0){
            if(yIntercept()> 0){
                interceptString = "+" + Math.abs(yIntercept());
            } else{
                interceptString = " - " + Math.abs(yIntercept());
            }
        } else{
           interceptString = "";
        }
      //  String yIntercept = yIntercept() != 0 // check if there is a y-intercept
             //   ? yIntercept() > 0 // true: check if y intercept is + or -
               // ? " + " + Math.abs(yIntercept()) // (+) return add y-intercept
               // : " - " + Math.abs(yIntercept()) // (-) return minus y-intercept
               // : ""; // false: return empty string
       // String slope = num % den == 0 // int or fraction //if this is true
        //   ?   (Math.abs(num/den) != 1 ? "" + num/den : num/den < 0? "-" : "") // do this
        //    : num + "/" + den; // if not true do this

        return "y = " + slopeString + "x" + interceptString;
    }


    //input your x value method
    public String chooseVal(double yourX){
        double yourY = slope()*yourX + yIntercept();
        return "(" + yourX + ", " + yourY + ")";
    }
    // line info method
    public String lineInfo(){
        return "The two points are: (" + x1 + ", " + y1 + ")" + " and (" + x2 + ", " + y2 + ")" + "\n The equation of the line between these points is: " + equation() + "\n The slope of this line is: " + slope() + "\n The y-intercept of the line is: " + yIntercept() + " \n The distance between the two points is: " + distance() ;
    }
    public double roundToHundredth(double toRound) {
        return (double) Math.round(toRound * 100) / 100; // round to the nearest hundredth
    }

}


/*  if (slope() == 0){
            return "y = " + yIntercept();
        } else if (slope()==1) {
            return "y = x + " + yIntercept();
        } else if (slope() == -1) {
            return "y = -x + " + yIntercept();
        } else{
            return "y = " + rise + "/" + run + "x " + "+ " + yIntercept();
        }
 */