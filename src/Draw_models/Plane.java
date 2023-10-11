package Draw_models;

import Interface.Drawable;

import java.awt.*;

public class Plane implements Drawable {
    private Color color;

    public Plane(Color color){
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(2));

        g2d.setColor(Color.black);
        g2d.drawPolygon(new int[]{600, 900, 1000, 550, 600}, new int[]{150, 150, 200, 200 , 150}, 5);
        g2d.setColor(color);
        g2d.fillPolygon(new int[]{600, 900, 1000, 550, 600}, new int[]{150, 150, 200, 200 , 150}, 5);

        g2d.setColor(Color.black);
        g2d.drawPolygon(new int[]{550, 600, 550}, new int[]{200, 150, 100}, 3);
        g2d.setColor(color);
        g2d.fillPolygon(new int[]{550, 600, 550}, new int[]{200, 150, 100}, 3);

        g2d.setColor(Color.black);
        g2d.drawPolygon(new int[]{700, 800, 700}, new int[]{150, 150, 100}, 3);
        g2d.setColor(color);
        g2d.fillPolygon(new int[]{700, 800, 700}, new int[]{150, 150, 100}, 3);

        g2d.setColor(Color.black);
        g2d.drawPolygon(new int[]{700, 800, 700}, new int[]{200, 200, 250}, 3);
        g2d.setColor(color);
        g2d.fillPolygon(new int[]{700, 800, 700}, new int[]{200, 200, 250}, 3);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawOval(750, 160, 30, 30);
        g2d.setColor(Color.white);
        g2d.fillOval(750, 160, 30, 30);
    }
}
