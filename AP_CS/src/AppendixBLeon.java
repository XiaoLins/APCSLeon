/*
Appendix B
Java 2D Graphics
 */
import java.awt.*;
import javax.swing.JFrame;

public class AppendixBLeon extends Canvas{
    public static void main (String[] args){
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new AppendixBLeon();
        canvas.setSize(400, 400);
        frame.add(canvas);
        Color purple = new Color(128, 0 , 128);
        canvas.setBackground(purple);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g){
        g.setColor(Color.cyan);
        g.fillOval(100, 100, 200, 200);
    }
}
