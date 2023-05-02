import javax.swing.*;
import java.awt.*;

class Figure extends JComponent{

    private final Color color;
    private final int type;

    Figure(Color color, int type){
        this.color = color;
        this.type = type;
        setOpaque(false);
    }

    public void paintComponent(Graphics graphics){
        graphics.setColor(color);
        if (type == 0) {
            graphics.fillRoundRect(0, 0, 100, 270, 40, 40);
        }
    }
}

class JLayeredPaneTest extends JFrame{

    public JLayeredPaneTest(){
        super("Светофор");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        Figure figure1 = new Figure(Color.DARK_GRAY, 0);
        figure1.setBounds(225, 165, 100 , 270);
        lp.add(figure1, JLayeredPane.PALETTE_LAYER);
        setSize(550, 600);
        setBackground(Color.gray);
        setVisible(true);
    }

    public static void main(String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        new JLayeredPaneTest();
    }
}