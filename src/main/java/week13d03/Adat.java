package week13d03;

public class Adat {
    private String name;
    private String targy;
    private String osztaly;
    private int oraszam;

    public Adat(String name, String targy, String osztaly, int oraszam) {
        this.name = name;
        this.targy = targy;
        this.osztaly = osztaly;
        this.oraszam = oraszam;
    }

    public String getName() {
        return name;
    }

    public String getTargy() {
        return targy;
    }

    public String getOsztaly() {
        return osztaly;
    }

    public int getOraszam() {
        return oraszam;
    }
}
