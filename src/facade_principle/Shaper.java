package facade_principle;

public class Shaper {

    private Rectangle rectangle;
    private Square square;
    private Circle circle;

    public Shaper(){
        rectangle = new Rectangle();
        square = new Square();
        circle = new Circle();
    }

    public void drawRectangle(){
        rectangle.Draw();
    }

    public void drawSquare(){
        square.Draw();
    }

    public void drawCircle(){
        circle.Draw();
    }

}
