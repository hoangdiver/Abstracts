package advance.dev;

import java.util.Scanner;

public class MainApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];

        // Nhập thông tin cho mảng shapes
        input(shapes);

        // Xuất thông tin các hình vừa nhập
        System.out.println("Danh sách các hình đã nhập:");
        print(shapes);

        // Tìm hình có diện tích lớn nhất
        Shape maxAreaShape = findMaxAreaShape(shapes);
        if (maxAreaShape != null) {
            System.out.println("Hình có diện tích lớn nhất:");
            System.out.println("Diện tích: " + maxAreaShape.dienTich());
        } else {
            System.out.println("Không tìm thấy hình.");
        }

        // Tìm diện tích lớn nhất của mỗi hình
        System.out.println("Diện tích lớn nhất của mỗi hình:");
        findMaxAreaOfEachShape(shapes);
    }

    // Phương thức nhập thông tin cho mảng shapes
    static void input(Shape[] shapes) {
        int circleCount = 0, rectangleCount = 0, triangleCount = 0;

        for (int i = 0; i < shapes.length; i++) {
            if (circleCount < 3) {
                System.out.println("Nhập thông tin hình tròn " + (circleCount + 1) + ":");
                System.out.print("Bán kính: ");
                double radius = scanner.nextDouble();
                shapes[i] = new Circle(radius);
                circleCount++;
            } else if (rectangleCount < 3) {
                System.out.println("Nhập thông tin hình chữ nhật " + (rectangleCount + 1) + ":");
                System.out.print("Chiều dài: ");
                double length = scanner.nextDouble();
                System.out.print("Chiều rộng: ");
                double width = scanner.nextDouble();
                shapes[i] = new Rectangle(length, width);
                rectangleCount++;
            } else if (triangleCount < 4) {
                System.out.println("Nhập thông tin tam giác " + (triangleCount + 1) + ":");
                System.out.print("Độ dài cạnh a: ");
                double a = scanner.nextDouble();
                System.out.print("Độ dài cạnh b: ");
                double b = scanner.nextDouble();
                System.out.print("Độ dài cạnh c: ");
                double c = scanner.nextDouble();
                shapes[i] = new Triangle(a, b, c);
                triangleCount++;
            }
        }
    }

    // Phương thức xuất thông tin các hình trong mảng shapes
    static void print(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println("Chu vi: " + shape.chuVi());
            System.out.println("Diện tích: " + shape.dienTich());
            System.out.println();
        }
    }

    // Phương thức tìm hình có diện tích lớn nhất
    static Shape findMaxAreaShape(Shape[] shapes) {
        Shape maxAreaShape = null;
        double maxArea = Double.MIN_VALUE;

        for (Shape shape : shapes) {
            if (shape.dienTich() > maxArea) {
                maxArea = shape.dienTich();
                maxAreaShape = shape;
            }
        }

        return maxAreaShape;
    }

    // Phương thức tìm diện tích lớn nhất của mỗi hình trong mảng shapes
    static void findMaxAreaOfEachShape(Shape[] shapes) {
        double maxCircleArea = Double.MIN_VALUE;
        double maxRectangleArea = Double.MIN_VALUE;
        double maxTriangleArea = Double.MIN_VALUE;

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                double area = shape.dienTich();
                if (area > maxCircleArea) {
                    maxCircleArea = area;
                }
            } else if (shape instanceof Rectangle) {
                double area = shape.dienTich();
                if (area > maxRectangleArea) {
                    maxRectangleArea = area;
                }
            } else if (shape instanceof Triangle) {
                double area = shape.dienTich();
                if (area > maxTriangleArea) {
                    maxTriangleArea = area;
                }
            }
        }

        System.out.println("Diện tích lớn nhất của hình tròn: " + maxCircleArea);
        System.out.println("Diện tích lớn nhất của hình chữ nhật: " + maxRectangleArea);
        System.out.println("Diện tích lớn nhất của tam giác: " + maxTriangleArea);
    }
}
