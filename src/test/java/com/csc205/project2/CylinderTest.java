package com.csc205.project2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CylinderTest {

    public CylinderTest() {
    }

    @Test
    public void testing() {
        Cylinder cylinder = new Cylinder(1, 4);
        Assertions.assertTrue(cylinder.surfaceArea() == 31.41592653589793);
        Assertions.assertTrue(cylinder.volume() == 12.566370614359172);
    }
}
