package stringconcat;

public class Employee {

    private String name;
    private String job;
    private int cost;

    public Employee(String name, String job, int cost) {
        if (name == null || "".equals(name)){
            throw new IllegalArgumentException("Nev ures");
        }
        this.name = name;
        if (job == null || "".equals(job)){
            throw new IllegalArgumentException("Munka ures");
        }
        this.job = job;
        if ((cost <= 0) || ((cost % 1000) != 0)){
            throw new IllegalArgumentException("Fizu nem jo");
        }
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name+" - "+job+" - "+cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
