package coordinate;

public class Mypoint {


    private double p1;
    private double p2;
    public Mypoint(){
        this(0,0);

    }

    public Mypoint(double p1, double p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public int distance1(Mypoint point ){
        double result= Math.sqrt (Math.pow(point.getP1(),2)+ Math.pow(point.getP2(),2));
        System.out.println(result);
        return (int) result;

     }
    public int distance1( double p1,double p2){
        double result= Math.sqrt(Math.pow(p1,2)+ Math.pow(p2,2));
        System.out.println(result);
        return (int) result;

    }
}
