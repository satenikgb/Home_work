package Creational_DP_HMW.Task3;

public class ShapeFactory {
    public Shape shape(String s) {
        switch (s) {
            case "Circle" :
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Triangle":
                return new Triangle();
            default:
                throw new IllegalArgumentException("Try again");

        }
    }
}
