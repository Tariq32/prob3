public class Rectangle extends Shape{
    private double width;
    private double length;
   public Rectangle()
    { width= 1;
        length = 2;

    }
    public Rectangle(double w, double l )
    { width= w;
        length = l;
    }
    public Rectangle( double width, double length, boolean isFilled, String color )
    {super(isFilled, color);
      this.width= width;
      this.length= length;


    }
    void setLW(double x,double y) {
        if (x>y) {
            x = this.length;
        }else {
            y=this.width;
        }
    ;
    } public double getArea()
    {
        double getArea;
        return width*length;
    }@Override
    public String toString()
    {
        return " Width:" +width+ "\nLength:" +length+"\nArea:" +getArea()+
                "\n" +super.toString();
    }





















}
