import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DrawingPanel extends JFrame implements
        ActionListener {
    private final int BACKGROUND_WIDTH = 800;
    private final int BACKGROUND_HEIGHT = 800;

    private final int TIMER_DELAY = 500;
    private final Timer timer = new Timer ( TIMER_DELAY ,
            this );
    private int ticksFromStart = 0;

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

        g2d . setColor ( Color . WHITE ) ;
        g2d . fillRect (0 , 0, BACKGROUND_WIDTH ,
                BACKGROUND_HEIGHT ) ;

//        new Train().draw(g2d, 10+ticksFromStart, 500);
    }

    @Override
    public void actionPerformed ( ActionEvent e) {
        if ( e. getSource () == timer ) {
            repaint () ;
            ++ ticksFromStart ;
        }
    }
}
