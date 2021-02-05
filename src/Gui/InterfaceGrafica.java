package Gui;

//import Gui.TestandoFormas;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class InterfaceGrafica {

    JButton botaoCor;
    JButton botaoTexto;
    JFrame janela;
    JLabel mensagem;
    int coor1,coor2;

    public void janela(){
        janela = new JFrame(); // cria a moldura
        // esse método permite que a moldura seja fechada quando se clicar em fechar a janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Configuração das ações do botão de mudar a cor da bola
        botaoCor = new JButton("Clique aqui, e veja a mágica acontecer!!"); //cria o botão para interação
        botaoCor.addActionListener(new Botaocor());
        System.out.println("testando 1");
        TestandoFormas forma = new TestandoFormas();
        janela.getContentPane().add(BorderLayout.SOUTH, botaoCor); // adiciona o botão criado ao conteúdo  do painel
        System.out.println("testando 2");
        janela.getContentPane().add(BorderLayout.CENTER,forma); //adiciona a forma gerada na classe TestandoFormas
        //configuração do botão de mudança de texto
        botaoTexto = new JButton("Clique aqui e veja uma mensagem importantissima!!!!!!!!");
        botaoTexto.addActionListener(new BotaoTexto());
        janela.getContentPane().add(BorderLayout.WEST,botaoTexto);
        mensagem =  new JLabel("Clique em mim.");
        janela.getContentPane().add(BorderLayout.EAST,mensagem);

        //Configuração do frame
        janela.setSize(1366,766);//tamanho em pixels (largura e altura)
        janela.setVisible(true);//torna visível
    }

class Botaocor implements ActionListener{
    public void actionPerformed(ActionEvent event){
        janela.repaint();
    }
}

class BotaoTexto implements ActionListener{
    public void actionPerformed(ActionEvent event){
        mensagem.setText("Que coisa incrível é o aprendizado");
    }
}

public class TestandoFormas extends JPanel {


    public void paintComponent(Graphics g){

        g.fillRect(0,0,this.getWidth(),this.getHeight());
        int vermelho = (int) (Math.random() * 255);
        int verde = (int) (Math.random() * 255);
        int azul = (int) (Math.random() * 255);

        Color corAleatoria = new Color(vermelho,verde,azul);

           // while(parar==0){
            g.setColor(corAleatoria);
            g.fillOval(coor1,coor2,70,70);
            coor1+=50;
            coor2+=50;
                if(coor2>=700){
                    coor1=0;
                    coor2=0;
                }

          //  }




    }

    
}
    
    
}
