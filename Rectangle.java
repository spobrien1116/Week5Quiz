public class Rectangle implements Shape {
    
    double perimeter;
    double area;

    public double calculatePerimeter(double length, double width) {
        perimeter = length * width;
        return perimeter;
    }

    public double calculateArea(double length, double width, double height) {
        area = length * width * height;
        return area;
    }
}
