package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;

import static org.junit.Assert.assertEquals;

public class InheritanceTest {

    @Test
    public void inheritsSuperInFirstConstructor(){
        HouseCat keyboardcat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardcat.getWeight(), .001);
    }
}
