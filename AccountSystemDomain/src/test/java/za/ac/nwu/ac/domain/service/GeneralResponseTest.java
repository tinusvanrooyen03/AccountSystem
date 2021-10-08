package za.ac.nwu.ac.domain.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneralResponseTest {

    private GeneralResponse testClass;

    @BeforeEach
     void setUp() {
        testClass = new GeneralResponse(true, 0);
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }

    @Test
    void isSuccessful() {
        testClass = null;

    }

    @Test
    void getPayload() {
        testClass = null;
    }

    @Test
    void testEquals() {
        assertTrue(testClass.testEquals());
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }
}