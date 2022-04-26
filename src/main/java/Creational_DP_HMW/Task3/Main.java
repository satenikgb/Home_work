package Creational_DP_HMW.Task3;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.shape("Circle");
        shape.shape();
        Shape shape1=shapeFactory.shape("Triangle");
        shape1.shape();
        Shape shape2=shapeFactory.shape("Rectangle");
        shape2.shape();
    }

}
