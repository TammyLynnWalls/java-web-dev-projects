package technology.main.java.org.launchcode;

public class Smartphone extends Laptop{

    private double cameraMPX;
    public Smartphone(String akeyboardType, String aoperatingSystem, double aweight, double acameraMPX) {
        super(akeyboardType, aoperatingSystem, aweight);
        cameraMPX = acameraMPX;
    }

    public double getCameraMPX() {
        return cameraMPX;
    }

    public void setCameraMPX(double cameraMPX) {
        this.cameraMPX = cameraMPX;
    }

    public void takePicture() {
        setDisplayOn(true);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "idNumber=" + this.getIdNumber() +
                " cameraMPX=" + cameraMPX +
                '}';
    }
}
