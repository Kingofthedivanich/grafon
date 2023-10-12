import Interface.Drawable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class DrawingPanel extends JFrame {
    private final int BACKGROUND_WIDTH = 1200;
    private final int BACKGROUND_HEIGHT = 800;
    ArrayList<Drawable> drawList = new ArrayList<>();

    public DrawingPanel() {
        setTitle (" Drawing panel ");
        setSize ( BACKGROUND_WIDTH , BACKGROUND_HEIGHT );
        setVisible ( true );
        setDefaultCloseOperation ( DISPOSE_ON_CLOSE ) ;
    }

    public void addObject(Drawable obj){
        drawList.add(obj);
    }

    @Override
    public void paint ( Graphics g) {
        Graphics2D g2d = ( Graphics2D ) g;
        for (Drawable obj:drawList){
            obj.draw(g2d);
        }
    }
}
