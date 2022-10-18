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

    public double distance(){
double dis = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
return Math.pow(dis, 0.5);
    }
    public double slope(){
        return ((double) y2-y1)/(x2-x1);
    }
    public String equation(){
        double b = y1-(slope()*x1);
return "y= " + slope() + "x " + "+ " + b;
    }
    public double yIntercept(){
        double b = y1-(slope()*x1);
        return (-b)/slope();
    }
}


