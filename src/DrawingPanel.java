import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        g2d . setColor ( Color . decode("#4cbb17") ) ;
        g2d . fillRect (0 , 0, BACKGROUND_WIDTH,
                BACKGROUND_HEIGHT) ;

        g2d . setColor ( Color . decode("#bfefff") ) ;
        g2d . fillRect (0 , 0, BACKGROUND_WIDTH,
                BACKGROUND_HEIGHT / 2 + 100) ;

        new fly().draw(g2d, 10, 500);
    }
}


//захуярить все в интерфейс все приколы в лист