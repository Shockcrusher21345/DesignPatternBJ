import javax.swing.*;
public class Main {
    public static void main(String[] args){
        CompositeIcon composite = new CompositeIcon();
        composite.addIcon(new GreenCircleIcon(30), 0,0);
        composite.addIcon(new WhiteSquareIcon(20), 40, 10);

        JLabel label = new JLabel(composite);

        JFrame frame = new JFrame("Composite Icons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
