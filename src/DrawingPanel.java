import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DrawingPanel extends JFrame implements
        ActionListener {
    private final int BACKGROUND_WIDTH = 1200;
    private final int BACKGROUND_HEIGHT = 800;

    private final int TIMER_DELAY = 500;
    private final Timer timer = new Timer ( TIMER_DELAY ,
            this );

    public DrawingPanel() {
        setTitle (" Drawing panel ");
        setSize ( BACKGROUND_WIDTH , BACKGROUND_HEIGHT );
        setVisible ( true );
        setDefaultCloseOperation ( DISPOSE_ON_CLOSE ) ;
      timer . start () ;
    }

    @Override
    public void paint ( Graphics g) {
        Graphics2D g2d = ( Graphics2D ) g;

        g2d . setColor ( Color . green ) ;
        g2d . fillRect (0 , 0, BACKGROUND_WIDTH,
                BACKGROUND_HEIGHT) ;

        g2d . setColor ( Color . BLUE ) ;
        g2d . fillRect (0 , 0, BACKGROUND_WIDTH,
                BACKGROUND_HEIGHT / 2 + 100) ;

        new fly().draw(g2d, 10, 500);
    }

    @Override
    public void actionPerformed ( ActionEvent e) {
        if ( e. getSource () == timer ) {
            repaint () ;
        }
    }
}
