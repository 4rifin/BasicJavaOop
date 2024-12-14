public class ShapeApp {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.getCorner());

        Rectanggle rectangle = new Rectanggle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
