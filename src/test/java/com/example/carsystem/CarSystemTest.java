package com.example.carsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarSystemTest {
    private final CarSystem carSystem = new CarSystem();

    @Test
    void testPrintSpeedingWarning() {
        assertDoesNotThrow(() -> carSystem.printSpeedingWarning(40, 60));
        assertDoesNotThrow(() -> carSystem.printSpeedingWarning(40, 39));
    }

    @Test
    void testPrintSpeedingTicket() {
        assertDoesNotThrow(() -> {
            carSystem.printSpeedingTicket(40, 59); // 500
            carSystem.printSpeedingTicket(40, 79); // 1000
            carSystem.printSpeedingTicket(40, 99); // 2500
            carSystem.printSpeedingTicket(40, 120); // 5000
        });
    }

    @Test
    void testProcessTrafficLightSignal() {
        assertEquals("можно ехать", carSystem.processTrafficLightSignal("зелёный"));
        assertEquals("стой", carSystem.processTrafficLightSignal("жёлтый"));
        assertEquals("стой", carSystem.processTrafficLightSignal("красный"));
        assertEquals("перезапросить датчики", carSystem.processTrafficLightSignal("синий"));
    }
}