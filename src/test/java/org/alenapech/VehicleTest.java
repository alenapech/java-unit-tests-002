package org.alenapech;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    private Motorcycle motorcycle;
    private Car car;

    @BeforeEach
    public void initialization() {
        motorcycle = new Motorcycle("Yamaha", "Test", 2012);
        car = new Car("Tesla", "Model S", 2022);
    }

    @Test
    public void carIsVehicle() {
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    public void carWheels() {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void motorcycleWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void carTestSpeed() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void motorcycleTestSpeed() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void carPark() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void motorcyclePark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

}