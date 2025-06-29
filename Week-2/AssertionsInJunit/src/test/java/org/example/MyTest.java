package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyTest {

        @Test
        public void testAssertions() {

            assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});

            assertEquals(5, 2 + 3);

            assertNotEquals("helloworld","hello" + " " + "world");

            assertTrue(5 > 3);

            assertFalse(5 < 3);

            assertNull(null);

            assertNotNull(new Object());

    }
}
