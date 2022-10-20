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
        //String slope = num % den == 0 // int or fraction //if this is true
         //    ?   (Math.abs(num/den) != 1 ? "" + num/den : num/den < 0? "-" : "") // do this
            //    : num + "/" + den; // if not true do this


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
