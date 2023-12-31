package test.ex03_2;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

    private int x;
    private int y;

    private ImageIcon playerR, playerL;

    public Player() {
        initObject();
        initSetting();
    }

    private void initObject() {
        playerR = new ImageIcon("image/playerR.png");
        playerL = new ImageIcon("image/playerL.png");
    }

    private void initSetting() {
        x = 70;
        y = 535;

        setIcon(playerR);
        setSize(50, 50);
        setLocation(x, y);
    }

    public void right() {
        setIcon(playerR);
        while (true) {
            x = x + 1;
            setLocation(x, y);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void left() {
        setIcon(playerL);
        x = x - 1;
        setLocation(x, y);
    }

    public void up() {

        y = y - 120;
        setLocation(x, y);
    }

    public void down() {

        y = y + 120;
        setLocation(x, y);
    }

}
