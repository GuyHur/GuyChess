package Game;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;

import Game.Board;

import javax.swing.*;

public class GameWindow {
    private JFrame gameWindow;
    private Board board;

    public GameWindow(String name, String secondName) {

        gameWindow = new JFrame("GuyChess");

        try{
            gameWindow.setLocation(100,100);
            gameWindow.setLayout(new BorderLayout(20,20));

            //TODO: implement data window

            this.board = new Board(this);

            gameWindow.add(board, BorderLayout.CENTER);

            gameWindow.add(buttons(), BorderLayout.SOUTH);

            gameWindow.setMinimumSize(gameWindow.getPreferredSize());
            gameWindow.setSize(gameWindow.getPreferredSize());
            gameWindow.setResizable(false);

            gameWindow.pack();
            gameWindow.setVisible(true);
            gameWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        }



    }

    private JPanel buttons(){
        JPanel buttons = JPanel();
        buttons.setLayout(new GridLayout(1,3,10,0));

        final JButton quit = new JButton("Quit");

        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = JOptionPane.showConfirmDialog(gameWindow, "Are you sure you wanna quit?", "Confirm quit", JOptionPane.YES_NO_OPTION);

                if (n == JOptionPane.YES_OPTION){
                    //dipose game
                }
            }
        });
        final JButton newGame = new JButton("New Game");

        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = JOptionPane.showConfirmDialog(
                        gameWindow,
                        "Are you sure you want to begin a new game?",
                        "Confirm new game", JOptionPane.YES_NO_OPTION);
            }
        });
    buttons.add(newGame);
    buttons.add(quit);

    return buttons;

    }


}
