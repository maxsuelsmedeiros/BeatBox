package Gui;

import java.awt.*;
import javax.swing.*;

public class TestandoFormas extends JPanel{

    int cont = 0;

    public void paintComponent(Graphics g){

        if(cont<1){

            Image imagem = new ImageIcon("/home/maxsuel/Documentos/java/Projetos/BeatBox/BeatBox/lib/Imagens/white-rose-close-up.jpg").getImage();
            g.drawImage(imagem, 2, 2,this);
            System.out.println("teste 123");

        }else{

        g.fillRect(0,0,this.getWidth(),this.getHeight());
        int vermelho = (int) (Math.random() * 255);
        int verde = (int) (Math.random() * 255);
        int azul = (int) (Math.random() * 255);

        Color corAleatoria = new Color(vermelho,verde,azul);
        g.setColor(corAleatoria);
        g.fillOval(50,50,70,70);
        }
        cont++;

    }

    
}
