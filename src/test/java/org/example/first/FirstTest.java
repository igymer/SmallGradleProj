package org.example.first;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstTest {

    @Test
    public void testCreating() {
        FirstTest firstTest = new FirstTest();
        assertNotNull(firstTest);
    }
}