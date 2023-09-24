package test.main.java.org.launchcode;

import org.junit.jupiter.api.Test;
import technology.main.java.org.launchcode.Smartphone;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartphoneTest {
    Smartphone note5G  = new Smartphone("capacitive", "android", 6.03, 12);

    @Test
    public void testinitializeSmartPhoneDisplayOn() {
        assertTrue(note5G.isDisplayOn());
    }
    @Test
    public void testinitializeSmartPhoneKeyboard() {
        assertEquals("capacitive", note5G.getKeyboardType());
    }

    @Test
    public void testinitializeSmartPhoneWeight() {
        assertEquals(6.03, note5G.getWeight());
    }


}
