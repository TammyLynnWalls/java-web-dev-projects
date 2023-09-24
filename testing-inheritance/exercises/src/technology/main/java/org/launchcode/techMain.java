package technology.main.java.org.launchcode;

public class techMain {
    public static void main(String[] args) {
        Smartphone note5 = new Smartphone("touch", "android", 7, 12);
        System.out.println(note5);

        Laptop dell = new Laptop("built in", "windows", 3.36);
        System.out.println(dell);

        Computer inWin = new Computer ("wireless,", "windows");
        System.out.println(inWin);

    }
}
