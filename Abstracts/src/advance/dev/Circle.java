package advance.dev;

//Lớp Circle kế thừa từ lớp Shape
class Circle extends Shape {
 private double r; // Bán kính của hình tròn

 // Constructor
 public Circle(double r) {
     this.r = r;
 }

 // Phương thức tính chu vi của hình tròn
 @Override
 public double chuVi() {
     return 2 * Math.PI * r;
 }

 // Phương thức tính diện tích của hình tròn
 @Override
 public double dienTich() {
     return Math.PI * r * r;
 }
}
