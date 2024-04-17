package advance.dev;

//Lớp Rectangle kế thừa từ lớp Shape
class Rectangle extends Shape {
 private double a, b; // Độ dài 2 cạnh của hình chữ nhật

 // Constructor
 public Rectangle(double a, double b) {
     this.a = a;
     this.b = b;
 }

 // Phương thức tính chu vi của hình chữ nhật
 @Override
 public double chuVi() {
     return 2 * (a + b);
 }

 // Phương thức tính diện tích của hình chữ nhật
 @Override
 public double dienTich() {
     return a * b;
 }
}
