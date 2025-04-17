import javax.swing.*;
public class IconAdapterMain {
    public static void main(String[] args){
        Icon greenCircle = new GreenCircleIcon(60);
        IconAdapter adapter = new IconAdapter(greenCircle);

        JFrame frame = new JFrame("Icon Adapter Demonstration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(adapter);
        frame.pack();
        frame.setVisible(true);
    }
}
