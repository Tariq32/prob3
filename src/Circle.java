public class Circle extends Shape {
    private double radius;
    public Circle() {
        radius = 1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle( double radius,boolean isFilled, String color ){
       this.radius= radius;
       this.isFilled= isFilled;
       this.color = color;
    }
    public double getArea(){
        return   Math.PI * Math.pow(radius,2);
    }
    @Override
    public String toString()
    {
      return "Radius:" +radius+ "\nArea:" +getArea()+
              "\nFilled:"+isFilled+ "\nColor:" +color;


    }
}
