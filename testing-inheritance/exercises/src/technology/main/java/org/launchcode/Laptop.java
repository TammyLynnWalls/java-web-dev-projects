package technology.main.java.org.launchcode;

public class Laptop extends Computer {
    private double weight;
    private boolean inCase = true;
    public Laptop(String akeyboardType, String aoperatingSystem, double aweight) {
        super(akeyboardType, aoperatingSystem);
        weight = aweight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isInCase() {
        return inCase;
    }

    public void setInCase(boolean inCase) {
        this.inCase = inCase;
    }

    public void transport() {
        inCase = true;
    }

    public void atWork() {
        inCase = false;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "idNumber=" + this.getIdNumber() +
                " weight=" + weight +
                ", inCase=" + inCase +
                '}';
    }
}
