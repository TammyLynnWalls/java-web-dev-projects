package technology.main.java.org.launchcode;

public class Computer extends AbstractEntity{
    private boolean startUpSound = false;
    private boolean displayOn = true;
    private String keyboardType;
    private String operatingSystem;

    public Computer (String akeyboardType, String aoperatingSystem) {
        keyboardType = akeyboardType;
        operatingSystem = aoperatingSystem;
    }

    public boolean isStartUpSound() {
        return startUpSound;
    }

    public void setStartUpSound(boolean startUpSound) {
        this.startUpSound = startUpSound;
    }

    public boolean isDisplayOn() {
        return displayOn;
    }

    public void setDisplayOn(boolean displayOn) {
        this.displayOn = displayOn;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void shutDown() {
        displayOn = false;
    }

    public void turnOn() {
        displayOn = true;
        startUpSound = true;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "idNumber=" + this.getIdNumber() +
                " startUpSound=" + startUpSound +
                ", displayOn=" + displayOn +
                ", keyboardType='" + keyboardType + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
