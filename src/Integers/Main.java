package Integers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int x;


        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();

        MyInteger inter1= new MyInteger(x);
        if(inter1.iseven()){
            System.out.println("yes");
        }
        if(inter1.isodd())
            System.out.println("Yes");
        if( inter1.isprime())
            System.out.println("yes");
        if(inter1.iseven()){
            System.out.println("yes");

        }
        if(inter1.isEven(x)){
            System.out.println("yeseven");
        }
        if(inter1.isOdd(x))
            System.out.println("Yes odd");
        if( inter1.isPrime(x))
            System.out.print("yes prime");
        if(inter1.IsEven(inter1)){
            System.out.println("yes");
        }
        if(inter1.IsOdd(inter1))
            System.out.println("Yes");
        if( inter1.IsPrime(inter1))
            System.out.print("yes");
        inter1.isequale(x);
        inter1.Isequal(inter1);

    }
}
