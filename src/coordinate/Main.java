package coordinate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double x;
        double y;

        Mypoint point1= new Mypoint(10,30.5);
        point1.distance1(point1);
        Mypoint point2= new Mypoint();
        Scanner input = new Scanner(System.in);
        x=input.nextDouble();
        y= input.nextDouble();
        point2.distance1(x,y);
    }
}
