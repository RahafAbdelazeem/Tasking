package Time;

public class Main {

    public static void main(String[] args) {
	// write your code here
        time timer1= new time();
        System .out.printf("%d:%d:%d %n",timer1.getHouers(),timer1.getMinutes(),timer1.getSecounds());
        time timer2= new time(555550000);
        System .out.printf("%d:%d:%d %n",timer2.getHouers(),timer2.getMinutes(),timer2.getSecounds());
        time timer3= new time (5,23,55);
        System .out.printf("%d:%d:%d %n",timer3.getHouers(),timer3.getMinutes(),timer3.getSecounds());
         time timer = new time();
         timer.setETime(24689371L);
        System .out.printf("%d:%d:%d %n",timer.getHouers(),timer.getMinutes(),timer.getSecounds());



    }
}
