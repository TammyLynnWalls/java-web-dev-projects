package test.main.java.org.launchcode;

import org.junit.jupiter.api.Test;
import technology.main.java.org.launchcode.Computer;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {
    Computer katinka = new Computer("wireless" , "windows");

    @Test

    public void testComputerInitialization() {
        assertTrue(katinka.isDisplayOn());

    }
    @Test
    public void testComputerInitializationStartUpSound() {
        assertFalse(katinka.isStartUpSound());

    }

    @Test
    public void testComputerInitializationKeyboardType() {
        assertEquals("wireless",katinka.getKeyboardType());

    }


}
