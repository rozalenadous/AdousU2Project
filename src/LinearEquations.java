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
        if (slope() == 0){
            return "y = " + yIntercept();
        } else if (slope()==1) {
            return "y = x + " + yIntercept();
        } else if (slope() == -1) {
            return "y = -x + " + yIntercept();
        } else{
            return "y = " + slope() + "x " + "+ " + yIntercept();
        }
    }


//input your x value method
    public String chooseVal(double yourX){
        double yourY = slope()*yourX + yIntercept();
        return "(" + yourX + ", " + yourY + ")";
    }
    public String lineInfo(){
        return "the slope ";
    }

}


