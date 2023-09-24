package technology.main.java.org.launchcode;

public abstract class AbstractEntity {
    private static int idNumber = 0;

    public AbstractEntity() {
        idNumber ++;
    }

    public int getIdNumber() {
        return idNumber;
    }
}
