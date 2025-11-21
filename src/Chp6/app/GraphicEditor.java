package Chp6.app;

import Chp6.base.Shape;
import Chp6.derived.Circle;

public class GraphicEditor {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
