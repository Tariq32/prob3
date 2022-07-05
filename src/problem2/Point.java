package problem2;

public class Point {
    private int x;
    private int y;

    public Point()
    {x=0;
        y=0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setPoint(int newX, int newY )
    {
        this.x=newX;
        this.y=newY;

    }
    public String toString()
    {
        String coordinates= "("+this.x+","+this.y+")";
        return coordinates;
    }
    public double distance(Point points)
    {
    double distance= Math.sqrt(Math.pow((this.x- points.getX()),2)
            +Math.pow((this.y- points.getY()),2));
    return distance;
    }
}

