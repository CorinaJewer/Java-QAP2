import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args) {

        System.out.println();

        // Objects
        MyLine line1 = new MyLine(2,6,4,7);
        System.out.println("Line 1: " + line1);
       
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(4, 6);
        MyLine line2 = new MyLine(begin, end);
        System.out.println("Line 2: " + line2);

        line1.setBeginX(0);
        line1.setBeginY(3);

        System.out.println("The amended Line 1 beginning X value is " + line1.getBeginX());
        System.out.println("The amended Line 1 beginning Y value is " + line1.getBeginY());

        line1.setEndXY(5,9);
        System.out.println("The amended Line 1 ending X value is " + line1.getEndX());
        System.out.println("The amended Line 1 ending Y value is " + line1.getEndY());
        System.out.println(line1);

        System.out.println("Line 2 has beginning coordinates of " + Arrays.toString(line2.getBeginXY()));
        System.out.println("Line 2 has ending coordinates of " + Arrays.toString(line2.getEndXY()));

        // Length & Gradient Methods

        System.out.println("The length of Line 1 is " + String.format("%.2f",line1.getLength()));

        System.out.println("The gradient of Line 2 is " + String.format("%.2f", line2.getGradient()));

        System.out.println();
    }
}
