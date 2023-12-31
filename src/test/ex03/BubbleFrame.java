package test.ex03;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {
        initObject();
        initSetting();
        initListener();
        setVisible(true);

    }

    private void initObject() {
        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
        setContentPane(backgroundMap);

        player = new Player();
        add(player);

    }

    private void initSetting() {
        setSize(1000, 640);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void initListener() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());

                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    player.left();
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    player.right();
                }

            }
        });
    }

    public static void main(String[] args) {
        new BubbleFrame();
    }
}
