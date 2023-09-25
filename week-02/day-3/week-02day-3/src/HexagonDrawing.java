import javax.swing.*;
import java.awt.*;

public class HexagonDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int[] xPoints = {100, 150, 250, 300, 250, 150};
        int[] yPoints = {150, 75, 75, 150, 225, 225};
        int nPoints = 6;

        g.setColor(Color.blue); // You can change the color as you like
        g.fillPolygon(xPoints, yPoints, nPoints);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hexagon Drawing");
        HexagonDrawing hexagonDrawing = new HexagonDrawing();
        frame.add(hexagonDrawing);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
