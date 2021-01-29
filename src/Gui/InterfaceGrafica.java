package Gui;

import javax.swing.*;
import java.awt.event.*;
public class InterfaceGrafica implements ActionListener {

    JButton botao;

    public void janela(){
        JFrame janela = new JFrame(); // cria a moldura
        botao = new JButton("Clique aqui!!"); //cria o botão para interação
        botao.addActionListener(this);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // esse método permite que a moldura seja fechada quando se clicar em fechar a janela
        janela.getContentPane().add(botao); // adiciona o botão criado ao conteúdo  do painel
        janela.setSize(300,400);//tamanho em pixels (largura e altura)
        janela.setVisible(true);//torna visível
    }

    public void actionPerformed(ActionEvent event){
        botao.setText("Fui clicado, minha vida tem sentido !!!!!!");
    }
    
}
