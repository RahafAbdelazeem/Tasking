package Integers;

public class MyInteger {
    int value;

    public int getValue() {
        return value;
    }

    public MyInteger(int value) {
        this.value = value;
    }

    public boolean iseven() {
        if (value % 2 == 0)
            return true;
        return false;
    }

    public boolean isodd() {
        if (value % 2 != 0)
            return true;
        return false;
    }

    public boolean isprime() {
        if (value == 2 || value == 3)
            return true;
        else if (value % value == 0)
            return true;
        return false;
    }

    public boolean isEven(int value) {
        if (value % 2 == 0)
            return true;
        return false;
    }

    public boolean isOdd(int value) {
        if (value % 2 != 0)
            return true;
        return false;
    }

    public boolean isPrime(int value) {
        if (value == 2 || value == 3)
            return true;
        else if (value % value == 0)
            return true;
        return false;

    }

    public boolean IsEven(MyInteger e) {
        return e.iseven();
    }

    public boolean IsOdd(MyInteger me) {
        return me.isodd();
    }


    public boolean IsPrime(MyInteger Int) {
        return Int.isprime();
    }

    public boolean isequale(int value) {
        if (this.value == value)
            return true;
        System.out.println(" yes that is equal");
        return false;

    }

    public boolean Isequal(MyInteger R) {
        return R.isequale(value);
    }

    public int parseInt(char[] arr) {
        int sumatiomn = 0;
        for (char C : arr) {
            sumatiomn += Character.getNumericValue(C);

        }
        System.out.println(sumatiomn);
        return sumatiomn;

    }

    public int parseInt(String S) {
        return Integer.parseInt(S);

    }
}
