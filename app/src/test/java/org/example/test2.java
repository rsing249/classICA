package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class test2 {
    @Test
    public void testAppHasGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    
    @Test
    public void testRandom() {
        assertEquals(0, 0);
        assertEquals(1, 1);
    }
}