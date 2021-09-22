package com.csc205.project2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ConeTest {

    public ConeTest() {
    }

    @Test
    public void testing() {
        Cone cone = new Cone(1, 1);
        Assertions.assertTrue(cone.surfaceArea() == 7.584475591748159);
        Assertions.assertTrue(cone.volume() == 1.0471975511965976);
    }
}
