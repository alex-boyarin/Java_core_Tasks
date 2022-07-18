package theSimplestClassesAndObjects.task6;


public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public Time() {
        this.hour = randomHour();
        this.minute = randomMinute();
        this.seconds = randomSeconds();
    }

    public Time(int hh, int mm, int ss) {
       this.setHour(hh);
        this.setMinute(mm);
        this.setSeconds(ss);
    }


    public void setHour(int hh) {
        if (hh < 0 || hh > 24) {
            hour = 0;
        } else {
            hour = hh;
        }
    }

    public void setMinute(int mm) {
        if (mm < 0 || mm > 60) {
            minute = 0;
        } else {
            minute = mm;
        }
    }

    public void setSeconds(int ss) {
        if (ss < 0 || ss > 60) {
            seconds = 0;
        } else {
            seconds = ss;
        }
    }

    private int randomHour() {
        return (int) (Math.random() * 24);
    }

    private int randomMinute() {
        return (int) (Math.random() * 60);
    }

    private int randomSeconds() {
        return (int) (Math.random() * 60);
    }

    public void addHour(int hh) {
        addSeconds(hh * 60 * 60);
    }

    public void addMinute(int mm) {
        addSeconds(mm * 60);
    }

    public void addSeconds(int ss) {
        seconds += ss;
        minute += seconds / 60;
        seconds = seconds % 60;
        hour += minute / 60;
        minute = minute % 60;
        hour = hour % 24;
    }

    @Override
    public String toString() {
        return "Time{" + hour + ":" + minute + ":" + seconds + '}';
    }
}
