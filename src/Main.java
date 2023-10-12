import Draw_models.Balloon;
import Draw_models.Plane;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        DrawingPanel meh = new DrawingPanel();
        meh.addObject(new Plane(Color.GRAY));
        meh.addObject(new Balloon(Color.ORANGE));
    }
}