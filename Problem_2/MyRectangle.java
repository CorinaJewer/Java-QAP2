public class MyRectangle {
   
    private MyPoint topLeft;
   private MyPoint bottomRight;

   public MyRectangle(){
        this.topLeft =  new MyPoint(1,4);
        this.bottomRight = new MyPoint(5,2);
   }

    public MyRectangle (MyPoint topleft, MyPoint bottomRight){
            this.topLeft = topleft;
            this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public double getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public double getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public String toString() {
        return "Rectangle[Top Left Coordinate = " + topLeft + ", Bottom Right Coordinate = " + bottomRight + "]";
    } 
}
