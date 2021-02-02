package Gui;

import Gui.TestandoFormas;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class InterfaceGrafica implements ActionListener {

    JButton botao;
    JFrame janela;

    public void janela(){
        janela = new JFrame(); // cria a moldura
        botao = new JButton("Clique aqui!!"); //cria o botão para interação
        botao.addActionListener(this);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // esse método permite que a moldura seja fechada quando se clicar em fechar a janela
        janela.getContentPane().add(BorderLayout.SOUTH, botao); // adiciona o botão criado ao conteúdo  do painel
        TestandoFormas forma = new TestandoFormas();
        janela.getContentPane().add(BorderLayout.CENTER,forma); //adiciona a forma gerada na classe TestandoFormas
        janela.setSize(300,400);//tamanho em pixels (largura e altura)
        janela.setVisible(true);//torna visível
    }

    public void actionPerformed(ActionEvent event){
        janela.repaint();
    }
    
}
