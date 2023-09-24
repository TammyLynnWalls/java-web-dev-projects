package test.main.java.org.launchcode;

import org.junit.jupiter.api.Test;
import technology.main.java.org.launchcode.Laptop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LaptopTest {
    Laptop lenovo = new Laptop("built in", "windows", 3.1 );
    @Test

    public void testLaptopInitialization(){
        assertTrue(lenovo.isDisplayOn());
    }
    @Test
    public void testLaptopInitializationInCase(){
        assertTrue(lenovo.isInCase());
    }
    @Test
    public void testLaptopInitializationOS(){
        assertEquals("windows",lenovo.getOperatingSystem());
    }

}
