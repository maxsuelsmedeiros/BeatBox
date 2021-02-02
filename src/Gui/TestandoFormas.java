package Gui;

import java.awt.*;
import javax.swing.*;

public class TestandoFormas extends JPanel{

    public void paintComponent(Graphics g){

        g.fillRect(0,0,this.getWidth(),this.getHeight());
        int vermelho = (int) (Math.random() * 255);
        int verde = (int) (Math.random() * 255);
        int azul = (int) (Math.random() * 255);

        Color corAleatoria = new Color(vermelho,verde,azul);
        g.setColor(corAleatoria);
        g.fillOval(50,50,70,70);
    }
    
}
