package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleMoveDemo extends JFrame implements KeyListener {
    private JPanel panel;
    private JLabel object;
    private int x, y;
    
    public SimpleMoveDemo() {
        panel = new JPanel();
        object = new JLabel("Object");
        x = 50;
        y = 50;
        panel.setLayout(null);
        object.setBounds(x, y, 50, 50);
        panel.add(object);
        add(panel);
        addKeyListener(this);
        setFocusable(true);
        setSize(500, 500);
        setVisible(true);
    }
    
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            x -= 10;
        }
        if (keyCode == KeyEvent.VK_RIGHT) {
            x += 10;
        }
        if (keyCode == KeyEvent.VK_UP) {
            y -= 10;
        }
        if (keyCode == KeyEvent.VK_DOWN) {
            y += 10;
        }
        object.setBounds(x, y, 50, 50);
    }
    
    public void keyReleased(KeyEvent e) {
    }
    
    public void keyTyped(KeyEvent e) {
    }
    
    public static void main(String[] args) {
        new SimpleMoveDemo();
    }
}
