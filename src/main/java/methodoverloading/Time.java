package methodoverloading;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(Time time) {
        this.hours = time.hours;
        this.minutes = time.minutes;
        this.seconds = time.seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isEqual(Time time) {
        return this.hours == time.hours && this.minutes == time.minutes && this.seconds == time.seconds;
    }

    public boolean isEqual(int h, int m, int s) {
        return this.hours == h && this.minutes == m && this.seconds == s;
    }
    public boolean isEarlier(Time time) {
        return this.hours < time.hours || this.minutes < time.minutes || this.seconds < time.seconds;
    }

    public boolean isEarlier(int h, int m, int s) {
        return this.hours < h || this.minutes < m || this.seconds < s;
    }

}
