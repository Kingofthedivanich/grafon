import Draw_models.Balloon;
import Draw_models.Plane;
import Interface.Drawable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class DrawingPanel extends JFrame {
    private final int BACKGROUND_WIDTH = 1200;
    private final int BACKGROUND_HEIGHT = 800;

    public DrawingPanel() {
        setTitle (" Drawing panel ");
        setSize ( BACKGROUND_WIDTH , BACKGROUND_HEIGHT );
        setVisible ( true );
        setDefaultCloseOperation ( DISPOSE_ON_CLOSE ) ;
    }

    @Override
    public void paint ( Graphics g) {
        Graphics2D g2d = ( Graphics2D ) g;

        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);

        ArrayList<Drawable> drawList = new ArrayList<>();

        drawList.add(new Balloon(Color.orange));
        drawList.add(new Plane(Color.gray));

        for (Drawable obj:drawList){
            obj.draw(g2d);
        }
    }
}
