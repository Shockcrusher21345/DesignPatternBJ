import javax.swing.*;
import java.awt.*;
public class WhiteSquareIcon implements Icon {
    private final int size;

    public WhiteSquareIcon(int size){
        this.size = size;
    }

    @Override
    public int getIconWidth(){
        return size;
    }

    @Override
    public int getIconHeight(){
        return size;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y){
        g.setColor(Color.WHITE);
        g.fillRect(x,y,size,size);
    }
}
