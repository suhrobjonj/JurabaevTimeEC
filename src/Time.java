public class Time {
    private int h;
    private int m;
    private int s;

    public Time(int hr, int min, int sec) {
        h = hr;
        m = min;
        s = sec;
    }

    private void addSec(int sec) {
        if (s + sec > 59){
            s = sec - (60 - s);
            addMin(1);
        } else {
            s+=sec;
        }
    }

    private void addMin(int min) {
        if (m + min > 59){
            m = min - (60 - m);
            addHr(1);
        } else {
            m+=min;
        }
    }

    private void addHr(int hr) {
        if (h + hr > 23){
            h = hr - (24 - h);;
        } else {
            h+=hr;
        }
    }

    public String info() {
        String time = "";
        if (h < 10) {
            time+=0;
        }
        time+=h + ":";
        if (m < 10) {
            time+=0;
        }
        time+=m + ":";
        if (s < 10) {
            time+=0;
        }
        time+=s;
        return time;
    }

    public void tick() {
        addSec(1);
    }

    public void add(Time t) {
        addSec(t.s);
        addMin(t.m);
        addHr(t.h);
    }

}
