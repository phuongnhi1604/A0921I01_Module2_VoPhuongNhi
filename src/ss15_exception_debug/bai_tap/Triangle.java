package ss15_exception_debug.bai_tap;

import java.util.Map;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Có cạnh nhỏ hơn 0.");
        } else {
            if (side1 >= side2 + side3)
                throw new IllegalTriangleException("Có một cạnh không lớn hơn tổng hai cạnh còn lại.");
            else if (side2 >= side1 + side3)
                throw new IllegalTriangleException("Có một cạnh không lớn hơn tổng hai cạnh còn lại.");
            else if (side3 >= side1 + side2)
                throw new IllegalTriangleException("Có một cạnh không lớn hơn tổng hai cạnh còn lại.");
            else {
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
            }
        }
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                "}";
    }
}
