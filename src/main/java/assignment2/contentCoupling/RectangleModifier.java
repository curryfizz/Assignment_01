package assignment2.contentCoupling;

public class RectangleModifier {

    public RectangleModifier(Rectangle rectangle){
        rectangle.height = 5;
        rectangle.width = 10;
        //the RectangleModifier class's constructor and modifies the parameter rectangle's height and width
        //an example of content coupling
    }
}
