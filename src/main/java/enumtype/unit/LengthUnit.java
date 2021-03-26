package enumtype.unit;

public enum LengthUnit {
    MM(true, 1), CM(true, 10), M(true, 1000),
    YARD(false, 9144), FOOT(false, 3048), INCH(false, 254);

    private boolean si;
    private int inmm;

    LengthUnit(boolean si, int inmm) {
        this.si = si;
        this.inmm = inmm;
    }

    public boolean getSi() {
        return si;
    }

    public int getInmm() {
        return inmm;
    }
}
