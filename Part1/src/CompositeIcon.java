import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class CompositeIcon  implements Icon{
    private static class PositionedIcon{
        Icon icon;
        int x,y;

        PositionedIcon(Icon icon, int x, int y){
            this.icon = icon;
            this.x=x;
            this.y=y;
        }
    }

    private final List<PositionedIcon> icons = new ArrayList<>();

    public void addIcon(Icon icon, int x, int y){
        icons.add(new PositionedIcon(icon, x, y));
    }

    @Override
    public int getIconWidth(){
        int maxWidth = 0;
        for (PositionedIcon pi: icons){
            maxWidth = Math.max(maxWidth, pi.x + pi.icon.getIconWidth());
        }
        return maxWidth;
    }

    @Override
    public int getIconHeight(){
        int maxHeight = 0;
        for (PositionedIcon pi: icons){
            maxHeight = Math.max(maxHeight, pi.y + pi.icon.getIconHeight());
        }
        return maxHeight;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y){
        for (PositionedIcon pi: icons){
            pi.icon.paintIcon(c,g,x+pi.x,y+pi.y);
        }
    }
}
