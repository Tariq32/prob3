

public class Shape {
    boolean isFilled;
        String color;
        public Shape() {
            isFilled = true;
            color = "Green";
        }
        public Shape(boolean x, String s)
        {
            isFilled = x;
            color = s;
        }
        @Override
        public String toString() {
            return "Filled:" +isFilled+ "Color:" +color;
        }

}
