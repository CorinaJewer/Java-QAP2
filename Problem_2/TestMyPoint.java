public class TestMyPoint {
    public static void main(String[] args) {

      System.out.println();

      // Objects
      MyPoint p1 = new MyPoint(3,4);
      System.out.println("MyPoint p1 is " + p1);
      MyPoint p2 = new MyPoint(0,4);
      System.out.println("MyPoint p2 is " + p2);

      System.err.println();

      p1.setX(8);
      p1.setY(6);

      System.out.println("Reset p1 is "+ p1);

      System.out.println("The amended x variable for p1 is " + p1.getX());
      System.out.println("The amended y variable for p1 is " + p1.getY());

      p1.setXY(3,0);
      System.out.println("Reset p1 is " + p1);

      // Distance() methods

      System.out.println("The distnace between p1 and the default point is " + p1.distance());
      System.out.println ("The distance between the entered point and p1 is " + String.format("%.2f", p1.distance(5,6)));
      System.out.println("The distance between p1 & p2 is " + p1.distance(p2));
      System.out.println("The distance between p2 & p1 is " + p2.distance(p1));

      System.out.println();
  }
}
