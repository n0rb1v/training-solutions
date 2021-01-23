package ioreadwritebytes;

public class Temperatures {
    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage() {
        double ave = 0;
        for (Byte item : data) {
            ave += item;
        }
        return ave / 365;
    }

    public double getMonthAverage() {
        double ave = 0;
        for (int i = data.length - 1; i > data.length - 31; i--) {
            ave += data[i];
        }
        return ave / 30;
    }
}
