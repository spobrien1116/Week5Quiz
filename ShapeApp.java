public class ShapeApp {
    
    public static void main(String[] args) {
        double length = 5.0;
        double width = 7.0;
        double height = 3.0;
        Shape rectangle = new Rectangle();
        System.out.println(rectangle.calculatePerimeter(length, width));
        System.out.println(rectangle.calculateArea(length, width, height));
    }
}
