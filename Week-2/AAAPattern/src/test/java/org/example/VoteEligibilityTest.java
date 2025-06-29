package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VoteEligibilityTest {
    private VoteEligibility ve;

    @Before
    public void setUp(){
        ve= new VoteEligibility(); // Arrange (Object Initialisation)
        System.out.println("SetUp done");
    }

    @After
    public void tearDown(){
        ve=null;  // Cleanup
        System.out.println("Teardown done");
    }

    @Test
    public void isEligibleTest(){
        boolean output1=ve.isEligible(18,"Indian"); // Act
        boolean output2=ve.isEligible(17,"Indian"); // Act
        boolean output3=ve.isEligible(50,"Not Indian"); // Act
        boolean output4=ve.isEligible(10,"Not Indian"); // Act
        assertTrue(output1); // Assert
        assertFalse(output2); // Assert
        assertFalse(output3); // Assert
        assertFalse(output4); // Assert

    }
}
