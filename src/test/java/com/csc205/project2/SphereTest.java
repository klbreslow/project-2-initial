package com.csc205.project2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SphereTest {
    public SphereTest() {
    }

    @Test
    public void testing() {
        Sphere sphere = new Sphere(2);
        Assertions.assertTrue(sphere.volume() == 33.510321638291124);
        Assertions.assertTrue(sphere.surfaceArea() == 50.26548245743669);
    }
}