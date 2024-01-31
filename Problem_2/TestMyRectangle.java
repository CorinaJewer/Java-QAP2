public class TestMyRectangle {
    public static void main(String[] args) {

        System.err.println();

        // Objects
        MyRectangle rec1 = new MyRectangle();
        System.out.println("Rectangle 1: " + rec1);
        MyPoint topLeft = new MyPoint(0,7);
        MyPoint bottomRight = new MyPoint(7,4);
        MyRectangle rec2 = new MyRectangle( topLeft, bottomRight);
        System.out.println("Rectangle 2: "+ rec2);

        rec2.setTopLeft(new MyPoint(2,10));
        rec2.setBottomRight( new MyPoint(6,7));
        System.out.println("The amended TopLeft coordinate is " + rec2.getTopLeft());
        System.out.println("The amended BottomRight coordinate is " + rec2.getBottomRight());
        System.out.println("The amended Rectangle 2: " + rec2);

        // width(), height(), perimeter() methods

        System.out.println("The width of Rectangle 2 is " + rec2.getWidth());
        System.out.println("The height of Rectangle 1 is " + rec1.getHeight());
        System.out.println("The perimeter of Rectangle 2 is " + rec2.getPerimeter());

        System.out.println();       
    }
}
