package Draw_models;

import Interface.Drawable;

import java.awt.*;

public class Balloon implements Drawable {
    private  Color color;

    public Balloon(Color color){
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawOval(115, 127, 150, 150);
        g2d.setColor(color);
        g2d.fillOval(115, 127, 150, 150);

        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawLine(140, 260, 165, 300);

        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawLine(215, 300, 240, 260);

        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawRect(165, 300, 50, 40);
        g2d.setColor(Color.decode("#b87333"));
        g2d.fillRect(165, 300, 50, 40);
    }
}
