package test.java.org.launchcode;
import main.java.org.launchcode.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car test_car;

    @BeforeEach
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10,10,.001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank(){
        //Car test_car = new Car("Toyota", "Prius", 10, 50);
        //assertEquals(10, test_car.getGasTankLevel(), .001);
        //assertFalse(test_car.getGasTankLevel() == 0);
        assertTrue(test_car.getGasTankLevel() == 10);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);

        assertEquals(9, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range

    @Test
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(501);
        assertTrue(test_car.getGasTankLevel()<1);
        assertEquals(test_car.getGasTankLevel(),0,.001);
        System.out.println(test_car.getGasTankLevel());

    }
    //TODO: can't have more gas than tank size, expect an exception

    @Test
    public void testGasOverfillException() {

        assertThrows(IllegalArgumentException.class, () ->
                test_car.addGas(11), "Can't exceed tank size"
                );
    }
}