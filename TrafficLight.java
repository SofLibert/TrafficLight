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
            graphics.fillRoundRect(0, 0, 100, 270, 20, 20);
        }
        if (type == 1) {
            graphics.fillRoundRect(0, 0, 40, 50, 10, 10);
        }
        if (type == 2) {
            int[] xp = {0, 50, 50};
            int[] xy = {0, 0, 50};
            graphics.fillPolygon(xp, xy, 3);
        }
        if (type == 3) {
            int[] xp = {0, 50, 0};
            int[] xy = {0, 0, 50};
            graphics.fillPolygon(xp, xy, 3);
        }
        if (type == 4) {
            graphics.fillRoundRect(0, 0, 55, 10, 5, 5);
        }
        if (type == 5) {
            graphics.fillRoundRect(0, 0, 10, 55, 5, 5);
        }
        if (type == 6) {
            graphics.fillRoundRect(0, 0, 7, 55, 10, 10);
        }
        if (type == 7) {
            graphics.fillRoundRect(0, 0, 70, 20, 50, 50);
        }
        if (type == 8) {
            graphics.fillRoundRect(0, 0, 70, 5, 10, 10);
        }
    }
}

class JLayeredPaneTest extends JFrame{

    public JLayeredPaneTest(){
        super("Светофор");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        //Прямоугольники с округленными углами
        Figure figure1 = new Figure(Color.DARK_GRAY, 0);
        Figure figure2 = new Figure(Color.DARK_GRAY, 1);
        Figure figure21 = new Figure(Color.DARK_GRAY, 7);
        Figure figure22 = new Figure(Color.DARK_GRAY, 8);
        //Левые треугольники
        Figure figure3 = new Figure(Color.DARK_GRAY, 2);
        Figure figure4 = new Figure(Color.DARK_GRAY, 2);
        Figure figure5 = new Figure(Color.DARK_GRAY, 2);
        Figure figure9 = new Figure(Color.DARK_GRAY, 4);
        Figure figure10 = new Figure(Color.DARK_GRAY, 4);
        Figure figure11 = new Figure(Color.DARK_GRAY, 4);
        Figure figure12 = new Figure(Color.DARK_GRAY, 6);
        Figure figure13 = new Figure(Color.DARK_GRAY, 6);
        Figure figure14 = new Figure(Color.DARK_GRAY, 6);
        //Правые треугольники
        Figure figure6 = new Figure(Color.DARK_GRAY, 3);
        Figure figure7 = new Figure(Color.DARK_GRAY, 3);
        Figure figure8 = new Figure(Color.DARK_GRAY, 3);
        Figure figure15 = new Figure(Color.DARK_GRAY, 4);
        Figure figure16 = new Figure(Color.DARK_GRAY, 4);
        Figure figure17 = new Figure(Color.DARK_GRAY, 4);
        Figure figure18 = new Figure(Color.DARK_GRAY, 5);
        Figure figure19 = new Figure(Color.DARK_GRAY, 5);
        Figure figure20 = new Figure(Color.DARK_GRAY, 5);


        figure1.setBounds(225, 165, 100 , 270);
        figure2.setBounds(255, 440, 40 , 50);
        figure21.setBounds(240, 145, 70 , 10);
        figure22.setBounds(240, 153, 70 , 5);

        figure3.setBounds(165, 190, 50 , 50);
        figure4.setBounds(165, 270, 50 , 50);
        figure5.setBounds(165, 350, 50 , 50);
        figure9.setBounds(165, 185, 55 , 5);
        figure10.setBounds(165, 265, 55 , 5);
        figure11.setBounds(165, 345, 55 , 5);
        figure12.setBounds(213, 185, 7 , 55);
        figure13.setBounds(213, 265, 7 , 55);
        figure14.setBounds(213, 345, 7 , 55);

        figure6.setBounds(335, 190, 50 , 50);
        figure7.setBounds(335, 270, 50 , 50);
        figure8.setBounds(335, 350, 50 , 50);
        figure15.setBounds(330, 185, 55 , 5);
        figure16.setBounds(330, 265, 55 , 5);
        figure17.setBounds(330, 345, 55 , 5);
        figure18.setBounds(330, 185, 5 , 55);
        figure19.setBounds(330, 265, 5 , 55);
        figure20.setBounds(330, 345, 5 , 55);

        lp.add(figure1, JLayeredPane.PALETTE_LAYER);
        lp.add(figure2, JLayeredPane.PALETTE_LAYER);
        lp.add(figure3, JLayeredPane.PALETTE_LAYER);
        lp.add(figure4, JLayeredPane.PALETTE_LAYER);
        lp.add(figure5, JLayeredPane.PALETTE_LAYER);
        lp.add(figure6, JLayeredPane.PALETTE_LAYER);
        lp.add(figure7, JLayeredPane.PALETTE_LAYER);
        lp.add(figure8, JLayeredPane.PALETTE_LAYER);
        lp.add(figure9, JLayeredPane.PALETTE_LAYER);
        lp.add(figure10, JLayeredPane.PALETTE_LAYER);
        lp.add(figure11, JLayeredPane.PALETTE_LAYER);
        lp.add(figure12, JLayeredPane.PALETTE_LAYER);
        lp.add(figure13, JLayeredPane.PALETTE_LAYER);
        lp.add(figure14, JLayeredPane.PALETTE_LAYER);
        lp.add(figure15, JLayeredPane.PALETTE_LAYER);
        lp.add(figure16, JLayeredPane.PALETTE_LAYER);
        lp.add(figure17, JLayeredPane.PALETTE_LAYER);
        lp.add(figure18, JLayeredPane.PALETTE_LAYER);
        lp.add(figure19, JLayeredPane.PALETTE_LAYER);
        lp.add(figure20, JLayeredPane.PALETTE_LAYER);
        lp.add(figure21, JLayeredPane.PALETTE_LAYER);
        lp.add(figure22, JLayeredPane.PALETTE_LAYER);

        setSize(550, 600);
        getContentPane().setBackground(Color.lightGray);
        setVisible(true);
    }

    public static void main(String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        new JLayeredPaneTest();
    }
}