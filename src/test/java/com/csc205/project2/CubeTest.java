package com.csc205.project2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CubeTest {

    public CubeTest() {
    }

    @Test
    public void testing() {
        Cube cube = new Cube(1);
        Assertions.assertTrue(cube.surfaceArea() == 6);
        Assertions.assertTrue(cube.volume() == 1);
    }
}
