package com.csc205.project2;

public class Cone extends Shape{

    private double height;
    private double radius;

    public Cone() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cone(double radius, double height) {
        super();
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return ((radius * Math.PI) * (radius + Math.sqrt(Math.pow(height, 2) + Math.sqrt(Math.pow(radius, 2)))));
    }

    public double volume() {
        return (height / 3.0) * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}