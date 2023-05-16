package Time;

public class time {

    private int houers;
     private int minutes;
     private int secounds;
     private long  ETime;
    public time() {
        ETime=System.currentTimeMillis();

    }

    public time(int houers, int minutes, int secounds) {
        this.houers = houers;
        this.minutes = minutes;
        this.secounds = secounds;

    }

    public time(long ElapsedTime) {
        this.ETime = ElapsedTime;
    }

    public int getHouers() {
        return (int)(ETime/(1000*60*60))%24;
    }

    public int getMinutes() {
        return (int)(ETime/(1000*60))%60;
    }

    public int getSecounds() {
        return (int)(ETime/1000)%60;
    }

    public void setETime(long ElapsedTime) {
        this.ETime = ElapsedTime;
    }
}
