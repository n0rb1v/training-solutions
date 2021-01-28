package week13d02;

import java.time.LocalTime;

public class Airport {
    private String jarat;
    private String irany;
    private String varos;
    private LocalTime idopont;

    public Airport(String jarat, String irany, String varos, LocalTime idopont) {
        this.jarat = jarat;
        this.irany = irany;
        this.varos = varos;
        this.idopont = idopont;
    }

    public String getJarat() {
        return jarat;
    }

    public String getIrany() {
        return irany;
    }

    public String getVaros() {
        return varos;
    }

    public LocalTime getIdopont() {
        return idopont;
    }

    @Override
    public String toString() {
        return  "jarat=" + jarat + " irany=" + irany +" varos=" + varos +" idopont=" + idopont;
    }
}
