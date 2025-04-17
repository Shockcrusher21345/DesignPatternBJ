import javax.swing.*;
import java.awt.*;

public class GreenCircleIcon implements Icon {
    private final int diameter;

    public GreenCircleIcon(int diameter){
        this.diameter=diameter;
    }

    @Override
    public int getIconWidth(){
        return diameter;
    }

    @Override
    public int getIconHeight(){
        return diameter;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y){
        g.setColor(Color.GREEN);
        g.fillOval(x,y,diameter,diameter);
    }
}