package stringbasic;

import java.time.LocalDate;

public class Pet {
    private String nev;
    private LocalDate szIdo;
    private Gender nem;
    private String regSzam;

    public Pet(String nev, LocalDate szIdo, Gender nem, String regSzam) {
        this.nev = nev;
        this.szIdo = szIdo;
        this.nem = nem;
        this.regSzam = regSzam;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public LocalDate getSzIdo() {
        return szIdo;
    }

    public void setSzIdo(LocalDate szIdo) {
        this.szIdo = szIdo;
    }

    public Gender getNem() {
        return nem;
    }

    public void setNem(Gender nem) {
        this.nem = nem;
    }

    public String getRegSzam() {
        return regSzam;
    }

    public void setRegSzam(String regSzam) {
        this.regSzam = regSzam;
    }
}
