package Draw_models;

import java.awt.*;

public class Picture {

    public Picture() {

    }

    public void draw(Graphics2D g2d, int x, int y){

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawOval(115, 127, 150, 150);
        g2d.setColor(Color.ORANGE);
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


        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(2));

        g2d.setColor(Color.black);
        g2d.drawPolygon(new int[]{600, 900, 1000, 550, 600}, new int[]{150, 150, 200, 200 , 150}, 5);
        g2d.setColor(Color.gray);
        g2d.fillPolygon(new int[]{600, 900, 1000, 550, 600}, new int[]{150, 150, 200, 200 , 150}, 5);

        g2d.setColor(Color.black);
        g2d.drawPolygon(new int[]{550, 600, 550}, new int[]{200, 150, 100}, 3);
        g2d.setColor(Color.gray);
        g2d.fillPolygon(new int[]{550, 600, 550}, new int[]{200, 150, 100}, 3);

        g2d.setColor(Color.black);
        g2d.drawPolygon(new int[]{700, 800, 700}, new int[]{150, 150, 100}, 3);
        g2d.setColor(Color.gray);
        g2d.fillPolygon(new int[]{700, 800, 700}, new int[]{150, 150, 100}, 3);

        g2d.setColor(Color.black);
        g2d.drawPolygon(new int[]{700, 800, 700}, new int[]{200, 200, 250}, 3);
        g2d.setColor(Color.gray);
        g2d.fillPolygon(new int[]{700, 800, 700}, new int[]{200, 200, 250}, 3);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawOval(750, 160, 30, 30);
        g2d.setColor(Color.white);
        g2d.fillOval(750, 160, 30, 30);


    }



}
