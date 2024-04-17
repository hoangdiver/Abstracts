package advance.dev;

//Lớp Triangle kế thừa từ lớp Shape
class Triangle extends Shape {
 private double a, b, c; // Độ dài 3 cạnh của tam giác

 // Constructor
 public Triangle(double a, double b, double c) {
     this.a = a;
     this.b = b;
     this.c = c;
 }

 // Phương thức tính chu vi của tam giác
 @Override
 public double chuVi() {
     return a + b + c;
 }

 // Phương thức tính diện tích của tam giác (sử dụng công thức Heron)
 @Override
 public double dienTich() {
     double p = chuVi() / 2; // Nửa chu vi
     return Math.sqrt(p * (p - a) * (p - b) * (p - c));
 }
}

